package typings.reactDashDates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashDatesMod {
  import typings.react.reactMod.ClassicComponentClass

  // COMPONENTS
  //
  // components/DateRangePicker.js
  type DateRangePicker = ClassicComponentClass[DateRangePickerShape]
  type DayPickerRangeController = ClassicComponentClass[DayPickerRangeControllerShape]
  type DayPickerSingleDateController = ClassicComponentClass[DayPickerSingleDateControllerShape]
  // shapes/DisabledShape.js
  /* Rewritten from type alias, can be one of: 
    - scala.Boolean
    - typings.reactDashDates.reactDashDatesStrings.startDate
    - typings.reactDashDates.reactDashDatesStrings.endDate
  */
  type DisabledShape = _DisabledShape | Boolean
  // components/SingleDatePicker.js
  type SingleDatePicker = ClassicComponentClass[SingleDatePickerShape]
}
