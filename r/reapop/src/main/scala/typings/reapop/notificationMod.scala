package typings.reapop

import typings.react.mod.global.JSX.Element
import typings.reapop.componentsContextMod.ComponentContextType
import typings.reapop.notificationsSystemMod.DismissNotification
import typings.reapop.themesTypesMod.Theme
import typings.reapop.typesMod.Notification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notificationMod {
  
  @JSImport("reapop/dist/components/Notification", JSImport.Default)
  @js.native
  def default(props: Props): Element = js.native
  
  @js.native
  trait Props extends StObject {
    
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
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponents(value: ComponentContextType): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDismissNotification(value: /* id */ String => Unit): Self = StObject.set(x, "dismissNotification", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNotification(value: Notification): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
}
