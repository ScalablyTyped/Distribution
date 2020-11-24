package typings.reapop.notificationsSystemMod

import typings.reapop.componentsContextMod.ComponentContextType
import typings.reapop.themesTypesMod.Theme
import typings.reapop.typesMod.Notification
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Props extends js.Object {
  
  var components: js.UndefOr[ComponentContextType] = js.native
  
  var dismissNotification: DismissNotification = js.native
  
  var notifications: js.Array[Notification] = js.native
  
  var smallScreenBreakpoint: js.UndefOr[Double] = js.native
  
  var theme: js.UndefOr[Theme] = js.native
}
object Props {
  
  @scala.inline
  def apply(dismissNotification: /* id */ String => Unit, notifications: js.Array[Notification]): Props = {
    val __obj = js.Dynamic.literal(dismissNotification = js.Any.fromFunction1(dismissNotification), notifications = notifications.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
  
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    
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
    def setDismissNotification(value: /* id */ String => Unit): Self = this.set("dismissNotification", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNotificationsVarargs(value: Notification*): Self = this.set("notifications", js.Array(value :_*))
    
    @scala.inline
    def setNotifications(value: js.Array[Notification]): Self = this.set("notifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponents(value: ComponentContextType): Self = this.set("components", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponents: Self = this.set("components", js.undefined)
    
    @scala.inline
    def setSmallScreenBreakpoint(value: Double): Self = this.set("smallScreenBreakpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmallScreenBreakpoint: Self = this.set("smallScreenBreakpoint", js.undefined)
    
    @scala.inline
    def setTheme(value: Theme): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
}
