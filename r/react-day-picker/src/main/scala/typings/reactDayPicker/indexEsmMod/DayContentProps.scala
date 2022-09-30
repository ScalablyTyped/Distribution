package typings.reactDayPicker.indexEsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represent the props for the {@link DayContent} component. */
trait DayContentProps extends StObject {
  
  /** The active modifiers for the given date. */
  var activeModifiers: ActiveModifiers
  
  /** The date representing the day. */
  var date: js.Date
  
  /** The month where the day is displayed. */
  var displayMonth: js.Date
}
object DayContentProps {
  
  inline def apply(activeModifiers: ActiveModifiers, date: js.Date, displayMonth: js.Date): DayContentProps = {
    val __obj = js.Dynamic.literal(activeModifiers = activeModifiers.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], displayMonth = displayMonth.asInstanceOf[js.Any])
    __obj.asInstanceOf[DayContentProps]
  }
  
  extension [Self <: DayContentProps](x: Self) {
    
    inline def setActiveModifiers(value: ActiveModifiers): Self = StObject.set(x, "activeModifiers", value.asInstanceOf[js.Any])
    
    inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDisplayMonth(value: js.Date): Self = StObject.set(x, "displayMonth", value.asInstanceOf[js.Any])
  }
}
