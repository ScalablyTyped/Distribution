package typings.rmcCalendar.calendarPropsMod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.rmcCalendar.dataTypesMod.Models.ExtraData
import typings.rmcCalendar.dataTypesMod.Models.Locale
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

@js.native
trait PropsType extends js.Object {
  /** 显示开始日期，default: today */
  var defaultDate: js.UndefOr[Date] = js.native
  /** 默认时间选择值 */
  var defaultTimeValue: js.UndefOr[Date] = js.native
  /** 默认选择值，开始时间、结束时间 */
  var defaultValue: js.UndefOr[SelectDateType] = js.native
  /** 入场方向，default: vertical，vertical: 垂直，horizontal: 水平 */
  var enterDirection: js.UndefOr[horizontal | vertical] = js.native
  /** 日期扩展数据 */
  var getDateExtra: js.UndefOr[js.Function1[/* date */ Date, ExtraData]] = js.native
  /** 无限滚动优化（大范围选择），default: false */
  var infiniteOpt: js.UndefOr[Boolean] = js.native
  /** 初始化月个数，default: 6 */
  var initalMonths: js.UndefOr[Double] = js.native
  /** 本地化 */
  var locale: js.UndefOr[Locale] = js.native
  /** 最大日期 */
  var maxDate: js.UndefOr[Date] = js.native
  /** 最小日期 */
  var minDate: js.UndefOr[Date] = js.native
  /** 关闭时回调 */
  var onCancel: js.UndefOr[js.Function0[Unit]] = js.native
  /** 清除时回调 */
  var onClear: js.UndefOr[js.Function0[Unit]] = js.native
  /** 确认时回调 */
  var onConfirm: js.UndefOr[
    js.Function2[/* startDateTime */ js.UndefOr[Date], /* endDateTime */ js.UndefOr[Date], Unit]
  ] = js.native
  /** 选择日期回调，如果有返回值，选择范围将使用返回值 */
  var onSelect: js.UndefOr[
    js.Function2[
      /* date */ Date, 
      /* state */ js.UndefOr[js.Tuple2[js.UndefOr[Date], js.UndefOr[Date]]], 
      SelectDateType | Unit
    ]
  ] = js.native
  /** 选择区间包含不可用日期 */
  var onSelectHasDisableDate: js.UndefOr[js.Function1[/* date */ js.Array[Date], Unit]] = js.native
  /** 是否选择时间，default: false */
  var pickTime: js.UndefOr[Boolean] = js.native
  /** (web only) 样式前缀，default: rmc-calendar */
  var prefixCls: js.UndefOr[String] = js.native
  /** 替换标题栏 */
  var renderHeader: js.UndefOr[js.Function1[/* prop */ this.type, ReactNode]] = js.native
  /** 替换快捷选择栏，需要设置showShortcut: true */
  var renderShortcut: js.UndefOr[
    js.Function1[
      /* select */ js.Function2[/* startDate */ js.UndefOr[Date], /* endDate */ js.UndefOr[Date], Unit], 
      ReactNode
    ]
  ] = js.native
  /** 行大小，default: normal */
  var rowSize: js.UndefOr[normal | xl] = js.native
  /** 快捷日期选择， default: false */
  var showShortcut: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var timePickerPickerPrefixCls: js.UndefOr[String] = js.native
  var timePickerPrefixCls: js.UndefOr[String] = js.native
  /** header title, default: {locale.title} */
  var title: js.UndefOr[String] = js.native
  /** 选择类型，default: range，one: 单日，range: 日期区间 */
  var `type`: js.UndefOr[one | range] = js.native
  /** 是否显示，default: false */
  var visible: js.UndefOr[Boolean] = js.native
}

