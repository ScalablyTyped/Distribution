package typings.rcTextarea

import typings.rcTextarea.anon.Height
import typings.rcTextarea.anon.Value
import typings.rcTextarea.esResizableTextAreaMod.AutoSizeType
import typings.rcTextarea.esResizableTextAreaMod.ResizableTextAreaRef
import typings.react.mod.ChangeEvent
import typings.react.mod.Component
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.RefAttributes
import typings.react.mod.TextareaHTMLAttributes
import typings.std.HTMLTextAreaElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rc-textarea", JSImport.Default)
  @js.native
  open class default protected () extends TextArea {
    def this(props: TextAreaProps) = this()
  }
  object default {
    
    @JSImport("rc-textarea", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def getDerivedStateFromProps(nextProps: TextAreaProps): Value = ^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(nextProps.asInstanceOf[js.Any]).asInstanceOf[Value]
  }
  
  @JSImport("rc-textarea", "ResizableTextArea")
  @js.native
  val ResizableTextArea: ForwardRefExoticComponent[TextAreaProps & RefAttributes[ResizableTextAreaRef]] = js.native
  
  type HTMLTextareaProps = TextareaHTMLAttributes[HTMLTextAreaElement]
  
  @js.native
  trait TextArea extends Component[TextAreaProps, TextAreaState, Any] {
    
    def blur(): Unit = js.native
    
    def focus(): Unit = js.native
    
    def handleChange(e: ChangeEvent[HTMLTextAreaElement]): Unit = js.native
    
    def handleKeyDown(e: KeyboardEvent[HTMLTextAreaElement]): Unit = js.native
    
    var resizableTextArea: ResizableTextAreaRef = js.native
    
    def saveTextArea(resizableTextArea: ResizableTextAreaRef): Unit = js.native
    
    def setValue(value: String): Unit = js.native
    def setValue(value: String, callback: js.Function0[Unit]): Unit = js.native
  }
  
  trait TextAreaProps
    extends StObject
       with TextareaHTMLAttributes[HTMLTextAreaElement] {
    
    var autoSize: js.UndefOr[Boolean | AutoSizeType] = js.undefined
    
    var onPressEnter: js.UndefOr[KeyboardEventHandler[HTMLTextAreaElement]] = js.undefined
    
    @JSName("onResize")
    var onResize_TextAreaProps: js.UndefOr[js.Function1[/* size */ Height, Unit]] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
  }
  object TextAreaProps {
    
    inline def apply(): TextAreaProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextAreaProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TextAreaProps] (val x: Self) extends AnyVal {
      
      inline def setAutoSize(value: Boolean | AutoSizeType): Self = StObject.set(x, "autoSize", value.asInstanceOf[js.Any])
      
      inline def setAutoSizeUndefined: Self = StObject.set(x, "autoSize", js.undefined)
      
      inline def setOnPressEnter(value: KeyboardEvent[HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onPressEnter", js.Any.fromFunction1(value))
      
      inline def setOnPressEnterUndefined: Self = StObject.set(x, "onPressEnter", js.undefined)
      
      inline def setOnResize(value: /* size */ Height => Unit): Self = StObject.set(x, "onResize", js.Any.fromFunction1(value))
      
      inline def setOnResizeUndefined: Self = StObject.set(x, "onResize", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
    }
  }
  
  trait TextAreaState extends StObject {
    
    var value: Any
  }
  object TextAreaState {
    
    inline def apply(value: Any): TextAreaState = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextAreaState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TextAreaState] (val x: Self) extends AnyVal {
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
