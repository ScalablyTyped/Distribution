package typings.reactDates.anon

import typings.moment.mod.Moment
import typings.reactDates.mod.DisabledShape
import typings.reactDates.mod.FocusedInputShape
import typings.reactDates.mod.ScrollableOrientationShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DaysViolatingMinNightsCanBeClicked extends StObject {
  
  var daysViolatingMinNightsCanBeClicked: js.UndefOr[Boolean] = js.native
  
  var disabled: js.UndefOr[DisabledShape] = js.native
  
  var endDate: Moment | Null = js.native
  
  var endDateOffset: js.UndefOr[js.Function1[/* day */ Moment, Moment]] = js.native
  
  var focusedInput: FocusedInputShape | Null = js.native
  
  var getMinNightsForHoverDate: js.UndefOr[js.Function1[/* day */ Moment, Double]] = js.native
  
  // DayPicker props
  var initialVisibleMonth: js.Function0[Moment] | Null = js.native
  
  var isDayBlocked: js.UndefOr[js.Function1[/* day */ Moment, Boolean]] = js.native
  
  var isDayHighlighted: js.UndefOr[js.Function1[/* day */ Moment, Boolean]] = js.native
  
  var isOutsideRange: js.UndefOr[js.Function1[/* day */ Moment, Boolean]] = js.native
  
  var keepOpenOnDateSelect: js.UndefOr[Boolean] = js.native
  
  var maxDate: js.UndefOr[Moment | Null] = js.native
  
  var minDate: js.UndefOr[Moment | Null] = js.native
  
  var minimumNights: js.UndefOr[Double] = js.native
  
  var onClose: js.UndefOr[js.Function1[/* final */ EndDate, Unit]] = js.native
  
  def onDatesChange(arg: EndDate): Unit = js.native
  
  def onFocusChange(): Unit = js.native
  def onFocusChange(arg: FocusedInputShape): Unit = js.native
  
  var onNextMonthClick: js.UndefOr[js.Function1[/* newCurrentMonth */ Moment, Unit]] = js.native
  
  var onPrevMonthClick: js.UndefOr[js.Function1[/* newCurrentMonth */ Moment, Unit]] = js.native
  
  var orientation: js.UndefOr[ScrollableOrientationShape] = js.native
  
  var startDate: Moment | Null = js.native
  
  var startDateOffset: js.UndefOr[js.Function1[/* day */ Moment, Moment]] = js.native
}
