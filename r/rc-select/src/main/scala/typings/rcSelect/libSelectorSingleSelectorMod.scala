package typings.rcSelect

import org.scalablytyped.runtime.Shortcut
import typings.rcSelect.libBaseSelectMod.DisplayValueType
import typings.rcSelect.libBaseSelectMod.Mode
import typings.rcSelect.libSelectorMod.InnerSelectorProps
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

object libSelectorSingleSelectorMod extends Shortcut {
  
  @JSImport("rc-select/lib/Selector/SingleSelector", JSImport.Default)
  @js.native
  val default: FC[SelectorProps] = js.native
  
  trait SelectorProps
    extends StObject
       with InnerSelectorProps {
    
    var activeValue: String
    
    var inputElement: ReactElement
  }
  object SelectorProps {
    
    inline def apply(
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
      values: js.Array[DisplayValueType]
    ): SelectorProps = {
      val __obj = js.Dynamic.literal(activeValue = activeValue.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inputElement = inputElement.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], onInputChange = js.Any.fromFunction1(onInputChange), onInputCompositionEnd = js.Any.fromFunction1(onInputCompositionEnd), onInputCompositionStart = js.Any.fromFunction1(onInputCompositionStart), onInputKeyDown = js.Any.fromFunction1(onInputKeyDown), onInputMouseDown = js.Any.fromFunction1(onInputMouseDown), onInputPaste = js.Any.fromFunction1(onInputPaste), open = open.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], searchValue = searchValue.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any], inputRef = null)
      __obj.asInstanceOf[SelectorProps]
    }
    
    extension [Self <: SelectorProps](x: Self) {
      
      inline def setActiveValue(value: String): Self = StObject.set(x, "activeValue", value.asInstanceOf[js.Any])
      
      inline def setInputElement(value: ReactElement): Self = StObject.set(x, "inputElement", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = FC[SelectorProps]
  
  /* This means you don't have to write `default`, but can instead just say `libSelectorSingleSelectorMod.foo` */
  override def _to: FC[SelectorProps] = default
}
