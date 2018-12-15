package typings
package reactDashDatesLib.reactDashDatesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ReactDatesNs {
  // SHAPES
  //
  // shapes/AnchorDirectionShape.js
  type AnchorDirectionShape = reactDashDatesLib.reactDashDatesLibStrings.left | reactDashDatesLib.reactDashDatesLibStrings.right
  // shapes/CalendarInfoPositionShape.js
  type CalendarInfoPositionShape = reactDashDatesLib.reactDashDatesLibStrings.top | reactDashDatesLib.reactDashDatesLibStrings.bottom | reactDashDatesLib.reactDashDatesLibStrings.before | reactDashDatesLib.reactDashDatesLibStrings.after
  // COMPONENTS
  //
  // components/DateRangePicker.js
  type DateRangePicker = reactLib.reactMod.ReactNs.ClassicComponentClass[DateRangePickerShape]
  // shapes/DayOfWeekShape.js
  type DayOfWeekShape = reactDashDatesLib.reactDashDatesLibNumbers.`0` | reactDashDatesLib.reactDashDatesLibNumbers.`1` | reactDashDatesLib.reactDashDatesLibNumbers.`2` | reactDashDatesLib.reactDashDatesLibNumbers.`3` | reactDashDatesLib.reactDashDatesLibNumbers.`4` | reactDashDatesLib.reactDashDatesLibNumbers.`5` | reactDashDatesLib.reactDashDatesLibNumbers.`6`
  type DayPickerRangeController = reactLib.reactMod.ReactNs.ClassicComponentClass[DayPickerRangeControllerShape]
  type DayPickerSingleDateController = reactLib.reactMod.ReactNs.ClassicComponentClass[DayPickerSingleDateControllerShape]
  // shapes/DisabledShape.js
  type DisabledShape = scala.Boolean | reactDashDatesLib.reactDashDatesLibStrings.startDate | reactDashDatesLib.reactDashDatesLibStrings.endDate
  // shapes/FocusedInputShape.js
  type FocusedInputShape = reactDashDatesLib.reactDashDatesLibStrings.startDate | reactDashDatesLib.reactDashDatesLibStrings.endDate
  // shape/IconPositionShape.js
  type IconPositionShape = reactDashDatesLib.reactDashDatesLibStrings.before | reactDashDatesLib.reactDashDatesLibStrings.after
  // type/OpenDirectionShape.js
  type OpenDirectionShape = reactDashDatesLib.reactDashDatesLibStrings.down | reactDashDatesLib.reactDashDatesLibStrings.up
  // shpae/OrientationShape.js
  type OrientationShape = reactDashDatesLib.reactDashDatesLibStrings.horizontal | reactDashDatesLib.reactDashDatesLibStrings.vertical
  // shape/ScrollableOrientationShape.js
  type ScrollableOrientationShape = reactDashDatesLib.reactDashDatesLibStrings.horizontal | reactDashDatesLib.reactDashDatesLibStrings.vertical | reactDashDatesLib.reactDashDatesLibStrings.verticalScrollable
  // components/SingleDatePicker.js
  type SingleDatePicker = reactLib.reactMod.ReactNs.ClassicComponentClass[SingleDatePickerShape]
}
