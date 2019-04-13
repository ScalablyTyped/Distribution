package typings
package reactDashDatesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashDatesMod {
  // COMPONENTS
  //
  // components/DateRangePicker.js
  type DateRangePicker = reactLib.reactMod.ClassicComponentClass[DateRangePickerShape]
  type DayPickerRangeController = reactLib.reactMod.ClassicComponentClass[DayPickerRangeControllerShape]
  type DayPickerSingleDateController = reactLib.reactMod.ClassicComponentClass[DayPickerSingleDateControllerShape]
  // shapes/DisabledShape.js
  /* Rewritten from type alias, can be one of: 
    - scala.Boolean
    - reactDashDatesLib.reactDashDatesLibStrings.startDate
    - reactDashDatesLib.reactDashDatesLibStrings.endDate
  */
  type DisabledShape = _DisabledShape | scala.Boolean
  // components/SingleDatePicker.js
  type SingleDatePicker = reactLib.reactMod.ClassicComponentClass[SingleDatePickerShape]
}
