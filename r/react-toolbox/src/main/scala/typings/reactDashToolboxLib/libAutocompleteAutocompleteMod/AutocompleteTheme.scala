package typings
package reactDashToolboxLib.libAutocompleteAutocompleteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutocompleteTheme extends js.Object {
  /**
    * Used for a suggestion when it's active.
    */
  var active: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used for the root element.
    */
  var autocomplete: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used when the input is focused.
    */
  var focus: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used to style the Input component.
    */
  var input: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used to style each suggestion.
    */
  var suggestion: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used to style the suggestions container.
    */
  var suggestions: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used for the suggestions when it's opening to the top.
    */
  var up: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Classname used for a single value.
    */
  var value: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Classname used for the values container.
    */
  var values: js.UndefOr[java.lang.String] = js.undefined
}

object AutocompleteTheme {
  @scala.inline
  def apply(
    active: java.lang.String = null,
    autocomplete: java.lang.String = null,
    focus: java.lang.String = null,
    input: java.lang.String = null,
    suggestion: java.lang.String = null,
    suggestions: java.lang.String = null,
    up: java.lang.String = null,
    value: java.lang.String = null,
    values: java.lang.String = null
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

