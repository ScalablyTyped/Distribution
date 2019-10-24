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

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react-bootstrap-typeahead.react-bootstrap-typeahead.BaseTypeaheadInputProps, keyof react-bootstrap-typeahead.react-bootstrap-typeahead.InputContainerPropsSingle<T>> ]: react-bootstrap-typeahead.react-bootstrap-typeahead.BaseTypeaheadInputProps[P]} */ trait TypeaheadSingleInputWithHocProps[T /* <: TypeaheadModel */] extends InputContainerPropsSingle[T]

object TypeaheadSingleInputWithHocProps {
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
  ): TypeaheadSingleInputWithHocProps[T] = {
    val __obj = js.Dynamic.literal(autoComplete = autoComplete, disabled = disabled, onBlur = js.Any.fromFunction1(onBlur), onChange = js.Any.fromFunction1(onChange), onClick = js.Any.fromFunction1(onClick), onFocus = js.Any.fromFunction1(onFocus), onKeyDown = js.Any.fromFunction1(onKeyDown), role = role, value = value)
    __obj.updateDynamic("aria-activedescendant")(`aria-activedescendant`)
    __obj.updateDynamic("aria-autocomplete")(`aria-autocomplete`.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-expanded")(`aria-expanded`)
    __obj.updateDynamic("aria-haspopup")(`aria-haspopup`)
    __obj.updateDynamic("aria-owns")(`aria-owns`)
    if (inputRef != null) __obj.updateDynamic("inputRef")(inputRef.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    __obj.asInstanceOf[TypeaheadSingleInputWithHocProps[T]]
  }
}

