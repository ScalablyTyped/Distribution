package typings.reactDashBigDashScheduler.reactDashBigDashSchedulerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerDataConfig extends js.Object {
  var agendaMaxEventWidth: js.UndefOr[Double] = js.undefined
  var agendaResourceTableWidth: js.UndefOr[Double] = js.undefined
  var calendarPopoverEnabled: js.UndefOr[Boolean] = js.undefined
  var checkConflict: js.UndefOr[Boolean] = js.undefined
  var creatable: js.UndefOr[Boolean] = js.undefined
  var crossResourceMove: js.UndefOr[Boolean] = js.undefined
  var dayCellWidth: js.UndefOr[Double] = js.undefined
  var dayMaxEvents: js.UndefOr[Double] = js.undefined
  var dayResourceTableWidth: js.UndefOr[Double] = js.undefined
  var dayStartFrom: js.UndefOr[Double] = js.undefined
  var dayStopTo: js.UndefOr[Double] = js.undefined
  var defaultEventBgColor: js.UndefOr[String] = js.undefined
  var displayWeekend: js.UndefOr[Boolean] = js.undefined
  var endResizable: js.UndefOr[Boolean] = js.undefined
  var eventItemHeight: js.UndefOr[Double] = js.undefined
  var eventItemLineHeight: js.UndefOr[Double] = js.undefined
  var eventItemPopoverEnabled: js.UndefOr[Boolean] = js.undefined
  var headerEnabled: js.UndefOr[Boolean] = js.undefined
  var minuteStep: js.UndefOr[Double] = js.undefined
  var monthCellWidth: js.UndefOr[Double] = js.undefined
  var monthMaxEvents: js.UndefOr[Double] = js.undefined
  var monthResourceTableWidth: js.UndefOr[Double] = js.undefined
  var movable: js.UndefOr[Boolean] = js.undefined
  var nonAgendaSlotMinHeight: js.UndefOr[Double] = js.undefined
  var nonWorkingTimeBodyBgColor: js.UndefOr[String] = js.undefined
  var nonWorkingTimeHeadBgColor: js.UndefOr[String] = js.undefined
  var nonWorkingTimeHeadColor: js.UndefOr[String] = js.undefined
  var quarterCellWidth: js.UndefOr[Double] = js.undefined
  var quarterMaxEvents: js.UndefOr[Double] = js.undefined
  var quarterResourceTableWidth: js.UndefOr[Double] = js.undefined
  var recurringEventsEnabled: js.UndefOr[Boolean] = js.undefined
  var relativeMove: js.UndefOr[Boolean] = js.undefined
  var resourceName: js.UndefOr[String] = js.undefined
  var schedulerMaxHeight: js.UndefOr[Double] = js.undefined
  var schedulerWidth: js.UndefOr[Double | String] = js.undefined
  var scrollToSpecialMomentEnabled: js.UndefOr[Boolean] = js.undefined
  var selectedAreaColor: js.UndefOr[String] = js.undefined
  var startResizable: js.UndefOr[Boolean] = js.undefined
  var summaryColor: js.UndefOr[String] = js.undefined
  var summaryPos: js.UndefOr[SummaryPos] = js.undefined
  var tableHeaderHeight: js.UndefOr[Double] = js.undefined
  var views: js.UndefOr[js.Array[View]] = js.undefined
  var weekCellWidth: js.UndefOr[Double] = js.undefined
  var weekMaxEvents: js.UndefOr[Double] = js.undefined
  var weekResourceTableWidth: js.UndefOr[Double] = js.undefined
  var yearCellWidth: js.UndefOr[Double] = js.undefined
  var yearMaxEvents: js.UndefOr[Double] = js.undefined
  var yearResourceTableWidth: js.UndefOr[Double] = js.undefined
}

