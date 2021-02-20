package typings.reactNativeNavigation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventSubscriptionMod {
  
  @js.native
  trait EventSubscription extends StObject {
    
    def remove(): Unit = js.native
  }
  object EventSubscription {
    
    @scala.inline
    def apply(remove: () => Unit): EventSubscription = {
      val __obj = js.Dynamic.literal(remove = js.Any.fromFunction0(remove))
      __obj.asInstanceOf[EventSubscription]
    }
    
    @scala.inline
    implicit class EventSubscriptionMutableBuilder[Self <: EventSubscription] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
    }
  }
}
