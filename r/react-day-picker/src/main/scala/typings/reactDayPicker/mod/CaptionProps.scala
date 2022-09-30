package typings.reactDayPicker.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represent the props of the {@link Caption} component. */
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
