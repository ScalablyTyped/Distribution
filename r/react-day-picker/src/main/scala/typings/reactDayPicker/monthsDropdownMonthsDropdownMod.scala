package typings.reactDayPicker

import typings.react.mod.global.JSX.Element
import typings.reactDayPicker.eventHandlersMod.MonthChangeEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object monthsDropdownMonthsDropdownMod {
  
  @JSImport("react-day-picker/dist/components/MonthsDropdown/MonthsDropdown", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def MonthsDropdown(props: MonthsDropdownProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("MonthsDropdown")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait MonthsDropdownProps extends StObject {
    
    /** The month where the dropdown is displayed. */
    var displayMonth: js.Date
    
    var onChange: MonthChangeEventHandler
  }
  object MonthsDropdownProps {
    
    inline def apply(displayMonth: js.Date, onChange: /* month */ js.Date => Unit): MonthsDropdownProps = {
      val __obj = js.Dynamic.literal(displayMonth = displayMonth.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
      __obj.asInstanceOf[MonthsDropdownProps]
    }
    
    extension [Self <: MonthsDropdownProps](x: Self) {
      
      inline def setDisplayMonth(value: js.Date): Self = StObject.set(x, "displayMonth", value.asInstanceOf[js.Any])
      
      inline def setOnChange(value: /* month */ js.Date => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    }
  }
}
