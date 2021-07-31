package typings.sipJs

import typings.sipJs.notificationMod.Notification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subscriptionDelegateMod {
  
  trait SubscriptionDelegate extends StObject {
    
    /**
      * Called upon receiving an incoming NOTIFY request.
      * @param notification - A notification. See {@link Notification} for details.
      */
    def onNotify(notification: Notification): Unit
  }
  object SubscriptionDelegate {
    
    @scala.inline
    def apply(onNotify: Notification => Unit): SubscriptionDelegate = {
      val __obj = js.Dynamic.literal(onNotify = js.Any.fromFunction1(onNotify))
      __obj.asInstanceOf[SubscriptionDelegate]
    }
    
    @scala.inline
    implicit class SubscriptionDelegateMutableBuilder[Self <: SubscriptionDelegate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnNotify(value: Notification => Unit): Self = StObject.set(x, "onNotify", js.Any.fromFunction1(value))
    }
  }
}
