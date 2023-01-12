package typings.reapop

import typings.react.mod.Context
import typings.react.mod.global.JSX.Element
import typings.reapop.distComponentsNotificationMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distContextsComponentsContextMod {
  
  @JSImport("reapop/dist/contexts/componentsContext", "ComponentsContext")
  @js.native
  val ComponentsContext: Context[ComponentContextType] = js.native
  
  trait ComponentContextType extends StObject {
    
    var Notification: js.UndefOr[js.Function1[/* props */ Props, Element]] = js.undefined
    
    var NotificationIcon: js.UndefOr[
        js.Function1[/* props */ typings.reapop.distComponentsNotificationIconMod.Props, Element | Null]
      ] = js.undefined
    
    var Transition: js.UndefOr[
        js.Function1[
          (/* props */ typings.reapop.distComponentsSlideTransitionMod.Props) | (/* props */ typings.reapop.distComponentsGrowTransitionMod.Props) | (/* props */ typings.reapop.distComponentsFadeTransitionMod.Props), 
          Element
        ]
      ] = js.undefined
  }
  object ComponentContextType {
    
    inline def apply(): ComponentContextType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComponentContextType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ComponentContextType] (val x: Self) extends AnyVal {
      
      inline def setNotification(value: /* props */ Props => Element): Self = StObject.set(x, "Notification", js.Any.fromFunction1(value))
      
      inline def setNotificationIcon(value: /* props */ typings.reapop.distComponentsNotificationIconMod.Props => Element | Null): Self = StObject.set(x, "NotificationIcon", js.Any.fromFunction1(value))
      
      inline def setNotificationIconUndefined: Self = StObject.set(x, "NotificationIcon", js.undefined)
      
      inline def setNotificationUndefined: Self = StObject.set(x, "Notification", js.undefined)
      
      inline def setTransition(
        value: (/* props */ typings.reapop.distComponentsSlideTransitionMod.Props) | (/* props */ typings.reapop.distComponentsGrowTransitionMod.Props) | (/* props */ typings.reapop.distComponentsFadeTransitionMod.Props) => Element
      ): Self = StObject.set(x, "Transition", js.Any.fromFunction1(value))
      
      inline def setTransitionUndefined: Self = StObject.set(x, "Transition", js.undefined)
    }
  }
}
