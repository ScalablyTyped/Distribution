package typings.rxjs

import typings.rxjs.notificationMod.Notification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testMessageMod {
  
  trait TestMessage extends StObject {
    
    var frame: Double
    
    var isGhost: js.UndefOr[Boolean] = js.undefined
    
    var notification: Notification[js.Any]
  }
  object TestMessage {
    
    inline def apply(frame: Double, notification: Notification[js.Any]): TestMessage = {
      val __obj = js.Dynamic.literal(frame = frame.asInstanceOf[js.Any], notification = notification.asInstanceOf[js.Any])
      __obj.asInstanceOf[TestMessage]
    }
    
    extension [Self <: TestMessage](x: Self) {
      
      inline def setFrame(value: Double): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
      
      inline def setIsGhost(value: Boolean): Self = StObject.set(x, "isGhost", value.asInstanceOf[js.Any])
      
      inline def setIsGhostUndefined: Self = StObject.set(x, "isGhost", js.undefined)
      
      inline def setNotification(value: Notification[js.Any]): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
    }
  }
}
