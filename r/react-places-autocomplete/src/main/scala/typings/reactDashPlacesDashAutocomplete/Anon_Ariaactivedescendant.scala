package typings.reactDashPlacesDashAutocomplete

import typings.react.Element
import typings.react.reactMod.FocusEventHandler
import typings.react.reactMod.KeyboardEventHandler
import typings.reactDashPlacesDashAutocomplete.reactDashPlacesDashAutocompleteStrings.combobox
import typings.reactDashPlacesDashAutocomplete.reactDashPlacesDashAutocompleteStrings.list
import typings.reactDashPlacesDashAutocomplete.reactDashPlacesDashAutocompleteStrings.off
import typings.reactDashPlacesDashAutocomplete.reactDashPlacesDashAutocompleteStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ariaactivedescendant extends js.Object {
  var `aria-activedescendant`: js.UndefOr[String] = js.undefined
  var `aria-autocomplete`: list
  var `aria-expanded`: Boolean
  var autoComplete: off
  var disabled: Boolean
  var onBlur: FocusEventHandler[Element]
  var onKeyDown: KeyboardEventHandler[Element]
  var role: combobox
  var `type`: text
  var value: js.UndefOr[String] = js.undefined
  def onChange(ev: Anon_Target): Unit
}

object Anon_Ariaactivedescendant {
  @scala.inline
  def apply(
    `aria-autocomplete`: list,
    `aria-expanded`: Boolean,
    autoComplete: off,
    disabled: Boolean,
    onBlur: FocusEventHandler[Element],
    onChange: Anon_Target => Unit,
    onKeyDown: KeyboardEventHandler[Element],
    role: combobox,
    `type`: text,
    `aria-activedescendant`: String = null,
    value: String = null
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

