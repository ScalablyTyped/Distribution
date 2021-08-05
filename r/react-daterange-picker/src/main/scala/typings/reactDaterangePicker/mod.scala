package typings.reactDaterangePicker

import org.scalablytyped.runtime.StringDictionary
import typings.moment.mod.Moment
import typings.momentRange.mod.DateRange
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.SFC
import typings.reactDaterangePicker.anon.MomentRangeNoneinpundefin
import typings.reactDaterangePicker.reactDaterangePickerStrings.next
import typings.reactDaterangePicker.reactDaterangePickerStrings.previous
import typings.reactDaterangePicker.reactDaterangePickerStrings.range
import typings.reactDaterangePicker.reactDaterangePickerStrings.single
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-daterange-picker", JSImport.Default)
  @js.native
  class default ()
    extends Component[Props[DateRangePicker], js.Object, js.Any]
  
  trait BaseProps[T]
    extends StObject
       with typings.react.mod.Props[T] {
    
    var bemBlock: js.UndefOr[String] = js.undefined
    
    var bemNamespace: js.UndefOr[String] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var dateStates: js.UndefOr[js.Array[DateState]] = js.undefined
    
    var defaultState: js.UndefOr[String] = js.undefined
    
    var disableNavigation: js.UndefOr[Boolean] = js.undefined
    
    // Use Number Literal Types after TypeScript 2.0 GA released.
    var firstOfWeek: js.UndefOr[Double] = js.undefined
    
    // React.PropTypes.oneOf([0, 1, 2, 3, 4, 5, 6])
    var helpMessage: js.UndefOr[String] = js.undefined
    
    var initialDate: js.UndefOr[Date] = js.undefined
    
    var initialFromValue: js.UndefOr[Boolean] = js.undefined
    
    var initialMonth: js.UndefOr[Double] = js.undefined
    
    var initialRange: js.UndefOr[js.Object] = js.undefined
    
    var initialYear: js.UndefOr[Double] = js.undefined
    
    /**
      * @default moment().locale()
      */
    var locale: js.UndefOr[String] = js.undefined
    
    var maximumDate: js.UndefOr[Date] = js.undefined
    
    var minimumDate: js.UndefOr[Date] = js.undefined
    
    var numberOfCalendars: js.UndefOr[Double] = js.undefined
    
    var onHighlightDate: js.UndefOr[js.Function1[/* date */ Date, Unit]] = js.undefined
    
    var onHighlightRange: js.UndefOr[js.Function1[/* date */ Date, Unit]] = js.undefined
    
    var onSelectStart: js.UndefOr[js.Function1[/* value */ MomentRangeNoneinpundefin, Unit]] = js.undefined
    
    var paginationArrowComponent: js.UndefOr[
        (ComponentClass[PaginationArrowProps[js.Object], ComponentState]) | SFC[PaginationArrowProps[js.Object]]
      ] = js.undefined
    
    var selectedLabel: js.UndefOr[String] = js.undefined
    
    var showLegend: js.UndefOr[Boolean] = js.undefined
    
    var singleDateRange: js.UndefOr[Boolean] = js.undefined
    
    var stateDefinitions: js.UndefOr[StateDefinitions] = js.undefined
    
    var value: js.UndefOr[MomentRangeNoneinpundefin | DateRange | Moment] = js.undefined
  }
  object BaseProps {
    
    inline def apply[T](): BaseProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseProps[T]]
    }
    
    extension [Self <: BaseProps[?], T](x: Self & BaseProps[T]) {
      
      inline def setBemBlock(value: String): Self = StObject.set(x, "bemBlock", value.asInstanceOf[js.Any])
      
      inline def setBemBlockUndefined: Self = StObject.set(x, "bemBlock", js.undefined)
      
      inline def setBemNamespace(value: String): Self = StObject.set(x, "bemNamespace", value.asInstanceOf[js.Any])
      
      inline def setBemNamespaceUndefined: Self = StObject.set(x, "bemNamespace", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDateStates(value: js.Array[DateState]): Self = StObject.set(x, "dateStates", value.asInstanceOf[js.Any])
      
      inline def setDateStatesUndefined: Self = StObject.set(x, "dateStates", js.undefined)
      
      inline def setDateStatesVarargs(value: DateState*): Self = StObject.set(x, "dateStates", js.Array(value :_*))
      
      inline def setDefaultState(value: String): Self = StObject.set(x, "defaultState", value.asInstanceOf[js.Any])
      
      inline def setDefaultStateUndefined: Self = StObject.set(x, "defaultState", js.undefined)
      
      inline def setDisableNavigation(value: Boolean): Self = StObject.set(x, "disableNavigation", value.asInstanceOf[js.Any])
      
      inline def setDisableNavigationUndefined: Self = StObject.set(x, "disableNavigation", js.undefined)
      
      inline def setFirstOfWeek(value: Double): Self = StObject.set(x, "firstOfWeek", value.asInstanceOf[js.Any])
      
      inline def setFirstOfWeekUndefined: Self = StObject.set(x, "firstOfWeek", js.undefined)
      
      inline def setHelpMessage(value: String): Self = StObject.set(x, "helpMessage", value.asInstanceOf[js.Any])
      
      inline def setHelpMessageUndefined: Self = StObject.set(x, "helpMessage", js.undefined)
      
      inline def setInitialDate(value: Date): Self = StObject.set(x, "initialDate", value.asInstanceOf[js.Any])
      
      inline def setInitialDateUndefined: Self = StObject.set(x, "initialDate", js.undefined)
      
      inline def setInitialFromValue(value: Boolean): Self = StObject.set(x, "initialFromValue", value.asInstanceOf[js.Any])
      
      inline def setInitialFromValueUndefined: Self = StObject.set(x, "initialFromValue", js.undefined)
      
      inline def setInitialMonth(value: Double): Self = StObject.set(x, "initialMonth", value.asInstanceOf[js.Any])
      
      inline def setInitialMonthUndefined: Self = StObject.set(x, "initialMonth", js.undefined)
      
      inline def setInitialRange(value: js.Object): Self = StObject.set(x, "initialRange", value.asInstanceOf[js.Any])
      
      inline def setInitialRangeUndefined: Self = StObject.set(x, "initialRange", js.undefined)
      
      inline def setInitialYear(value: Double): Self = StObject.set(x, "initialYear", value.asInstanceOf[js.Any])
      
      inline def setInitialYearUndefined: Self = StObject.set(x, "initialYear", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setMaximumDate(value: Date): Self = StObject.set(x, "maximumDate", value.asInstanceOf[js.Any])
      
      inline def setMaximumDateUndefined: Self = StObject.set(x, "maximumDate", js.undefined)
      
      inline def setMinimumDate(value: Date): Self = StObject.set(x, "minimumDate", value.asInstanceOf[js.Any])
      
      inline def setMinimumDateUndefined: Self = StObject.set(x, "minimumDate", js.undefined)
      
      inline def setNumberOfCalendars(value: Double): Self = StObject.set(x, "numberOfCalendars", value.asInstanceOf[js.Any])
      
      inline def setNumberOfCalendarsUndefined: Self = StObject.set(x, "numberOfCalendars", js.undefined)
      
      inline def setOnHighlightDate(value: /* date */ Date => Unit): Self = StObject.set(x, "onHighlightDate", js.Any.fromFunction1(value))
      
      inline def setOnHighlightDateUndefined: Self = StObject.set(x, "onHighlightDate", js.undefined)
      
      inline def setOnHighlightRange(value: /* date */ Date => Unit): Self = StObject.set(x, "onHighlightRange", js.Any.fromFunction1(value))
      
      inline def setOnHighlightRangeUndefined: Self = StObject.set(x, "onHighlightRange", js.undefined)
      
      inline def setOnSelectStart(value: /* value */ MomentRangeNoneinpundefin => Unit): Self = StObject.set(x, "onSelectStart", js.Any.fromFunction1(value))
      
      inline def setOnSelectStartUndefined: Self = StObject.set(x, "onSelectStart", js.undefined)
      
      inline def setPaginationArrowComponent(
        value: (ComponentClass[PaginationArrowProps[js.Object], ComponentState]) | SFC[PaginationArrowProps[js.Object]]
      ): Self = StObject.set(x, "paginationArrowComponent", value.asInstanceOf[js.Any])
      
      inline def setPaginationArrowComponentUndefined: Self = StObject.set(x, "paginationArrowComponent", js.undefined)
      
      inline def setSelectedLabel(value: String): Self = StObject.set(x, "selectedLabel", value.asInstanceOf[js.Any])
      
      inline def setSelectedLabelUndefined: Self = StObject.set(x, "selectedLabel", js.undefined)
      
      inline def setShowLegend(value: Boolean): Self = StObject.set(x, "showLegend", value.asInstanceOf[js.Any])
      
      inline def setShowLegendUndefined: Self = StObject.set(x, "showLegend", js.undefined)
      
      inline def setSingleDateRange(value: Boolean): Self = StObject.set(x, "singleDateRange", value.asInstanceOf[js.Any])
      
      inline def setSingleDateRangeUndefined: Self = StObject.set(x, "singleDateRange", js.undefined)
      
      inline def setStateDefinitions(value: StateDefinitions): Self = StObject.set(x, "stateDefinitions", value.asInstanceOf[js.Any])
      
      inline def setStateDefinitionsUndefined: Self = StObject.set(x, "stateDefinitions", js.undefined)
      
      inline def setValue(value: MomentRangeNoneinpundefin | DateRange | Moment): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait DateRangePicker
    extends Component[Props[DateRangePicker], js.Object, js.Any]
  
  trait DateState extends StObject {
    
    var range: DateRange
    
    var state: String
  }
  object DateState {
    
    inline def apply(range: DateRange, state: String): DateState = {
      val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[DateState]
    }
    
    extension [Self <: DateState](x: Self) {
      
      inline def setRange(value: DateRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  trait OnSelectCallbackParam extends StObject {
    
    var end: Moment
    
    var start: Moment
  }
  object OnSelectCallbackParam {
    
    inline def apply(end: Moment, start: Moment): OnSelectCallbackParam = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnSelectCallbackParam]
    }
    
    extension [Self <: OnSelectCallbackParam](x: Self) {
      
      inline def setEnd(value: Moment): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Moment): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  trait PaginationArrowProps[T]
    extends StObject
       with typings.react.mod.Props[T] {
    
    var direction: js.UndefOr[next | previous] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var onTrigger: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object PaginationArrowProps {
    
    inline def apply[T](): PaginationArrowProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaginationArrowProps[T]]
    }
    
    extension [Self <: PaginationArrowProps[?], T](x: Self & PaginationArrowProps[T]) {
      
      inline def setDirection(value: next | previous): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setOnTrigger(value: () => Unit): Self = StObject.set(x, "onTrigger", js.Any.fromFunction0(value))
      
      inline def setOnTriggerUndefined: Self = StObject.set(x, "onTrigger", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactDaterangePicker.mod.RangeProps[T]
    - typings.reactDaterangePicker.mod.SingleProps[T]
  */
  trait Props[T] extends StObject
  object Props {
    
    inline def RangeProps[T](): typings.reactDaterangePicker.mod.RangeProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.reactDaterangePicker.mod.RangeProps[T]]
    }
    
    inline def SingleProps[T](): typings.reactDaterangePicker.mod.SingleProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.reactDaterangePicker.mod.SingleProps[T]]
    }
  }
  
  trait RangeProps[T]
    extends StObject
       with BaseProps[T]
       with Props[T] {
    
    var onSelect: js.UndefOr[js.Function1[/* value */ OnSelectCallbackParam, Unit]] = js.undefined
    
    var selectionType: js.UndefOr[range] = js.undefined
  }
  object RangeProps {
    
    inline def apply[T](): RangeProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RangeProps[T]]
    }
    
    extension [Self <: RangeProps[?], T](x: Self & RangeProps[T]) {
      
      inline def setOnSelect(value: /* value */ OnSelectCallbackParam => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setSelectionType(value: range): Self = StObject.set(x, "selectionType", value.asInstanceOf[js.Any])
      
      inline def setSelectionTypeUndefined: Self = StObject.set(x, "selectionType", js.undefined)
    }
  }
  
  trait SingleProps[T]
    extends StObject
       with BaseProps[T]
       with Props[T] {
    
    var onSelect: js.UndefOr[js.Function1[/* value */ Moment, Unit]] = js.undefined
    
    var selectionType: js.UndefOr[single] = js.undefined
  }
  object SingleProps {
    
    inline def apply[T](): SingleProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SingleProps[T]]
    }
    
    extension [Self <: SingleProps[?], T](x: Self & SingleProps[T]) {
      
      inline def setOnSelect(value: /* value */ Moment => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setSelectionType(value: single): Self = StObject.set(x, "selectionType", value.asInstanceOf[js.Any])
      
      inline def setSelectionTypeUndefined: Self = StObject.set(x, "selectionType", js.undefined)
    }
  }
  
  trait StateDefinition extends StObject {
    
    var color: String
    
    var label: String
    
    var selectable: js.UndefOr[Boolean] = js.undefined
  }
  object StateDefinition {
    
    inline def apply(color: String, label: String): StateDefinition = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[StateDefinition]
    }
    
    extension [Self <: StateDefinition](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
      
      inline def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
    }
  }
  
  type StateDefinitions = StringDictionary[StateDefinition]
}
