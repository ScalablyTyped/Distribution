package typings.reactInfiniteCalendar.anon

import typings.reactInfiniteCalendar.reactInfiniteCalendarStrings.landscape
import typings.reactInfiniteCalendar.reactInfiniteCalendarStrings.portrait
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HideYearsOnSelect extends js.Object {
  var hideYearsOnSelect: js.UndefOr[Boolean] = js.native
  var layout: js.UndefOr[portrait | landscape] = js.native
  var overscanMonthCount: js.UndefOr[Double] = js.native
  var shouldHeaderAnimate: js.UndefOr[Boolean] = js.native
  var showHeader: js.UndefOr[Boolean] = js.native
  var showMonthsForYears: js.UndefOr[Boolean] = js.native
  var showOverlay: js.UndefOr[Boolean] = js.native
  var showTodayHelper: js.UndefOr[Boolean] = js.native
  var showWeekdays: js.UndefOr[Boolean] = js.native
  var todayHelperRowOffset: js.UndefOr[Double] = js.native
}

object HideYearsOnSelect {
  @scala.inline
  def apply(): HideYearsOnSelect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HideYearsOnSelect]
  }
  @scala.inline
  implicit class HideYearsOnSelectOps[Self <: HideYearsOnSelect] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHideYearsOnSelect(value: Boolean): Self = this.set("hideYearsOnSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideYearsOnSelect: Self = this.set("hideYearsOnSelect", js.undefined)
    @scala.inline
    def setLayout(value: portrait | landscape): Self = this.set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    @scala.inline
    def setOverscanMonthCount(value: Double): Self = this.set("overscanMonthCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverscanMonthCount: Self = this.set("overscanMonthCount", js.undefined)
    @scala.inline
    def setShouldHeaderAnimate(value: Boolean): Self = this.set("shouldHeaderAnimate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShouldHeaderAnimate: Self = this.set("shouldHeaderAnimate", js.undefined)
    @scala.inline
    def setShowHeader(value: Boolean): Self = this.set("showHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowHeader: Self = this.set("showHeader", js.undefined)
    @scala.inline
    def setShowMonthsForYears(value: Boolean): Self = this.set("showMonthsForYears", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowMonthsForYears: Self = this.set("showMonthsForYears", js.undefined)
    @scala.inline
    def setShowOverlay(value: Boolean): Self = this.set("showOverlay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowOverlay: Self = this.set("showOverlay", js.undefined)
    @scala.inline
    def setShowTodayHelper(value: Boolean): Self = this.set("showTodayHelper", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowTodayHelper: Self = this.set("showTodayHelper", js.undefined)
    @scala.inline
    def setShowWeekdays(value: Boolean): Self = this.set("showWeekdays", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowWeekdays: Self = this.set("showWeekdays", js.undefined)
    @scala.inline
    def setTodayHelperRowOffset(value: Double): Self = this.set("todayHelperRowOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTodayHelperRowOffset: Self = this.set("todayHelperRowOffset", js.undefined)
  }
  
}

