package typings.reactDates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  // COMPONENTS
  //
  // components/DateRangePicker.js
  type DateRangePicker = typings.react.mod.ClassicComponentClass[typings.reactDates.mod.DateRangePickerShape]
  type DayPickerRangeController = typings.react.mod.ClassicComponentClass[typings.reactDates.mod.DayPickerRangeControllerShape]
  type DayPickerSingleDateController = typings.react.mod.ClassicComponentClass[typings.reactDates.mod.DayPickerSingleDateControllerShape]
  // shapes/DisabledShape.js
  /* Rewritten from type alias, can be one of: 
    - scala.Boolean
    - typings.reactDates.reactDatesStrings.startDate
    - typings.reactDates.reactDatesStrings.endDate
  */
  type DisabledShape = typings.reactDates.mod._DisabledShape | scala.Boolean
  // components/SingleDatePicker.js
  type SingleDatePicker = typings.react.mod.ClassicComponentClass[typings.reactDates.mod.SingleDatePickerShape]
}
