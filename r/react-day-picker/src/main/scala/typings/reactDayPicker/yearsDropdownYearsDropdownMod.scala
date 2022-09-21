package typings.reactDayPicker

import typings.react.mod.global.JSX.Element
import typings.reactDayPicker.eventHandlersMod.MonthChangeEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object yearsDropdownYearsDropdownMod {
  
  @JSImport("react-day-picker/dist/components/YearsDropdown/YearsDropdown", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def YearsDropdown(props: YearsDropdownProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("YearsDropdown")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait YearsDropdownProps extends StObject {
    
    /** The month where the drop-down is displayed. */
    var displayMonth: js.Date
    
    /** Callback to handle the `change` event. */
    var onChange: MonthChangeEventHandler
  }
  object YearsDropdownProps {
    
    inline def apply(displayMonth: js.Date, onChange: /* month */ js.Date => Unit): YearsDropdownProps = {
      val __obj = js.Dynamic.literal(displayMonth = displayMonth.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
      __obj.asInstanceOf[YearsDropdownProps]
    }
    
    extension [Self <: YearsDropdownProps](x: Self) {
      
      inline def setDisplayMonth(value: js.Date): Self = StObject.set(x, "displayMonth", value.asInstanceOf[js.Any])
      
      inline def setOnChange(value: /* month */ js.Date => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    }
  }
}
