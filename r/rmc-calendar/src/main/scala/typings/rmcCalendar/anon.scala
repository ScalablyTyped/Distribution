package typings.rmcCalendar

import org.scalablytyped.runtime.Instantiable0
import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.react.mod.TouchEvent
import typings.rmcCalendar.calendarPropsMod.SelectDateType
import typings.rmcCalendar.dataTypesMod.Models.ExtraData
import typings.rmcCalendar.dataTypesMod.Models.Locale
import typings.rmcCalendar.headerMod.PropsType
import typings.rmcCalendar.headerMod.default
import typings.rmcCalendar.rmcCalendarStrings.horizontal
import typings.rmcCalendar.rmcCalendarStrings.normal
import typings.rmcCalendar.rmcCalendarStrings.one
import typings.rmcCalendar.rmcCalendarStrings.range
import typings.rmcCalendar.rmcCalendarStrings.vertical
import typings.rmcCalendar.rmcCalendarStrings.xl
import typings.std.Date
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
    
    @scala.inline
    def apply(client: Double, full: Double, top: Double): Client = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], full = full.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[Client]
    }
    
    @scala.inline
    implicit class ClientMutableBuilder[Self <: Client] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClient(value: Double): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFull(value: Double): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  trait CloseIcon extends StObject {
    
    var closeIcon: String
  }
  object CloseIcon {
    
    @scala.inline
    def apply(closeIcon: String): CloseIcon = {
      val __obj = js.Dynamic.literal(closeIcon = closeIcon.asInstanceOf[js.Any])
      __obj.asInstanceOf[CloseIcon]
    }
    
    @scala.inline
    implicit class CloseIconMutableBuilder[Self <: CloseIcon] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCloseIcon(value: String): Self = StObject.set(x, "closeIcon", value.asInstanceOf[js.Any])
    }
  }
  
  trait EndDate extends StObject {
    
    var endDate: js.UndefOr[Date] = js.undefined
    
    var startDate: js.UndefOr[Date] = js.undefined
  }
  object EndDate {
    
    @scala.inline
    def apply(): EndDate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EndDate]
    }
    
    @scala.inline
    implicit class EndDateMutableBuilder[Self <: EndDate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEndDate(value: Date): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
      
      @scala.inline
      def setStartDate(value: Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    }
  }
  
  trait FirstDate extends StObject {
    
    var firstDate: Date
    
    var lastDate: Date
  }
  object FirstDate {
    
    @scala.inline
    def apply(firstDate: Date, lastDate: Date): FirstDate = {
      val __obj = js.Dynamic.literal(firstDate = firstDate.asInstanceOf[js.Any], lastDate = lastDate.asInstanceOf[js.Any])
      __obj.asInstanceOf[FirstDate]
    }
    
    @scala.inline
    implicit class FirstDateMutableBuilder[Self <: FirstDate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFirstDate(value: Date): Self = StObject.set(x, "firstDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastDate(value: Date): Self = StObject.set(x, "lastDate", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply(
      onFinish: () => Unit,
      onTouchCancel: () => Unit,
      onTouchEnd: () => Unit,
      onTouchMove: TouchEvent[HTMLDivElement] => Unit,
      onTouchStart: TouchEvent[HTMLDivElement] => Unit
    ): OnFinish = {
      val __obj = js.Dynamic.literal(onFinish = js.Any.fromFunction0(onFinish), onTouchCancel = js.Any.fromFunction0(onTouchCancel), onTouchEnd = js.Any.fromFunction0(onTouchEnd), onTouchMove = js.Any.fromFunction1(onTouchMove), onTouchStart = js.Any.fromFunction1(onTouchStart))
      __obj.asInstanceOf[OnFinish]
    }
    
    @scala.inline
    implicit class OnFinishMutableBuilder[Self <: OnFinish] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnFinish(value: () => Unit): Self = StObject.set(x, "onFinish", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnTouchCancel(value: () => Unit): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnTouchEnd(value: () => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnTouchMove(value: TouchEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchStart(value: TouchEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
    }
  }
  
  /* Inlined std.Readonly<{  children :react.react.ReactNode | undefined}> & std.Readonly<rmc-calendar.rmc-calendar/lib/CalendarProps.default> */
  trait ReadonlychildrenReactNode extends StObject {
    
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
    def apply(): ReadonlychildrenReactNode = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlychildrenReactNode]
    }
    
    @scala.inline
    implicit class ReadonlychildrenReactNodeMutableBuilder[Self <: ReadonlychildrenReactNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDefaultDate(value: Date): Self = StObject.set(x, "defaultDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultDateUndefined: Self = StObject.set(x, "defaultDate", js.undefined)
      
      @scala.inline
      def setDefaultTimeValue(value: Date): Self = StObject.set(x, "defaultTimeValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultTimeValueUndefined: Self = StObject.set(x, "defaultTimeValue", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: SelectDateType): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDefaultValueVarargs(value: Date*): Self = StObject.set(x, "defaultValue", js.Array(value :_*))
      
      @scala.inline
      def setEnterDirection(value: horizontal | vertical): Self = StObject.set(x, "enterDirection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnterDirectionUndefined: Self = StObject.set(x, "enterDirection", js.undefined)
      
      @scala.inline
      def setGetDateExtra(value: /* date */ Date => ExtraData): Self = StObject.set(x, "getDateExtra", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetDateExtraUndefined: Self = StObject.set(x, "getDateExtra", js.undefined)
      
      @scala.inline
      def setInfiniteOpt(value: Boolean): Self = StObject.set(x, "infiniteOpt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfiniteOptUndefined: Self = StObject.set(x, "infiniteOpt", js.undefined)
      
      @scala.inline
      def setInitalMonths(value: Double): Self = StObject.set(x, "initalMonths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitalMonthsUndefined: Self = StObject.set(x, "initalMonths", js.undefined)
      
      @scala.inline
      def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setMaxDate(value: Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      @scala.inline
      def setMinDate(value: Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      @scala.inline
      def setOnCancel(value: () => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
      
      @scala.inline
      def setOnClear(value: () => Unit): Self = StObject.set(x, "onClear", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnClearUndefined: Self = StObject.set(x, "onClear", js.undefined)
      
      @scala.inline
      def setOnConfirm(value: (/* startDateTime */ js.UndefOr[Date], /* endDateTime */ js.UndefOr[Date]) => Unit): Self = StObject.set(x, "onConfirm", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnConfirmUndefined: Self = StObject.set(x, "onConfirm", js.undefined)
      
      @scala.inline
      def setOnSelect(
        value: (/* date */ Date, /* state */ js.UndefOr[js.Tuple2[js.UndefOr[Date], js.UndefOr[Date]]]) => SelectDateType | Unit
      ): Self = StObject.set(x, "onSelect", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnSelectHasDisableDate(value: /* date */ js.Array[Date] => Unit): Self = StObject.set(x, "onSelectHasDisableDate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSelectHasDisableDateUndefined: Self = StObject.set(x, "onSelectHasDisableDate", js.undefined)
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      @scala.inline
      def setPickTime(value: Boolean): Self = StObject.set(x, "pickTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPickTimeUndefined: Self = StObject.set(x, "pickTime", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setRenderHeader(value: /* prop */ PropsType => ReactNode): Self = StObject.set(x, "renderHeader", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderHeaderUndefined: Self = StObject.set(x, "renderHeader", js.undefined)
      
      @scala.inline
      def setRenderShortcut(
        value: /* select */ js.Function2[/* startDate */ js.UndefOr[Date], /* endDate */ js.UndefOr[Date], Unit] => ReactNode
      ): Self = StObject.set(x, "renderShortcut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderShortcutUndefined: Self = StObject.set(x, "renderShortcut", js.undefined)
      
      @scala.inline
      def setRowSize(value: normal | xl): Self = StObject.set(x, "rowSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowSizeUndefined: Self = StObject.set(x, "rowSize", js.undefined)
      
      @scala.inline
      def setShowShortcut(value: Boolean): Self = StObject.set(x, "showShortcut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowShortcutUndefined: Self = StObject.set(x, "showShortcut", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTimePickerPickerPrefixCls(value: String): Self = StObject.set(x, "timePickerPickerPrefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimePickerPickerPrefixClsUndefined: Self = StObject.set(x, "timePickerPickerPrefixCls", js.undefined)
      
      @scala.inline
      def setTimePickerPrefixCls(value: String): Self = StObject.set(x, "timePickerPrefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimePickerPrefixClsUndefined: Self = StObject.set(x, "timePickerPrefixCls", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setType(value: one | range): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
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
    
    @scala.inline
    def apply(weekComponents: js.Array[ReactNode]): WeekComponents = {
      val __obj = js.Dynamic.literal(weekComponents = weekComponents.asInstanceOf[js.Any])
      __obj.asInstanceOf[WeekComponents]
    }
    
    @scala.inline
    implicit class WeekComponentsMutableBuilder[Self <: WeekComponents] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setWeekComponents(value: js.Array[ReactNode]): Self = StObject.set(x, "weekComponents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeekComponentsVarargs(value: ReactNode*): Self = StObject.set(x, "weekComponents", js.Array(value :_*))
    }
  }
}
