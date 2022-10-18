package typings.rmcCalendar

import org.scalablytyped.runtime.Instantiable0
import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.react.mod.TouchEvent
import typings.rmcCalendar.libCalendarHeaderMod.PropsType
import typings.rmcCalendar.libCalendarHeaderMod.default
import typings.rmcCalendar.libCalendarPropsMod.SelectDateType
import typings.rmcCalendar.libDateDataTypesMod.Models.ExtraData
import typings.rmcCalendar.libDateDataTypesMod.Models.Locale
import typings.rmcCalendar.rmcCalendarStrings.horizontal
import typings.rmcCalendar.rmcCalendarStrings.normal
import typings.rmcCalendar.rmcCalendarStrings.one
import typings.rmcCalendar.rmcCalendarStrings.range
import typings.rmcCalendar.rmcCalendarStrings.vertical
import typings.rmcCalendar.rmcCalendarStrings.xl
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Client extends StObject {
    
    var client: Double
    
    var full: Double
    
    var top: Double
  }
  object Client {
    
    inline def apply(client: Double, full: Double, top: Double): Client = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], full = full.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[Client]
    }
    
    extension [Self <: Client](x: Self) {
      
      inline def setClient(value: Double): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      inline def setFull(value: Double): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  trait CloseIcon extends StObject {
    
    var closeIcon: String
  }
  object CloseIcon {
    
    inline def apply(closeIcon: String): CloseIcon = {
      val __obj = js.Dynamic.literal(closeIcon = closeIcon.asInstanceOf[js.Any])
      __obj.asInstanceOf[CloseIcon]
    }
    
    extension [Self <: CloseIcon](x: Self) {
      
      inline def setCloseIcon(value: String): Self = StObject.set(x, "closeIcon", value.asInstanceOf[js.Any])
    }
  }
  
  trait EndDate extends StObject {
    
    var endDate: js.UndefOr[js.Date] = js.undefined
    
    var startDate: js.UndefOr[js.Date] = js.undefined
  }
  object EndDate {
    
    inline def apply(): EndDate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EndDate]
    }
    
    extension [Self <: EndDate](x: Self) {
      
      inline def setEndDate(value: js.Date): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
      
      inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
      
      inline def setStartDate(value: js.Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
      
      inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    }
  }
  
  trait FirstDate extends StObject {
    
    var firstDate: js.Date
    
    var lastDate: js.Date
  }
  object FirstDate {
    
    inline def apply(firstDate: js.Date, lastDate: js.Date): FirstDate = {
      val __obj = js.Dynamic.literal(firstDate = firstDate.asInstanceOf[js.Any], lastDate = lastDate.asInstanceOf[js.Any])
      __obj.asInstanceOf[FirstDate]
    }
    
    extension [Self <: FirstDate](x: Self) {
      
      inline def setFirstDate(value: js.Date): Self = StObject.set(x, "firstDate", value.asInstanceOf[js.Any])
      
      inline def setLastDate(value: js.Date): Self = StObject.set(x, "lastDate", value.asInstanceOf[js.Any])
    }
  }
  
  trait OnFinish extends StObject {
    
    def onFinish(): Unit
    
    def onTouchCancel(): Unit
    
    def onTouchEnd(): Unit
    
    def onTouchMove(evt: TouchEvent[HTMLDivElement]): Unit
    
    def onTouchStart(evt: TouchEvent[HTMLDivElement]): Unit
  }
  object OnFinish {
    
    inline def apply(
      onFinish: () => Unit,
      onTouchCancel: () => Unit,
      onTouchEnd: () => Unit,
      onTouchMove: TouchEvent[HTMLDivElement] => Unit,
      onTouchStart: TouchEvent[HTMLDivElement] => Unit
    ): OnFinish = {
      val __obj = js.Dynamic.literal(onFinish = js.Any.fromFunction0(onFinish), onTouchCancel = js.Any.fromFunction0(onTouchCancel), onTouchEnd = js.Any.fromFunction0(onTouchEnd), onTouchMove = js.Any.fromFunction1(onTouchMove), onTouchStart = js.Any.fromFunction1(onTouchStart))
      __obj.asInstanceOf[OnFinish]
    }
    
    extension [Self <: OnFinish](x: Self) {
      
      inline def setOnFinish(value: () => Unit): Self = StObject.set(x, "onFinish", js.Any.fromFunction0(value))
      
      inline def setOnTouchCancel(value: () => Unit): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction0(value))
      
      inline def setOnTouchEnd(value: () => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction0(value))
      
      inline def setOnTouchMove(value: TouchEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1(value))
      
      inline def setOnTouchStart(value: TouchEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
    }
  }
  
  /* Inlined std.Readonly<{  children :react.react.ReactNode | undefined}> & std.Readonly<rmc-calendar.rmc-calendar/lib/CalendarProps.default> */
  trait ReadonlychildrenReactNode extends StObject {
    
    val children: js.UndefOr[ReactNode] = js.undefined
    
    val defaultDate: js.UndefOr[js.Date] = js.undefined
    
    val defaultTimeValue: js.UndefOr[js.Date] = js.undefined
    
    val defaultValue: js.UndefOr[SelectDateType] = js.undefined
    
    val enterDirection: js.UndefOr[horizontal | vertical] = js.undefined
    
    val getDateExtra: js.UndefOr[js.Function1[/* date */ js.Date, ExtraData]] = js.undefined
    
    val infiniteOpt: js.UndefOr[Boolean] = js.undefined
    
    val initalMonths: js.UndefOr[Double] = js.undefined
    
    val locale: js.UndefOr[Locale] = js.undefined
    
    val maxDate: js.UndefOr[js.Date] = js.undefined
    
    val minDate: js.UndefOr[js.Date] = js.undefined
    
    val onCancel: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    val onClear: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    val onConfirm: js.UndefOr[
        js.Function2[/* startDateTime */ js.UndefOr[js.Date], /* endDateTime */ js.UndefOr[js.Date], Unit]
      ] = js.undefined
    
    val onSelect: js.UndefOr[
        js.Function2[
          /* date */ js.Date, 
          /* state */ js.UndefOr[js.Tuple2[js.UndefOr[js.Date], js.UndefOr[js.Date]]], 
          SelectDateType | Unit
        ]
      ] = js.undefined
    
    val onSelectHasDisableDate: js.UndefOr[js.Function1[/* date */ js.Array[js.Date], Unit]] = js.undefined
    
    val pickTime: js.UndefOr[Boolean] = js.undefined
    
    val prefixCls: js.UndefOr[String] = js.undefined
    
    val renderHeader: js.UndefOr[js.Function1[/* prop */ PropsType, ReactNode]] = js.undefined
    
    val renderShortcut: js.UndefOr[
        js.Function1[
          /* select */ js.Function2[/* startDate */ js.UndefOr[js.Date], /* endDate */ js.UndefOr[js.Date], Unit], 
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
    
    inline def apply(): ReadonlychildrenReactNode = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlychildrenReactNode]
    }
    
    extension [Self <: ReadonlychildrenReactNode](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDefaultDate(value: js.Date): Self = StObject.set(x, "defaultDate", value.asInstanceOf[js.Any])
      
      inline def setDefaultDateUndefined: Self = StObject.set(x, "defaultDate", js.undefined)
      
      inline def setDefaultTimeValue(value: js.Date): Self = StObject.set(x, "defaultTimeValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultTimeValueUndefined: Self = StObject.set(x, "defaultTimeValue", js.undefined)
      
      inline def setDefaultValue(value: SelectDateType): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDefaultValueVarargs(value: js.Date*): Self = StObject.set(x, "defaultValue", js.Array(value*))
      
      inline def setEnterDirection(value: horizontal | vertical): Self = StObject.set(x, "enterDirection", value.asInstanceOf[js.Any])
      
      inline def setEnterDirectionUndefined: Self = StObject.set(x, "enterDirection", js.undefined)
      
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
      
      inline def setOnCancel(value: () => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction0(value))
      
      inline def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
      
      inline def setOnClear(value: () => Unit): Self = StObject.set(x, "onClear", js.Any.fromFunction0(value))
      
      inline def setOnClearUndefined: Self = StObject.set(x, "onClear", js.undefined)
      
      inline def setOnConfirm(value: (/* startDateTime */ js.UndefOr[js.Date], /* endDateTime */ js.UndefOr[js.Date]) => Unit): Self = StObject.set(x, "onConfirm", js.Any.fromFunction2(value))
      
      inline def setOnConfirmUndefined: Self = StObject.set(x, "onConfirm", js.undefined)
      
      inline def setOnSelect(
        value: (/* date */ js.Date, /* state */ js.UndefOr[js.Tuple2[js.UndefOr[js.Date], js.UndefOr[js.Date]]]) => SelectDateType | Unit
      ): Self = StObject.set(x, "onSelect", js.Any.fromFunction2(value))
      
      inline def setOnSelectHasDisableDate(value: /* date */ js.Array[js.Date] => Unit): Self = StObject.set(x, "onSelectHasDisableDate", js.Any.fromFunction1(value))
      
      inline def setOnSelectHasDisableDateUndefined: Self = StObject.set(x, "onSelectHasDisableDate", js.undefined)
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setPickTime(value: Boolean): Self = StObject.set(x, "pickTime", value.asInstanceOf[js.Any])
      
      inline def setPickTimeUndefined: Self = StObject.set(x, "pickTime", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setRenderHeader(value: /* prop */ PropsType => ReactNode): Self = StObject.set(x, "renderHeader", js.Any.fromFunction1(value))
      
      inline def setRenderHeaderUndefined: Self = StObject.set(x, "renderHeader", js.undefined)
      
      inline def setRenderShortcut(
        value: /* select */ js.Function2[/* startDate */ js.UndefOr[js.Date], /* endDate */ js.UndefOr[js.Date], Unit] => ReactNode
      ): Self = StObject.set(x, "renderShortcut", js.Any.fromFunction1(value))
      
      inline def setRenderShortcutUndefined: Self = StObject.set(x, "renderShortcut", js.undefined)
      
      inline def setRowSize(value: normal | xl): Self = StObject.set(x, "rowSize", value.asInstanceOf[js.Any])
      
      inline def setRowSizeUndefined: Self = StObject.set(x, "rowSize", js.undefined)
      
      inline def setShowShortcut(value: Boolean): Self = StObject.set(x, "showShortcut", value.asInstanceOf[js.Any])
      
      inline def setShowShortcutUndefined: Self = StObject.set(x, "showShortcut", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTimePickerPickerPrefixCls(value: String): Self = StObject.set(x, "timePickerPickerPrefixCls", value.asInstanceOf[js.Any])
      
      inline def setTimePickerPickerPrefixClsUndefined: Self = StObject.set(x, "timePickerPickerPrefixCls", js.undefined)
      
      inline def setTimePickerPrefixCls(value: String): Self = StObject.set(x, "timePickerPrefixCls", value.asInstanceOf[js.Any])
      
      inline def setTimePickerPrefixClsUndefined: Self = StObject.set(x, "timePickerPrefixCls", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setType(value: one | range): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  @js.native
  trait TypeofHeader
    extends StObject
       with Instantiable0[default] {
    
    var defaultProps: CloseIcon = js.native
  }
  
  trait WeekComponents extends StObject {
    
    var weekComponents: js.Array[ReactNode]
  }
  object WeekComponents {
    
    inline def apply(weekComponents: js.Array[ReactNode]): WeekComponents = {
      val __obj = js.Dynamic.literal(weekComponents = weekComponents.asInstanceOf[js.Any])
      __obj.asInstanceOf[WeekComponents]
    }
    
    extension [Self <: WeekComponents](x: Self) {
      
      inline def setWeekComponents(value: js.Array[ReactNode]): Self = StObject.set(x, "weekComponents", value.asInstanceOf[js.Any])
      
      inline def setWeekComponentsVarargs(value: ReactNode*): Self = StObject.set(x, "weekComponents", js.Array(value*))
    }
  }
}
