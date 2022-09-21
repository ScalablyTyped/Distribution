package typings.reactDayPicker

import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object captionLabelCaptionLabelMod {
  
  @JSImport("react-day-picker/dist/components/CaptionLabel/CaptionLabel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def CaptionLabel(props: CaptionLabelProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("CaptionLabel")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait CaptionLabelProps extends StObject {
    
    /** The month where the caption is displayed. */
    var displayMonth: js.Date
    
    /** The ID for the heading element. Must be the same as the labelled-by in Table. */
    var id: js.UndefOr[String] = js.undefined
  }
  object CaptionLabelProps {
    
    inline def apply(displayMonth: js.Date): CaptionLabelProps = {
      val __obj = js.Dynamic.literal(displayMonth = displayMonth.asInstanceOf[js.Any])
      __obj.asInstanceOf[CaptionLabelProps]
    }
    
    extension [Self <: CaptionLabelProps](x: Self) {
      
      inline def setDisplayMonth(value: js.Date): Self = StObject.set(x, "displayMonth", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    }
  }
}
