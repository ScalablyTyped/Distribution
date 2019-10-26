package typings.reactDashPlacesDashAutocomplete

import typings.react.reactMod.FocusEvent
import typings.react.reactMod.FocusEventHandler
import typings.react.reactMod.KeyboardEvent
import typings.react.reactMod.KeyboardEventHandler
import typings.reactDashPlacesDashAutocomplete.reactDashPlacesDashAutocompleteStrings.combobox
import typings.reactDashPlacesDashAutocomplete.reactDashPlacesDashAutocompleteStrings.list
import typings.reactDashPlacesDashAutocomplete.reactDashPlacesDashAutocompleteStrings.off
import typings.reactDashPlacesDashAutocomplete.reactDashPlacesDashAutocompleteStrings.text
import typings.std.Element
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
    onBlur: FocusEvent[Element] => Unit,
    onChange: Anon_Target => Unit,
    onKeyDown: KeyboardEvent[Element] => Unit,
    role: combobox,
    `type`: text,
    `aria-activedescendant`: String = null,
    value: String = null
  ): Anon_Ariaactivedescendant = {
    val __obj = js.Dynamic.literal(autoComplete = autoComplete, disabled = disabled, onBlur = js.Any.fromFunction1(onBlur), onChange = js.Any.fromFunction1(onChange), onKeyDown = js.Any.fromFunction1(onKeyDown), role = role)
    __obj.updateDynamic("aria-autocomplete")(`aria-autocomplete`)
    __obj.updateDynamic("aria-expanded")(`aria-expanded`)
    __obj.updateDynamic("type")(`type`)
    if (`aria-activedescendant` != null) __obj.updateDynamic("aria-activedescendant")(`aria-activedescendant`)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_Ariaactivedescendant]
  }
}

