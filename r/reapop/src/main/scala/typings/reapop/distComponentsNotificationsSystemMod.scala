package typings.reapop

import typings.react.mod.global.JSX.Element
import typings.reapop.distContextsComponentsContextMod.ComponentContextType
import typings.reapop.distReducersNotificationsTypesMod.Notification
import typings.reapop.distThemesTypesMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComponentsNotificationsSystemMod {
  
  @JSImport("reapop/dist/components/NotificationsSystem", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  type DismissNotification = js.Function1[/* id */ String, Unit]
  
  trait Props extends StObject {
    
    var components: js.UndefOr[ComponentContextType] = js.undefined
    
    var dismissNotification: DismissNotification
    
    var notifications: js.Array[Notification]
    
    var smallScreenBreakpoint: js.UndefOr[Double] = js.undefined
    
    var theme: js.UndefOr[Theme] = js.undefined
  }
  object Props {
    
    inline def apply(dismissNotification: /* id */ String => Unit, notifications: js.Array[Notification]): Props = {
      val __obj = js.Dynamic.literal(dismissNotification = js.Any.fromFunction1(dismissNotification), notifications = notifications.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setComponents(value: ComponentContextType): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
      
      inline def setDismissNotification(value: /* id */ String => Unit): Self = StObject.set(x, "dismissNotification", js.Any.fromFunction1(value))
      
      inline def setNotifications(value: js.Array[Notification]): Self = StObject.set(x, "notifications", value.asInstanceOf[js.Any])
      
      inline def setNotificationsVarargs(value: Notification*): Self = StObject.set(x, "notifications", js.Array(value*))
      
      inline def setSmallScreenBreakpoint(value: Double): Self = StObject.set(x, "smallScreenBreakpoint", value.asInstanceOf[js.Any])
      
      inline def setSmallScreenBreakpointUndefined: Self = StObject.set(x, "smallScreenBreakpoint", js.undefined)
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
}
