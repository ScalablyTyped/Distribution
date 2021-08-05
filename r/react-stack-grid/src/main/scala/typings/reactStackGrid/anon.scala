package typings.reactStackGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Appear extends StObject {
    
    def appear(): Unit
    
    def appeared(): Unit
    
    def enter(): Unit
    
    def entered(): Unit
    
    def leaved(): Unit
  }
  object Appear {
    
    inline def apply(
      appear: () => Unit,
      appeared: () => Unit,
      enter: () => Unit,
      entered: () => Unit,
      leaved: () => Unit
    ): Appear = {
      val __obj = js.Dynamic.literal(appear = js.Any.fromFunction0(appear), appeared = js.Any.fromFunction0(appeared), enter = js.Any.fromFunction0(enter), entered = js.Any.fromFunction0(entered), leaved = js.Any.fromFunction0(leaved))
      __obj.asInstanceOf[Appear]
    }
    
    extension [Self <: Appear](x: Self) {
      
      inline def setAppear(value: () => Unit): Self = StObject.set(x, "appear", js.Any.fromFunction0(value))
      
      inline def setAppeared(value: () => Unit): Self = StObject.set(x, "appeared", js.Any.fromFunction0(value))
      
      inline def setEnter(value: () => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction0(value))
      
      inline def setEntered(value: () => Unit): Self = StObject.set(x, "entered", js.Any.fromFunction0(value))
      
      inline def setLeaved(value: () => Unit): Self = StObject.set(x, "leaved", js.Any.fromFunction0(value))
    }
  }
}
