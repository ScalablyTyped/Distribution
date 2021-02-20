package typings.rxjs

import typings.rxjs.notificationMod.Notification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testMessageMod {
  
  @js.native
  trait TestMessage extends StObject {
    
    var frame: Double = js.native
    
    var isGhost: js.UndefOr[Boolean] = js.native
    
    var notification: Notification[_] = js.native
  }
  object TestMessage {
    
    @scala.inline
    def apply(frame: Double, notification: Notification[_]): TestMessage = {
      val __obj = js.Dynamic.literal(frame = frame.asInstanceOf[js.Any], notification = notification.asInstanceOf[js.Any])
      __obj.asInstanceOf[TestMessage]
    }
    
    @scala.inline
    implicit class TestMessageMutableBuilder[Self <: TestMessage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrame(value: Double): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsGhost(value: Boolean): Self = StObject.set(x, "isGhost", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsGhostUndefined: Self = StObject.set(x, "isGhost", js.undefined)
      
      @scala.inline
      def setNotification(value: Notification[_]): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
    }
  }
}
