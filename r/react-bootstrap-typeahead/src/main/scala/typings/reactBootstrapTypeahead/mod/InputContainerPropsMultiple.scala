package typings.reactBootstrapTypeahead.mod

import typings.react.mod.LegacyRef
import typings.react.mod.ReactNode
import typings.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings._empty
import typings.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.both
import typings.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.list
import typings.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.listbox
import typings.std.Event
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent react-bootstrap-typeahead.react-bootstrap-typeahead.Omit<react-bootstrap-typeahead.react-bootstrap-typeahead.InputContainerPropsSingle<T>, 'role'> */
trait InputContainerPropsMultiple[T /* <: TypeaheadModel */] extends js.Object {
  var `aria-activedescendant`: String
  var `aria-autocomplete`: list | both
  var `aria-expanded`: Boolean
  var `aria-haspopup`: listbox
  var `aria-owns`: String
  var autoComplete: String
  var disabled: Boolean
  var inputClassName: String
  var inputRef: LegacyRef[HTMLInputElement]
  var labelKey: TypeaheadLabelKey[T]
  var onBlur: js.Function1[/* e */ Event, Unit]
  var onChange: js.Function1[/* selected */ js.Array[T], Unit]
  var onClick: js.Function1[/* e */ Event, Unit]
  var onFocus: js.Function1[/* e */ Event, Unit]
  var onKeyDown: js.Function1[/* e */ Event, Unit]
  var placeholder: js.UndefOr[String] = js.undefined
  var role: _empty
  var selected: js.Array[T]
  var value: String
  def onRemove(e: Event): Unit
  def renderToken(selectedItem: T, props: TypeaheadMenuProps[T], index: Double): ReactNode
}

object InputContainerPropsMultiple {
  @scala.inline
  def apply[/* <: typings.reactBootstrapTypeahead.mod.TypeaheadModel */ T](
    `aria-activedescendant`: String,
    `aria-autocomplete`: list | both,
    `aria-expanded`: Boolean,
    `aria-haspopup`: listbox,
    `aria-owns`: String,
    autoComplete: String,
    disabled: Boolean,
    inputClassName: String,
    labelKey: TypeaheadLabelKey[T],
    onBlur: /* e */ Event => Unit,
    onChange: /* selected */ js.Array[T] => Unit,
    onClick: /* e */ Event => Unit,
    onFocus: /* e */ Event => Unit,
    onKeyDown: /* e */ Event => Unit,
    onRemove: Event => Unit,
    renderToken: (T, TypeaheadMenuProps[T], Double) => ReactNode,
    role: _empty,
    selected: js.Array[T],
    value: String,
    inputRef: LegacyRef[HTMLInputElement] = null,
    placeholder: String = null
  ): InputContainerPropsMultiple[T] = {
    val __obj = js.Dynamic.literal(autoComplete = autoComplete.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], inputClassName = inputClassName.asInstanceOf[js.Any], labelKey = labelKey.asInstanceOf[js.Any], onBlur = js.Any.fromFunction1(onBlur), onChange = js.Any.fromFunction1(onChange), onClick = js.Any.fromFunction1(onClick), onFocus = js.Any.fromFunction1(onFocus), onKeyDown = js.Any.fromFunction1(onKeyDown), onRemove = js.Any.fromFunction1(onRemove), renderToken = js.Any.fromFunction3(renderToken), role = role.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], inputRef = inputRef.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-activedescendant")(`aria-activedescendant`.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-autocomplete")(`aria-autocomplete`.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-expanded")(`aria-expanded`.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-haspopup")(`aria-haspopup`.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-owns")(`aria-owns`.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputContainerPropsMultiple[T]]
  }
}

