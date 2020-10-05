package typings.rcSelect.singleSelectorMod

import typings.rcSelect.generatorMod.LabelValueType
import typings.rcSelect.interfaceMod.Mode
import typings.rcSelect.selectorMod.InnerSelectorProps
import typings.react.mod.ChangeEvent
import typings.react.mod.ClipboardEvent
import typings.react.mod.CompositionEvent
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.std.HTMLInputElement
import typings.std.HTMLTextAreaElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectorProps extends InnerSelectorProps {
  var activeValue: String = js.native
  var backfill: js.UndefOr[Boolean] = js.native
  var inputElement: ReactElement = js.native
}

object SelectorProps {
  @scala.inline
  def apply(
    accessibilityIndex: Double,
    activeValue: String,
    id: String,
    inputElement: ReactElement,
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
  ): SelectorProps = {
    val __obj = js.Dynamic.literal(accessibilityIndex = accessibilityIndex.asInstanceOf[js.Any], activeValue = activeValue.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inputElement = inputElement.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], onInputChange = js.Any.fromFunction1(onInputChange), onInputCompositionEnd = js.Any.fromFunction1(onInputCompositionEnd), onInputCompositionStart = js.Any.fromFunction1(onInputCompositionStart), onInputKeyDown = js.Any.fromFunction1(onInputKeyDown), onInputMouseDown = js.Any.fromFunction1(onInputMouseDown), onInputPaste = js.Any.fromFunction1(onInputPaste), open = open.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], searchValue = searchValue.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectorProps]
  }
  @scala.inline
  implicit class SelectorPropsOps[Self <: SelectorProps] (val x: Self) extends AnyVal {
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
    def setActiveValue(value: String): Self = this.set("activeValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputElement(value: ReactElement): Self = this.set("inputElement", value.asInstanceOf[js.Any])
    @scala.inline
    def setBackfill(value: Boolean): Self = this.set("backfill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackfill: Self = this.set("backfill", js.undefined)
  }
  
}