object SchedulerDataConfig {
  @scala.inline
  def apply(
    agendaMaxEventWidth: Int | Double = null,
    agendaResourceTableWidth: Int | Double = null,
    calendarPopoverEnabled: js.UndefOr[Boolean] = js.undefined,
    checkConflict: js.UndefOr[Boolean] = js.undefined,
    creatable: js.UndefOr[Boolean] = js.undefined,
    crossResourceMove: js.UndefOr[Boolean] = js.undefined,
    dayCellWidth: Int | Double = null,
    dayMaxEvents: Int | Double = null,
    dayResourceTableWidth: Int | Double = null,
    dayStartFrom: Int | Double = null,
    dayStopTo: Int | Double = null,
    defaultEventBgColor: String = null,
    displayWeekend: js.UndefOr[Boolean] = js.undefined,
    endResizable: js.UndefOr[Boolean] = js.undefined,
    eventItemHeight: Int | Double = null,
    eventItemLineHeight: Int | Double = null,
    eventItemPopoverEnabled: js.UndefOr[Boolean] = js.undefined,
    headerEnabled: js.UndefOr[Boolean] = js.undefined,
    minuteStep: Int | Double = null,
    monthCellWidth: Int | Double = null,
    monthMaxEvents: Int | Double = null,
    monthResourceTableWidth: Int | Double = null,
    movable: js.UndefOr[Boolean] = js.undefined,
    nonAgendaSlotMinHeight: Int | Double = null,
    nonWorkingTimeBodyBgColor: String = null,
    nonWorkingTimeHeadBgColor: String = null,
    nonWorkingTimeHeadColor: String = null,
    quarterCellWidth: Int | Double = null,
    quarterMaxEvents: Int | Double = null,
    quarterResourceTableWidth: Int | Double = null,
    recurringEventsEnabled: js.UndefOr[Boolean] = js.undefined,
    relativeMove: js.UndefOr[Boolean] = js.undefined,
    resourceName: String = null,
    schedulerMaxHeight: Int | Double = null,
    schedulerWidth: Double | String = null,
    scrollToSpecialMomentEnabled: js.UndefOr[Boolean] = js.undefined,
    selectedAreaColor: String = null,
    startResizable: js.UndefOr[Boolean] = js.undefined,
    summaryColor: String = null,
    summaryPos: SummaryPos = null,
    tableHeaderHeight: Int | Double = null,
    views: js.Array[View] = null,
    weekCellWidth: Int | Double = null,
    weekMaxEvents: Int | Double = null,
    weekResourceTableWidth: Int | Double = null,
    yearCellWidth: Int | Double = null,
    yearMaxEvents: Int | Double = null,
    yearResourceTableWidth: Int | Double = null
  ): SchedulerDataConfig = {
    val __obj = js.Dynamic.literal()
    if (agendaMaxEventWidth != null) __obj.updateDynamic("agendaMaxEventWidth")(agendaMaxEventWidth.asInstanceOf[js.Any])
    if (agendaResourceTableWidth != null) __obj.updateDynamic("agendaResourceTableWidth")(agendaResourceTableWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(calendarPopoverEnabled)) __obj.updateDynamic("calendarPopoverEnabled")(calendarPopoverEnabled)
    if (!js.isUndefined(checkConflict)) __obj.updateDynamic("checkConflict")(checkConflict)
    if (!js.isUndefined(creatable)) __obj.updateDynamic("creatable")(creatable)
    if (!js.isUndefined(crossResourceMove)) __obj.updateDynamic("crossResourceMove")(crossResourceMove)
    if (dayCellWidth != null) __obj.updateDynamic("dayCellWidth")(dayCellWidth.asInstanceOf[js.Any])
    if (dayMaxEvents != null) __obj.updateDynamic("dayMaxEvents")(dayMaxEvents.asInstanceOf[js.Any])
    if (dayResourceTableWidth != null) __obj.updateDynamic("dayResourceTableWidth")(dayResourceTableWidth.asInstanceOf[js.Any])
    if (dayStartFrom != null) __obj.updateDynamic("dayStartFrom")(dayStartFrom.asInstanceOf[js.Any])
    if (dayStopTo != null) __obj.updateDynamic("dayStopTo")(dayStopTo.asInstanceOf[js.Any])
    if (defaultEventBgColor != null) __obj.updateDynamic("defaultEventBgColor")(defaultEventBgColor)
    if (!js.isUndefined(displayWeekend)) __obj.updateDynamic("displayWeekend")(displayWeekend)
    if (!js.isUndefined(endResizable)) __obj.updateDynamic("endResizable")(endResizable)
    if (eventItemHeight != null) __obj.updateDynamic("eventItemHeight")(eventItemHeight.asInstanceOf[js.Any])
    if (eventItemLineHeight != null) __obj.updateDynamic("eventItemLineHeight")(eventItemLineHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(eventItemPopoverEnabled)) __obj.updateDynamic("eventItemPopoverEnabled")(eventItemPopoverEnabled)
    if (!js.isUndefined(headerEnabled)) __obj.updateDynamic("headerEnabled")(headerEnabled)
    if (minuteStep != null) __obj.updateDynamic("minuteStep")(minuteStep.asInstanceOf[js.Any])
    if (monthCellWidth != null) __obj.updateDynamic("monthCellWidth")(monthCellWidth.asInstanceOf[js.Any])
    if (monthMaxEvents != null) __obj.updateDynamic("monthMaxEvents")(monthMaxEvents.asInstanceOf[js.Any])
    if (monthResourceTableWidth != null) __obj.updateDynamic("monthResourceTableWidth")(monthResourceTableWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(movable)) __obj.updateDynamic("movable")(movable)
    if (nonAgendaSlotMinHeight != null) __obj.updateDynamic("nonAgendaSlotMinHeight")(nonAgendaSlotMinHeight.asInstanceOf[js.Any])
    if (nonWorkingTimeBodyBgColor != null) __obj.updateDynamic("nonWorkingTimeBodyBgColor")(nonWorkingTimeBodyBgColor)
    if (nonWorkingTimeHeadBgColor != null) __obj.updateDynamic("nonWorkingTimeHeadBgColor")(nonWorkingTimeHeadBgColor)
    if (nonWorkingTimeHeadColor != null) __obj.updateDynamic("nonWorkingTimeHeadColor")(nonWorkingTimeHeadColor)
    if (quarterCellWidth != null) __obj.updateDynamic("quarterCellWidth")(quarterCellWidth.asInstanceOf[js.Any])
    if (quarterMaxEvents != null) __obj.updateDynamic("quarterMaxEvents")(quarterMaxEvents.asInstanceOf[js.Any])
    if (quarterResourceTableWidth != null) __obj.updateDynamic("quarterResourceTableWidth")(quarterResourceTableWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(recurringEventsEnabled)) __obj.updateDynamic("recurringEventsEnabled")(recurringEventsEnabled)
    if (!js.isUndefined(relativeMove)) __obj.updateDynamic("relativeMove")(relativeMove)
    if (resourceName != null) __obj.updateDynamic("resourceName")(resourceName)
    if (schedulerMaxHeight != null) __obj.updateDynamic("schedulerMaxHeight")(schedulerMaxHeight.asInstanceOf[js.Any])
    if (schedulerWidth != null) __obj.updateDynamic("schedulerWidth")(schedulerWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollToSpecialMomentEnabled)) __obj.updateDynamic("scrollToSpecialMomentEnabled")(scrollToSpecialMomentEnabled)
    if (selectedAreaColor != null) __obj.updateDynamic("selectedAreaColor")(selectedAreaColor)
    if (!js.isUndefined(startResizable)) __obj.updateDynamic("startResizable")(startResizable)
    if (summaryColor != null) __obj.updateDynamic("summaryColor")(summaryColor)
    if (summaryPos != null) __obj.updateDynamic("summaryPos")(summaryPos)
    if (tableHeaderHeight != null) __obj.updateDynamic("tableHeaderHeight")(tableHeaderHeight.asInstanceOf[js.Any])
    if (views != null) __obj.updateDynamic("views")(views)
    if (weekCellWidth != null) __obj.updateDynamic("weekCellWidth")(weekCellWidth.asInstanceOf[js.Any])
    if (weekMaxEvents != null) __obj.updateDynamic("weekMaxEvents")(weekMaxEvents.asInstanceOf[js.Any])
    if (weekResourceTableWidth != null) __obj.updateDynamic("weekResourceTableWidth")(weekResourceTableWidth.asInstanceOf[js.Any])
    if (yearCellWidth != null) __obj.updateDynamic("yearCellWidth")(yearCellWidth.asInstanceOf[js.Any])
    if (yearMaxEvents != null) __obj.updateDynamic("yearMaxEvents")(yearMaxEvents.asInstanceOf[js.Any])
    if (yearResourceTableWidth != null) __obj.updateDynamic("yearResourceTableWidth")(yearResourceTableWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchedulerDataConfig]
  }
}

