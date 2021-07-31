package typings.reapop

import typings.react.mod.global.JSX.Element
import typings.reapop.themesTypesMod.Theme
import typings.reapop.typesMod.Notification
import typings.reapop.typesMod.NotificationButton
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notificationButtonMod {
  
  @JSImport("reapop/dist/components/NotificationButton", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(props: Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @scala.inline
  def NotificationButton(props: Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("NotificationButton")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait Props extends StObject {
    
    var button: NotificationButton
    
    var notification: Notification
    
    var position: Double
    
    var theme: js.UndefOr[Theme] = js.undefined
  }
  object Props {
    
    @scala.inline
    def apply(button: NotificationButton, notification: Notification, position: Double): Props = {
      val __obj = js.Dynamic.literal(button = button.asInstanceOf[js.Any], notification = notification.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setButton(value: NotificationButton): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotification(value: Notification): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
}
