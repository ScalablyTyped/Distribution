package typings.reactDayPicker.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the value of the {@link NavigationContext}. */
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
