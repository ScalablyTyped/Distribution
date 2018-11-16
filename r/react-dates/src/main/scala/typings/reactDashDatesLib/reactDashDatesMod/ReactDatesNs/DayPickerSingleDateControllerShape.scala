package typings
package reactDashDatesLib.reactDashDatesMod.ReactDatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// components/DayPickerSingleDateController.jsx
@js.native
trait DayPickerSingleDateControllerShape extends DayPickerShape {
  var date: reactDashDatesLib.reactDashDatesMod.momentPropTypesNs.momentObj | scala.Null = js.native
  var focused: scala.Boolean = js.native
  var isDayBlocked: js.UndefOr[js.Function1[/* day */ js.Any, scala.Boolean]] = js.native
  var isDayHighlighted: js.UndefOr[js.Function1[/* day */ js.Any, scala.Boolean]] = js.native
  var isOutsideRange: js.UndefOr[js.Function1[/* day */ js.Any, scala.Boolean]] = js.native
  var keepOpenOnDateSelect: js.UndefOr[scala.Boolean] = js.native
  var onClose: js.UndefOr[js.Function1[/* final */ reactDashDatesLib.Anon_Date, scala.Unit]] = js.native
  def onDateChange(): scala.Unit = js.native
  def onDateChange(date: reactDashDatesLib.reactDashDatesMod.momentPropTypesNs.momentObj): scala.Unit = js.native
  def onFocusChange(arg: reactDashDatesLib.Anon_Focused): scala.Unit = js.native
}

