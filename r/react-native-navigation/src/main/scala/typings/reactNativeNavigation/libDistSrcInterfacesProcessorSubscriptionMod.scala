package typings.reactNativeNavigation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDistSrcInterfacesProcessorSubscriptionMod {
  
  trait ProcessorSubscription extends StObject {
    
    def remove(): Unit
  }
  object ProcessorSubscription {
    
    inline def apply(remove: () => Unit): ProcessorSubscription = {
      val __obj = js.Dynamic.literal(remove = js.Any.fromFunction0(remove))
      __obj.asInstanceOf[ProcessorSubscription]
    }
    
    extension [Self <: ProcessorSubscription](x: Self) {
      
      inline def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
    }
  }
}
