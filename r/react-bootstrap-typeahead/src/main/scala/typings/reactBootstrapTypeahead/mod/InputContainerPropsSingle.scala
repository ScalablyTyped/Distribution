package typings.reactBootstrapTypeahead.mod

import typings.react.mod.LegacyRef
import typings.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.both
import typings.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.combobox
import typings.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.list
import typings.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.listbox
import typings.std.Event
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputContainerPropsSingle[T /* <: TypeaheadModel */] extends StObject {
  
  var `aria-activedescendant`: String
  
  var `aria-autocomplete`: list | both
  
  var `aria-expanded`: Boolean
  
  var `aria-haspopup`: listbox
  
  var `aria-owns`: String
  
  var autoComplete: String
  
  var disabled: Boolean
  
  var inputRef: LegacyRef[HTMLInputElement]
  
  def onBlur(e: Event): Unit
  
  def onChange(selected: js.Array[T]): Unit
  
  def onClick(e: Event): Unit
  
  def onFocus(e: Event): Unit
  
  def onKeyDown(e: Event): Unit
  
  var placeholder: String | Null
  
  var role: combobox
  
  var value: String
}
object InputContainerPropsSingle {
  
  inline def apply[T /* <: TypeaheadModel */](
    `aria-activedescendant`: String,
    `aria-autocomplete`: list | both,
    `aria-expanded`: Boolean,
    `aria-owns`: String,
    autoComplete: String,
    disabled: Boolean,
    onBlur: Event => Unit,
    onChange: js.Array[T] => Unit,
    onClick: Event => Unit,
    onFocus: Event => Unit,
    onKeyDown: Event => Unit,
    value: String
  ): InputContainerPropsSingle[T] = {
    val __obj = js.Dynamic.literal(autoComplete = autoComplete.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], onBlur = js.Any.fromFunction1(onBlur), onChange = js.Any.fromFunction1(onChange), onClick = js.Any.fromFunction1(onClick), onFocus = js.Any.fromFunction1(onFocus), onKeyDown = js.Any.fromFunction1(onKeyDown), role = "combobox", value = value.asInstanceOf[js.Any], inputRef = null, placeholder = null)
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
    
    inline def setInputRef(value: LegacyRef[HTMLInputElement]): Self = StObject.set(x, "inputRef", value.asInstanceOf[js.Any])
    
    inline def setInputRefFunction1(value: /* instance */ HTMLInputElement | Null => Unit): Self = StObject.set(x, "inputRef", js.Any.fromFunction1(value))
    
    inline def setInputRefNull: Self = StObject.set(x, "inputRef", null)
    
    inline def setOnBlur(value: Event => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
    
    inline def setOnChange(value: js.Array[T] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOnClick(value: Event => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnFocus(value: Event => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
    
    inline def setOnKeyDown(value: Event => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderNull: Self = StObject.set(x, "placeholder", null)
    
    inline def setRole(value: combobox): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
