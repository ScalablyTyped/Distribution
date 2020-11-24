package typings.rcSelect.multipleSelectorMod

import typings.rcSelect.anon.Selected
import typings.rcSelect.generatorMod.CustomTagProps
import typings.rcSelect.generatorMod.LabelValueType
import typings.rcSelect.generatorMod.RawValueType
import typings.rcSelect.interfaceMod.Mode
import typings.rcSelect.interfaceMod.RenderNode
import typings.rcSelect.selectorMod.InnerSelectorProps
import typings.react.mod.ChangeEvent
import typings.react.mod.ClipboardEvent
import typings.react.mod.CompositionEvent
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.HTMLInputElement
import typings.std.HTMLTextAreaElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectorProps extends InnerSelectorProps {
  
  var choiceTransitionName: js.UndefOr[String] = js.native
  
  var maxTagCount: js.UndefOr[Double] = js.native
  
  var maxTagPlaceholder: js.UndefOr[
    ReactNode | (js.Function1[/* omittedValues */ js.Array[LabelValueType], ReactNode])
  ] = js.native
  
  var maxTagTextLength: js.UndefOr[Double] = js.native
  
  def onSelect(value: RawValueType, option: Selected): Unit = js.native
  
  var removeIcon: js.UndefOr[RenderNode] = js.native
  
  var tagRender: js.UndefOr[js.Function1[/* props */ CustomTagProps, ReactElement]] = js.native
  
  var tokenSeparators: js.UndefOr[js.Array[String]] = js.native
}
object SelectorProps {
  
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
    onSelect: (RawValueType, Selected) => Unit,
    open: Boolean,
    prefixCls: String,
    searchValue: String,
    values: js.Array[LabelValueType]
  ): SelectorProps = {
    val __obj = js.Dynamic.literal(accessibilityIndex = accessibilityIndex.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], onInputChange = js.Any.fromFunction1(onInputChange), onInputCompositionEnd = js.Any.fromFunction1(onInputCompositionEnd), onInputCompositionStart = js.Any.fromFunction1(onInputCompositionStart), onInputKeyDown = js.Any.fromFunction1(onInputKeyDown), onInputMouseDown = js.Any.fromFunction1(onInputMouseDown), onInputPaste = js.Any.fromFunction1(onInputPaste), onSelect = js.Any.fromFunction2(onSelect), open = open.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], searchValue = searchValue.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
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
    def setOnSelect(value: (RawValueType, Selected) => Unit): Self = this.set("onSelect", js.Any.fromFunction2(value))
    
    @scala.inline
    def setChoiceTransitionName(value: String): Self = this.set("choiceTransitionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChoiceTransitionName: Self = this.set("choiceTransitionName", js.undefined)
    
    @scala.inline
    def setMaxTagCount(value: Double): Self = this.set("maxTagCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxTagCount: Self = this.set("maxTagCount", js.undefined)
    
    @scala.inline
    def setMaxTagPlaceholderFunction1(value: /* omittedValues */ js.Array[LabelValueType] => ReactNode): Self = this.set("maxTagPlaceholder", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMaxTagPlaceholder(value: ReactNode | (js.Function1[/* omittedValues */ js.Array[LabelValueType], ReactNode])): Self = this.set("maxTagPlaceholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxTagPlaceholder: Self = this.set("maxTagPlaceholder", js.undefined)
    
    @scala.inline
    def setMaxTagTextLength(value: Double): Self = this.set("maxTagTextLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxTagTextLength: Self = this.set("maxTagTextLength", js.undefined)
    
    @scala.inline
    def setRemoveIconFunction1(value: /* props */ js.Any => ReactNode): Self = this.set("removeIcon", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveIcon(value: RenderNode): Self = this.set("removeIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveIcon: Self = this.set("removeIcon", js.undefined)
    
    @scala.inline
    def setTagRender(value: /* props */ CustomTagProps => ReactElement): Self = this.set("tagRender", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTagRender: Self = this.set("tagRender", js.undefined)
    
    @scala.inline
    def setTokenSeparatorsVarargs(value: String*): Self = this.set("tokenSeparators", js.Array(value :_*))
    
    @scala.inline
    def setTokenSeparators(value: js.Array[String]): Self = this.set("tokenSeparators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTokenSeparators: Self = this.set("tokenSeparators", js.undefined)
  }
}
