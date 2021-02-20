package typings.reactMdForm

import typings.react.mod.ChangeEvent
import typings.std.HTMLInputElement
import typings.std.HTMLSelectElement
import typings.std.HTMLTextAreaElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useValuedStateMod {
  
  @JSImport("@react-md/form/types/text-field/useValuedState", "useValuedState")
  @js.native
  def useValuedState[T /* <: TextElement */](hasOnChangeValueDefaultValue: Options[T]): js.Tuple2[Boolean, js.UndefOr[ChangeEventHandler[T]]] = js.native
  
  type ChangeEventHandler[T /* <: TextElement */] = typings.react.mod.ChangeEventHandler[T]
  
  @js.native
  trait Options[T /* <: TextElement */] extends StObject {
    
    var defaultValue: js.UndefOr[Value] = js.native
    
    var onChange: js.UndefOr[ChangeEventHandler[T]] = js.native
    
    var value: js.UndefOr[Value] = js.native
  }
  object Options {
    
    @scala.inline
    def apply[T /* <: TextElement */](): Options[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[T]]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options[_], T /* <: TextElement */] (val x: Self with Options[T]) extends AnyVal {
      
      @scala.inline
      def setDefaultValue(value: Value): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDefaultValueVarargs(value: (String | Double)*): Self = StObject.set(x, "defaultValue", js.Array(value :_*))
      
      @scala.inline
      def setOnChange(value: ChangeEvent[T] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setValue(value: Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setValueVarargs(value: (String | Double)*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
  
  type TextElement = HTMLInputElement | HTMLTextAreaElement | HTMLSelectElement
  
  type Value = String | Double | (js.Array[String | Double])
}