object PropsType {
  @scala.inline
  def apply(): PropsType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropsType]
  }
  @scala.inline
  implicit class PropsTypeOps[Self <: PropsType] (val x: Self) extends AnyVal {
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
    def setDefaultDate(value: Date): Self = this.set("defaultDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultDate: Self = this.set("defaultDate", js.undefined)
    @scala.inline
    def setDefaultTimeValue(value: Date): Self = this.set("defaultTimeValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultTimeValue: Self = this.set("defaultTimeValue", js.undefined)
    @scala.inline
    def setDefaultValueVarargs(value: Date*): Self = this.set("defaultValue", js.Array(value :_*))
    @scala.inline
    def setDefaultValue(value: SelectDateType): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setEnterDirection(value: horizontal | vertical): Self = this.set("enterDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnterDirection: Self = this.set("enterDirection", js.undefined)
    @scala.inline
    def setGetDateExtra(value: /* date */ Date => ExtraData): Self = this.set("getDateExtra", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetDateExtra: Self = this.set("getDateExtra", js.undefined)
    @scala.inline
    def setInfiniteOpt(value: Boolean): Self = this.set("infiniteOpt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfiniteOpt: Self = this.set("infiniteOpt", js.undefined)
    @scala.inline
    def setInitalMonths(value: Double): Self = this.set("initalMonths", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitalMonths: Self = this.set("initalMonths", js.undefined)
    @scala.inline
    def setLocale(value: Locale): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setMaxDate(value: Date): Self = this.set("maxDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxDate: Self = this.set("maxDate", js.undefined)
    @scala.inline
    def setMinDate(value: Date): Self = this.set("minDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinDate: Self = this.set("minDate", js.undefined)
    @scala.inline
    def setOnCancel(value: () => Unit): Self = this.set("onCancel", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnCancel: Self = this.set("onCancel", js.undefined)
    @scala.inline
    def setOnClear(value: () => Unit): Self = this.set("onClear", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnClear: Self = this.set("onClear", js.undefined)
    @scala.inline
    def setOnConfirm(value: (/* startDateTime */ js.UndefOr[Date], /* endDateTime */ js.UndefOr[Date]) => Unit): Self = this.set("onConfirm", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnConfirm: Self = this.set("onConfirm", js.undefined)
    @scala.inline
    def setOnSelect(
      value: (/* date */ Date, /* state */ js.UndefOr[js.Tuple2[js.UndefOr[Date], js.UndefOr[Date]]]) => SelectDateType | Unit
    ): Self = this.set("onSelect", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    @scala.inline
    def setOnSelectHasDisableDate(value: /* date */ js.Array[Date] => Unit): Self = this.set("onSelectHasDisableDate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSelectHasDisableDate: Self = this.set("onSelectHasDisableDate", js.undefined)
    @scala.inline
    def setPickTime(value: Boolean): Self = this.set("pickTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePickTime: Self = this.set("pickTime", js.undefined)
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    @scala.inline
    def setRenderHeader(value: PropsType => ReactNode): Self = this.set("renderHeader", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRenderHeader: Self = this.set("renderHeader", js.undefined)
    @scala.inline
    def setRenderShortcut(
      value: /* select */ js.Function2[/* startDate */ js.UndefOr[Date], /* endDate */ js.UndefOr[Date], Unit] => ReactNode
    ): Self = this.set("renderShortcut", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRenderShortcut: Self = this.set("renderShortcut", js.undefined)
    @scala.inline
    def setRowSize(value: normal | xl): Self = this.set("rowSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowSize: Self = this.set("rowSize", js.undefined)
    @scala.inline
    def setShowShortcut(value: Boolean): Self = this.set("showShortcut", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowShortcut: Self = this.set("showShortcut", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTimePickerPickerPrefixCls(value: String): Self = this.set("timePickerPickerPrefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimePickerPickerPrefixCls: Self = this.set("timePickerPickerPrefixCls", js.undefined)
    @scala.inline
    def setTimePickerPrefixCls(value: String): Self = this.set("timePickerPrefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimePickerPrefixCls: Self = this.set("timePickerPrefixCls", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setType(value: one | range): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}

