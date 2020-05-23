package typings.reactInfiniteCalendar.anon

import typings.reactInfiniteCalendar.reactInfiniteCalendarStrings.landscape
import typings.reactInfiniteCalendar.reactInfiniteCalendarStrings.portrait
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HideYearsOnSelect extends js.Object {
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

object HideYearsOnSelect {
  @scala.inline
  def apply(
    hideYearsOnSelect: js.UndefOr[Boolean] = js.undefined,
    layout: portrait | landscape = null,
    overscanMonthCount: js.UndefOr[Double] = js.undefined,
    shouldHeaderAnimate: js.UndefOr[Boolean] = js.undefined,
    showHeader: js.UndefOr[Boolean] = js.undefined,
    showMonthsForYears: js.UndefOr[Boolean] = js.undefined,
    showOverlay: js.UndefOr[Boolean] = js.undefined,
    showTodayHelper: js.UndefOr[Boolean] = js.undefined,
    showWeekdays: js.UndefOr[Boolean] = js.undefined,
    todayHelperRowOffset: js.UndefOr[Double] = js.undefined
  ): HideYearsOnSelect = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hideYearsOnSelect)) __obj.updateDynamic("hideYearsOnSelect")(hideYearsOnSelect.get.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (!js.isUndefined(overscanMonthCount)) __obj.updateDynamic("overscanMonthCount")(overscanMonthCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldHeaderAnimate)) __obj.updateDynamic("shouldHeaderAnimate")(shouldHeaderAnimate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showHeader)) __obj.updateDynamic("showHeader")(showHeader.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showMonthsForYears)) __obj.updateDynamic("showMonthsForYears")(showMonthsForYears.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showOverlay)) __obj.updateDynamic("showOverlay")(showOverlay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showTodayHelper)) __obj.updateDynamic("showTodayHelper")(showTodayHelper.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showWeekdays)) __obj.updateDynamic("showWeekdays")(showWeekdays.get.asInstanceOf[js.Any])
    if (!js.isUndefined(todayHelperRowOffset)) __obj.updateDynamic("todayHelperRowOffset")(todayHelperRowOffset.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[HideYearsOnSelect]
  }
}

