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
@js.native
trait InputContainerPropsMultiple[T /* <: TypeaheadModel */] extends js.Object {
  var `aria-activedescendant`: String = js.native
  var `aria-autocomplete`: list | both = js.native
  var `aria-expanded`: Boolean = js.native
  var `aria-haspopup`: listbox = js.native
  var `aria-owns`: String = js.native
  var autoComplete: String = js.native
  var disabled: Boolean = js.native
  var inputClassName: String = js.native
  var inputRef: LegacyRef[HTMLInputElement] = js.native
  var labelKey: TypeaheadLabelKey[T] = js.native
  var onBlur: js.Function1[/* e */ Event, Unit] = js.native
  var onChange: js.Function1[/* selected */ js.Array[T], Unit] = js.native
  var onClick: js.Function1[/* e */ Event, Unit] = js.native
  var onFocus: js.Function1[/* e */ Event, Unit] = js.native
  var onKeyDown: js.Function1[/* e */ Event, Unit] = js.native
  var placeholder: js.UndefOr[String | Null] = js.native
  var role: _empty = js.native
  var selected: js.Array[T] = js.native
  var value: String = js.native
  def onRemove(e: Event): Unit = js.native
  def renderToken(selectedItem: T, props: TypeaheadMenuProps[T], index: Double): ReactNode = js.native
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
    value: String
  ): InputContainerPropsMultiple[T] = {
    val __obj = js.Dynamic.literal(autoComplete = autoComplete.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], inputClassName = inputClassName.asInstanceOf[js.Any], labelKey = labelKey.asInstanceOf[js.Any], onBlur = js.Any.fromFunction1(onBlur), onChange = js.Any.fromFunction1(onChange), onClick = js.Any.fromFunction1(onClick), onFocus = js.Any.fromFunction1(onFocus), onKeyDown = js.Any.fromFunction1(onKeyDown), onRemove = js.Any.fromFunction1(onRemove), renderToken = js.Any.fromFunction3(renderToken), role = role.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-activedescendant")(`aria-activedescendant`.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-autocomplete")(`aria-autocomplete`.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-expanded")(`aria-expanded`.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-haspopup")(`aria-haspopup`.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-owns")(`aria-owns`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputContainerPropsMultiple[T]]
  }
  @scala.inline
  implicit class InputContainerPropsMultipleOps[Self <: InputContainerPropsMultiple[_], /* <: typings.reactBootstrapTypeahead.mod.TypeaheadModel */ T] (val x: Self with InputContainerPropsMultiple[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def `setAria-activedescendant`(value: String): Self = this.set("aria-activedescendant", value.asInstanceOf[js.Any])
    @scala.inline
    def `setAria-autocomplete`(value: list | both): Self = this.set("aria-autocomplete", value.asInstanceOf[js.Any])
    @scala.inline
    def `setAria-expanded`(value: Boolean): Self = this.set("aria-expanded", value.asInstanceOf[js.Any])
    @scala.inline
    def `setAria-haspopup`(value: listbox): Self = this.set("aria-haspopup", value.asInstanceOf[js.Any])
    @scala.inline
    def `setAria-owns`(value: String): Self = this.set("aria-owns", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoComplete(value: String): Self = this.set("autoComplete", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputClassName(value: String): Self = this.set("inputClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabelKeyFunction1(value: T => String): Self = this.set("labelKey", js.Any.fromFunction1(value))
    @scala.inline
    def setLabelKey(value: TypeaheadLabelKey[T]): Self = this.set("labelKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnBlur(value: /* e */ Event => Unit): Self = this.set("onBlur", js.Any.fromFunction1(value))
    @scala.inline
    def setOnChange(value: /* selected */ js.Array[T] => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def setOnClick(value: /* e */ Event => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def setOnFocus(value: /* e */ Event => Unit): Self = this.set("onFocus", js.Any.fromFunction1(value))
    @scala.inline
    def setOnKeyDown(value: /* e */ Event => Unit): Self = this.set("onKeyDown", js.Any.fromFunction1(value))
    @scala.inline
    def setOnRemove(value: Event => Unit): Self = this.set("onRemove", js.Any.fromFunction1(value))
    @scala.inline
    def setRenderToken(value: (T, TypeaheadMenuProps[T], Double) => ReactNode): Self = this.set("renderToken", js.Any.fromFunction3(value))
    @scala.inline
    def setRole(value: _empty): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectedVarargs(value: T*): Self = this.set("selected", js.Array(value :_*))
    @scala.inline
    def setSelected(value: js.Array[T]): Self = this.set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputRefFunction1(value: /* instance */ HTMLInputElement | Null => Unit): Self = this.set("inputRef", js.Any.fromFunction1(value))
    @scala.inline
    def setInputRef(value: LegacyRef[HTMLInputElement]): Self = this.set("inputRef", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputRefNull: Self = this.set("inputRef", null)
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setPlaceholderNull: Self = this.set("placeholder", null)
  }
  
}

