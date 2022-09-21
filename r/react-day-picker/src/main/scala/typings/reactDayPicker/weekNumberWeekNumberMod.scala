package typings.reactDayPicker

import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object weekNumberWeekNumberMod {
  
  @JSImport("react-day-picker/dist/components/WeekNumber/WeekNumber", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def WeekNumber(props: WeekNumberProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("WeekNumber")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait WeekNumberProps extends StObject {
    
    /** The dates in the week. */
    var dates: js.Array[js.Date]
    
    /** The number of the week. */
    var number: Double
  }
  object WeekNumberProps {
    
    inline def apply(dates: js.Array[js.Date], number: Double): WeekNumberProps = {
      val __obj = js.Dynamic.literal(dates = dates.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
      __obj.asInstanceOf[WeekNumberProps]
    }
    
    extension [Self <: WeekNumberProps](x: Self) {
      
      inline def setDates(value: js.Array[js.Date]): Self = StObject.set(x, "dates", value.asInstanceOf[js.Any])
      
      inline def setDatesVarargs(value: js.Date*): Self = StObject.set(x, "dates", js.Array(value*))
      
      inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    }
  }
}
