package typings.reapop.constantsMod

import typings.reapop.anon.PartialNotification
import typings.reapop.typesMod.NewNotification
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotificationConfig extends js.Object {
  
  var customizeNotification: (js.Function1[/* notification */ NewNotification, Unit]) | Null = js.native
  
  var defaultProps: PartialNotification = js.native
  
  var generateId: (js.Function1[/* notification */ NewNotification, String]) | Null = js.native
}
object NotificationConfig {
  
  @scala.inline
  def apply(defaultProps: PartialNotification): NotificationConfig = {
    val __obj = js.Dynamic.literal(defaultProps = defaultProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationConfig]
  }
  
  @scala.inline
  implicit class NotificationConfigOps[Self <: NotificationConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDefaultProps(value: PartialNotification): Self = this.set("defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomizeNotification(value: /* notification */ NewNotification => Unit): Self = this.set("customizeNotification", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCustomizeNotificationNull: Self = this.set("customizeNotification", null)
    
    @scala.inline
    def setGenerateId(value: /* notification */ NewNotification => String): Self = this.set("generateId", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGenerateIdNull: Self = this.set("generateId", null)
  }
}
