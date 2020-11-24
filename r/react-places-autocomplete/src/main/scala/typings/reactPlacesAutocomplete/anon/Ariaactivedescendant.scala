package typings.reactPlacesAutocomplete.anon

import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.reactPlacesAutocomplete.reactPlacesAutocompleteStrings.combobox
import typings.reactPlacesAutocomplete.reactPlacesAutocompleteStrings.list
import typings.reactPlacesAutocomplete.reactPlacesAutocompleteStrings.off
import typings.reactPlacesAutocomplete.reactPlacesAutocompleteStrings.text
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ariaactivedescendant extends js.Object {
  
  var `aria-activedescendant`: js.UndefOr[String] = js.native
  
  var `aria-autocomplete`: list = js.native
  
  var `aria-expanded`: Boolean = js.native
  
  var autoComplete: off = js.native
  
  var disabled: Boolean = js.native
  
  var onBlur: FocusEventHandler[Element] = js.native
  
  def onChange(ev: Target): Unit = js.native
  
  var onKeyDown: KeyboardEventHandler[Element] = js.native
  
  var role: combobox = js.native
  
  var `type`: text = js.native
  
  var value: js.UndefOr[String] = js.native
}
object Ariaactivedescendant {
  
  @scala.inline
  def apply(
    `aria-autocomplete`: list,
    `aria-expanded`: Boolean,
    autoComplete: off,
    disabled: Boolean,
    onBlur: FocusEvent[Element] => Unit,
    onChange: Target => Unit,
    onKeyDown: KeyboardEvent[Element] => Unit,
    role: combobox,
    `type`: text
  ): Ariaactivedescendant = {
    val __obj = js.Dynamic.literal(autoComplete = autoComplete.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], onBlur = js.Any.fromFunction1(onBlur), onChange = js.Any.fromFunction1(onChange), onKeyDown = js.Any.fromFunction1(onKeyDown), role = role.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-autocomplete")(`aria-autocomplete`.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-expanded")(`aria-expanded`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ariaactivedescendant]
  }
  
  @scala.inline
  implicit class AriaactivedescendantOps[Self <: Ariaactivedescendant] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def `setAria-autocomplete`(value: list): Self = this.set("aria-autocomplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-expanded`(value: Boolean): Self = this.set("aria-expanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoComplete(value: off): Self = this.set("autoComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnBlur(value: FocusEvent[Element] => Unit): Self = this.set("onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnChange(value: Target => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnKeyDown(value: KeyboardEvent[Element] => Unit): Self = this.set("onKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRole(value: combobox): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: text): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-activedescendant`(value: String): Self = this.set("aria-activedescendant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-activedescendant`: Self = this.set("aria-activedescendant", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
