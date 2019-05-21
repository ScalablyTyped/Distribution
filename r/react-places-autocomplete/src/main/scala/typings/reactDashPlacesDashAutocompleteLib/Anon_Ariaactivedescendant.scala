package typings
package reactDashPlacesDashAutocompleteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ariaactivedescendant extends js.Object {
  var `aria-activedescendant`: js.UndefOr[java.lang.String] = js.undefined
  var `aria-autocomplete`: reactDashPlacesDashAutocompleteLib.reactDashPlacesDashAutocompleteLibStrings.list
  var `aria-expanded`: scala.Boolean
  var autoComplete: reactDashPlacesDashAutocompleteLib.reactDashPlacesDashAutocompleteLibStrings.off
  var disabled: scala.Boolean
  var onBlur: reactLib.reactMod.FocusEventHandler[reactLib.Element]
  var onKeyDown: reactLib.reactMod.KeyboardEventHandler[reactLib.Element]
  var role: reactDashPlacesDashAutocompleteLib.reactDashPlacesDashAutocompleteLibStrings.combobox
  var `type`: reactDashPlacesDashAutocompleteLib.reactDashPlacesDashAutocompleteLibStrings.text
  var value: js.UndefOr[java.lang.String] = js.undefined
  def onChange(ev: Anon_Target): scala.Unit
}

object Anon_Ariaactivedescendant {
  @scala.inline
  def apply(
    `aria-autocomplete`: reactDashPlacesDashAutocompleteLib.reactDashPlacesDashAutocompleteLibStrings.list,
    `aria-expanded`: scala.Boolean,
    autoComplete: reactDashPlacesDashAutocompleteLib.reactDashPlacesDashAutocompleteLibStrings.off,
    disabled: scala.Boolean,
    onBlur: reactLib.reactMod.FocusEventHandler[reactLib.Element],
    onChange: Anon_Target => scala.Unit,
    onKeyDown: reactLib.reactMod.KeyboardEventHandler[reactLib.Element],
    role: reactDashPlacesDashAutocompleteLib.reactDashPlacesDashAutocompleteLibStrings.combobox,
    `type`: reactDashPlacesDashAutocompleteLib.reactDashPlacesDashAutocompleteLibStrings.text,
    `aria-activedescendant`: java.lang.String = null,
    value: java.lang.String = null
  ): Anon_Ariaactivedescendant = {
    val __obj = js.Dynamic.literal(autoComplete = autoComplete, disabled = disabled, onBlur = onBlur, onChange = js.Any.fromFunction1(onChange), onKeyDown = onKeyDown, role = role)
    __obj.updateDynamic("aria-autocomplete")(`aria-autocomplete`)
    __obj.updateDynamic("aria-expanded")(`aria-expanded`)
    __obj.updateDynamic("type")(`type`)
    if (`aria-activedescendant` != null) __obj.updateDynamic("aria-activedescendant")(`aria-activedescendant`)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_Ariaactivedescendant]
  }
}

