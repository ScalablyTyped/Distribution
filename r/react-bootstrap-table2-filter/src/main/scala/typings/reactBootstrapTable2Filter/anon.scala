package typings.reactBootstrapTable2Filter

import typings.react.mod.CSSProperties
import typings.react.mod.SyntheticEvent
import typings.reactBootstrapTable2Filter.mod.MultiSelectFilterOptions
import typings.reactBootstrapTable2Filter.mod.SelectFilterOptions
import typings.reactBootstrapTableNext.mod.ColumnDescription
import typings.reactBootstrapTableNext.mod.TableColumnFilterProps
import typings.std.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Comparator extends StObject {
    
    var comparator: typings.reactBootstrapTable2Filter.mod.Comparator
    
    var number: Double
  }
  object Comparator {
    
    @scala.inline
    def apply(comparator: typings.reactBootstrapTable2Filter.mod.Comparator, number: Double): Comparator = {
      val __obj = js.Dynamic.literal(comparator = comparator.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
      __obj.asInstanceOf[Comparator]
    }
    
    @scala.inline
    implicit class ComparatorMutableBuilder[Self <: Comparator] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComparator(value: typings.reactBootstrapTable2Filter.mod.Comparator): Self = StObject.set(x, "comparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    }
  }
  
  trait Date extends StObject {
    
    var comparator: typings.reactBootstrapTable2Filter.mod.Comparator
    
    var date: typings.std.Date
  }
  object Date {
    
    @scala.inline
    def apply(comparator: typings.reactBootstrapTable2Filter.mod.Comparator, date: typings.std.Date): Date = {
      val __obj = js.Dynamic.literal(comparator = comparator.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any])
      __obj.asInstanceOf[Date]
    }
    
    @scala.inline
    implicit class DateMutableBuilder[Self <: Date] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComparator(value: typings.reactBootstrapTable2Filter.mod.Comparator): Self = StObject.set(x, "comparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDate(value: typings.std.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    }
  }
  
  trait Label extends StObject {
    
    var label: String
    
    var value: Double
  }
  object Label {
    
    @scala.inline
    def apply(label: String, value: Double): Label = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Label]
    }
    
    @scala.inline
    implicit class LabelMutableBuilder[Self <: Label] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<react-bootstrap-table2-filter.react-bootstrap-table2-filter.MultiSelectFilterProps<any>> */
  trait PartialMultiSelectFilterP extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var comparator: js.UndefOr[typings.reactBootstrapTable2Filter.mod.Comparator] = js.undefined
    
    var defaultValue: js.UndefOr[js.Any] = js.undefined
    
    var delay: js.UndefOr[Double] = js.undefined
    
    var getFilter: js.UndefOr[js.Function1[/* filter */ String, Unit]] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var onFilter: js.UndefOr[js.Function1[/* filterValue */ String, Unit | js.Array[js.Any]]] = js.undefined
    
    var options: js.UndefOr[MultiSelectFilterOptions | js.Function0[MultiSelectFilterOptions]] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var withoutEmptyOption: js.UndefOr[Boolean] = js.undefined
  }
  object PartialMultiSelectFilterP {
    
    @scala.inline
    def apply(): PartialMultiSelectFilterP = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMultiSelectFilterP]
    }
    
    @scala.inline
    implicit class PartialMultiSelectFilterPMutableBuilder[Self <: PartialMultiSelectFilterP] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setComparator(value: typings.reactBootstrapTable2Filter.mod.Comparator): Self = StObject.set(x, "comparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComparatorUndefined: Self = StObject.set(x, "comparator", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: js.Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setGetFilter(value: /* filter */ String => Unit): Self = StObject.set(x, "getFilter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetFilterUndefined: Self = StObject.set(x, "getFilter", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setOnFilter(value: /* filterValue */ String => Unit | js.Array[js.Any]): Self = StObject.set(x, "onFilter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFilterUndefined: Self = StObject.set(x, "onFilter", js.undefined)
      
      @scala.inline
      def setOptions(value: MultiSelectFilterOptions | js.Function0[MultiSelectFilterOptions]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsFunction0(value: () => MultiSelectFilterOptions): Self = StObject.set(x, "options", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setWithoutEmptyOption(value: Boolean): Self = StObject.set(x, "withoutEmptyOption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithoutEmptyOptionUndefined: Self = StObject.set(x, "withoutEmptyOption", js.undefined)
    }
  }
  
  /* Inlined std.Partial<react-bootstrap-table2-filter.react-bootstrap-table2-filter.NumberFilterProps<any>> */
  trait PartialNumberFilterPropsa extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var comparatorClassName: js.UndefOr[String] = js.undefined
    
    var comparatorStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var comparators: js.UndefOr[js.Array[typings.reactBootstrapTable2Filter.mod.Comparator]] = js.undefined
    
    var defaultValue: js.UndefOr[Comparator] = js.undefined
    
    var delay: js.UndefOr[Double] = js.undefined
    
    var getFilter: js.UndefOr[js.Function1[/* filter */ TableColumnFilterProps[js.Any, js.Any], Unit]] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var numberClassName: js.UndefOr[String] = js.undefined
    
    var numberStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var onFilter: js.UndefOr[
        js.Function1[/* filterValue */ TableColumnFilterProps[js.Any, js.Any], Unit | js.Array[js.Any]]
      ] = js.undefined
    
    var options: js.UndefOr[js.Array[Double]] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var withoutEmptyComparatorOption: js.UndefOr[Boolean] = js.undefined
    
    var withoutEmptyNumberOption: js.UndefOr[Boolean] = js.undefined
  }
  object PartialNumberFilterPropsa {
    
    @scala.inline
    def apply(): PartialNumberFilterPropsa = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialNumberFilterPropsa]
    }
    
    @scala.inline
    implicit class PartialNumberFilterPropsaMutableBuilder[Self <: PartialNumberFilterPropsa] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setComparatorClassName(value: String): Self = StObject.set(x, "comparatorClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComparatorClassNameUndefined: Self = StObject.set(x, "comparatorClassName", js.undefined)
      
      @scala.inline
      def setComparatorStyle(value: CSSProperties): Self = StObject.set(x, "comparatorStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComparatorStyleUndefined: Self = StObject.set(x, "comparatorStyle", js.undefined)
      
      @scala.inline
      def setComparators(value: js.Array[typings.reactBootstrapTable2Filter.mod.Comparator]): Self = StObject.set(x, "comparators", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComparatorsUndefined: Self = StObject.set(x, "comparators", js.undefined)
      
      @scala.inline
      def setComparatorsVarargs(value: typings.reactBootstrapTable2Filter.mod.Comparator*): Self = StObject.set(x, "comparators", js.Array(value :_*))
      
      @scala.inline
      def setDefaultValue(value: Comparator): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setGetFilter(value: /* filter */ TableColumnFilterProps[js.Any, js.Any] => Unit): Self = StObject.set(x, "getFilter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetFilterUndefined: Self = StObject.set(x, "getFilter", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setNumberClassName(value: String): Self = StObject.set(x, "numberClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberClassNameUndefined: Self = StObject.set(x, "numberClassName", js.undefined)
      
      @scala.inline
      def setNumberStyle(value: CSSProperties): Self = StObject.set(x, "numberStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberStyleUndefined: Self = StObject.set(x, "numberStyle", js.undefined)
      
      @scala.inline
      def setOnFilter(value: /* filterValue */ TableColumnFilterProps[js.Any, js.Any] => Unit | js.Array[js.Any]): Self = StObject.set(x, "onFilter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFilterUndefined: Self = StObject.set(x, "onFilter", js.undefined)
      
      @scala.inline
      def setOptions(value: js.Array[Double]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setOptionsVarargs(value: Double*): Self = StObject.set(x, "options", js.Array(value :_*))
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setWithoutEmptyComparatorOption(value: Boolean): Self = StObject.set(x, "withoutEmptyComparatorOption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithoutEmptyComparatorOptionUndefined: Self = StObject.set(x, "withoutEmptyComparatorOption", js.undefined)
      
      @scala.inline
      def setWithoutEmptyNumberOption(value: Boolean): Self = StObject.set(x, "withoutEmptyNumberOption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithoutEmptyNumberOptionUndefined: Self = StObject.set(x, "withoutEmptyNumberOption", js.undefined)
    }
  }
  
  /* Inlined std.Partial<react-bootstrap-table2-filter.react-bootstrap-table2-filter.SelectFilterProps<any>> */
  trait PartialSelectFilterPropsa extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var comparator: js.UndefOr[typings.reactBootstrapTable2Filter.mod.Comparator] = js.undefined
    
    var defaultValue: js.UndefOr[js.Any] = js.undefined
    
    var delay: js.UndefOr[Double] = js.undefined
    
    var getFilter: js.UndefOr[js.Function1[/* filter */ String, Unit]] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var onFilter: js.UndefOr[js.Function1[/* filterValue */ String, Unit | js.Array[js.Any]]] = js.undefined
    
    var options: js.UndefOr[
        SelectFilterOptions | (js.Function1[/* column */ ColumnDescription[js.Any, js.Any], SelectFilterOptions])
      ] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var withoutEmptyOption: js.UndefOr[Boolean] = js.undefined
  }
  object PartialSelectFilterPropsa {
    
    @scala.inline
    def apply(): PartialSelectFilterPropsa = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialSelectFilterPropsa]
    }
    
    @scala.inline
    implicit class PartialSelectFilterPropsaMutableBuilder[Self <: PartialSelectFilterPropsa] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setComparator(value: typings.reactBootstrapTable2Filter.mod.Comparator): Self = StObject.set(x, "comparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComparatorUndefined: Self = StObject.set(x, "comparator", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: js.Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setGetFilter(value: /* filter */ String => Unit): Self = StObject.set(x, "getFilter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetFilterUndefined: Self = StObject.set(x, "getFilter", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setOnFilter(value: /* filterValue */ String => Unit | js.Array[js.Any]): Self = StObject.set(x, "onFilter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFilterUndefined: Self = StObject.set(x, "onFilter", js.undefined)
      
      @scala.inline
      def setOptions(
        value: SelectFilterOptions | (js.Function1[/* column */ ColumnDescription[js.Any, js.Any], SelectFilterOptions])
      ): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsFunction1(value: /* column */ ColumnDescription[js.Any, js.Any] => SelectFilterOptions): Self = StObject.set(x, "options", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setOptionsVarargs(value: Label*): Self = StObject.set(x, "options", js.Array(value :_*))
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setWithoutEmptyOption(value: Boolean): Self = StObject.set(x, "withoutEmptyOption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithoutEmptyOptionUndefined: Self = StObject.set(x, "withoutEmptyOption", js.undefined)
    }
  }
  
  /* Inlined std.Partial<react-bootstrap-table2-filter.react-bootstrap-table2-filter.TextFilterProps<any>> */
  trait PartialTextFilterPropsany extends StObject {
    
    var caseSensitive: js.UndefOr[Boolean] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var comparator: js.UndefOr[typings.reactBootstrapTable2Filter.mod.Comparator] = js.undefined
    
    var defaultValue: js.UndefOr[js.Any] = js.undefined
    
    var delay: js.UndefOr[Double] = js.undefined
    
    var getFilter: js.UndefOr[js.Function1[/* filter */ TableColumnFilterProps[js.Any, js.Any], Unit]] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var onClick: js.UndefOr[js.Function1[/* e */ SyntheticEvent[Element, Event], Unit]] = js.undefined
    
    var onFilter: js.UndefOr[
        js.Function1[/* filterValue */ TableColumnFilterProps[js.Any, js.Any], Unit | js.Array[js.Any]]
      ] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object PartialTextFilterPropsany {
    
    @scala.inline
    def apply(): PartialTextFilterPropsany = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialTextFilterPropsany]
    }
    
    @scala.inline
    implicit class PartialTextFilterPropsanyMutableBuilder[Self <: PartialTextFilterPropsany] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setComparator(value: typings.reactBootstrapTable2Filter.mod.Comparator): Self = StObject.set(x, "comparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComparatorUndefined: Self = StObject.set(x, "comparator", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: js.Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setGetFilter(value: /* filter */ TableColumnFilterProps[js.Any, js.Any] => Unit): Self = StObject.set(x, "getFilter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetFilterUndefined: Self = StObject.set(x, "getFilter", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setOnClick(value: /* e */ SyntheticEvent[Element, Event] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnFilter(value: /* filterValue */ TableColumnFilterProps[js.Any, js.Any] => Unit | js.Array[js.Any]): Self = StObject.set(x, "onFilter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFilterUndefined: Self = StObject.set(x, "onFilter", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
