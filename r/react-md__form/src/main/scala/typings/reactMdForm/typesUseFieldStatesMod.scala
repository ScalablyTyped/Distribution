package typings.reactMdForm

import typings.react.mod.ChangeEvent
import typings.react.mod.ChangeEventHandler
import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.std.Element
import typings.std.HTMLInputElement
import typings.std.HTMLSelectElement
import typings.std.HTMLTextAreaElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUseFieldStatesMod {
  
  @JSImport("@react-md/form/types/useFieldStates", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useFieldStates[E /* <: FormElement */](param0: FieldStatesOptions[E]): ReturnValue[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFieldStates")(param0.asInstanceOf[js.Any]).asInstanceOf[ReturnValue[E]]
  
  /**
    * @internal
    * @remarks \@since 2.5.2
    */
  trait EventHandlers[E /* <: FormElement */] extends StObject {
    
    var onBlur: js.UndefOr[FocusEventHandler[E]] = js.undefined
    
    var onChange: js.UndefOr[ChangeEventHandler[E]] = js.undefined
    
    var onFocus: js.UndefOr[FocusEventHandler[E]] = js.undefined
  }
  object EventHandlers {
    
    inline def apply[E /* <: FormElement */](): EventHandlers[E] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventHandlers[E]]
    }
    
    extension [Self <: EventHandlers[?], E /* <: FormElement */](x: Self & EventHandlers[E]) {
      
      inline def setOnBlur(value: FocusEvent[E, Element] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(value: ChangeEvent[E] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnFocus(value: FocusEvent[E, Element] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    }
  }
  
  /**
    * @internal
    * @remarks \@since 2.5.2
    */
  trait FieldStatesOptions[E /* <: FormElement */]
    extends StObject
       with EventHandlers[E] {
    
    var defaultValue: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var value: js.UndefOr[String | js.Array[String]] = js.undefined
  }
  object FieldStatesOptions {
    
    inline def apply[E /* <: FormElement */](): FieldStatesOptions[E] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FieldStatesOptions[E]]
    }
    
    extension [Self <: FieldStatesOptions[?], E /* <: FormElement */](x: Self & FieldStatesOptions[E]) {
      
      inline def setDefaultValue(value: String | js.Array[String]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDefaultValueVarargs(value: String*): Self = StObject.set(x, "defaultValue", js.Array(value*))
      
      inline def setValue(value: String | js.Array[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value*))
    }
  }
  
  /**
    * @internal
    * @remarks \@since 2.5.2
    */
  type FormElement = HTMLInputElement | HTMLTextAreaElement | HTMLSelectElement
  
  /**
    * @internal
    * @remarks \@since 2.5.2
    */
  /* Inlined parent std.Required<@react-md/form.@react-md/form/types/useFieldStates.EventHandlers<E>> */
  trait ReturnValue[E /* <: FormElement */] extends StObject {
    
    /**
      * Boolean if the TextField or TextArea currently has focus.
      */
    var focused: Boolean
    
    var onBlur: FocusEventHandler[E]
    
    var onChange: ChangeEventHandler[E]
    
    var onFocus: FocusEventHandler[E]
    
    /**
      * Boolean if the TextField or TextArea current has a value with a `length > 0`
      * so that any labels will correctly float above the text field. This will
      * also make sure that number inputs will still be considered valued when
      * there is a `badInput` validity error.
      */
    var valued: Boolean
  }
  object ReturnValue {
    
    inline def apply[E /* <: FormElement */](
      focused: Boolean,
      onBlur: FocusEvent[E, Element] => Unit,
      onChange: ChangeEvent[E] => Unit,
      onFocus: FocusEvent[E, Element] => Unit,
      valued: Boolean
    ): ReturnValue[E] = {
      val __obj = js.Dynamic.literal(focused = focused.asInstanceOf[js.Any], onBlur = js.Any.fromFunction1(onBlur), onChange = js.Any.fromFunction1(onChange), onFocus = js.Any.fromFunction1(onFocus), valued = valued.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReturnValue[E]]
    }
    
    extension [Self <: ReturnValue[?], E /* <: FormElement */](x: Self & ReturnValue[E]) {
      
      inline def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      inline def setOnBlur(value: FocusEvent[E, Element] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnChange(value: ChangeEvent[E] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnFocus(value: FocusEvent[E, Element] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setValued(value: Boolean): Self = StObject.set(x, "valued", value.asInstanceOf[js.Any])
    }
  }
}
