package typings.reapop

import typings.react.mod.global.JSX.Element
import typings.reapop.distComponentsNotificationsSystemMod.DismissNotification
import typings.reapop.distContextsComponentsContextMod.ComponentContextType
import typings.reapop.distReducersNotificationsTypesMod.Notification
import typings.reapop.distThemesTypesMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComponentsNotificationMod {
  
  @JSImport("reapop/dist/components/Notification", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait Props extends StObject {
    
    var components: ComponentContextType
    
    var dismissNotification: DismissNotification
    
    var notification: Notification
    
    var theme: js.UndefOr[Theme] = js.undefined
  }
  object Props {
    
    inline def apply(
      components: ComponentContextType,
      dismissNotification: /* id */ String => Unit,
      notification: Notification
    ): Props = {
      val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], dismissNotification = js.Any.fromFunction1(dismissNotification), notification = notification.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def setComponents(value: ComponentContextType): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      inline def setDismissNotification(value: /* id */ String => Unit): Self = StObject.set(x, "dismissNotification", js.Any.fromFunction1(value))
      
      inline def setNotification(value: Notification): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
}
