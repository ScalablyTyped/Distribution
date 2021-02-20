package typings.reapop

import typings.react.mod.global.JSX.Element
import typings.reapop.notificationsSystemMod.DismissNotification
import typings.reapop.typesMod.Notification
import typings.reapop.typesMod.Position
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notificationsContainerMod {
  
  @JSImport("reapop/dist/components/NotificationsContainer", JSImport.Default)
  @js.native
  def default(props: Props): Element = js.native
  
  @js.native
  trait Props extends StObject {
    
    var dismissNotification: DismissNotification = js.native
    
    var notifications: js.Array[Notification] = js.native
    
    var position: Position = js.native
    
    var singleContainer: Boolean = js.native
  }
  object Props {
    
    @scala.inline
    def apply(
      dismissNotification: /* id */ String => Unit,
      notifications: js.Array[Notification],
      position: Position,
      singleContainer: Boolean
    ): Props = {
      val __obj = js.Dynamic.literal(dismissNotification = js.Any.fromFunction1(dismissNotification), notifications = notifications.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], singleContainer = singleContainer.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDismissNotification(value: /* id */ String => Unit): Self = StObject.set(x, "dismissNotification", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNotifications(value: js.Array[Notification]): Self = StObject.set(x, "notifications", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotificationsVarargs(value: Notification*): Self = StObject.set(x, "notifications", js.Array(value :_*))
      
      @scala.inline
      def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSingleContainer(value: Boolean): Self = StObject.set(x, "singleContainer", value.asInstanceOf[js.Any])
    }
  }
}
