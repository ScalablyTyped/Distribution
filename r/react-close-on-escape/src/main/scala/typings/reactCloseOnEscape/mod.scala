package typings.reactCloseOnEscape

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-close-on-escape", JSImport.Default)
  @js.native
  class default ()
    extends Component[CloseOnEscapeProps, js.Object, js.Any]
  
  type CloseOnEscape = Component[CloseOnEscapeProps, js.Object, js.Any]
  
  trait CloseOnEscapeProps extends StObject {
    
    /**
      * Callback triggered by pressing ESC
      */
    def onEscape(): Unit
  }
  object CloseOnEscapeProps {
    
    @scala.inline
    def apply(onEscape: () => Unit): CloseOnEscapeProps = {
      val __obj = js.Dynamic.literal(onEscape = js.Any.fromFunction0(onEscape))
      __obj.asInstanceOf[CloseOnEscapeProps]
    }
    
    @scala.inline
    implicit class CloseOnEscapePropsMutableBuilder[Self <: CloseOnEscapeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnEscape(value: () => Unit): Self = StObject.set(x, "onEscape", js.Any.fromFunction0(value))
    }
  }
}
