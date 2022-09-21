package typings.reactDayPicker

import typings.react.mod.Context
import typings.react.mod.global.JSX.Element
import typings.reactDayPicker.anon.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object navigationContextMod {
  
  @JSImport("react-day-picker/dist/contexts/Navigation/NavigationContext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-day-picker/dist/contexts/Navigation/NavigationContext", "NavigationContext")
  @js.native
  val NavigationContext: Context[js.UndefOr[NavigationContextValue]] = js.native
  
  inline def NavigationProvider(props: `2`): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("NavigationProvider")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @js.native
  trait NavigationContextValue extends StObject {
    
    /** The month to display in the calendar. When `numberOfMonths` is greater than one, is the first of the displayed months. */
    var currentMonth: js.Date = js.native
    
    /** The months rendered by DayPicker. DayPicker can render multiple months via `numberOfMonths`. */
    var displayMonths: js.Array[js.Date] = js.native
    
    /** Navigate to the specified date. */
    def goToDate(date: js.Date): Unit = js.native
    def goToDate(date: js.Date, refDate: js.Date): Unit = js.native
    
    /** Navigate to the specified month. */
    def goToMonth(month: js.Date): Unit = js.native
    
    /** Whether the given day is included in the displayed months. */
    def isDateDisplayed(day: js.Date): Boolean = js.native
    
    /** The next month to display. */
    var nextMonth: js.UndefOr[js.Date] = js.native
    
    /** The previous month to display. */
    var previousMonth: js.UndefOr[js.Date] = js.native
  }
}
