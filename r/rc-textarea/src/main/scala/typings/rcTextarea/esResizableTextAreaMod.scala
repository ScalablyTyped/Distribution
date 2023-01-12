package typings.rcTextarea

import org.scalablytyped.runtime.Shortcut
import typings.rcTextarea.mod.TextAreaProps
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.std.HTMLTextAreaElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esResizableTextAreaMod extends Shortcut {
  
  @JSImport("rc-textarea/es/ResizableTextArea", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[TextAreaProps & RefAttributes[ResizableTextAreaRef]] = js.native
  
  trait AutoSizeType extends StObject {
    
    var maxRows: js.UndefOr[Double] = js.undefined
    
    var minRows: js.UndefOr[Double] = js.undefined
  }
  object AutoSizeType {
    
    inline def apply(): AutoSizeType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutoSizeType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AutoSizeType] (val x: Self) extends AnyVal {
      
      inline def setMaxRows(value: Double): Self = StObject.set(x, "maxRows", value.asInstanceOf[js.Any])
      
      inline def setMaxRowsUndefined: Self = StObject.set(x, "maxRows", js.undefined)
      
      inline def setMinRows(value: Double): Self = StObject.set(x, "minRows", value.asInstanceOf[js.Any])
      
      inline def setMinRowsUndefined: Self = StObject.set(x, "minRows", js.undefined)
    }
  }
  
  trait ResizableTextAreaRef extends StObject {
    
    var textArea: HTMLTextAreaElement
  }
  object ResizableTextAreaRef {
    
    inline def apply(textArea: HTMLTextAreaElement): ResizableTextAreaRef = {
      val __obj = js.Dynamic.literal(textArea = textArea.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResizableTextAreaRef]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResizableTextAreaRef] (val x: Self) extends AnyVal {
      
      inline def setTextArea(value: HTMLTextAreaElement): Self = StObject.set(x, "textArea", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ForwardRefExoticComponent[TextAreaProps & RefAttributes[ResizableTextAreaRef]]
  
  /* This means you don't have to write `default`, but can instead just say `esResizableTextAreaMod.foo` */
  override def _to: ForwardRefExoticComponent[TextAreaProps & RefAttributes[ResizableTextAreaRef]] = default
}
