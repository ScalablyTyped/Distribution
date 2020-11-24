package typings.storybookUi.anon

import typings.emotionSerialize.mod.CSSObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClearNotification extends js.Object {
  
  def clearNotification(id: String): Unit = js.native
  
  var notifications: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['notifications'] */ js.Any = js.native
  
  var placement: CSSObject = js.native
}
object ClearNotification {
  
  @scala.inline
  def apply(
    clearNotification: String => Unit,
    notifications: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['notifications'] */ js.Any,
    placement: CSSObject
  ): ClearNotification = {
    val __obj = js.Dynamic.literal(clearNotification = js.Any.fromFunction1(clearNotification), notifications = notifications.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClearNotification]
  }
  
  @scala.inline
  implicit class ClearNotificationOps[Self <: ClearNotification] (val x: Self) extends AnyVal {
    
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
    def setClearNotification(value: String => Unit): Self = this.set("clearNotification", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNotifications(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['notifications'] */ js.Any
    ): Self = this.set("notifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacement(value: CSSObject): Self = this.set("placement", value.asInstanceOf[js.Any])
  }
}
