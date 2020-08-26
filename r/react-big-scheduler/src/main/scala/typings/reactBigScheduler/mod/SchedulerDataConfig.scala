package typings.reactBigScheduler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchedulerDataConfig extends js.Object {
  var agendaMaxEventWidth: js.UndefOr[Double] = js.native
  var agendaResourceTableWidth: js.UndefOr[Double] = js.native
  var calendarPopoverEnabled: js.UndefOr[Boolean] = js.native
  var checkConflict: js.UndefOr[Boolean] = js.native
  var creatable: js.UndefOr[Boolean] = js.native
  var crossResourceMove: js.UndefOr[Boolean] = js.native
  var dayCellWidth: js.UndefOr[Double] = js.native
  var dayMaxEvents: js.UndefOr[Double] = js.native
  var dayResourceTableWidth: js.UndefOr[Double] = js.native
  var dayStartFrom: js.UndefOr[Double] = js.native
  var dayStopTo: js.UndefOr[Double] = js.native
  var defaultEventBgColor: js.UndefOr[String] = js.native
  var displayWeekend: js.UndefOr[Boolean] = js.native
  var endResizable: js.UndefOr[Boolean] = js.native
  var eventItemHeight: js.UndefOr[Double] = js.native
  var eventItemLineHeight: js.UndefOr[Double] = js.native
  var eventItemPopoverEnabled: js.UndefOr[Boolean] = js.native
  var headerEnabled: js.UndefOr[Boolean] = js.native
  var minuteStep: js.UndefOr[Double] = js.native
  var monthCellWidth: js.UndefOr[Double] = js.native
  var monthMaxEvents: js.UndefOr[Double] = js.native
  var monthResourceTableWidth: js.UndefOr[Double] = js.native
  var movable: js.UndefOr[Boolean] = js.native
  var nonAgendaSlotMinHeight: js.UndefOr[Double] = js.native
  var nonWorkingTimeBodyBgColor: js.UndefOr[String] = js.native
  var nonWorkingTimeHeadBgColor: js.UndefOr[String] = js.native
  var nonWorkingTimeHeadColor: js.UndefOr[String] = js.native
  var quarterCellWidth: js.UndefOr[Double] = js.native
  var quarterMaxEvents: js.UndefOr[Double] = js.native
  var quarterResourceTableWidth: js.UndefOr[Double] = js.native
  var recurringEventsEnabled: js.UndefOr[Boolean] = js.native
  var relativeMove: js.UndefOr[Boolean] = js.native
  var resourceName: js.UndefOr[String] = js.native
  var schedulerMaxHeight: js.UndefOr[Double] = js.native
  var schedulerWidth: js.UndefOr[Double | String] = js.native
  var scrollToSpecialMomentEnabled: js.UndefOr[Boolean] = js.native
  var selectedAreaColor: js.UndefOr[String] = js.native
  var startResizable: js.UndefOr[Boolean] = js.native
  var summaryColor: js.UndefOr[String] = js.native
  var summaryPos: js.UndefOr[SummaryPos] = js.native
  var tableHeaderHeight: js.UndefOr[Double] = js.native
  var views: js.UndefOr[js.Array[View]] = js.native
  var weekCellWidth: js.UndefOr[Double] = js.native
  var weekMaxEvents: js.UndefOr[Double] = js.native
  var weekResourceTableWidth: js.UndefOr[Double] = js.native
  var yearCellWidth: js.UndefOr[Double] = js.native
  var yearMaxEvents: js.UndefOr[Double] = js.native
  var yearResourceTableWidth: js.UndefOr[Double] = js.native
}

