package typings.rcTextarea

import typings.rcTextarea.anon.Height
import typings.rcTextarea.mod.TextAreaProps
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import typings.std.HTMLTextAreaElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resizableTextAreaMod {
  
  @JSImport("rc-textarea/es/ResizableTextArea", JSImport.Default)
  @js.native
  open class default protected () extends ResizableTextArea {
    def this(props: TextAreaProps) = this()
  }
  
  @js.native
  sealed trait RESIZE_STATUS extends StObject
  @JSImport("rc-textarea/es/ResizableTextArea", "RESIZE_STATUS")
  @js.native
  object RESIZE_STATUS extends StObject {
    
    @js.native
    sealed trait NONE
      extends StObject
         with RESIZE_STATUS
    
    @js.native
    sealed trait RESIZED
      extends StObject
         with RESIZE_STATUS
    
    @js.native
    sealed trait RESIZING
      extends StObject
         with RESIZE_STATUS
  }
  
  trait AutoSizeType extends StObject {
    
    var maxRows: js.UndefOr[Double] = js.undefined
    
    var minRows: js.UndefOr[Double] = js.undefined
  }
  object AutoSizeType {
    
    inline def apply(): AutoSizeType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutoSizeType]
    }
    
    extension [Self <: AutoSizeType](x: Self) {
      
      inline def setMaxRows(value: Double): Self = StObject.set(x, "maxRows", value.asInstanceOf[js.Any])
      
      inline def setMaxRowsUndefined: Self = StObject.set(x, "maxRows", js.undefined)
      
      inline def setMinRows(value: Double): Self = StObject.set(x, "minRows", value.asInstanceOf[js.Any])
      
      inline def setMinRowsUndefined: Self = StObject.set(x, "minRows", js.undefined)
    }
  }
  
  @js.native
  trait ResizableTextArea extends Component[TextAreaProps, TextAreaState, Any] {
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MResizableTextArea(prevProps: TextAreaProps): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MResizableTextArea(): Unit = js.native
    
    def fixFirefoxAutoScroll(): Unit = js.native
    
    def handleResize(size: Height): Unit = js.native
    
    var nextFrameActionId: Double = js.native
    
    def renderTextArea(): Element = js.native
    
    var resizeFrameId: Double = js.native
    
    def resizeOnNextFrame(): Unit = js.native
    
    def resizeTextarea(): Unit = js.native
    
    def saveTextArea(textArea: HTMLTextAreaElement): Unit = js.native
    
    var textArea: HTMLTextAreaElement = js.native
  }
  
  trait TextAreaState extends StObject {
    
    /** We need add process style to disable scroll first and then add back to avoid unexpected scrollbar  */
    var resizeStatus: js.UndefOr[RESIZE_STATUS] = js.undefined
    
    var textareaStyles: js.UndefOr[CSSProperties] = js.undefined
  }
  object TextAreaState {
    
    inline def apply(): TextAreaState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextAreaState]
    }
    
    extension [Self <: TextAreaState](x: Self) {
      
      inline def setResizeStatus(value: RESIZE_STATUS): Self = StObject.set(x, "resizeStatus", value.asInstanceOf[js.Any])
      
      inline def setResizeStatusUndefined: Self = StObject.set(x, "resizeStatus", js.undefined)
      
      inline def setTextareaStyles(value: CSSProperties): Self = StObject.set(x, "textareaStyles", value.asInstanceOf[js.Any])
      
      inline def setTextareaStylesUndefined: Self = StObject.set(x, "textareaStyles", js.undefined)
    }
  }
}
