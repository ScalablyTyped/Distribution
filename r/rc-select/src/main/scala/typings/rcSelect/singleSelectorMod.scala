package typings.rcSelect

import org.scalablytyped.runtime.Shortcut
import typings.rcSelect.generatorMod.LabelValueType
import typings.rcSelect.interfaceMod.Mode
import typings.rcSelect.selectorMod.InnerSelectorProps
import typings.react.mod.ChangeEvent
import typings.react.mod.ClipboardEvent
import typings.react.mod.CompositionEvent
import typings.react.mod.FC
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.std.HTMLInputElement
import typings.std.HTMLTextAreaElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object singleSelectorMod extends Shortcut {
  
  @JSImport("rc-select/lib/Selector/SingleSelector", JSImport.Default)
  @js.native
  val default: FC[SelectorProps] = js.native
  
  trait SelectorProps
    extends StObject
       with InnerSelectorProps {
    
    var activeValue: String
    
    var backfill: js.UndefOr[Boolean] = js.undefined
    
    var inputElement: ReactElement
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
      val __obj = js.Dynamic.literal(accessibilityIndex = accessibilityIndex.asInstanceOf[js.Any], activeValue = activeValue.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inputElement = inputElement.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], onInputChange = js.Any.fromFunction1(onInputChange), onInputCompositionEnd = js.Any.fromFunction1(onInputCompositionEnd), onInputCompositionStart = js.Any.fromFunction1(onInputCompositionStart), onInputKeyDown = js.Any.fromFunction1(onInputKeyDown), onInputMouseDown = js.Any.fromFunction1(onInputMouseDown), onInputPaste = js.Any.fromFunction1(onInputPaste), open = open.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], searchValue = searchValue.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any], inputRef = null)
      __obj.asInstanceOf[SelectorProps]
    }
    
    @scala.inline
    implicit class SelectorPropsMutableBuilder[Self <: SelectorProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveValue(value: String): Self = StObject.set(x, "activeValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackfill(value: Boolean): Self = StObject.set(x, "backfill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackfillUndefined: Self = StObject.set(x, "backfill", js.undefined)
      
      @scala.inline
      def setInputElement(value: ReactElement): Self = StObject.set(x, "inputElement", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = FC[SelectorProps]
  
  /* This means you don't have to write `default`, but can instead just say `singleSelectorMod.foo` */
  override def _to: FC[SelectorProps] = default
}
