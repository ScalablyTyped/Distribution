package typings.semanticUiReact

import typings.react.mod.ChangeEvent
import typings.react.mod.Component
import typings.react.mod.FormEvent
import typings.react.mod.TextareaHTMLAttributes
import typings.std.HTMLTextAreaElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textAreaTextAreaMod {
  
  @JSImport("semantic-ui-react/dist/commonjs/addons/TextArea/TextArea", JSImport.Default)
  @js.native
  open class default () extends TextArea
  
  trait StrictTextAreaProps
    extends StObject
       with TextareaHTMLAttributes[HTMLTextAreaElement] {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[Any] = js.undefined
    
    /**
      * Called on change.
      *
      * @param {SyntheticEvent} event - The React SyntheticEvent object
      * @param {object} data - All props and the event value.
      */
    @JSName("onChange")
    var onChange_StrictTextAreaProps: js.UndefOr[
        js.Function2[/* event */ ChangeEvent[HTMLTextAreaElement], /* data */ TextAreaProps, Unit]
      ] = js.undefined
    
    /**
      * Called on input.
      *
      * @param {SyntheticEvent} event - The React SyntheticEvent object
      * @param {object} data - All props and the event value.
      */
    @JSName("onInput")
    var onInput_StrictTextAreaProps: js.UndefOr[
        js.Function2[/* event */ FormEvent[HTMLTextAreaElement], /* data */ TextAreaProps, Unit]
      ] = js.undefined
    
    /** Indicates row count for a TextArea. */
    @JSName("rows")
    var rows_StrictTextAreaProps: js.UndefOr[Double | String] = js.undefined
    
    /** The value of the textarea. */
    @JSName("value")
    var value_StrictTextAreaProps: js.UndefOr[Double | String] = js.undefined
  }
  object StrictTextAreaProps {
    
    inline def apply(): StrictTextAreaProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictTextAreaProps]
    }
    
    extension [Self <: StrictTextAreaProps](x: Self) {
      
      inline def setAs(value: Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setOnChange(value: (/* event */ ChangeEvent[HTMLTextAreaElement], /* data */ TextAreaProps) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnInput(value: (/* event */ FormEvent[HTMLTextAreaElement], /* data */ TextAreaProps) => Unit): Self = StObject.set(x, "onInput", js.Any.fromFunction2(value))
      
      inline def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
      
      inline def setRows(value: Double | String): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      inline def setValue(value: Double | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait TextArea
    extends Component[TextAreaProps, js.Object, Any] {
    
    def focus(): Unit = js.native
  }
  
  type TextAreaProps = StrictTextAreaProps
}
