package typings.reapop

import typings.react.mod.global.JSX.Element
import typings.reapop.distComponentsNotificationsSystemMod.DismissNotification
import typings.reapop.distReducersNotificationsTypesMod.Notification
import typings.reapop.distReducersNotificationsTypesMod.Position
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComponentsNotificationsContainerMod {
  
  @JSImport("reapop/dist/components/NotificationsContainer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait Props extends StObject {
    
    var dismissNotification: DismissNotification
    
    var notifications: js.Array[Notification]
    
    var position: Position
    
    var singleContainer: Boolean
  }
  object Props {
    
    inline def apply(
      dismissNotification: /* id */ String => Unit,
      notifications: js.Array[Notification],
      position: Position,
      singleContainer: Boolean
    ): Props = {
      val __obj = js.Dynamic.literal(dismissNotification = js.Any.fromFunction1(dismissNotification), notifications = notifications.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], singleContainer = singleContainer.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setDismissNotification(value: /* id */ String => Unit): Self = StObject.set(x, "dismissNotification", js.Any.fromFunction1(value))
      
      inline def setNotifications(value: js.Array[Notification]): Self = StObject.set(x, "notifications", value.asInstanceOf[js.Any])
      
      inline def setNotificationsVarargs(value: Notification*): Self = StObject.set(x, "notifications", js.Array(value*))
      
      inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setSingleContainer(value: Boolean): Self = StObject.set(x, "singleContainer", value.asInstanceOf[js.Any])
    }
  }
}
