package typings.reapop.notificationMod

import typings.reapop.componentsContextMod.ComponentContextType
import typings.reapop.notificationsSystemMod.DismissNotification
import typings.reapop.themesTypesMod.Theme
import typings.reapop.typesMod.Notification
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Props extends js.Object {
  
  var components: ComponentContextType = js.native
  
  var dismissNotification: DismissNotification = js.native
  
  var notification: Notification = js.native
  
  var theme: js.UndefOr[Theme] = js.native
}
object Props {
  
  @scala.inline
  def apply(
    components: ComponentContextType,
    dismissNotification: /* id */ String => Unit,
    notification: Notification
  ): Props = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], dismissNotification = js.Any.fromFunction1(dismissNotification), notification = notification.asInstanceOf[js.Any])
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
    def setComponents(value: ComponentContextType): Self = this.set("components", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDismissNotification(value: /* id */ String => Unit): Self = this.set("dismissNotification", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNotification(value: Notification): Self = this.set("notification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTheme(value: Theme): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
}
