package typings.reactDates.anon

import typings.moment.mod.Moment
import typings.reactDates.mod.ScrollableOrientationShape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InitialVisibleMonth extends js.Object {
  
  var date: Moment | Null = js.native
  
  var focused: Boolean = js.native
  
  // DayPicker props
  var initialVisibleMonth: js.Function0[Moment] | Null = js.native
  
  var isDayBlocked: js.UndefOr[js.Function1[/* day */ Moment, Boolean]] = js.native
  
  var isDayHighlighted: js.UndefOr[js.Function1[/* day */ Moment, Boolean]] = js.native
  
  var isOutsideRange: js.UndefOr[js.Function1[/* day */ Moment, Boolean]] = js.native
  
  var keepOpenOnDateSelect: js.UndefOr[Boolean] = js.native
  
  var onClose: js.UndefOr[js.Function1[/* arg */ Date, Unit]] = js.native
  
  def onDateChange(): Unit = js.native
  def onDateChange(date: Moment): Unit = js.native
  
  def onFocusChange(arg: Focused): Unit = js.native
  
  var onNextMonthClick: js.UndefOr[js.Function1[/* newCurrentMonth */ Moment, Unit]] = js.native
  
  var onPrevMonthClick: js.UndefOr[js.Function1[/* newCurrentMonth */ Moment, Unit]] = js.native
  
  var orientation: js.UndefOr[ScrollableOrientationShape] = js.native
}
