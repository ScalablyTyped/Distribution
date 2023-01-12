package typings.reactTypesShared

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ContinuePropagation extends StObject {
    
    def continuePropagation(): Unit
    
    /** @deprecated Use continuePropagation. */
    def stopPropagation(): Unit
  }
  object ContinuePropagation {
    
    inline def apply(continuePropagation: () => Unit, stopPropagation: () => Unit): ContinuePropagation = {
      val __obj = js.Dynamic.literal(continuePropagation = js.Any.fromFunction0(continuePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation))
      __obj.asInstanceOf[ContinuePropagation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContinuePropagation] (val x: Self) extends AnyVal {
      
      inline def setContinuePropagation(value: () => Unit): Self = StObject.set(x, "continuePropagation", js.Any.fromFunction0(value))
      
      inline def setStopPropagation(value: () => Unit): Self = StObject.set(x, "stopPropagation", js.Any.fromFunction0(value))
    }
  }
}
