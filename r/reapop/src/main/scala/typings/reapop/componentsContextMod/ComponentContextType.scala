package typings.reapop.componentsContextMod

import typings.react.mod.global.JSX.Element
import typings.reapop.notificationMod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentContextType extends js.Object {
  
  var Notification: js.UndefOr[js.Function1[/* props */ Props, Element]] = js.native
  
  var NotificationIcon: js.UndefOr[
    js.Function1[/* props */ typings.reapop.notificationIconMod.Props, Element | Null]
  ] = js.native
  
  var Transition: js.UndefOr[
    js.Function1[
      (/* props */ typings.reapop.slideTransitionMod.Props) | (/* props */ typings.reapop.growTransitionMod.Props) | (/* props */ typings.reapop.fadeTransitionMod.Props), 
      Element
    ]
  ] = js.native
}
object ComponentContextType {
  
  @scala.inline
  def apply(): ComponentContextType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentContextType]
  }
  
  @scala.inline
  implicit class ComponentContextTypeOps[Self <: ComponentContextType] (val x: Self) extends AnyVal {
    
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
    def setNotification(value: /* props */ Props => Element): Self = this.set("Notification", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteNotification: Self = this.set("Notification", js.undefined)
    
    @scala.inline
    def setNotificationIcon(value: /* props */ typings.reapop.notificationIconMod.Props => Element | Null): Self = this.set("NotificationIcon", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteNotificationIcon: Self = this.set("NotificationIcon", js.undefined)
    
    @scala.inline
    def setTransition(
      value: (/* props */ typings.reapop.slideTransitionMod.Props) | (/* props */ typings.reapop.growTransitionMod.Props) | (/* props */ typings.reapop.fadeTransitionMod.Props) => Element
    ): Self = this.set("Transition", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTransition: Self = this.set("Transition", js.undefined)
  }
}
