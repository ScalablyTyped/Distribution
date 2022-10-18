package typings.rcSelect

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ChangeEvent
import typings.react.mod.ChangeEventHandler
import typings.react.mod.ClipboardEvent
import typings.react.mod.ClipboardEventHandler
import typings.react.mod.CompositionEvent
import typings.react.mod.CompositionEventHandler
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.react.mod.RefAttributes
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import typings.std.HTMLTextAreaElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSelectorInputMod extends Shortcut {
  
  @JSImport("rc-select/lib/Selector/Input", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[InputProps & RefAttributes[InputRef]] = js.native
  
  trait InputProps extends StObject {
    
    var activeDescendantId: js.UndefOr[String] = js.undefined
    
    /** Pass accessibility props to input */
    var attrs: Record[String, Any]
    
    var autoComplete: String
    
    var autoFocus: Boolean
    
    var disabled: Boolean
    
    var editable: Boolean
    
    var id: String
    
    var inputElement: ReactElement
    
    var maxLength: js.UndefOr[Double] = js.undefined
    
    var onChange: ChangeEventHandler[HTMLInputElement | HTMLTextAreaElement | HTMLElement]
    
    var onCompositionEnd: CompositionEventHandler[HTMLInputElement | HTMLTextAreaElement | HTMLElement]
    
    var onCompositionStart: CompositionEventHandler[HTMLInputElement | HTMLTextAreaElement | HTMLElement]
    
    var onKeyDown: KeyboardEventHandler[HTMLInputElement | HTMLTextAreaElement | HTMLElement]
    
    var onMouseDown: MouseEventHandler[HTMLInputElement | HTMLTextAreaElement | HTMLElement]
    
    var onPaste: ClipboardEventHandler[HTMLInputElement | HTMLTextAreaElement | HTMLElement]
    
    var open: Boolean
    
    var prefixCls: String
    
    var tabIndex: Double
    
    var value: String
  }
  object InputProps {
    
    inline def apply(
      attrs: Record[String, Any],
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
      val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], autoComplete = autoComplete.asInstanceOf[js.Any], autoFocus = autoFocus.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], editable = editable.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inputElement = inputElement.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), onCompositionEnd = js.Any.fromFunction1(onCompositionEnd), onCompositionStart = js.Any.fromFunction1(onCompositionStart), onKeyDown = js.Any.fromFunction1(onKeyDown), onMouseDown = js.Any.fromFunction1(onMouseDown), onPaste = js.Any.fromFunction1(onPaste), open = open.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], tabIndex = tabIndex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[InputProps]
    }
    
    extension [Self <: InputProps](x: Self) {
      
      inline def setActiveDescendantId(value: String): Self = StObject.set(x, "activeDescendantId", value.asInstanceOf[js.Any])
      
      inline def setActiveDescendantIdUndefined: Self = StObject.set(x, "activeDescendantId", js.undefined)
      
      inline def setAttrs(value: Record[String, Any]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      inline def setAutoComplete(value: String): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setInputElement(value: ReactElement): Self = StObject.set(x, "inputElement", value.asInstanceOf[js.Any])
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setOnChange(value: ChangeEvent[HTMLInputElement | HTMLTextAreaElement | HTMLElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnCompositionEnd(value: CompositionEvent[HTMLInputElement | HTMLTextAreaElement | HTMLElement] => Unit): Self = StObject.set(x, "onCompositionEnd", js.Any.fromFunction1(value))
      
      inline def setOnCompositionStart(value: CompositionEvent[HTMLInputElement | HTMLTextAreaElement | HTMLElement] => Unit): Self = StObject.set(x, "onCompositionStart", js.Any.fromFunction1(value))
      
      inline def setOnKeyDown(value: KeyboardEvent[HTMLInputElement | HTMLTextAreaElement | HTMLElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnMouseDown(value: MouseEvent[HTMLInputElement | HTMLTextAreaElement | HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      inline def setOnPaste(value: ClipboardEvent[HTMLInputElement | HTMLTextAreaElement | HTMLElement] => Unit): Self = StObject.set(x, "onPaste", js.Any.fromFunction1(value))
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type InputRef = HTMLInputElement | HTMLTextAreaElement
  
  type _To = ForwardRefExoticComponent[InputProps & RefAttributes[InputRef]]
  
  /* This means you don't have to write `default`, but can instead just say `libSelectorInputMod.foo` */
  override def _to: ForwardRefExoticComponent[InputProps & RefAttributes[InputRef]] = default
}
