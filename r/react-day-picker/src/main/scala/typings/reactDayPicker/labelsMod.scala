package typings.reactDayPicker

import typings.reactDayPicker.typesLabelsMod.DayLabel
import typings.reactDayPicker.typesLabelsMod.NavButtonLabel
import typings.reactDayPicker.typesLabelsMod.WeekNumberLabel
import typings.reactDayPicker.typesLabelsMod.WeekdayLabel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object labelsMod {
  
  @JSImport("react-day-picker/dist/contexts/DayPicker/labels", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-day-picker/dist/contexts/DayPicker/labels", "labelDay")
  @js.native
  val labelDay: DayLabel = js.native
  
  inline def labelMonthDropdown(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("labelMonthDropdown")().asInstanceOf[String]
  
  @JSImport("react-day-picker/dist/contexts/DayPicker/labels", "labelNext")
  @js.native
  val labelNext: NavButtonLabel = js.native
  
  @JSImport("react-day-picker/dist/contexts/DayPicker/labels", "labelPrevious")
  @js.native
  val labelPrevious: NavButtonLabel = js.native
  
  @JSImport("react-day-picker/dist/contexts/DayPicker/labels", "labelWeekNumber")
  @js.native
  val labelWeekNumber: WeekNumberLabel = js.native
  
  @JSImport("react-day-picker/dist/contexts/DayPicker/labels", "labelWeekday")
  @js.native
  val labelWeekday: WeekdayLabel = js.native
  
  inline def labelYearDropdown(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("labelYearDropdown")().asInstanceOf[String]
}
