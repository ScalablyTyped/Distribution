package typings.reactDashBootstrapDashTypeahead.reactDashBootstrapDashTypeaheadMod

import typings.react.reactMod.LegacyRef
import typings.reactDashBootstrapDashTypeahead.reactDashBootstrapDashTypeaheadStrings.both
import typings.reactDashBootstrapDashTypeahead.reactDashBootstrapDashTypeaheadStrings.combobox
import typings.reactDashBootstrapDashTypeahead.reactDashBootstrapDashTypeaheadStrings.list
import typings.reactDashBootstrapDashTypeahead.reactDashBootstrapDashTypeaheadStrings.listbox
import typings.std.Event
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputContainerPropsSingle[T /* <: TypeaheadModel */] extends js.Object {
  var `aria-activedescendant`: String
  var `aria-autocomplete`: list | both
  var `aria-expanded`: Boolean
  var `aria-haspopup`: listbox
  var `aria-owns`: String
  var autoComplete: String
  var disabled: Boolean
  var inputRef: LegacyRef[HTMLInputElement]
  var placeholder: String | Null
  var role: combobox
  var value: String
  def onBlur(e: Event): Unit
  def onChange(selected: js.Array[T]): Unit
  def onClick(e: Event): Unit
  def onFocus(e: Event): Unit
  def onKeyDown(e: Event): Unit
}

object InputContainerPropsSingle {
  @scala.inline
  def apply[T /* <: TypeaheadModel */](
    `aria-activedescendant`: String,
    `aria-autocomplete`: list | both,
    `aria-expanded`: Boolean,
    `aria-haspopup`: listbox,
    `aria-owns`: String,
    autoComplete: String,
    disabled: Boolean,
    onBlur: Event => Unit,
    onChange: js.Array[T] => Unit,
    onClick: Event => Unit,
    onFocus: Event => Unit,
    onKeyDown: Event => Unit,
    role: combobox,
    value: String,
    inputRef: LegacyRef[HTMLInputElement] = null,
    placeholder: String = null
  ): InputContainerPropsSingle[T] = {
    val __obj = js.Dynamic.literal(autoComplete = autoComplete, disabled = disabled, onBlur = js.Any.fromFunction1(onBlur), onChange = js.Any.fromFunction1(onChange), onClick = js.Any.fromFunction1(onClick), onFocus = js.Any.fromFunction1(onFocus), onKeyDown = js.Any.fromFunction1(onKeyDown), role = role, value = value)
    __obj.updateDynamic("aria-activedescendant")(`aria-activedescendant`)
    __obj.updateDynamic("aria-autocomplete")(`aria-autocomplete`.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-expanded")(`aria-expanded`)
    __obj.updateDynamic("aria-haspopup")(`aria-haspopup`)
    __obj.updateDynamic("aria-owns")(`aria-owns`)
    if (inputRef != null) __obj.updateDynamic("inputRef")(inputRef.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    __obj.asInstanceOf[InputContainerPropsSingle[T]]
  }
}

