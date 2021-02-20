package typings.slickgrid.Slick

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Plugins {
  
  @js.native
  trait HeaderButtons[T /* <: SlickData */] extends Plugin[T] {
    
    var onCommand: Event[OnCommandEventArgs[T]] = js.native
  }
  object HeaderButtons {
    
    @scala.inline
    def apply[T /* <: SlickData */](destroy: () => Unit, init: Grid[T] => Unit, onCommand: Event[OnCommandEventArgs[T]]): HeaderButtons[T] = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), init = js.Any.fromFunction1(init), onCommand = onCommand.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeaderButtons[T]]
    }
    
    @scala.inline
    implicit class HeaderButtonsMutableBuilder[Self <: HeaderButtons[_], T /* <: SlickData */] (val x: Self with HeaderButtons[T]) extends AnyVal {
      
      @scala.inline
      def setOnCommand(value: Event[OnCommandEventArgs[T]]): Self = StObject.set(x, "onCommand", value.asInstanceOf[js.Any])
    }
  }
}
