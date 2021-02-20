package typings.reactStackGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Appear extends StObject {
    
    def appear(): Unit = js.native
    
    def appeared(): Unit = js.native
    
    def enter(): Unit = js.native
    
    def entered(): Unit = js.native
    
    def leaved(): Unit = js.native
  }
  object Appear {
    
    @scala.inline
    def apply(
      appear: () => Unit,
      appeared: () => Unit,
      enter: () => Unit,
      entered: () => Unit,
      leaved: () => Unit
    ): Appear = {
      val __obj = js.Dynamic.literal(appear = js.Any.fromFunction0(appear), appeared = js.Any.fromFunction0(appeared), enter = js.Any.fromFunction0(enter), entered = js.Any.fromFunction0(entered), leaved = js.Any.fromFunction0(leaved))
      __obj.asInstanceOf[Appear]
    }
    
    @scala.inline
    implicit class AppearMutableBuilder[Self <: Appear] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppear(value: () => Unit): Self = StObject.set(x, "appear", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAppeared(value: () => Unit): Self = StObject.set(x, "appeared", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEnter(value: () => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEntered(value: () => Unit): Self = StObject.set(x, "entered", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLeaved(value: () => Unit): Self = StObject.set(x, "leaved", js.Any.fromFunction0(value))
    }
  }
}
