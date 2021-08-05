package typings.slickgrid.Slick

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Plugins {
  
  trait HeaderButtons[T /* <: SlickData */]
    extends StObject
       with Plugin[T] {
    
    var onCommand: Event[OnCommandEventArgs[T]]
  }
  object HeaderButtons {
    
    inline def apply[T /* <: SlickData */](destroy: () => Unit, init: Grid[T] => Unit, onCommand: Event[OnCommandEventArgs[T]]): HeaderButtons[T] = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), init = js.Any.fromFunction1(init), onCommand = onCommand.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeaderButtons[T]]
    }
    
    extension [Self <: HeaderButtons[?], T /* <: SlickData */](x: Self & HeaderButtons[T]) {
      
      inline def setOnCommand(value: Event[OnCommandEventArgs[T]]): Self = StObject.set(x, "onCommand", value.asInstanceOf[js.Any])
    }
  }
}
