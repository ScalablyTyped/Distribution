package typings.reapop

import typings.react.mod.global.JSX.Element
import typings.reapop.typesMod.Notification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notificationImageMod {
  
  @JSImport("reapop/dist/components/NotificationImage", JSImport.Default)
  @js.native
  def default(props: Props): Element = js.native
  
  @js.native
  trait Props extends StObject {
    
    var notification: Notification = js.native
  }
  object Props {
    
    @scala.inline
    def apply(notification: Notification): Props = {
      val __obj = js.Dynamic.literal(notification = notification.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNotification(value: Notification): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
    }
  }
}
