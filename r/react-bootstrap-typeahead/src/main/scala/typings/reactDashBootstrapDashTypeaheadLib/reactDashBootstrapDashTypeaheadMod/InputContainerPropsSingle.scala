package typings
package reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputContainerPropsSingle[T /* <: TypeaheadModel */] extends js.Object {
  var `aria-activedescendant`: java.lang.String
  var `aria-autocomplete`: reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.list | reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.both
  var `aria-expanded`: scala.Boolean | reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.`true` | reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.`false`
  var `aria-haspopup`: reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.listbox
  var `aria-owns`: java.lang.String
  var autoComplete: java.lang.String
  var disabled: scala.Boolean
  var inputRef: reactLib.reactMod.ReactNs.LegacyRef[stdLib.HTMLInputElement]
  var placeholder: java.lang.String | scala.Null
  var role: reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.combobox
  var value: java.lang.String
  def onBlur(e: stdLib.Event): scala.Unit
  def onChange(selected: js.Array[T]): scala.Unit
  def onClick(e: stdLib.Event): scala.Unit
  def onFocus(e: stdLib.Event): scala.Unit
  def onKeyDown(e: stdLib.Event): scala.Unit
}

object InputContainerPropsSingle {
  @scala.inline
  def apply[T /* <: TypeaheadModel */](
    `aria-activedescendant`: java.lang.String,
    `aria-autocomplete`: reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.list | reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.both,
    `aria-expanded`: scala.Boolean | reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.`true` | reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.`false`,
    `aria-haspopup`: reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.listbox,
    `aria-owns`: java.lang.String,
    autoComplete: java.lang.String,
    disabled: scala.Boolean,
    inputRef: reactLib.reactMod.ReactNs.LegacyRef[stdLib.HTMLInputElement],
    onBlur: stdLib.Event => scala.Unit,
    onChange: js.Array[T] => scala.Unit,
    onClick: stdLib.Event => scala.Unit,
    onFocus: stdLib.Event => scala.Unit,
    onKeyDown: stdLib.Event => scala.Unit,
    role: reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.combobox,
    value: java.lang.String,
    placeholder: java.lang.String = null
  ): InputContainerPropsSingle[T] = {
    val __obj = js.Dynamic.literal(autoComplete = autoComplete, disabled = disabled, inputRef = inputRef.asInstanceOf[js.Any], onBlur = js.Any.fromFunction1(onBlur), onChange = js.Any.fromFunction1(onChange), onClick = js.Any.fromFunction1(onClick), onFocus = js.Any.fromFunction1(onFocus), onKeyDown = js.Any.fromFunction1(onKeyDown), role = role, value = value)
    __obj.updateDynamic("aria-activedescendant")(`aria-activedescendant`)
    __obj.updateDynamic("aria-autocomplete")(`aria-autocomplete`.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-expanded")(`aria-expanded`.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-haspopup")(`aria-haspopup`)
    __obj.updateDynamic("aria-owns")(`aria-owns`)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    __obj.asInstanceOf[InputContainerPropsSingle[T]]
  }
}

