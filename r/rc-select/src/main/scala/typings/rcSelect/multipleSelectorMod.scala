package typings.rcSelect

import org.scalablytyped.runtime.Shortcut
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
import typings.react.mod.FC
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.HTMLInputElement
import typings.std.HTMLTextAreaElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object multipleSelectorMod extends Shortcut {
  
  @JSImport("rc-select/lib/Selector/MultipleSelector", JSImport.Default)
  @js.native
  val default: FC[SelectorProps] = js.native
  
  trait SelectorProps
    extends StObject
       with InnerSelectorProps {
    
    var choiceTransitionName: js.UndefOr[String] = js.undefined
    
    var maxTagCount: js.UndefOr[Double] = js.undefined
    
    var maxTagPlaceholder: js.UndefOr[
        ReactNode | (js.Function1[/* omittedValues */ js.Array[LabelValueType], ReactNode])
      ] = js.undefined
    
    var maxTagTextLength: js.UndefOr[Double] = js.undefined
    
    def onSelect(value: RawValueType, option: Selected): Unit
    
    var removeIcon: js.UndefOr[RenderNode] = js.undefined
    
    var tagRender: js.UndefOr[js.Function1[/* props */ CustomTagProps, ReactElement]] = js.undefined
    
    var tokenSeparators: js.UndefOr[js.Array[String]] = js.undefined
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
      val __obj = js.Dynamic.literal(accessibilityIndex = accessibilityIndex.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], onInputChange = js.Any.fromFunction1(onInputChange), onInputCompositionEnd = js.Any.fromFunction1(onInputCompositionEnd), onInputCompositionStart = js.Any.fromFunction1(onInputCompositionStart), onInputKeyDown = js.Any.fromFunction1(onInputKeyDown), onInputMouseDown = js.Any.fromFunction1(onInputMouseDown), onInputPaste = js.Any.fromFunction1(onInputPaste), onSelect = js.Any.fromFunction2(onSelect), open = open.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], searchValue = searchValue.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any], inputRef = null)
      __obj.asInstanceOf[SelectorProps]
    }
    
    @scala.inline
    implicit class SelectorPropsMutableBuilder[Self <: SelectorProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChoiceTransitionName(value: String): Self = StObject.set(x, "choiceTransitionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChoiceTransitionNameUndefined: Self = StObject.set(x, "choiceTransitionName", js.undefined)
      
      @scala.inline
      def setMaxTagCount(value: Double): Self = StObject.set(x, "maxTagCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxTagCountUndefined: Self = StObject.set(x, "maxTagCount", js.undefined)
      
      @scala.inline
      def setMaxTagPlaceholder(value: ReactNode | (js.Function1[/* omittedValues */ js.Array[LabelValueType], ReactNode])): Self = StObject.set(x, "maxTagPlaceholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxTagPlaceholderFunction1(value: /* omittedValues */ js.Array[LabelValueType] => ReactNode): Self = StObject.set(x, "maxTagPlaceholder", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMaxTagPlaceholderUndefined: Self = StObject.set(x, "maxTagPlaceholder", js.undefined)
      
      @scala.inline
      def setMaxTagTextLength(value: Double): Self = StObject.set(x, "maxTagTextLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxTagTextLengthUndefined: Self = StObject.set(x, "maxTagTextLength", js.undefined)
      
      @scala.inline
      def setOnSelect(value: (RawValueType, Selected) => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRemoveIcon(value: RenderNode): Self = StObject.set(x, "removeIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveIconFunction1(value: /* props */ js.Any => ReactNode): Self = StObject.set(x, "removeIcon", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveIconUndefined: Self = StObject.set(x, "removeIcon", js.undefined)
      
      @scala.inline
      def setTagRender(value: /* props */ CustomTagProps => ReactElement): Self = StObject.set(x, "tagRender", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTagRenderUndefined: Self = StObject.set(x, "tagRender", js.undefined)
      
      @scala.inline
      def setTokenSeparators(value: js.Array[String]): Self = StObject.set(x, "tokenSeparators", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenSeparatorsUndefined: Self = StObject.set(x, "tokenSeparators", js.undefined)
      
      @scala.inline
      def setTokenSeparatorsVarargs(value: String*): Self = StObject.set(x, "tokenSeparators", js.Array(value :_*))
    }
  }
  
  type _To = FC[SelectorProps]
  
  /* This means you don't have to write `default`, but can instead just say `multipleSelectorMod.foo` */
  override def _to: FC[SelectorProps] = default
}
