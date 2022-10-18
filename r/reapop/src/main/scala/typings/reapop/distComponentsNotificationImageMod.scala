package typings.reapop

import typings.react.mod.global.JSX.Element
import typings.reapop.distReducersNotificationsTypesMod.Notification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComponentsNotificationImageMod {
  
  @JSImport("reapop/dist/components/NotificationImage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait Props extends StObject {
    
    var notification: Notification
  }
  object Props {
    
    inline def apply(notification: Notification): Props = {
      val __obj = js.Dynamic.literal(notification = notification.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setNotification(value: Notification): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
    }
  }
}
