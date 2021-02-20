package typings.reapop

import typings.react.mod.Context
import typings.react.mod.global.JSX.Element
import typings.reapop.notificationMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsContextMod {
  
  @JSImport("reapop/dist/contexts/componentsContext", "ComponentsContext")
  @js.native
  val ComponentsContext: Context[ComponentContextType] = js.native
  
  @js.native
  trait ComponentContextType extends StObject {
    
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
    implicit class ComponentContextTypeMutableBuilder[Self <: ComponentContextType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNotification(value: /* props */ Props => Element): Self = StObject.set(x, "Notification", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNotificationIcon(value: /* props */ typings.reapop.notificationIconMod.Props => Element | Null): Self = StObject.set(x, "NotificationIcon", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNotificationIconUndefined: Self = StObject.set(x, "NotificationIcon", js.undefined)
      
      @scala.inline
      def setNotificationUndefined: Self = StObject.set(x, "Notification", js.undefined)
      
      @scala.inline
      def setTransition(
        value: (/* props */ typings.reapop.slideTransitionMod.Props) | (/* props */ typings.reapop.growTransitionMod.Props) | (/* props */ typings.reapop.fadeTransitionMod.Props) => Element
      ): Self = StObject.set(x, "Transition", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTransitionUndefined: Self = StObject.set(x, "Transition", js.undefined)
    }
  }
}
