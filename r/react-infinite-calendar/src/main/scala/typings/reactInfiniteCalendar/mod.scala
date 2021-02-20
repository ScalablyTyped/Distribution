package typings.reactInfiniteCalendar

import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.reactInfiniteCalendar.anon.AccentColor
import typings.reactInfiniteCalendar.anon.Blank
import typings.reactInfiniteCalendar.anon.End
import typings.reactInfiniteCalendar.anon.HideYearsOnSelect
import typings.reactInfiniteCalendar.reactInfiniteCalendarBooleans.`false`
import typings.reactInfiniteCalendar.reactInfiniteCalendarNumbers.`0`
import typings.reactInfiniteCalendar.reactInfiniteCalendarNumbers.`1`
import typings.reactInfiniteCalendar.reactInfiniteCalendarNumbers.`2`
import typings.reactInfiniteCalendar.reactInfiniteCalendarNumbers.`3`
import typings.reactInfiniteCalendar.reactInfiniteCalendarNumbers.`4`
import typings.reactInfiniteCalendar.reactInfiniteCalendarNumbers.`5`
import typings.reactInfiniteCalendar.reactInfiniteCalendarNumbers.`6`
import typings.reactInfiniteCalendar.reactInfiniteCalendarStrings.`100Percentsign`
import typings.reactInfiniteCalendar.reactInfiniteCalendarStrings.auto
import typings.reactInfiniteCalendar.reactInfiniteCalendarStrings.days
import typings.reactInfiniteCalendar.reactInfiniteCalendarStrings.years
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-infinite-calendar", JSImport.Default)
  @js.native
  class default ()
    extends Component[ReactInfiniteCalendarProps, js.Object, js.Any]
  
  @JSImport("react-infinite-calendar", "Calendar")
  @js.native
  class Calendar protected ()
    extends Component[ReactInfiniteCalendarProps, js.Object, js.Any] {
    def this(props: ReactInfiniteCalendarProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ReactInfiniteCalendarProps, context: js.Any) = this()
  }
  
  @js.native
  sealed trait EVENT_TYPE extends StObject
  @JSImport("react-infinite-calendar", "EVENT_TYPE")
  @js.native
  object EVENT_TYPE extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[EVENT_TYPE with Double] = js.native
    
    @js.native
    sealed trait END extends EVENT_TYPE
    /* 1 */ val END: typings.reactInfiniteCalendar.mod.EVENT_TYPE.END with Double = js.native
    
    @js.native
    sealed trait HOVER extends EVENT_TYPE
    /* 0 */ val HOVER: typings.reactInfiniteCalendar.mod.EVENT_TYPE.HOVER with Double = js.native
    
    @js.native
    sealed trait START extends EVENT_TYPE
    /* 1 */ val START: typings.reactInfiniteCalendar.mod.EVENT_TYPE.START with Double = js.native
  }
  
  @JSImport("react-infinite-calendar", "defaultMultipleDateInterpolation")
  @js.native
  def defaultMultipleDateInterpolation(component: CalendarClass): CalendarClass = js.native
  
  @JSImport("react-infinite-calendar", "withDateSelection")
  @js.native
  def withDateSelection(component: CalendarClass): CalendarClass = js.native
  
  @JSImport("react-infinite-calendar", "withKeyboardSupport")
  @js.native
  def withKeyboardSupport(component: CalendarClass): CalendarClass = js.native
  
  @JSImport("react-infinite-calendar", "withMultipleDates")
  @js.native
  def withMultipleDates(component: CalendarClass): CalendarClass = js.native
  
  @JSImport("react-infinite-calendar", "withRange")
  @js.native
  def withRange(component: CalendarClass): CalendarClass = js.native
  
  type CalendarClass = ComponentClass[ReactInfiniteCalendarProps, ComponentState]
  
  type DateSelectFunction = js.Function1[/* date */ Date, Unit]
  
  type DateType = Date | String | Double
  
  type RangedSelectFunction = js.Function1[/* rangedDate */ RangedSelection, Unit]
  
  @js.native
  trait RangedSelection extends StObject {
    
    var end: Date = js.native
    
    var eventType: EVENT_TYPE = js.native
    
    var start: Date = js.native
  }
  object RangedSelection {
    
    @scala.inline
    def apply(end: Date, eventType: EVENT_TYPE, start: Date): RangedSelection = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[RangedSelection]
    }
    
    @scala.inline
    implicit class RangedSelectionMutableBuilder[Self <: RangedSelection] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: Date): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventType(value: EVENT_TYPE): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: Date): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  type ReactInfiniteCalendar = Component[ReactInfiniteCalendarProps, js.Object, js.Any]
  
  @js.native
  trait ReactInfiniteCalendarProps extends StObject {
    
    var Component: js.UndefOr[CalendarClass] = js.native
    
    var autoFocus: js.UndefOr[Boolean] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var disabledDates: js.UndefOr[js.Array[DateType]] = js.native
    
    var disabledDays: js.UndefOr[js.Array[`0` | `1` | `2` | `3` | `4` | `5` | `6`]] = js.native
    
    var display: js.UndefOr[days | years] = js.native
    
    var displayOptions: js.UndefOr[HideYearsOnSelect] = js.native
    
    var height: js.UndefOr[Double | auto] = js.native
    
    var interpolateSelection: js.UndefOr[js.Function2[/* date */ Date, /* selected */ js.Array[Date], js.Array[Date]]] = js.native
    
    var locale: js.UndefOr[Blank] = js.native
    
    var max: js.UndefOr[DateType] = js.native
    
    var maxDate: js.UndefOr[DateType] = js.native
    
    var min: js.UndefOr[DateType] = js.native
    
    var minDate: js.UndefOr[DateType] = js.native
    
    var onScroll: js.UndefOr[js.Function1[/* scrollTop */ Double, Unit]] = js.native
    
    var onScrollEnd: js.UndefOr[js.Function1[/* scrollTop */ Double, Unit]] = js.native
    
    var onSelect: js.UndefOr[DateSelectFunction | RangedSelectFunction] = js.native
    
    var rowHeight: js.UndefOr[Double] = js.native
    
    var selected: js.UndefOr[DateType | `false` | End | js.Array[DateType]] = js.native
    
    var tabIndex: js.UndefOr[Double] = js.native
    
    var theme: js.UndefOr[AccentColor] = js.native
    
    var width: js.UndefOr[Double | auto | `100Percentsign`] = js.native
  }
  object ReactInfiniteCalendarProps {
    
    @scala.inline
    def apply(): ReactInfiniteCalendarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReactInfiniteCalendarProps]
    }
    
    @scala.inline
    implicit class ReactInfiniteCalendarPropsMutableBuilder[Self <: ReactInfiniteCalendarProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setComponent(value: CalendarClass): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentUndefined: Self = StObject.set(x, "Component", js.undefined)
      
      @scala.inline
      def setDisabledDates(value: js.Array[DateType]): Self = StObject.set(x, "disabledDates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledDatesUndefined: Self = StObject.set(x, "disabledDates", js.undefined)
      
      @scala.inline
      def setDisabledDatesVarargs(value: DateType*): Self = StObject.set(x, "disabledDates", js.Array(value :_*))
      
      @scala.inline
      def setDisabledDays(value: js.Array[`0` | `1` | `2` | `3` | `4` | `5` | `6`]): Self = StObject.set(x, "disabledDays", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledDaysUndefined: Self = StObject.set(x, "disabledDays", js.undefined)
      
      @scala.inline
      def setDisabledDaysVarargs(value: (`0` | `1` | `2` | `3` | `4` | `5` | `6`)*): Self = StObject.set(x, "disabledDays", js.Array(value :_*))
      
      @scala.inline
      def setDisplay(value: days | years): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayOptions(value: HideYearsOnSelect): Self = StObject.set(x, "displayOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayOptionsUndefined: Self = StObject.set(x, "displayOptions", js.undefined)
      
      @scala.inline
      def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      @scala.inline
      def setHeight(value: Double | auto): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setInterpolateSelection(value: (/* date */ Date, /* selected */ js.Array[Date]) => js.Array[Date]): Self = StObject.set(x, "interpolateSelection", js.Any.fromFunction2(value))
      
      @scala.inline
      def setInterpolateSelectionUndefined: Self = StObject.set(x, "interpolateSelection", js.undefined)
      
      @scala.inline
      def setLocale(value: Blank): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setMax(value: DateType): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxDate(value: DateType): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMin(value: DateType): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinDate(value: DateType): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setOnScroll(value: /* scrollTop */ Double => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnScrollEnd(value: /* scrollTop */ Double => Unit): Self = StObject.set(x, "onScrollEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnScrollEndUndefined: Self = StObject.set(x, "onScrollEnd", js.undefined)
      
      @scala.inline
      def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      @scala.inline
      def setOnSelect(value: (/* date */ Date) | (/* rangedDate */ RangedSelection) => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      @scala.inline
      def setRowHeight(value: Double): Self = StObject.set(x, "rowHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowHeightUndefined: Self = StObject.set(x, "rowHeight", js.undefined)
      
      @scala.inline
      def setSelected(value: DateType | `false` | End | js.Array[DateType]): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      @scala.inline
      def setSelectedVarargs(value: DateType*): Self = StObject.set(x, "selected", js.Array(value :_*))
      
      @scala.inline
      def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      @scala.inline
      def setTheme(value: AccentColor): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setWidth(value: Double | auto | `100Percentsign`): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
