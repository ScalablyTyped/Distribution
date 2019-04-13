package typings
package reactDashBootstrapDashDaterangepickerLib.ReactBootstrapDaterangepickerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props
  extends daterangepickerLib.daterangepickerMod.Options {
  var containerClass: js.UndefOr[java.lang.String] = js.undefined
  var containerStyles: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
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
    alwaysShowCalendars: js.UndefOr[scala.Boolean] = js.undefined,
    applyButtonClasses: java.lang.String = null,
    autoApply: js.UndefOr[scala.Boolean] = js.undefined,
    autoUpdateInput: js.UndefOr[scala.Boolean] = js.undefined,
    buttonClasses: js.Array[java.lang.String] = null,
    cancelButtonClasses: java.lang.String = null,
    containerClass: java.lang.String = null,
    containerStyles: reactLib.reactMod.CSSProperties = null,
    drops: daterangepickerLib.daterangepickerLibStrings.down | daterangepickerLib.daterangepickerLibStrings.up = null,
    endDate: daterangepickerLib.daterangepickerMod.DateOrString = null,
    isCustomDate: /* date */ daterangepickerLib.daterangepickerMod.DateOrString => js.UndefOr[java.lang.String | js.Array[java.lang.String]] = null,
    isInvalidDate: (/* startDate */ daterangepickerLib.daterangepickerMod.DateOrString, /* endDate */ js.UndefOr[daterangepickerLib.daterangepickerMod.DateOrString]) => scala.Boolean = null,
    linkedCalendars: js.UndefOr[scala.Boolean] = js.undefined,
    locale: daterangepickerLib.daterangepickerMod.Locale = null,
    maxDate: daterangepickerLib.daterangepickerMod.DateOrString = null,
    maxSpan: momentLib.momentMod.MomentInput | momentLib.momentMod.Duration = null,
    maxYear: scala.Int | scala.Double = null,
    minDate: daterangepickerLib.daterangepickerMod.DateOrString = null,
    minYear: scala.Int | scala.Double = null,
    onApply: EventHandler = null,
    onCancel: EventHandler = null,
    onEvent: EventHandler = null,
    onHide: EventHandler = null,
    onHideCalendar: EventHandler = null,
    onShow: EventHandler = null,
    onShowCalendar: EventHandler = null,
    opens: daterangepickerLib.daterangepickerLibStrings.left | daterangepickerLib.daterangepickerLibStrings.right | daterangepickerLib.daterangepickerLibStrings.center = null,
    parentEl: java.lang.String = null,
    ranges: org.scalablytyped.runtime.StringDictionary[
      js.Tuple2[
        daterangepickerLib.daterangepickerMod.DateOrString, 
        daterangepickerLib.daterangepickerMod.DateOrString
      ]
    ] = null,
    showCustomRangeLabel: js.UndefOr[scala.Boolean] = js.undefined,
    showDropdowns: js.UndefOr[scala.Boolean] = js.undefined,
    showISOWeekNumbers: js.UndefOr[scala.Boolean] = js.undefined,
    showWeekNumbers: js.UndefOr[scala.Boolean] = js.undefined,
    singleDatePicker: js.UndefOr[scala.Boolean] = js.undefined,
    startDate: daterangepickerLib.daterangepickerMod.DateOrString = null,
    timePicker: js.UndefOr[scala.Boolean] = js.undefined,
    timePicker24Hour: js.UndefOr[scala.Boolean] = js.undefined,
    timePickerIncrement: scala.Int | scala.Double = null,
    timePickerSeconds: js.UndefOr[scala.Boolean] = js.undefined
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

