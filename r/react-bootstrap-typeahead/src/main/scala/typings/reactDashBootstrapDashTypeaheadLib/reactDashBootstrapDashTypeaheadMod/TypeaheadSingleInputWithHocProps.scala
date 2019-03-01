package typings
package reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react-bootstrap-typeahead.react-bootstrap-typeahead.BaseTypeaheadInputProps, keyof react-bootstrap-typeahead.react-bootstrap-typeahead.InputContainerPropsSingle<react-bootstrap-typeahead.react-bootstrap-typeahead.BaseTypeaheadInputProps>> ]: react-bootstrap-typeahead.react-bootstrap-typeahead.BaseTypeaheadInputProps[P]} */ trait TypeaheadSingleInputWithHocProps[T /* <: TypeaheadModel */] extends InputContainerPropsSingle[T]

object TypeaheadSingleInputWithHocProps {
  @scala.inline
  def apply[T /* <: TypeaheadModel */](
    `aria-activedescendant`: java.lang.String,
    `aria-autocomplete`: reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.list | reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.both,
    `aria-expanded`: scala.Boolean | reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.`true` | reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.`false`,
    `aria-haspopup`: reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.listbox,
    `aria-owns`: java.lang.String,
    autoComplete: java.lang.String,
    disabled: scala.Boolean,
    inputRef: reactLib.reactMod.ReactNs.LegacyRef[reactLib.HTMLInputElement],
    onBlur: js.Function1[reactLib.Event, scala.Unit],
    onChange: js.Function1[js.Array[T], scala.Unit],
    onClick: js.Function1[reactLib.Event, scala.Unit],
    onFocus: js.Function1[reactLib.Event, scala.Unit],
    onKeyDown: js.Function1[reactLib.Event, scala.Unit],
    role: reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.combobox,
    value: java.lang.String,
    placeholder: java.lang.String = null
  ): TypeaheadSingleInputWithHocProps[T] = {
    val __obj = js.Dynamic.literal(`aria-activedescendant` = `aria-activedescendant`, `aria-autocomplete` = `aria-autocomplete`.asInstanceOf[js.Any], `aria-expanded` = `aria-expanded`.asInstanceOf[js.Any], `aria-haspopup` = `aria-haspopup`, `aria-owns` = `aria-owns`)
    __obj.updateDynamic("autoComplete")(autoComplete)
    __obj.updateDynamic("disabled")(disabled)
    __obj.updateDynamic("inputRef")(inputRef.asInstanceOf[js.Any])
    __obj.updateDynamic("onBlur")(onBlur)
    __obj.updateDynamic("onChange")(onChange)
    __obj.updateDynamic("onClick")(onClick)
    __obj.updateDynamic("onFocus")(onFocus)
    __obj.updateDynamic("onKeyDown")(onKeyDown)
    __obj.updateDynamic("role")(role)
    __obj.updateDynamic("value")(value)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    __obj.asInstanceOf[TypeaheadSingleInputWithHocProps[T]]
  }
}

