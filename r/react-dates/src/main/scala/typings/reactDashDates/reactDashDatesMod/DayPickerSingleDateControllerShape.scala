package typings.reactDashDates.reactDashDatesMod

import typings.reactDashDates.Anon_Date
import typings.reactDashDates.Anon_Focused
import typings.reactDashDates.reactDashDatesMod.momentPropTypes.momentObj
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// components/DayPickerSingleDateController.jsx
@js.native
trait DayPickerSingleDateControllerShape extends DayPickerShape {
  var date: momentObj | Null = js.native
  var focused: Boolean = js.native
  var isDayBlocked: js.UndefOr[js.Function1[/* day */ js.Any, Boolean]] = js.native
  var isDayHighlighted: js.UndefOr[js.Function1[/* day */ js.Any, Boolean]] = js.native
  var isOutsideRange: js.UndefOr[js.Function1[/* day */ js.Any, Boolean]] = js.native
  var keepOpenOnDateSelect: js.UndefOr[Boolean] = js.native
  var onClose: js.UndefOr[js.Function1[/* final */ Anon_Date, Unit]] = js.native
  def onDateChange(): Unit = js.native
  def onDateChange(date: momentObj): Unit = js.native
  def onFocusChange(arg: Anon_Focused): Unit = js.native
}

