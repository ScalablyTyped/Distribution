package typings.reactBootstrapDaterangepicker.ReactBootstrapDaterangepicker

import org.scalablytyped.runtime.StringDictionary
import typings.daterangepicker.daterangepickerStrings.center
import typings.daterangepicker.daterangepickerStrings.down
import typings.daterangepicker.daterangepickerStrings.left
import typings.daterangepicker.daterangepickerStrings.right
import typings.daterangepicker.daterangepickerStrings.up
import typings.daterangepicker.mod.DateOrString
import typings.daterangepicker.mod.Locale
import typings.daterangepicker.mod.Options
import typings.moment.mod.Duration_
import typings.moment.mod.MomentInput
import typings.react.mod.CSSProperties
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
    maxSpan: MomentInput | Duration_ = null,
    maxYear: js.UndefOr[Double] = js.undefined,
    minDate: DateOrString = null,
    minYear: js.UndefOr[Double] = js.undefined,
    onApply: (/* event */ js.UndefOr[js.Any], /* picker */ js.UndefOr[js.Any]) => js.Any = null,
    onCancel: (/* event */ js.UndefOr[js.Any], /* picker */ js.UndefOr[js.Any]) => js.Any = null,
    onEvent: (/* event */ js.UndefOr[js.Any], /* picker */ js.UndefOr[js.Any]) => js.Any = null,
    onHide: (/* event */ js.UndefOr[js.Any], /* picker */ js.UndefOr[js.Any]) => js.Any = null,
    onHideCalendar: (/* event */ js.UndefOr[js.Any], /* picker */ js.UndefOr[js.Any]) => js.Any = null,
    onShow: (/* event */ js.UndefOr[js.Any], /* picker */ js.UndefOr[js.Any]) => js.Any = null,
    onShowCalendar: (/* event */ js.UndefOr[js.Any], /* picker */ js.UndefOr[js.Any]) => js.Any = null,
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
    timePickerIncrement: js.UndefOr[Double] = js.undefined,
    timePickerSeconds: js.UndefOr[Boolean] = js.undefined
  ): Props = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alwaysShowCalendars)) __obj.updateDynamic("alwaysShowCalendars")(alwaysShowCalendars.get.asInstanceOf[js.Any])
    if (applyButtonClasses != null) __obj.updateDynamic("applyButtonClasses")(applyButtonClasses.asInstanceOf[js.Any])
    if (!js.isUndefined(autoApply)) __obj.updateDynamic("autoApply")(autoApply.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoUpdateInput)) __obj.updateDynamic("autoUpdateInput")(autoUpdateInput.get.asInstanceOf[js.Any])
    if (buttonClasses != null) __obj.updateDynamic("buttonClasses")(buttonClasses.asInstanceOf[js.Any])
    if (cancelButtonClasses != null) __obj.updateDynamic("cancelButtonClasses")(cancelButtonClasses.asInstanceOf[js.Any])
    if (containerClass != null) __obj.updateDynamic("containerClass")(containerClass.asInstanceOf[js.Any])
    if (containerStyles != null) __obj.updateDynamic("containerStyles")(containerStyles.asInstanceOf[js.Any])
    if (drops != null) __obj.updateDynamic("drops")(drops.asInstanceOf[js.Any])
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (isCustomDate != null) __obj.updateDynamic("isCustomDate")(js.Any.fromFunction1(isCustomDate))
    if (isInvalidDate != null) __obj.updateDynamic("isInvalidDate")(js.Any.fromFunction2(isInvalidDate))
    if (!js.isUndefined(linkedCalendars)) __obj.updateDynamic("linkedCalendars")(linkedCalendars.get.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (maxSpan != null) __obj.updateDynamic("maxSpan")(maxSpan.asInstanceOf[js.Any])
    if (!js.isUndefined(maxYear)) __obj.updateDynamic("maxYear")(maxYear.get.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (!js.isUndefined(minYear)) __obj.updateDynamic("minYear")(minYear.get.asInstanceOf[js.Any])
    if (onApply != null) __obj.updateDynamic("onApply")(js.Any.fromFunction2(onApply))
    if (onCancel != null) __obj.updateDynamic("onCancel")(js.Any.fromFunction2(onCancel))
    if (onEvent != null) __obj.updateDynamic("onEvent")(js.Any.fromFunction2(onEvent))
    if (onHide != null) __obj.updateDynamic("onHide")(js.Any.fromFunction2(onHide))
    if (onHideCalendar != null) __obj.updateDynamic("onHideCalendar")(js.Any.fromFunction2(onHideCalendar))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction2(onShow))
    if (onShowCalendar != null) __obj.updateDynamic("onShowCalendar")(js.Any.fromFunction2(onShowCalendar))
    if (opens != null) __obj.updateDynamic("opens")(opens.asInstanceOf[js.Any])
    if (parentEl != null) __obj.updateDynamic("parentEl")(parentEl.asInstanceOf[js.Any])
    if (ranges != null) __obj.updateDynamic("ranges")(ranges.asInstanceOf[js.Any])
    if (!js.isUndefined(showCustomRangeLabel)) __obj.updateDynamic("showCustomRangeLabel")(showCustomRangeLabel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showDropdowns)) __obj.updateDynamic("showDropdowns")(showDropdowns.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showISOWeekNumbers)) __obj.updateDynamic("showISOWeekNumbers")(showISOWeekNumbers.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showWeekNumbers)) __obj.updateDynamic("showWeekNumbers")(showWeekNumbers.get.asInstanceOf[js.Any])
    if (!js.isUndefined(singleDatePicker)) __obj.updateDynamic("singleDatePicker")(singleDatePicker.get.asInstanceOf[js.Any])
    if (startDate != null) __obj.updateDynamic("startDate")(startDate.asInstanceOf[js.Any])
    if (!js.isUndefined(timePicker)) __obj.updateDynamic("timePicker")(timePicker.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timePicker24Hour)) __obj.updateDynamic("timePicker24Hour")(timePicker24Hour.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timePickerIncrement)) __obj.updateDynamic("timePickerIncrement")(timePickerIncrement.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timePickerSeconds)) __obj.updateDynamic("timePickerSeconds")(timePickerSeconds.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

