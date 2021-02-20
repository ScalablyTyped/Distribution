package typings.reactNativeNavigation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object processorSubscriptionMod {
  
  @js.native
  trait ProcessorSubscription extends StObject {
    
    def remove(): Unit = js.native
  }
  object ProcessorSubscription {
    
    @scala.inline
    def apply(remove: () => Unit): ProcessorSubscription = {
      val __obj = js.Dynamic.literal(remove = js.Any.fromFunction0(remove))
      __obj.asInstanceOf[ProcessorSubscription]
    }
    
    @scala.inline
    implicit class ProcessorSubscriptionMutableBuilder[Self <: ProcessorSubscription] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
    }
  }
}
