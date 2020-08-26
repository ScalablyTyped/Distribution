package typings.reactToolbox.autocompleteAutocompleteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutocompleteTheme extends js.Object {
  /**
    * Used for a suggestion when it's active.
    */
  var active: js.UndefOr[String] = js.native
  /**
    * Used for the root element.
    */
  var autocomplete: js.UndefOr[String] = js.native
  /**
    * Used when the input is focused.
    */
  var focus: js.UndefOr[String] = js.native
  /**
    * Used to style the Input component.
    */
  var input: js.UndefOr[String] = js.native
  /**
    * Used to style each suggestion.
    */
  var suggestion: js.UndefOr[String] = js.native
  /**
    * Used to style the suggestions container.
    */
  var suggestions: js.UndefOr[String] = js.native
  /**
    * Used for the suggestions when it's opening to the top.
    */
  var up: js.UndefOr[String] = js.native
  /**
    * Classname used for a single value.
    */
  var value: js.UndefOr[String] = js.native
  /**
    * Classname used for the values container.
    */
  var values: js.UndefOr[String] = js.native
}

object AutocompleteTheme {
  @scala.inline
  def apply(): AutocompleteTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutocompleteTheme]
  }
  @scala.inline
  implicit class AutocompleteThemeOps[Self <: AutocompleteTheme] (val x: Self) extends AnyVal {
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
    def setActive(value: String): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setAutocomplete(value: String): Self = this.set("autocomplete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutocomplete: Self = this.set("autocomplete", js.undefined)
    @scala.inline
    def setFocus(value: String): Self = this.set("focus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocus: Self = this.set("focus", js.undefined)
    @scala.inline
    def setInput(value: String): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    @scala.inline
    def setSuggestion(value: String): Self = this.set("suggestion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuggestion: Self = this.set("suggestion", js.undefined)
    @scala.inline
    def setSuggestions(value: String): Self = this.set("suggestions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuggestions: Self = this.set("suggestions", js.undefined)
    @scala.inline
    def setUp(value: String): Self = this.set("up", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUp: Self = this.set("up", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setValues(value: String): Self = this.set("values", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
  
}

