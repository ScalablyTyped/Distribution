package typings.reactDayPicker

import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object monthMonthMod {
  
  @JSImport("react-day-picker/dist/components/Month/Month", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Month(props: MonthProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Month")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait MonthProps extends StObject {
    
    var displayIndex: Double
    
    var displayMonth: js.Date
  }
  object MonthProps {
    
    inline def apply(displayIndex: Double, displayMonth: js.Date): MonthProps = {
      val __obj = js.Dynamic.literal(displayIndex = displayIndex.asInstanceOf[js.Any], displayMonth = displayMonth.asInstanceOf[js.Any])
      __obj.asInstanceOf[MonthProps]
    }
    
    extension [Self <: MonthProps](x: Self) {
      
      inline def setDisplayIndex(value: Double): Self = StObject.set(x, "displayIndex", value.asInstanceOf[js.Any])
      
      inline def setDisplayMonth(value: js.Date): Self = StObject.set(x, "displayMonth", value.asInstanceOf[js.Any])
    }
  }
}
