package typings.reactMdForm

import typings.react.mod.ChangeEvent
import typings.std.HTMLInputElement
import typings.std.HTMLSelectElement
import typings.std.HTMLTextAreaElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useValuedStateMod {
  
  @JSImport("@react-md/form/types/text-field/useValuedState", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useValuedState[T /* <: TextElement */](hasOnChangeValueDefaultValue: Options[T]): js.Tuple2[Boolean, js.UndefOr[ChangeEventHandler[T]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useValuedState")(hasOnChangeValueDefaultValue.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[Boolean, js.UndefOr[ChangeEventHandler[T]]]]
  
  type ChangeEventHandler[T /* <: TextElement */] = typings.react.mod.ChangeEventHandler[T]
  
  trait Options[T /* <: TextElement */] extends StObject {
    
    var defaultValue: js.UndefOr[Value] = js.undefined
    
    var onChange: js.UndefOr[ChangeEventHandler[T]] = js.undefined
    
    var value: js.UndefOr[Value] = js.undefined
  }
  object Options {
    
    inline def apply[T /* <: TextElement */](): Options[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[T]]
    }
    
    extension [Self <: Options[?], T /* <: TextElement */](x: Self & Options[T]) {
      
      inline def setDefaultValue(value: Value): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDefaultValueVarargs(value: (String | Double)*): Self = StObject.set(x, "defaultValue", js.Array(value :_*))
      
      inline def setOnChange(value: ChangeEvent[T] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setValue(value: Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: (String | Double)*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
  
  type TextElement = HTMLInputElement | HTMLTextAreaElement | HTMLSelectElement
  
  type Value = String | Double | (js.Array[String | Double])
}
