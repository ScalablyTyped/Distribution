package typings.rcSelect.inputMod

import typings.react.mod.ChangeEvent
import typings.react.mod.ChangeEventHandler
import typings.react.mod.ClipboardEvent
import typings.react.mod.ClipboardEventHandler
import typings.react.mod.CompositionEvent
import typings.react.mod.CompositionEventHandler
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import typings.std.HTMLTextAreaElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputProps extends js.Object {
  var accessibilityIndex: Double = js.native
  /** Pass accessibility props to input */
  var attrs: js.Object = js.native
  var autoComplete: String = js.native
  var autoFocus: Boolean = js.native
  var disabled: Boolean = js.native
  var editable: Boolean = js.native
  var id: String = js.native
  var inputElement: ReactElement = js.native
  var onChange: ChangeEventHandler[HTMLInputElement | HTMLTextAreaElement | HTMLElement] = js.native
  var onCompositionEnd: CompositionEventHandler[HTMLInputElement | HTMLTextAreaElement | HTMLElement] = js.native
  var onCompositionStart: CompositionEventHandler[HTMLInputElement | HTMLTextAreaElement | HTMLElement] = js.native
  var onKeyDown: KeyboardEventHandler[HTMLInputElement | HTMLTextAreaElement | HTMLElement] = js.native
  var onMouseDown: MouseEventHandler[HTMLInputElement | HTMLTextAreaElement | HTMLElement] = js.native
  var onPaste: ClipboardEventHandler[HTMLInputElement | HTMLTextAreaElement | HTMLElement] = js.native
  var open: Boolean = js.native
  var prefixCls: String = js.native
  var tabIndex: Double = js.native
  var value: String = js.native
}

object InputProps {
  @scala.inline
  def apply(
    accessibilityIndex: Double,
    attrs: js.Object,
    autoComplete: String,
    autoFocus: Boolean,
    disabled: Boolean,
    editable: Boolean,
    id: String,
    inputElement: ReactElement,
    onChange: ChangeEvent[HTMLInputElement | HTMLTextAreaElement | HTMLElement] => Unit,
    onCompositionEnd: CompositionEvent[HTMLInputElement | HTMLTextAreaElement | HTMLElement] => Unit,
    onCompositionStart: CompositionEvent[HTMLInputElement | HTMLTextAreaElement | HTMLElement] => Unit,
    onKeyDown: KeyboardEvent[HTMLInputElement | HTMLTextAreaElement | HTMLElement] => Unit,
    onMouseDown: MouseEvent[HTMLInputElement | HTMLTextAreaElement | HTMLElement, NativeMouseEvent] => Unit,
    onPaste: ClipboardEvent[HTMLInputElement | HTMLTextAreaElement | HTMLElement] => Unit,
    open: Boolean,
    prefixCls: String,
    tabIndex: Double,
    value: String
  ): InputProps = {
    val __obj = js.Dynamic.literal(accessibilityIndex = accessibilityIndex.asInstanceOf[js.Any], attrs = attrs.asInstanceOf[js.Any], autoComplete = autoComplete.asInstanceOf[js.Any], autoFocus = autoFocus.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], editable = editable.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inputElement = inputElement.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), onCompositionEnd = js.Any.fromFunction1(onCompositionEnd), onCompositionStart = js.Any.fromFunction1(onCompositionStart), onKeyDown = js.Any.fromFunction1(onKeyDown), onMouseDown = js.Any.fromFunction1(onMouseDown), onPaste = js.Any.fromFunction1(onPaste), open = open.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], tabIndex = tabIndex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputProps]
  }
  @scala.inline
  implicit class InputPropsOps[Self <: InputProps] (val x: Self) extends AnyVal {
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
    def setAccessibilityIndex(value: Double): Self = this.set("accessibilityIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttrs(value: js.Object): Self = this.set("attrs", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoComplete(value: String): Self = this.set("autoComplete", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoFocus(value: Boolean): Self = this.set("autoFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setEditable(value: Boolean): Self = this.set("editable", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputElement(value: ReactElement): Self = this.set("inputElement", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnChange(value: ChangeEvent[HTMLInputElement | HTMLTextAreaElement | HTMLElement] => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def setOnCompositionEnd(value: CompositionEvent[HTMLInputElement | HTMLTextAreaElement | HTMLElement] => Unit): Self = this.set("onCompositionEnd", js.Any.fromFunction1(value))
    @scala.inline
    def setOnCompositionStart(value: CompositionEvent[HTMLInputElement | HTMLTextAreaElement | HTMLElement] => Unit): Self = this.set("onCompositionStart", js.Any.fromFunction1(value))
    @scala.inline
    def setOnKeyDown(value: KeyboardEvent[HTMLInputElement | HTMLTextAreaElement | HTMLElement] => Unit): Self = this.set("onKeyDown", js.Any.fromFunction1(value))
    @scala.inline
    def setOnMouseDown(value: MouseEvent[HTMLInputElement | HTMLTextAreaElement | HTMLElement, NativeMouseEvent] => Unit): Self = this.set("onMouseDown", js.Any.fromFunction1(value))
    @scala.inline
    def setOnPaste(value: ClipboardEvent[HTMLInputElement | HTMLTextAreaElement | HTMLElement] => Unit): Self = this.set("onPaste", js.Any.fromFunction1(value))
    @scala.inline
    def setOpen(value: Boolean): Self = this.set("open", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def setTabIndex(value: Double): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

