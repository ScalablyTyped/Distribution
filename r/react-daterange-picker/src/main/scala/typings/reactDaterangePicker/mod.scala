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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-daterange-picker", JSImport.Default)
  @js.native
  class default ()
    extends Component[Props[DateRangePicker], js.Object, js.Any]
  
  @js.native
  trait BaseProps[T]
    extends typings.react.mod.Props[T] {
    
    var bemBlock: js.UndefOr[String] = js.native
    
    var bemNamespace: js.UndefOr[String] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var dateStates: js.UndefOr[js.Array[DateState]] = js.native
    
    var defaultState: js.UndefOr[String] = js.native
    
    var disableNavigation: js.UndefOr[Boolean] = js.native
    
    // Use Number Literal Types after TypeScript 2.0 GA released.
    var firstOfWeek: js.UndefOr[Double] = js.native
    
    // React.PropTypes.oneOf([0, 1, 2, 3, 4, 5, 6])
    var helpMessage: js.UndefOr[String] = js.native
    
    var initialDate: js.UndefOr[Date] = js.native
    
    var initialFromValue: js.UndefOr[Boolean] = js.native
    
    var initialMonth: js.UndefOr[Double] = js.native
    
    var initialRange: js.UndefOr[js.Object] = js.native
    
    var initialYear: js.UndefOr[Double] = js.native
    
    /**
      * @default moment().locale()
      */
    var locale: js.UndefOr[String] = js.native
    
    var maximumDate: js.UndefOr[Date] = js.native
    
    var minimumDate: js.UndefOr[Date] = js.native
    
    var numberOfCalendars: js.UndefOr[Double] = js.native
    
    var onHighlightDate: js.UndefOr[js.Function1[/* date */ Date, Unit]] = js.native
    
    var onHighlightRange: js.UndefOr[js.Function1[/* date */ Date, Unit]] = js.native
    
    var onSelectStart: js.UndefOr[js.Function1[/* value */ MomentRangeNoneinpundefin, Unit]] = js.native
    
    var paginationArrowComponent: js.UndefOr[
        (ComponentClass[PaginationArrowProps[js.Object], ComponentState]) | SFC[PaginationArrowProps[js.Object]]
      ] = js.native
    
    var selectedLabel: js.UndefOr[String] = js.native
    
    var showLegend: js.UndefOr[Boolean] = js.native
    
    var singleDateRange: js.UndefOr[Boolean] = js.native
    
    var stateDefinitions: js.UndefOr[StateDefinitions] = js.native
    
    var value: js.UndefOr[MomentRangeNoneinpundefin | DateRange | Moment] = js.native
  }
  object BaseProps {
    
    @scala.inline
    def apply[T](): BaseProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseProps[T]]
    }
    
    @scala.inline
    implicit class BasePropsMutableBuilder[Self <: BaseProps[_], T] (val x: Self with BaseProps[T]) extends AnyVal {
      
      @scala.inline
      def setBemBlock(value: String): Self = StObject.set(x, "bemBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBemBlockUndefined: Self = StObject.set(x, "bemBlock", js.undefined)
      
      @scala.inline
      def setBemNamespace(value: String): Self = StObject.set(x, "bemNamespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBemNamespaceUndefined: Self = StObject.set(x, "bemNamespace", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDateStates(value: js.Array[DateState]): Self = StObject.set(x, "dateStates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateStatesUndefined: Self = StObject.set(x, "dateStates", js.undefined)
      
      @scala.inline
      def setDateStatesVarargs(value: DateState*): Self = StObject.set(x, "dateStates", js.Array(value :_*))
      
      @scala.inline
      def setDefaultState(value: String): Self = StObject.set(x, "defaultState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultStateUndefined: Self = StObject.set(x, "defaultState", js.undefined)
      
      @scala.inline
      def setDisableNavigation(value: Boolean): Self = StObject.set(x, "disableNavigation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableNavigationUndefined: Self = StObject.set(x, "disableNavigation", js.undefined)
      
      @scala.inline
      def setFirstOfWeek(value: Double): Self = StObject.set(x, "firstOfWeek", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstOfWeekUndefined: Self = StObject.set(x, "firstOfWeek", js.undefined)
      
      @scala.inline
      def setHelpMessage(value: String): Self = StObject.set(x, "helpMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHelpMessageUndefined: Self = StObject.set(x, "helpMessage", js.undefined)
      
      @scala.inline
      def setInitialDate(value: Date): Self = StObject.set(x, "initialDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialDateUndefined: Self = StObject.set(x, "initialDate", js.undefined)
      
      @scala.inline
      def setInitialFromValue(value: Boolean): Self = StObject.set(x, "initialFromValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialFromValueUndefined: Self = StObject.set(x, "initialFromValue", js.undefined)
      
      @scala.inline
      def setInitialMonth(value: Double): Self = StObject.set(x, "initialMonth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialMonthUndefined: Self = StObject.set(x, "initialMonth", js.undefined)
      
      @scala.inline
      def setInitialRange(value: js.Object): Self = StObject.set(x, "initialRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialRangeUndefined: Self = StObject.set(x, "initialRange", js.undefined)
      
      @scala.inline
      def setInitialYear(value: Double): Self = StObject.set(x, "initialYear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialYearUndefined: Self = StObject.set(x, "initialYear", js.undefined)
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setMaximumDate(value: Date): Self = StObject.set(x, "maximumDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumDateUndefined: Self = StObject.set(x, "maximumDate", js.undefined)
      
      @scala.inline
      def setMinimumDate(value: Date): Self = StObject.set(x, "minimumDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimumDateUndefined: Self = StObject.set(x, "minimumDate", js.undefined)
      
      @scala.inline
      def setNumberOfCalendars(value: Double): Self = StObject.set(x, "numberOfCalendars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberOfCalendarsUndefined: Self = StObject.set(x, "numberOfCalendars", js.undefined)
      
      @scala.inline
      def setOnHighlightDate(value: /* date */ Date => Unit): Self = StObject.set(x, "onHighlightDate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnHighlightDateUndefined: Self = StObject.set(x, "onHighlightDate", js.undefined)
      
      @scala.inline
      def setOnHighlightRange(value: /* date */ Date => Unit): Self = StObject.set(x, "onHighlightRange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnHighlightRangeUndefined: Self = StObject.set(x, "onHighlightRange", js.undefined)
      
      @scala.inline
      def setOnSelectStart(value: /* value */ MomentRangeNoneinpundefin => Unit): Self = StObject.set(x, "onSelectStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSelectStartUndefined: Self = StObject.set(x, "onSelectStart", js.undefined)
      
      @scala.inline
      def setPaginationArrowComponent(
        value: (ComponentClass[PaginationArrowProps[js.Object], ComponentState]) | SFC[PaginationArrowProps[js.Object]]
      ): Self = StObject.set(x, "paginationArrowComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaginationArrowComponentUndefined: Self = StObject.set(x, "paginationArrowComponent", js.undefined)
      
      @scala.inline
      def setSelectedLabel(value: String): Self = StObject.set(x, "selectedLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedLabelUndefined: Self = StObject.set(x, "selectedLabel", js.undefined)
      
      @scala.inline
      def setShowLegend(value: Boolean): Self = StObject.set(x, "showLegend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowLegendUndefined: Self = StObject.set(x, "showLegend", js.undefined)
      
      @scala.inline
      def setSingleDateRange(value: Boolean): Self = StObject.set(x, "singleDateRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSingleDateRangeUndefined: Self = StObject.set(x, "singleDateRange", js.undefined)
      
      @scala.inline
      def setStateDefinitions(value: StateDefinitions): Self = StObject.set(x, "stateDefinitions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateDefinitionsUndefined: Self = StObject.set(x, "stateDefinitions", js.undefined)
      
      @scala.inline
      def setValue(value: MomentRangeNoneinpundefin | DateRange | Moment): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait DateRangePicker
    extends Component[Props[DateRangePicker], js.Object, js.Any]
  
  @js.native
  trait DateState extends StObject {
    
    var range: DateRange = js.native
    
    var state: String = js.native
  }
  object DateState {
    
    @scala.inline
    def apply(range: DateRange, state: String): DateState = {
      val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[DateState]
    }
    
    @scala.inline
    implicit class DateStateMutableBuilder[Self <: DateState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRange(value: DateRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OnSelectCallbackParam extends StObject {
    
    var end: Moment = js.native
    
    var start: Moment = js.native
  }
  object OnSelectCallbackParam {
    
    @scala.inline
    def apply(end: Moment, start: Moment): OnSelectCallbackParam = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnSelectCallbackParam]
    }
    
    @scala.inline
    implicit class OnSelectCallbackParamMutableBuilder[Self <: OnSelectCallbackParam] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: Moment): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: Moment): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PaginationArrowProps[T]
    extends typings.react.mod.Props[T] {
    
    var direction: js.UndefOr[next | previous] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var onTrigger: js.UndefOr[js.Function0[Unit]] = js.native
  }
  object PaginationArrowProps {
    
    @scala.inline
    def apply[T](): PaginationArrowProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaginationArrowProps[T]]
    }
    
    @scala.inline
    implicit class PaginationArrowPropsMutableBuilder[Self <: PaginationArrowProps[_], T] (val x: Self with PaginationArrowProps[T]) extends AnyVal {
      
      @scala.inline
      def setDirection(value: next | previous): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setOnTrigger(value: () => Unit): Self = StObject.set(x, "onTrigger", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnTriggerUndefined: Self = StObject.set(x, "onTrigger", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactDaterangePicker.mod.RangeProps[T]
    - typings.reactDaterangePicker.mod.SingleProps[T]
  */
  trait Props[T] extends StObject
  object Props {
    
    @scala.inline
    def RangeProps[T](): typings.reactDaterangePicker.mod.RangeProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.reactDaterangePicker.mod.RangeProps[T]]
    }
    
    @scala.inline
    def SingleProps[T](): typings.reactDaterangePicker.mod.SingleProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.reactDaterangePicker.mod.SingleProps[T]]
    }
  }
  
  @js.native
  trait RangeProps[T]
    extends BaseProps[T]
       with Props[T] {
    
    var onSelect: js.UndefOr[js.Function1[/* value */ OnSelectCallbackParam, Unit]] = js.native
    
    var selectionType: js.UndefOr[range] = js.native
  }
  object RangeProps {
    
    @scala.inline
    def apply[T](): RangeProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RangeProps[T]]
    }
    
    @scala.inline
    implicit class RangePropsMutableBuilder[Self <: RangeProps[_], T] (val x: Self with RangeProps[T]) extends AnyVal {
      
      @scala.inline
      def setOnSelect(value: /* value */ OnSelectCallbackParam => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      @scala.inline
      def setSelectionType(value: range): Self = StObject.set(x, "selectionType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionTypeUndefined: Self = StObject.set(x, "selectionType", js.undefined)
    }
  }
  
  @js.native
  trait SingleProps[T]
    extends BaseProps[T]
       with Props[T] {
    
    var onSelect: js.UndefOr[js.Function1[/* value */ Moment, Unit]] = js.native
    
    var selectionType: js.UndefOr[single] = js.native
  }
  object SingleProps {
    
    @scala.inline
    def apply[T](): SingleProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SingleProps[T]]
    }
    
    @scala.inline
    implicit class SinglePropsMutableBuilder[Self <: SingleProps[_], T] (val x: Self with SingleProps[T]) extends AnyVal {
      
      @scala.inline
      def setOnSelect(value: /* value */ Moment => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      @scala.inline
      def setSelectionType(value: single): Self = StObject.set(x, "selectionType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionTypeUndefined: Self = StObject.set(x, "selectionType", js.undefined)
    }
  }
  
  @js.native
  trait StateDefinition extends StObject {
    
    var color: String = js.native
    
    var label: String = js.native
    
    var selectable: js.UndefOr[Boolean] = js.native
  }
  object StateDefinition {
    
    @scala.inline
    def apply(color: String, label: String): StateDefinition = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[StateDefinition]
    }
    
    @scala.inline
    implicit class StateDefinitionMutableBuilder[Self <: StateDefinition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
    }
  }
  
  type StateDefinitions = StringDictionary[StateDefinition]
}
