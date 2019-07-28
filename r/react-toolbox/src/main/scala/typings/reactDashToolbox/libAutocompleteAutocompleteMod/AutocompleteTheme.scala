package typings.reactDashToolbox.libAutocompleteAutocompleteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutocompleteTheme extends js.Object {
  /**
    * Used for a suggestion when it's active.
    */
  var active: js.UndefOr[String] = js.undefined
  /**
    * Used for the root element.
    */
  var autocomplete: js.UndefOr[String] = js.undefined
  /**
    * Used when the input is focused.
    */
  var focus: js.UndefOr[String] = js.undefined
  /**
    * Used to style the Input component.
    */
  var input: js.UndefOr[String] = js.undefined
  /**
    * Used to style each suggestion.
    */
  var suggestion: js.UndefOr[String] = js.undefined
  /**
    * Used to style the suggestions container.
    */
  var suggestions: js.UndefOr[String] = js.undefined
  /**
    * Used for the suggestions when it's opening to the top.
    */
  var up: js.UndefOr[String] = js.undefined
  /**
    * Classname used for a single value.
    */
  var value: js.UndefOr[String] = js.undefined
  /**
    * Classname used for the values container.
    */
  var values: js.UndefOr[String] = js.undefined
}

object AutocompleteTheme {
  @scala.inline
  def apply(
    active: String = null,
    autocomplete: String = null,
    focus: String = null,
    input: String = null,
    suggestion: String = null,
    suggestions: String = null,
    up: String = null,
    value: String = null,
    values: String = null
  ): AutocompleteTheme = {
    val __obj = js.Dynamic.literal()
    if (active != null) __obj.updateDynamic("active")(active)
    if (autocomplete != null) __obj.updateDynamic("autocomplete")(autocomplete)
    if (focus != null) __obj.updateDynamic("focus")(focus)
    if (input != null) __obj.updateDynamic("input")(input)
    if (suggestion != null) __obj.updateDynamic("suggestion")(suggestion)
    if (suggestions != null) __obj.updateDynamic("suggestions")(suggestions)
    if (up != null) __obj.updateDynamic("up")(up)
    if (value != null) __obj.updateDynamic("value")(value)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[AutocompleteTheme]
  }
}

