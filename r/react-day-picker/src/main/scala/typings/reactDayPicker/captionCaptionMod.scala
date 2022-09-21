package typings.reactDayPicker

import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object captionCaptionMod {
  
  @JSImport("react-day-picker/dist/components/Caption/Caption", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Caption(props: CaptionProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Caption")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactDayPicker.reactDayPickerStrings.dropdown
    - typings.reactDayPicker.reactDayPickerStrings.buttons
  */
  trait CaptionLayout extends StObject
  object CaptionLayout {
    
    inline def buttons: typings.reactDayPicker.reactDayPickerStrings.buttons = "buttons".asInstanceOf[typings.reactDayPicker.reactDayPickerStrings.buttons]
    
    inline def dropdown: typings.reactDayPicker.reactDayPickerStrings.dropdown = "dropdown".asInstanceOf[typings.reactDayPicker.reactDayPickerStrings.dropdown]
  }
  
  trait CaptionProps extends StObject {
    
    /** The month where the caption is displayed. */
    var displayMonth: js.Date
    
    /** The ID for the heading element. Must be the same as the labelled-by in Table. */
    var id: js.UndefOr[String] = js.undefined
  }
  object CaptionProps {
    
    inline def apply(displayMonth: js.Date): CaptionProps = {
      val __obj = js.Dynamic.literal(displayMonth = displayMonth.asInstanceOf[js.Any])
      __obj.asInstanceOf[CaptionProps]
    }
    
    extension [Self <: CaptionProps](x: Self) {
      
      inline def setDisplayMonth(value: js.Date): Self = StObject.set(x, "displayMonth", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    }
  }
}
