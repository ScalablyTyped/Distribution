package typings.reactDashInfiniteDashCalendar

import typings.reactDashInfiniteDashCalendar.reactDashInfiniteDashCalendarStrings.landscape
import typings.reactDashInfiniteDashCalendar.reactDashInfiniteDashCalendarStrings.portrait
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HideYearsOnSelect extends js.Object {
  var hideYearsOnSelect: js.UndefOr[Boolean] = js.undefined
  var layout: js.UndefOr[portrait | landscape] = js.undefined
  var overscanMonthCount: js.UndefOr[Double] = js.undefined
  var shouldHeaderAnimate: js.UndefOr[Boolean] = js.undefined
  var showHeader: js.UndefOr[Boolean] = js.undefined
  var showMonthsForYears: js.UndefOr[Boolean] = js.undefined
  var showOverlay: js.UndefOr[Boolean] = js.undefined
  var showTodayHelper: js.UndefOr[Boolean] = js.undefined
  var showWeekdays: js.UndefOr[Boolean] = js.undefined
  var todayHelperRowOffset: js.UndefOr[Double] = js.undefined
}

object Anon_HideYearsOnSelect {
  @scala.inline
  def apply(
    hideYearsOnSelect: js.UndefOr[Boolean] = js.undefined,
    layout: portrait | landscape = null,
    overscanMonthCount: Int | Double = null,
    shouldHeaderAnimate: js.UndefOr[Boolean] = js.undefined,
    showHeader: js.UndefOr[Boolean] = js.undefined,
    showMonthsForYears: js.UndefOr[Boolean] = js.undefined,
    showOverlay: js.UndefOr[Boolean] = js.undefined,
    showTodayHelper: js.UndefOr[Boolean] = js.undefined,
    showWeekdays: js.UndefOr[Boolean] = js.undefined,
    todayHelperRowOffset: Int | Double = null
  ): Anon_HideYearsOnSelect = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hideYearsOnSelect)) __obj.updateDynamic("hideYearsOnSelect")(hideYearsOnSelect)
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (overscanMonthCount != null) __obj.updateDynamic("overscanMonthCount")(overscanMonthCount.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldHeaderAnimate)) __obj.updateDynamic("shouldHeaderAnimate")(shouldHeaderAnimate)
    if (!js.isUndefined(showHeader)) __obj.updateDynamic("showHeader")(showHeader)
    if (!js.isUndefined(showMonthsForYears)) __obj.updateDynamic("showMonthsForYears")(showMonthsForYears)
    if (!js.isUndefined(showOverlay)) __obj.updateDynamic("showOverlay")(showOverlay)
    if (!js.isUndefined(showTodayHelper)) __obj.updateDynamic("showTodayHelper")(showTodayHelper)
    if (!js.isUndefined(showWeekdays)) __obj.updateDynamic("showWeekdays")(showWeekdays)
    if (todayHelperRowOffset != null) __obj.updateDynamic("todayHelperRowOffset")(todayHelperRowOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_HideYearsOnSelect]
  }
}

