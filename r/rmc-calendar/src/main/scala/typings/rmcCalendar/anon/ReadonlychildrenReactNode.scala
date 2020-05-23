package typings.rmcCalendar.anon

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.rmcCalendar.calendarPropsMod.SelectDateType
import typings.rmcCalendar.dataTypesMod.Models.ExtraData
import typings.rmcCalendar.dataTypesMod.Models.Locale
import typings.rmcCalendar.headerMod.PropsType
import typings.rmcCalendar.rmcCalendarStrings.horizontal
import typings.rmcCalendar.rmcCalendarStrings.normal
import typings.rmcCalendar.rmcCalendarStrings.one
import typings.rmcCalendar.rmcCalendarStrings.range
import typings.rmcCalendar.rmcCalendarStrings.vertical
import typings.rmcCalendar.rmcCalendarStrings.xl
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<{  children ? :react.react.ReactNode}> & std.Readonly<rmc-calendar.rmc-calendar/lib/CalendarProps.default> */
trait ReadonlychildrenReactNode extends js.Object {
  val children: js.UndefOr[ReactNode] = js.undefined
  val defaultDate: js.UndefOr[Date] = js.undefined
  val defaultTimeValue: js.UndefOr[Date] = js.undefined
  val defaultValue: js.UndefOr[SelectDateType] = js.undefined
  val enterDirection: js.UndefOr[horizontal | vertical] = js.undefined
  val getDateExtra: js.UndefOr[js.Function1[/* date */ Date, ExtraData]] = js.undefined
  val infiniteOpt: js.UndefOr[Boolean] = js.undefined
  val initalMonths: js.UndefOr[Double] = js.undefined
  val locale: js.UndefOr[Locale] = js.undefined
  val maxDate: js.UndefOr[Date] = js.undefined
  val minDate: js.UndefOr[Date] = js.undefined
  val onCancel: js.UndefOr[js.Function0[Unit]] = js.undefined
  val onClear: js.UndefOr[js.Function0[Unit]] = js.undefined
  val onConfirm: js.UndefOr[
    js.Function2[/* startDateTime */ js.UndefOr[Date], /* endDateTime */ js.UndefOr[Date], Unit]
  ] = js.undefined
  val onSelect: js.UndefOr[
    js.Function2[
      /* date */ Date, 
      /* state */ js.UndefOr[js.Tuple2[js.UndefOr[Date], js.UndefOr[Date]]], 
      SelectDateType | Unit
    ]
  ] = js.undefined
  val onSelectHasDisableDate: js.UndefOr[js.Function1[/* date */ js.Array[Date], Unit]] = js.undefined
  val pickTime: js.UndefOr[Boolean] = js.undefined
  val prefixCls: js.UndefOr[String] = js.undefined
  val renderHeader: js.UndefOr[js.Function1[/* prop */ PropsType, ReactNode]] = js.undefined
  val renderShortcut: js.UndefOr[
    js.Function1[
      /* select */ js.Function2[/* startDate */ js.UndefOr[Date], /* endDate */ js.UndefOr[Date], Unit], 
      ReactNode
    ]
  ] = js.undefined
  val rowSize: js.UndefOr[normal | xl] = js.undefined
  val showShortcut: js.UndefOr[Boolean] = js.undefined
  val style: js.UndefOr[CSSProperties] = js.undefined
  val timePickerPickerPrefixCls: js.UndefOr[String] = js.undefined
  val timePickerPrefixCls: js.UndefOr[String] = js.undefined
  val title: js.UndefOr[String] = js.undefined
  val `type`: js.UndefOr[one | range] = js.undefined
  val visible: js.UndefOr[Boolean] = js.undefined
}

object ReadonlychildrenReactNode {
  @scala.inline
  def apply(
    children: ReactNode = null,
    defaultDate: Date = null,
    defaultTimeValue: Date = null,
    defaultValue: SelectDateType = null,
    enterDirection: horizontal | vertical = null,
    getDateExtra: /* date */ Date => ExtraData = null,
    infiniteOpt: js.UndefOr[Boolean] = js.undefined,
    initalMonths: js.UndefOr[Double] = js.undefined,
    locale: Locale = null,
    maxDate: Date = null,
    minDate: Date = null,
    onCancel: () => Unit = null,
    onClear: () => Unit = null,
    onConfirm: (/* startDateTime */ js.UndefOr[Date], /* endDateTime */ js.UndefOr[Date]) => Unit = null,
    onSelect: (/* date */ Date, /* state */ js.UndefOr[js.Tuple2[js.UndefOr[Date], js.UndefOr[Date]]]) => SelectDateType | Unit = null,
    onSelectHasDisableDate: /* date */ js.Array[Date] => Unit = null,
    pickTime: js.UndefOr[Boolean] = js.undefined,
    prefixCls: String = null,
    renderHeader: /* prop */ PropsType => ReactNode = null,
    renderShortcut: /* select */ js.Function2[/* startDate */ js.UndefOr[Date], /* endDate */ js.UndefOr[Date], Unit] => ReactNode = null,
    rowSize: normal | xl = null,
    showShortcut: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    timePickerPickerPrefixCls: String = null,
    timePickerPrefixCls: String = null,
    title: String = null,
    `type`: one | range = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): ReadonlychildrenReactNode = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (defaultDate != null) __obj.updateDynamic("defaultDate")(defaultDate.asInstanceOf[js.Any])
    if (defaultTimeValue != null) __obj.updateDynamic("defaultTimeValue")(defaultTimeValue.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (enterDirection != null) __obj.updateDynamic("enterDirection")(enterDirection.asInstanceOf[js.Any])
    if (getDateExtra != null) __obj.updateDynamic("getDateExtra")(js.Any.fromFunction1(getDateExtra))
    if (!js.isUndefined(infiniteOpt)) __obj.updateDynamic("infiniteOpt")(infiniteOpt.get.asInstanceOf[js.Any])
    if (!js.isUndefined(initalMonths)) __obj.updateDynamic("initalMonths")(initalMonths.get.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (onCancel != null) __obj.updateDynamic("onCancel")(js.Any.fromFunction0(onCancel))
    if (onClear != null) __obj.updateDynamic("onClear")(js.Any.fromFunction0(onClear))
    if (onConfirm != null) __obj.updateDynamic("onConfirm")(js.Any.fromFunction2(onConfirm))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction2(onSelect))
    if (onSelectHasDisableDate != null) __obj.updateDynamic("onSelectHasDisableDate")(js.Any.fromFunction1(onSelectHasDisableDate))
    if (!js.isUndefined(pickTime)) __obj.updateDynamic("pickTime")(pickTime.get.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (renderHeader != null) __obj.updateDynamic("renderHeader")(js.Any.fromFunction1(renderHeader))
    if (renderShortcut != null) __obj.updateDynamic("renderShortcut")(js.Any.fromFunction1(renderShortcut))
    if (rowSize != null) __obj.updateDynamic("rowSize")(rowSize.asInstanceOf[js.Any])
    if (!js.isUndefined(showShortcut)) __obj.updateDynamic("showShortcut")(showShortcut.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (timePickerPickerPrefixCls != null) __obj.updateDynamic("timePickerPickerPrefixCls")(timePickerPickerPrefixCls.asInstanceOf[js.Any])
    if (timePickerPrefixCls != null) __obj.updateDynamic("timePickerPrefixCls")(timePickerPrefixCls.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlychildrenReactNode]
  }
}

