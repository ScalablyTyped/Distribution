package typings.reapop.anon

import typings.reapop.typesMod.NewNotification
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<reapop.reapop/dist/constants.NotificationConfig> */
@js.native
trait PartialNotificationConfig extends js.Object {
  
  var customizeNotification: js.UndefOr[(js.Function1[/* notification */ NewNotification, Unit]) | Null] = js.native
  
  var defaultProps: js.UndefOr[PartialNotification] = js.native
  
  var generateId: js.UndefOr[(js.Function1[/* notification */ NewNotification, String]) | Null] = js.native
}
object PartialNotificationConfig {
  
  @scala.inline
  def apply(): PartialNotificationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialNotificationConfig]
  }
  
  @scala.inline
  implicit class PartialNotificationConfigOps[Self <: PartialNotificationConfig] (val x: Self) extends AnyVal {
    
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
    def setCustomizeNotification(value: /* notification */ NewNotification => Unit): Self = this.set("customizeNotification", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCustomizeNotification: Self = this.set("customizeNotification", js.undefined)
    
    @scala.inline
    def setCustomizeNotificationNull: Self = this.set("customizeNotification", null)
    
    @scala.inline
    def setDefaultProps(value: PartialNotification): Self = this.set("defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultProps: Self = this.set("defaultProps", js.undefined)
    
    @scala.inline
    def setGenerateId(value: /* notification */ NewNotification => String): Self = this.set("generateId", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGenerateId: Self = this.set("generateId", js.undefined)
    
    @scala.inline
    def setGenerateIdNull: Self = this.set("generateId", null)
  }
}
