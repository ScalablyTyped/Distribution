package typings.rcSelect.selectorMod

import typings.rcSelect.generatorMod.LabelValueType
import typings.rcSelect.interfaceMod.Mode
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
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.std.HTMLInputElement
import typings.std.HTMLTextAreaElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InnerSelectorProps extends js.Object {
  var accessibilityIndex: Double = js.native
  var autoComplete: js.UndefOr[String] = js.native
  var autoFocus: js.UndefOr[Boolean] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var id: String = js.native
  var inputRef: Ref[HTMLInputElement | HTMLTextAreaElement] = js.native
  var mode: Mode = js.native
  var onInputChange: ChangeEventHandler[HTMLInputElement | HTMLTextAreaElement] = js.native
  var onInputCompositionEnd: CompositionEventHandler[HTMLInputElement | HTMLTextAreaElement] = js.native
  var onInputCompositionStart: CompositionEventHandler[HTMLInputElement | HTMLTextAreaElement] = js.native
  var onInputKeyDown: KeyboardEventHandler[HTMLInputElement | HTMLTextAreaElement] = js.native
  var onInputMouseDown: MouseEventHandler[HTMLInputElement | HTMLTextAreaElement] = js.native
  var onInputPaste: ClipboardEventHandler[HTMLInputElement | HTMLTextAreaElement] = js.native
  var open: Boolean = js.native
  var placeholder: js.UndefOr[ReactNode] = js.native
  var prefixCls: String = js.native
  var searchValue: String = js.native
  var showSearch: js.UndefOr[Boolean] = js.native
  var tabIndex: js.UndefOr[Double] = js.native
  var values: js.Array[LabelValueType] = js.native
}

object InnerSelectorProps {
  @scala.inline
  def apply(
    accessibilityIndex: Double,
    id: String,
    mode: Mode,
    onInputChange: ChangeEvent[HTMLInputElement | HTMLTextAreaElement] => Unit,
    onInputCompositionEnd: CompositionEvent[HTMLInputElement | HTMLTextAreaElement] => Unit,
    onInputCompositionStart: CompositionEvent[HTMLInputElement | HTMLTextAreaElement] => Unit,
    onInputKeyDown: KeyboardEvent[HTMLInputElement | HTMLTextAreaElement] => Unit,
    onInputMouseDown: MouseEvent[HTMLInputElement | HTMLTextAreaElement, NativeMouseEvent] => Unit,
    onInputPaste: ClipboardEvent[HTMLInputElement | HTMLTextAreaElement] => Unit,
    open: Boolean,
    prefixCls: String,
    searchValue: String,
    values: js.Array[LabelValueType]
  ): InnerSelectorProps = {
    val __obj = js.Dynamic.literal(accessibilityIndex = accessibilityIndex.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], onInputChange = js.Any.fromFunction1(onInputChange), onInputCompositionEnd = js.Any.fromFunction1(onInputCompositionEnd), onInputCompositionStart = js.Any.fromFunction1(onInputCompositionStart), onInputKeyDown = js.Any.fromFunction1(onInputKeyDown), onInputMouseDown = js.Any.fromFunction1(onInputMouseDown), onInputPaste = js.Any.fromFunction1(onInputPaste), open = open.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], searchValue = searchValue.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[InnerSelectorProps]
  }
  @scala.inline
  implicit class InnerSelectorPropsOps[Self <: InnerSelectorProps] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setMode(value: Mode): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnInputChange(value: ChangeEvent[HTMLInputElement | HTMLTextAreaElement] => Unit): Self = this.set("onInputChange", js.Any.fromFunction1(value))
    @scala.inline
    def setOnInputCompositionEnd(value: CompositionEvent[HTMLInputElement | HTMLTextAreaElement] => Unit): Self = this.set("onInputCompositionEnd", js.Any.fromFunction1(value))
    @scala.inline
    def setOnInputCompositionStart(value: CompositionEvent[HTMLInputElement | HTMLTextAreaElement] => Unit): Self = this.set("onInputCompositionStart", js.Any.fromFunction1(value))
    @scala.inline
    def setOnInputKeyDown(value: KeyboardEvent[HTMLInputElement | HTMLTextAreaElement] => Unit): Self = this.set("onInputKeyDown", js.Any.fromFunction1(value))
    @scala.inline
    def setOnInputMouseDown(value: MouseEvent[HTMLInputElement | HTMLTextAreaElement, NativeMouseEvent] => Unit): Self = this.set("onInputMouseDown", js.Any.fromFunction1(value))
    @scala.inline
    def setOnInputPaste(value: ClipboardEvent[HTMLInputElement | HTMLTextAreaElement] => Unit): Self = this.set("onInputPaste", js.Any.fromFunction1(value))
    @scala.inline
    def setOpen(value: Boolean): Self = this.set("open", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def setSearchValue(value: String): Self = this.set("searchValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setValuesVarargs(value: LabelValueType*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[LabelValueType]): Self = this.set("values", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoComplete(value: String): Self = this.set("autoComplete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoComplete: Self = this.set("autoComplete", js.undefined)
    @scala.inline
    def setAutoFocus(value: Boolean): Self = this.set("autoFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoFocus: Self = this.set("autoFocus", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setInputRefFunction1(value: /* instance */ (HTMLInputElement | HTMLTextAreaElement) | Null => Unit): Self = this.set("inputRef", js.Any.fromFunction1(value))
    @scala.inline
    def setInputRef(value: Ref[HTMLInputElement | HTMLTextAreaElement]): Self = this.set("inputRef", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputRefNull: Self = this.set("inputRef", null)
    @scala.inline
    def setPlaceholder(value: ReactNode): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setShowSearch(value: Boolean): Self = this.set("showSearch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowSearch: Self = this.set("showSearch", js.undefined)
    @scala.inline
    def setTabIndex(value: Double): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
  }
  
}

