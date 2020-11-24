package typings.rmcCalendar.datePickerPropsMod

import typings.rmcCalendar.dataTypesMod.Models.ExtraData
import typings.rmcCalendar.dataTypesMod.Models.Locale
import typings.rmcCalendar.rmcCalendarStrings.normal
import typings.rmcCalendar.rmcCalendarStrings.one
import typings.rmcCalendar.rmcCalendarStrings.range
import typings.rmcCalendar.rmcCalendarStrings.xl
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropsType extends js.Object {
  
  /** 默认日期，default: today */
  var defaultDate: js.UndefOr[Date] = js.native
  
  /** 选择值 */
  var endDate: js.UndefOr[Date] = js.native
  
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
  
  /** 日期点击回调 */
  var onCellClick: js.UndefOr[js.Function1[/* date */ Date, Unit]] = js.native
  
  var onLayout: js.UndefOr[js.Function1[/* clientHight */ Double, Unit]] = js.native
  
  /** 选择区间包含不可用日期 */
  var onSelectHasDisableDate: js.UndefOr[js.Function1[/* date */ js.Array[Date], Unit]] = js.native
  
  /** (web only) 样式前缀 */
  var prefixCls: js.UndefOr[String] = js.native
  
  /** 行大小 */
  var rowSize: js.UndefOr[normal | xl] = js.native
  
  /** 选择值 */
  var startDate: js.UndefOr[Date] = js.native
  
  /** 选择类型，default: range，one: 单日，range: 日期区间 */
  var `type`: js.UndefOr[one | range] = js.native
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
    def setEndDate(value: Date): Self = this.set("endDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndDate: Self = this.set("endDate", js.undefined)
    
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
    def setOnCellClick(value: /* date */ Date => Unit): Self = this.set("onCellClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnCellClick: Self = this.set("onCellClick", js.undefined)
    
    @scala.inline
    def setOnLayout(value: /* clientHight */ Double => Unit): Self = this.set("onLayout", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnLayout: Self = this.set("onLayout", js.undefined)
    
    @scala.inline
    def setOnSelectHasDisableDate(value: /* date */ js.Array[Date] => Unit): Self = this.set("onSelectHasDisableDate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSelectHasDisableDate: Self = this.set("onSelectHasDisableDate", js.undefined)
    
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    
    @scala.inline
    def setRowSize(value: normal | xl): Self = this.set("rowSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowSize: Self = this.set("rowSize", js.undefined)
    
    @scala.inline
    def setStartDate(value: Date): Self = this.set("startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartDate: Self = this.set("startDate", js.undefined)
    
    @scala.inline
    def setType(value: one | range): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
