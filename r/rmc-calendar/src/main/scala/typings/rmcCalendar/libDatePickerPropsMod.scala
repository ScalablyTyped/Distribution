package typings.rmcCalendar

import typings.rmcCalendar.libDateDataTypesMod.Models.ExtraData
import typings.rmcCalendar.libDateDataTypesMod.Models.Locale
import typings.rmcCalendar.rmcCalendarStrings.normal
import typings.rmcCalendar.rmcCalendarStrings.one
import typings.rmcCalendar.rmcCalendarStrings.range
import typings.rmcCalendar.rmcCalendarStrings.xl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDatePickerPropsMod {
  
  trait PropsType extends StObject {
    
    /** 默认日期，default: today */
    var defaultDate: js.UndefOr[js.Date] = js.undefined
    
    /** 选择值 */
    var endDate: js.UndefOr[js.Date] = js.undefined
    
    /** 日期扩展数据 */
    var getDateExtra: js.UndefOr[js.Function1[/* date */ js.Date, ExtraData]] = js.undefined
    
    /** 无限滚动优化（大范围选择），default: false */
    var infiniteOpt: js.UndefOr[Boolean] = js.undefined
    
    /** 初始化月个数，default: 6 */
    var initalMonths: js.UndefOr[Double] = js.undefined
    
    /** 本地化 */
    var locale: js.UndefOr[Locale] = js.undefined
    
    /** 最大日期 */
    var maxDate: js.UndefOr[js.Date] = js.undefined
    
    /** 最小日期 */
    var minDate: js.UndefOr[js.Date] = js.undefined
    
    /** 日期点击回调 */
    var onCellClick: js.UndefOr[js.Function1[/* date */ js.Date, Unit]] = js.undefined
    
    var onLayout: js.UndefOr[js.Function1[/* clientHight */ Double, Unit]] = js.undefined
    
    /** 选择区间包含不可用日期 */
    var onSelectHasDisableDate: js.UndefOr[js.Function1[/* date */ js.Array[js.Date], Unit]] = js.undefined
    
    /** (web only) 样式前缀 */
    var prefixCls: js.UndefOr[String] = js.undefined
    
    /** 行大小 */
    var rowSize: js.UndefOr[normal | xl] = js.undefined
    
    /** 选择值 */
    var startDate: js.UndefOr[js.Date] = js.undefined
    
    /** 选择类型，default: range，one: 单日，range: 日期区间 */
    var `type`: js.UndefOr[one | range] = js.undefined
  }
  object PropsType {
    
    inline def apply(): PropsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PropsType]
    }
    
    extension [Self <: PropsType](x: Self) {
      
      inline def setDefaultDate(value: js.Date): Self = StObject.set(x, "defaultDate", value.asInstanceOf[js.Any])
      
      inline def setDefaultDateUndefined: Self = StObject.set(x, "defaultDate", js.undefined)
      
      inline def setEndDate(value: js.Date): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
      
      inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
      
      inline def setGetDateExtra(value: /* date */ js.Date => ExtraData): Self = StObject.set(x, "getDateExtra", js.Any.fromFunction1(value))
      
      inline def setGetDateExtraUndefined: Self = StObject.set(x, "getDateExtra", js.undefined)
      
      inline def setInfiniteOpt(value: Boolean): Self = StObject.set(x, "infiniteOpt", value.asInstanceOf[js.Any])
      
      inline def setInfiniteOptUndefined: Self = StObject.set(x, "infiniteOpt", js.undefined)
      
      inline def setInitalMonths(value: Double): Self = StObject.set(x, "initalMonths", value.asInstanceOf[js.Any])
      
      inline def setInitalMonthsUndefined: Self = StObject.set(x, "initalMonths", js.undefined)
      
      inline def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setMaxDate(value: js.Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      inline def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      inline def setMinDate(value: js.Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      inline def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      inline def setOnCellClick(value: /* date */ js.Date => Unit): Self = StObject.set(x, "onCellClick", js.Any.fromFunction1(value))
      
      inline def setOnCellClickUndefined: Self = StObject.set(x, "onCellClick", js.undefined)
      
      inline def setOnLayout(value: /* clientHight */ Double => Unit): Self = StObject.set(x, "onLayout", js.Any.fromFunction1(value))
      
      inline def setOnLayoutUndefined: Self = StObject.set(x, "onLayout", js.undefined)
      
      inline def setOnSelectHasDisableDate(value: /* date */ js.Array[js.Date] => Unit): Self = StObject.set(x, "onSelectHasDisableDate", js.Any.fromFunction1(value))
      
      inline def setOnSelectHasDisableDateUndefined: Self = StObject.set(x, "onSelectHasDisableDate", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setRowSize(value: normal | xl): Self = StObject.set(x, "rowSize", value.asInstanceOf[js.Any])
      
      inline def setRowSizeUndefined: Self = StObject.set(x, "rowSize", js.undefined)
      
      inline def setStartDate(value: js.Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
      
      inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
      
      inline def setType(value: one | range): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
