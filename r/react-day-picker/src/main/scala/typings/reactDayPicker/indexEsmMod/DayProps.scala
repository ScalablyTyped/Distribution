package typings.reactDayPicker.indexEsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represent the props used by the {@link Day} component. */
trait DayProps extends StObject {
  
  /** The date to render. */
  var date: js.Date
  
  /** The month where the date is displayed. */
  var displayMonth: js.Date
}
object DayProps {
  
  inline def apply(date: js.Date, displayMonth: js.Date): DayProps = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], displayMonth = displayMonth.asInstanceOf[js.Any])
    __obj.asInstanceOf[DayProps]
  }
  
  extension [Self <: DayProps](x: Self) {
    
    inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDisplayMonth(value: js.Date): Self = StObject.set(x, "displayMonth", value.asInstanceOf[js.Any])
  }
}
