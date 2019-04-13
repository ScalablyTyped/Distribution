package typings
package reactDashDatesLib.reactDashDatesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// components/DayPickerRangeController.jsx
@js.native
trait DayPickerRangeControllerShape extends DayPickerShape {
  var disabled: js.UndefOr[DisabledShape] = js.native
  var endDate: reactDashDatesLib.reactDashDatesMod.momentPropTypesNs.momentObj | scala.Null = js.native
  var endDateOffset: js.UndefOr[js.Function1[/* day */ js.Any, _]] = js.native
  var focusedInput: FocusedInputShape = js.native
  var isDayBlocked: js.UndefOr[js.Function1[/* day */ js.Any, scala.Boolean]] = js.native
  var isDayHighlighted: js.UndefOr[js.Function1[/* day */ js.Any, scala.Boolean]] = js.native
  var isOutsideRange: js.UndefOr[js.Function1[/* day */ js.Any, scala.Boolean]] = js.native
  var keepOpenOnDateSelect: js.UndefOr[scala.Boolean] = js.native
  var minimumNights: js.UndefOr[scala.Double] = js.native
  var onClose: js.UndefOr[js.Function1[/* final */ reactDashDatesLib.Anon_EndDateStartDate, scala.Unit]] = js.native
  // REQUIRED props
  var startDate: reactDashDatesLib.reactDashDatesMod.momentPropTypesNs.momentObj | scala.Null = js.native
  var startDateOffset: js.UndefOr[js.Function1[/* day */ js.Any, _]] = js.native
  def onDatesChange(arg: reactDashDatesLib.Anon_EndDate): scala.Unit = js.native
  def onFocusChange(): scala.Unit = js.native
  def onFocusChange(arg: FocusedInputShape): scala.Unit = js.native
}

