package typings.rbx

import typings.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalContextMod {
  
  @JSImport("rbx/components/modal/modal-context", "ModalContext")
  @js.native
  val ModalContext: Context[ModalContextValue] = js.native
  
  @JSImport("rbx/components/modal/modal-context", "initialValue")
  @js.native
  val initialValue: ModalContextValue = js.native
  
  trait ModalContextValue extends StObject {
    
    def close(): Unit
    
    var closeOnBlur: Boolean
    
    var closeOnEsc: Boolean
  }
  object ModalContextValue {
    
    @scala.inline
    def apply(close: () => Unit, closeOnBlur: Boolean, closeOnEsc: Boolean): ModalContextValue = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), closeOnBlur = closeOnBlur.asInstanceOf[js.Any], closeOnEsc = closeOnEsc.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModalContextValue]
    }
    
    @scala.inline
    implicit class ModalContextValueMutableBuilder[Self <: ModalContextValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCloseOnBlur(value: Boolean): Self = StObject.set(x, "closeOnBlur", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseOnEsc(value: Boolean): Self = StObject.set(x, "closeOnEsc", value.asInstanceOf[js.Any])
    }
  }
}
