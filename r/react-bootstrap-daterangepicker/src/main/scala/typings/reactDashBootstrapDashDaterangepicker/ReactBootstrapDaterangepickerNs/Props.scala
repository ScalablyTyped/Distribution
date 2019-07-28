package typings.reactDashBootstrapDashDaterangepicker.ReactBootstrapDaterangepickerNs

import org.scalablytyped.runtime.StringDictionary
import typings.daterangepicker.daterangepickerMod.DateOrString
import typings.daterangepicker.daterangepickerMod.Locale
import typings.daterangepicker.daterangepickerMod.Options
import typings.daterangepicker.daterangepickerStrings.center
import typings.daterangepicker.daterangepickerStrings.down
import typings.daterangepicker.daterangepickerStrings.left
import typings.daterangepicker.daterangepickerStrings.right
import typings.daterangepicker.daterangepickerStrings.up
import typings.moment.momentMod.Duration
import typings.moment.momentMod.MomentInput
import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends Options {
  var containerClass: js.UndefOr[String] = js.undefined
  var containerStyles: js.UndefOr[CSSProperties] = js.undefined
  var onApply: js.UndefOr[EventHandler] = js.undefined
  var onCancel: js.UndefOr[EventHandler] = js.undefined
  var onEvent: js.UndefOr[EventHandler] = js.undefined
  var onHide: js.UndefOr[EventHandler] = js.undefined
  var onHideCalendar: js.UndefOr[EventHandler] = js.undefined
  var onShow: js.UndefOr[EventHandler] = js.undefined
  var onShowCalendar: js.UndefOr[EventHandler] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    alwaysShowCalendars: js.UndefOr[Boolean] = js.undefined,
    applyButtonClasses: String = null,
    autoApply: js.UndefOr[Boolean] = js.undefined,
    autoUpdateInput: js.UndefOr[Boolean] = js.undefined,
    buttonClasses: js.Array[String] = null,
    cancelButtonClasses: String = null,
    containerClass: String = null,
    containerStyles: CSSProperties = null,
    drops: down | up = null,
    endDate: DateOrString = null,
    isCustomDate: /* date */ DateOrString => js.UndefOr[String | js.Array[String]] = null,
    isInvalidDate: (/* startDate */ DateOrString, /* endDate */ js.UndefOr[DateOrString]) => Boolean = null,
    linkedCalendars: js.UndefOr[Boolean] = js.undefined,
    locale: Locale = null,
    maxDate: DateOrString = null,
    maxSpan: MomentInput | Duration = null,
    maxYear: Int | Double = null,
    minDate: DateOrString = null,
    minYear: Int | Double = null,
    onApply: EventHandler = null,
    onCancel: EventHandler = null,
    onEvent: EventHandler = null,
    onHide: EventHandler = null,
    onHideCalendar: EventHandler = null,
    onShow: EventHandler = null,
    onShowCalendar: EventHandler = null,
    opens: left | right | center = null,
    parentEl: String = null,
    ranges: StringDictionary[js.Tuple2[DateOrString, DateOrString]] = null,
    showCustomRangeLabel: js.UndefOr[Boolean] = js.undefined,
    showDropdowns: js.UndefOr[Boolean] = js.undefined,
    showISOWeekNumbers: js.UndefOr[Boolean] = js.undefined,
    showWeekNumbers: js.UndefOr[Boolean] = js.undefined,
    singleDatePicker: js.UndefOr[Boolean] = js.undefined,
    startDate: DateOrString = null,
    timePicker: js.UndefOr[Boolean] = js.undefined,
    timePicker24Hour: js.UndefOr[Boolean] = js.undefined,
    timePickerIncrement: Int | Double = null,
    timePickerSeconds: js.UndefOr[Boolean] = js.undefined
  ): Props = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alwaysShowCalendars)) __obj.updateDynamic("alwaysShowCalendars")(alwaysShowCalendars)
    if (applyButtonClasses != null) __obj.updateDynamic("applyButtonClasses")(applyButtonClasses)
    if (!js.isUndefined(autoApply)) __obj.updateDynamic("autoApply")(autoApply)
    if (!js.isUndefined(autoUpdateInput)) __obj.updateDynamic("autoUpdateInput")(autoUpdateInput)
    if (buttonClasses != null) __obj.updateDynamic("buttonClasses")(buttonClasses)
    if (cancelButtonClasses != null) __obj.updateDynamic("cancelButtonClasses")(cancelButtonClasses)
    if (containerClass != null) __obj.updateDynamic("containerClass")(containerClass)
    if (containerStyles != null) __obj.updateDynamic("containerStyles")(containerStyles)
    if (drops != null) __obj.updateDynamic("drops")(drops.asInstanceOf[js.Any])
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (isCustomDate != null) __obj.updateDynamic("isCustomDate")(js.Any.fromFunction1(isCustomDate))
    if (isInvalidDate != null) __obj.updateDynamic("isInvalidDate")(js.Any.fromFunction2(isInvalidDate))
    if (!js.isUndefined(linkedCalendars)) __obj.updateDynamic("linkedCalendars")(linkedCalendars)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (maxSpan != null) __obj.updateDynamic("maxSpan")(maxSpan.asInstanceOf[js.Any])
    if (maxYear != null) __obj.updateDynamic("maxYear")(maxYear.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (minYear != null) __obj.updateDynamic("minYear")(minYear.asInstanceOf[js.Any])
    if (onApply != null) __obj.updateDynamic("onApply")(onApply)
    if (onCancel != null) __obj.updateDynamic("onCancel")(onCancel)
    if (onEvent != null) __obj.updateDynamic("onEvent")(onEvent)
    if (onHide != null) __obj.updateDynamic("onHide")(onHide)
    if (onHideCalendar != null) __obj.updateDynamic("onHideCalendar")(onHideCalendar)
    if (onShow != null) __obj.updateDynamic("onShow")(onShow)
    if (onShowCalendar != null) __obj.updateDynamic("onShowCalendar")(onShowCalendar)
    if (opens != null) __obj.updateDynamic("opens")(opens.asInstanceOf[js.Any])
    if (parentEl != null) __obj.updateDynamic("parentEl")(parentEl)
    if (ranges != null) __obj.updateDynamic("ranges")(ranges)
    if (!js.isUndefined(showCustomRangeLabel)) __obj.updateDynamic("showCustomRangeLabel")(showCustomRangeLabel)
    if (!js.isUndefined(showDropdowns)) __obj.updateDynamic("showDropdowns")(showDropdowns)
    if (!js.isUndefined(showISOWeekNumbers)) __obj.updateDynamic("showISOWeekNumbers")(showISOWeekNumbers)
    if (!js.isUndefined(showWeekNumbers)) __obj.updateDynamic("showWeekNumbers")(showWeekNumbers)
    if (!js.isUndefined(singleDatePicker)) __obj.updateDynamic("singleDatePicker")(singleDatePicker)
    if (startDate != null) __obj.updateDynamic("startDate")(startDate.asInstanceOf[js.Any])
    if (!js.isUndefined(timePicker)) __obj.updateDynamic("timePicker")(timePicker)
    if (!js.isUndefined(timePicker24Hour)) __obj.updateDynamic("timePicker24Hour")(timePicker24Hour)
    if (timePickerIncrement != null) __obj.updateDynamic("timePickerIncrement")(timePickerIncrement.asInstanceOf[js.Any])
    if (!js.isUndefined(timePickerSeconds)) __obj.updateDynamic("timePickerSeconds")(timePickerSeconds)
    __obj.asInstanceOf[Props]
  }
}

