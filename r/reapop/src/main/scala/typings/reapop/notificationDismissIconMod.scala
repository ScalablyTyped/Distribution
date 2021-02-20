package typings.reapop

import typings.react.mod.SyntheticEvent
import typings.react.mod.global.JSX.Element
import typings.reapop.themesTypesMod.Theme
import typings.reapop.typesMod.Notification
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notificationDismissIconMod {
  
  @JSImport("reapop/dist/components/NotificationDismissIcon", JSImport.Default)
  @js.native
  def default(props: Props): Element = js.native
  
  @js.native
  trait Props extends StObject {
    
    def dismissNotification(event: SyntheticEvent[typings.std.Element, Event]): Unit = js.native
    
    var notification: Notification = js.native
    
    var theme: js.UndefOr[Theme] = js.native
  }
  object Props {
    
    @scala.inline
    def apply(
      dismissNotification: SyntheticEvent[typings.std.Element, Event] => Unit,
      notification: Notification
    ): Props = {
      val __obj = js.Dynamic.literal(dismissNotification = js.Any.fromFunction1(dismissNotification), notification = notification.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDismissNotification(value: SyntheticEvent[typings.std.Element, Event] => Unit): Self = StObject.set(x, "dismissNotification", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNotification(value: Notification): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
}
