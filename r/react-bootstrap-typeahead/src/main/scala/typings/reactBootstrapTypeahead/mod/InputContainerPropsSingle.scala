package typings.reactBootstrapTypeahead.mod

import typings.react.mod.LegacyRef
import typings.react.mod.SyntheticEvent
import typings.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.both
import typings.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.combobox
import typings.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.list
import typings.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.listbox
import typings.std.Element
import typings.std.Event
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputContainerPropsSingle[T /* <: TypeaheadModel */]
  extends StObject
     with InputProps {
  
  @JSName("aria-activedescendant")
  var `aria-activedescendant_InputContainerPropsSingle`: String
  
  @JSName("aria-autocomplete")
  var `aria-autocomplete_InputContainerPropsSingle`: list | both
  
  @JSName("aria-expanded")
  var `aria-expanded_InputContainerPropsSingle`: Boolean
  
  @JSName("aria-haspopup")
  var `aria-haspopup_InputContainerPropsSingle`: listbox
  
  @JSName("aria-owns")
  var `aria-owns_InputContainerPropsSingle`: String
  
  @JSName("autoComplete")
  var autoComplete_InputContainerPropsSingle: String
  
  @JSName("disabled")
  var disabled_InputContainerPropsSingle: Boolean
  
  var inputClassName: String
  
  var inputRef: LegacyRef[HTMLInputElement]
  
  def onBlur(e: SyntheticEvent[Element, Event]): Unit
  
  def onChange(selected: js.Array[T]): Unit
  
  @JSName("onClick")
  def onClick_MInputContainerPropsSingle(e: SyntheticEvent[HTMLInputElement, Event]): Unit
  
  def onFocus(e: SyntheticEvent[Element, Event]): Unit
  
  def onKeyDown(e: SyntheticEvent[Element, Event]): Unit
  
  @JSName("role")
  var role_InputContainerPropsSingle: combobox
  
  @JSName("value")
  var value_InputContainerPropsSingle: String
}
object InputContainerPropsSingle {
  
  inline def apply[T /* <: TypeaheadModel */](
    `aria-activedescendant`: String,
    `aria-autocomplete`: list | both,
    `aria-expanded`: Boolean,
    `aria-owns`: String,
    autoComplete: String,
    disabled: Boolean,
    inputClassName: String,
    onBlur: SyntheticEvent[Element, Event] => Unit,
    onChange: js.Array[T] => Unit,
    onClick: SyntheticEvent[HTMLInputElement, Event] => Unit,
    onFocus: SyntheticEvent[Element, Event] => Unit,
    onKeyDown: SyntheticEvent[Element, Event] => Unit,
    value: String
  ): InputContainerPropsSingle[T] = {
    val __obj = js.Dynamic.literal(autoComplete = autoComplete.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], inputClassName = inputClassName.asInstanceOf[js.Any], onBlur = js.Any.fromFunction1(onBlur), onChange = js.Any.fromFunction1(onChange), onClick = js.Any.fromFunction1(onClick), onFocus = js.Any.fromFunction1(onFocus), onKeyDown = js.Any.fromFunction1(onKeyDown), role = "combobox", value = value.asInstanceOf[js.Any], inputRef = null)
    __obj.updateDynamic("aria-activedescendant")(`aria-activedescendant`.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-autocomplete")(`aria-autocomplete`.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-expanded")(`aria-expanded`.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-haspopup")("listbox")
    __obj.updateDynamic("aria-owns")(`aria-owns`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputContainerPropsSingle[T]]
  }
  
  extension [Self <: InputContainerPropsSingle[?], T /* <: TypeaheadModel */](x: Self & InputContainerPropsSingle[T]) {
    
    inline def `setAria-activedescendant`(value: String): Self = StObject.set(x, "aria-activedescendant", value.asInstanceOf[js.Any])
    
    inline def `setAria-autocomplete`(value: list | both): Self = StObject.set(x, "aria-autocomplete", value.asInstanceOf[js.Any])
    
    inline def `setAria-expanded`(value: Boolean): Self = StObject.set(x, "aria-expanded", value.asInstanceOf[js.Any])
    
    inline def `setAria-haspopup`(value: listbox): Self = StObject.set(x, "aria-haspopup", value.asInstanceOf[js.Any])
    
    inline def `setAria-owns`(value: String): Self = StObject.set(x, "aria-owns", value.asInstanceOf[js.Any])
    
    inline def setAutoComplete(value: String): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setInputClassName(value: String): Self = StObject.set(x, "inputClassName", value.asInstanceOf[js.Any])
    
    inline def setInputRef(value: LegacyRef[HTMLInputElement]): Self = StObject.set(x, "inputRef", value.asInstanceOf[js.Any])
    
    inline def setInputRefFunction1(value: /* instance */ HTMLInputElement | Null => Unit): Self = StObject.set(x, "inputRef", js.Any.fromFunction1(value))
    
    inline def setInputRefNull: Self = StObject.set(x, "inputRef", null)
    
    inline def setOnBlur(value: SyntheticEvent[Element, Event] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
    
    inline def setOnChange(value: js.Array[T] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOnClick(value: SyntheticEvent[HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnFocus(value: SyntheticEvent[Element, Event] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
    
    inline def setOnKeyDown(value: SyntheticEvent[Element, Event] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
    
    inline def setRole(value: combobox): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