object SchedulerDataConfig {
  @scala.inline
  def apply(): SchedulerDataConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchedulerDataConfig]
  }
  @scala.inline
  implicit class SchedulerDataConfigOps[Self <: SchedulerDataConfig] (val x: Self) extends AnyVal {
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
    def setAgendaMaxEventWidth(value: Double): Self = this.set("agendaMaxEventWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAgendaMaxEventWidth: Self = this.set("agendaMaxEventWidth", js.undefined)
    @scala.inline
    def setAgendaResourceTableWidth(value: Double): Self = this.set("agendaResourceTableWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAgendaResourceTableWidth: Self = this.set("agendaResourceTableWidth", js.undefined)
    @scala.inline
    def setCalendarPopoverEnabled(value: Boolean): Self = this.set("calendarPopoverEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalendarPopoverEnabled: Self = this.set("calendarPopoverEnabled", js.undefined)
    @scala.inline
    def setCheckConflict(value: Boolean): Self = this.set("checkConflict", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckConflict: Self = this.set("checkConflict", js.undefined)
    @scala.inline
    def setCreatable(value: Boolean): Self = this.set("creatable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatable: Self = this.set("creatable", js.undefined)
    @scala.inline
    def setCrossResourceMove(value: Boolean): Self = this.set("crossResourceMove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrossResourceMove: Self = this.set("crossResourceMove", js.undefined)
    @scala.inline
    def setDayCellWidth(value: Double): Self = this.set("dayCellWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDayCellWidth: Self = this.set("dayCellWidth", js.undefined)
    @scala.inline
    def setDayMaxEvents(value: Double): Self = this.set("dayMaxEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDayMaxEvents: Self = this.set("dayMaxEvents", js.undefined)
    @scala.inline
    def setDayResourceTableWidth(value: Double): Self = this.set("dayResourceTableWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDayResourceTableWidth: Self = this.set("dayResourceTableWidth", js.undefined)
    @scala.inline
    def setDayStartFrom(value: Double): Self = this.set("dayStartFrom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDayStartFrom: Self = this.set("dayStartFrom", js.undefined)
    @scala.inline
    def setDayStopTo(value: Double): Self = this.set("dayStopTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDayStopTo: Self = this.set("dayStopTo", js.undefined)
    @scala.inline
    def setDefaultEventBgColor(value: String): Self = this.set("defaultEventBgColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultEventBgColor: Self = this.set("defaultEventBgColor", js.undefined)
    @scala.inline
    def setDisplayWeekend(value: Boolean): Self = this.set("displayWeekend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayWeekend: Self = this.set("displayWeekend", js.undefined)
    @scala.inline
    def setEndResizable(value: Boolean): Self = this.set("endResizable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndResizable: Self = this.set("endResizable", js.undefined)
    @scala.inline
    def setEventItemHeight(value: Double): Self = this.set("eventItemHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventItemHeight: Self = this.set("eventItemHeight", js.undefined)
    @scala.inline
    def setEventItemLineHeight(value: Double): Self = this.set("eventItemLineHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventItemLineHeight: Self = this.set("eventItemLineHeight", js.undefined)
    @scala.inline
    def setEventItemPopoverEnabled(value: Boolean): Self = this.set("eventItemPopoverEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventItemPopoverEnabled: Self = this.set("eventItemPopoverEnabled", js.undefined)
    @scala.inline
    def setHeaderEnabled(value: Boolean): Self = this.set("headerEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderEnabled: Self = this.set("headerEnabled", js.undefined)
    @scala.inline
    def setMinuteStep(value: Double): Self = this.set("minuteStep", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinuteStep: Self = this.set("minuteStep", js.undefined)
    @scala.inline
    def setMonthCellWidth(value: Double): Self = this.set("monthCellWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonthCellWidth: Self = this.set("monthCellWidth", js.undefined)
    @scala.inline
    def setMonthMaxEvents(value: Double): Self = this.set("monthMaxEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonthMaxEvents: Self = this.set("monthMaxEvents", js.undefined)
    @scala.inline
    def setMonthResourceTableWidth(value: Double): Self = this.set("monthResourceTableWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonthResourceTableWidth: Self = this.set("monthResourceTableWidth", js.undefined)
    @scala.inline
    def setMovable(value: Boolean): Self = this.set("movable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMovable: Self = this.set("movable", js.undefined)
    @scala.inline
    def setNonAgendaSlotMinHeight(value: Double): Self = this.set("nonAgendaSlotMinHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNonAgendaSlotMinHeight: Self = this.set("nonAgendaSlotMinHeight", js.undefined)
    @scala.inline
    def setNonWorkingTimeBodyBgColor(value: String): Self = this.set("nonWorkingTimeBodyBgColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNonWorkingTimeBodyBgColor: Self = this.set("nonWorkingTimeBodyBgColor", js.undefined)
    @scala.inline
    def setNonWorkingTimeHeadBgColor(value: String): Self = this.set("nonWorkingTimeHeadBgColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNonWorkingTimeHeadBgColor: Self = this.set("nonWorkingTimeHeadBgColor", js.undefined)
    @scala.inline
    def setNonWorkingTimeHeadColor(value: String): Self = this.set("nonWorkingTimeHeadColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNonWorkingTimeHeadColor: Self = this.set("nonWorkingTimeHeadColor", js.undefined)
    @scala.inline
    def setQuarterCellWidth(value: Double): Self = this.set("quarterCellWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuarterCellWidth: Self = this.set("quarterCellWidth", js.undefined)
    @scala.inline
    def setQuarterMaxEvents(value: Double): Self = this.set("quarterMaxEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuarterMaxEvents: Self = this.set("quarterMaxEvents", js.undefined)
    @scala.inline
    def setQuarterResourceTableWidth(value: Double): Self = this.set("quarterResourceTableWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuarterResourceTableWidth: Self = this.set("quarterResourceTableWidth", js.undefined)
    @scala.inline
    def setRecurringEventsEnabled(value: Boolean): Self = this.set("recurringEventsEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecurringEventsEnabled: Self = this.set("recurringEventsEnabled", js.undefined)
    @scala.inline
    def setRelativeMove(value: Boolean): Self = this.set("relativeMove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelativeMove: Self = this.set("relativeMove", js.undefined)
    @scala.inline
    def setResourceName(value: String): Self = this.set("resourceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceName: Self = this.set("resourceName", js.undefined)
    @scala.inline
    def setSchedulerMaxHeight(value: Double): Self = this.set("schedulerMaxHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchedulerMaxHeight: Self = this.set("schedulerMaxHeight", js.undefined)
    @scala.inline
    def setSchedulerWidth(value: Double | String): Self = this.set("schedulerWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchedulerWidth: Self = this.set("schedulerWidth", js.undefined)
    @scala.inline
    def setScrollToSpecialMomentEnabled(value: Boolean): Self = this.set("scrollToSpecialMomentEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollToSpecialMomentEnabled: Self = this.set("scrollToSpecialMomentEnabled", js.undefined)
    @scala.inline
    def setSelectedAreaColor(value: String): Self = this.set("selectedAreaColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedAreaColor: Self = this.set("selectedAreaColor", js.undefined)
    @scala.inline
    def setStartResizable(value: Boolean): Self = this.set("startResizable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartResizable: Self = this.set("startResizable", js.undefined)
    @scala.inline
    def setSummaryColor(value: String): Self = this.set("summaryColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSummaryColor: Self = this.set("summaryColor", js.undefined)
    @scala.inline
    def setSummaryPos(value: SummaryPos): Self = this.set("summaryPos", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSummaryPos: Self = this.set("summaryPos", js.undefined)
    @scala.inline
    def setTableHeaderHeight(value: Double): Self = this.set("tableHeaderHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableHeaderHeight: Self = this.set("tableHeaderHeight", js.undefined)
    @scala.inline
    def setViewsVarargs(value: View*): Self = this.set("views", js.Array(value :_*))
    @scala.inline
    def setViews(value: js.Array[View]): Self = this.set("views", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViews: Self = this.set("views", js.undefined)
    @scala.inline
    def setWeekCellWidth(value: Double): Self = this.set("weekCellWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeekCellWidth: Self = this.set("weekCellWidth", js.undefined)
    @scala.inline
    def setWeekMaxEvents(value: Double): Self = this.set("weekMaxEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeekMaxEvents: Self = this.set("weekMaxEvents", js.undefined)
    @scala.inline
    def setWeekResourceTableWidth(value: Double): Self = this.set("weekResourceTableWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeekResourceTableWidth: Self = this.set("weekResourceTableWidth", js.undefined)
    @scala.inline
    def setYearCellWidth(value: Double): Self = this.set("yearCellWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYearCellWidth: Self = this.set("yearCellWidth", js.undefined)
    @scala.inline
    def setYearMaxEvents(value: Double): Self = this.set("yearMaxEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYearMaxEvents: Self = this.set("yearMaxEvents", js.undefined)
    @scala.inline
    def setYearResourceTableWidth(value: Double): Self = this.set("yearResourceTableWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYearResourceTableWidth: Self = this.set("yearResourceTableWidth", js.undefined)
  }
  
}

