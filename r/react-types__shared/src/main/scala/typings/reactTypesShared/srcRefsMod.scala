package typings.reactTypesShared

import typings.react.mod.Ref
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcRefsMod {
  
  type DOMRef[T /* <: HTMLElement */] = Ref[DOMRefValue[T]]
  
  trait DOMRefValue[T /* <: HTMLElement */] extends StObject {
    
    def UNSAFE_getDOMNode(): T
  }
  object DOMRefValue {
    
    inline def apply[T /* <: HTMLElement */](UNSAFE_getDOMNode: () => T): DOMRefValue[T] = {
      val __obj = js.Dynamic.literal(UNSAFE_getDOMNode = js.Any.fromFunction0(UNSAFE_getDOMNode))
      __obj.asInstanceOf[DOMRefValue[T]]
    }
    
    extension [Self <: DOMRefValue[?], T /* <: HTMLElement */](x: Self & DOMRefValue[T]) {
      
      inline def setUNSAFE_getDOMNode(value: () => T): Self = StObject.set(x, "UNSAFE_getDOMNode", js.Any.fromFunction0(value))
    }
  }
  
  type FocusableRef[T /* <: HTMLElement */] = Ref[FocusableRefValue[T, T]]
  
  trait FocusableRefValue[T /* <: HTMLElement */, D /* <: HTMLElement */]
    extends StObject
       with DOMRefValue[D] {
    
    def focus(): Unit
  }
  object FocusableRefValue {
    
    inline def apply[T /* <: HTMLElement */, D /* <: HTMLElement */](UNSAFE_getDOMNode: () => D, focus: () => Unit): FocusableRefValue[T, D] = {
      val __obj = js.Dynamic.literal(UNSAFE_getDOMNode = js.Any.fromFunction0(UNSAFE_getDOMNode), focus = js.Any.fromFunction0(focus))
      __obj.asInstanceOf[FocusableRefValue[T, D]]
    }
    
    extension [Self <: FocusableRefValue[?, ?], T /* <: HTMLElement */, D /* <: HTMLElement */](x: Self & (FocusableRefValue[T, D])) {
      
      inline def setFocus(value: () => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
    }
  }
}
