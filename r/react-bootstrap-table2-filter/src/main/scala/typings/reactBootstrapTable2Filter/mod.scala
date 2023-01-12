package typings.reactBootstrapTable2Filter

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.CSSProperties
import typings.react.mod.SyntheticEvent
import typings.reactBootstrapTable2Filter.anon.Date
import typings.reactBootstrapTable2Filter.anon.Label
import typings.reactBootstrapTable2Filter.anon.Number
import typings.reactBootstrapTable2Filter.anon.PartialMultiSelectFilterP
import typings.reactBootstrapTable2Filter.anon.PartialNumberFilterPropsa
import typings.reactBootstrapTable2Filter.anon.PartialSelectFilterPropsa
import typings.reactBootstrapTable2Filter.anon.PartialTextFilterPropsany
import typings.reactBootstrapTableNext.mod.ColumnDescription
import typings.reactBootstrapTableNext.mod.TableColumnFilterProps
import typings.std.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-bootstrap-table2-filter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Any]
  inline def default(props: FilterFactoryProps[Any]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @js.native
  sealed trait Comparator extends StObject
  @JSImport("react-bootstrap-table2-filter", "Comparator")
  @js.native
  object Comparator extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Comparator & String] = js.native
    
    @js.native
    sealed trait EQ
      extends StObject
         with Comparator
    /* "=" */ val EQ: typings.reactBootstrapTable2Filter.mod.Comparator.EQ & String = js.native
    
    @js.native
    sealed trait GE
      extends StObject
         with Comparator
    /* ">=" */ val GE: typings.reactBootstrapTable2Filter.mod.Comparator.GE & String = js.native
    
    @js.native
    sealed trait GT
      extends StObject
         with Comparator
    /* ">" */ val GT: typings.reactBootstrapTable2Filter.mod.Comparator.GT & String = js.native
    
    @js.native
    sealed trait LE
      extends StObject
         with Comparator
    /* "<=" */ val LE: typings.reactBootstrapTable2Filter.mod.Comparator.LE & String = js.native
    
    @js.native
    sealed trait LIKE
      extends StObject
         with Comparator
    /* "LIKE" */ val LIKE: typings.reactBootstrapTable2Filter.mod.Comparator.LIKE & String = js.native
    
    @js.native
    sealed trait LT
      extends StObject
         with Comparator
    /* "<" */ val LT: typings.reactBootstrapTable2Filter.mod.Comparator.LT & String = js.native
    
    @js.native
    sealed trait NE
      extends StObject
         with Comparator
    /* "!=" */ val NE: typings.reactBootstrapTable2Filter.mod.Comparator.NE & String = js.native
  }
  
  @js.native
  sealed trait FILTER_TYPES extends StObject
  @JSImport("react-bootstrap-table2-filter", "FILTER_TYPES")
  @js.native
  object FILTER_TYPES extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[FILTER_TYPES & String] = js.native
    
    @js.native
    sealed trait DATE
      extends StObject
         with FILTER_TYPES
    /* "DATE" */ val DATE: typings.reactBootstrapTable2Filter.mod.FILTER_TYPES.DATE & String = js.native
    
    @js.native
    sealed trait MULTISELECT
      extends StObject
         with FILTER_TYPES
    /* "MULTISELECT" */ val MULTISELECT: typings.reactBootstrapTable2Filter.mod.FILTER_TYPES.MULTISELECT & String = js.native
    
    @js.native
    sealed trait NUMBER
      extends StObject
         with FILTER_TYPES
    /* "NUMBER" */ val NUMBER: typings.reactBootstrapTable2Filter.mod.FILTER_TYPES.NUMBER & String = js.native
    
    @js.native
    sealed trait SELECT
      extends StObject
         with FILTER_TYPES
    /* "SELECT" */ val SELECT: typings.reactBootstrapTable2Filter.mod.FILTER_TYPES.SELECT & String = js.native
    
    @js.native
    sealed trait TEXT
      extends StObject
         with FILTER_TYPES
    /* "TEXT" */ val TEXT: typings.reactBootstrapTable2Filter.mod.FILTER_TYPES.TEXT & String = js.native
  }
  
  inline def customFilter(props: CustomFilterProps): TableColumnFilterProps[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("customFilter")(props.asInstanceOf[js.Any]).asInstanceOf[TableColumnFilterProps[Any, Any]]
  
  inline def dateFilter(props: DateFilterProps[Any]): TableColumnFilterProps[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("dateFilter")(props.asInstanceOf[js.Any]).asInstanceOf[TableColumnFilterProps[Any, Any]]
  
  inline def multiSelectFilter(props: PartialMultiSelectFilterP): TableColumnFilterProps[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("multiSelectFilter")(props.asInstanceOf[js.Any]).asInstanceOf[TableColumnFilterProps[Any, Any]]
  
  inline def numberFilter(props: PartialNumberFilterPropsa): TableColumnFilterProps[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("numberFilter")(props.asInstanceOf[js.Any]).asInstanceOf[TableColumnFilterProps[Any, Any]]
  
  inline def selectFilter(props: PartialSelectFilterPropsa): TableColumnFilterProps[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("selectFilter")(props.asInstanceOf[js.Any]).asInstanceOf[TableColumnFilterProps[Any, Any]]
  
  inline def textFilter(): TableColumnFilterProps[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("textFilter")().asInstanceOf[TableColumnFilterProps[Any, Any]]
  inline def textFilter(props: PartialTextFilterPropsany): TableColumnFilterProps[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("textFilter")(props.asInstanceOf[js.Any]).asInstanceOf[TableColumnFilterProps[Any, Any]]
  
  trait CustomFilterProps extends StObject {
    
    var caseSensitive: js.UndefOr[Boolean] = js.undefined
    
    var comparator: js.UndefOr[Comparator] = js.undefined
    
    var `type`: js.UndefOr[String | FILTER_TYPES] = js.undefined
  }
  object CustomFilterProps {
    
    inline def apply(): CustomFilterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomFilterProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CustomFilterProps] (val x: Self) extends AnyVal {
      
      inline def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
      
      inline def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
      
      inline def setComparator(value: Comparator): Self = StObject.set(x, "comparator", value.asInstanceOf[js.Any])
      
      inline def setComparatorUndefined: Self = StObject.set(x, "comparator", js.undefined)
      
      inline def setType(value: String | FILTER_TYPES): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait DateFilterProps[T /* <: js.Object */]
    extends StObject
       with TableColumnFilterProps[js.Date, T] {
    
    var comparatorClassName: js.UndefOr[String] = js.undefined
    
    var comparatorStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var comparators: js.UndefOr[js.Array[Comparator]] = js.undefined
    
    var dateClassName: js.UndefOr[String] = js.undefined
    
    var dateStyle: js.UndefOr[CSSProperties] = js.undefined
    
    @JSName("defaultValue")
    var defaultValue_DateFilterProps: js.UndefOr[Date] = js.undefined
    
    var withoutEmptyComparatorOption: js.UndefOr[Boolean] = js.undefined
  }
  object DateFilterProps {
    
    inline def apply[T /* <: js.Object */](): DateFilterProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DateFilterProps[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DateFilterProps[?], T /* <: js.Object */] (val x: Self & DateFilterProps[T]) extends AnyVal {
      
      inline def setComparatorClassName(value: String): Self = StObject.set(x, "comparatorClassName", value.asInstanceOf[js.Any])
      
      inline def setComparatorClassNameUndefined: Self = StObject.set(x, "comparatorClassName", js.undefined)
      
      inline def setComparatorStyle(value: CSSProperties): Self = StObject.set(x, "comparatorStyle", value.asInstanceOf[js.Any])
      
      inline def setComparatorStyleUndefined: Self = StObject.set(x, "comparatorStyle", js.undefined)
      
      inline def setComparators(value: js.Array[Comparator]): Self = StObject.set(x, "comparators", value.asInstanceOf[js.Any])
      
      inline def setComparatorsUndefined: Self = StObject.set(x, "comparators", js.undefined)
      
      inline def setComparatorsVarargs(value: Comparator*): Self = StObject.set(x, "comparators", js.Array(value*))
      
      inline def setDateClassName(value: String): Self = StObject.set(x, "dateClassName", value.asInstanceOf[js.Any])
      
      inline def setDateClassNameUndefined: Self = StObject.set(x, "dateClassName", js.undefined)
      
      inline def setDateStyle(value: CSSProperties): Self = StObject.set(x, "dateStyle", value.asInstanceOf[js.Any])
      
      inline def setDateStyleUndefined: Self = StObject.set(x, "dateStyle", js.undefined)
      
      inline def setDefaultValue(value: Date): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setWithoutEmptyComparatorOption(value: Boolean): Self = StObject.set(x, "withoutEmptyComparatorOption", value.asInstanceOf[js.Any])
      
      inline def setWithoutEmptyComparatorOptionUndefined: Self = StObject.set(x, "withoutEmptyComparatorOption", js.undefined)
    }
  }
  
  trait FilterFactoryProps[T /* <: js.Object */] extends StObject {
    
    // TODO newFilters is not tested not its type is validated since the author of this commit has no experience with this field
    var afterFilter: js.UndefOr[
        js.Function2[/* newResult */ js.Array[T], /* newFilters */ js.UndefOr[js.Array[Any]], Unit]
      ] = js.undefined
  }
  object FilterFactoryProps {
    
    inline def apply[T /* <: js.Object */](): FilterFactoryProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FilterFactoryProps[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FilterFactoryProps[?], T /* <: js.Object */] (val x: Self & FilterFactoryProps[T]) extends AnyVal {
      
      inline def setAfterFilter(value: (/* newResult */ js.Array[T], /* newFilters */ js.UndefOr[js.Array[Any]]) => Unit): Self = StObject.set(x, "afterFilter", js.Any.fromFunction2(value))
      
      inline def setAfterFilterUndefined: Self = StObject.set(x, "afterFilter", js.undefined)
    }
  }
  
  type MultiSelectFilterOptions = StringDictionary[String]
  
  trait MultiSelectFilterProps[T /* <: js.Object */]
    extends StObject
       with TableColumnFilterProps[js.Array[String], T] {
    
    var comparator: js.UndefOr[Comparator] = js.undefined
    
    var options: MultiSelectFilterOptions | js.Function0[MultiSelectFilterOptions]
    
    /**
      * When set the default selection is hidden from dropdown
      */
    var withoutEmptyOption: js.UndefOr[Boolean] = js.undefined
  }
  object MultiSelectFilterProps {
    
    inline def apply[T /* <: js.Object */](options: MultiSelectFilterOptions | js.Function0[MultiSelectFilterOptions]): MultiSelectFilterProps[T] = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[MultiSelectFilterProps[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MultiSelectFilterProps[?], T /* <: js.Object */] (val x: Self & MultiSelectFilterProps[T]) extends AnyVal {
      
      inline def setComparator(value: Comparator): Self = StObject.set(x, "comparator", value.asInstanceOf[js.Any])
      
      inline def setComparatorUndefined: Self = StObject.set(x, "comparator", js.undefined)
      
      inline def setOptions(value: MultiSelectFilterOptions | js.Function0[MultiSelectFilterOptions]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsFunction0(value: () => MultiSelectFilterOptions): Self = StObject.set(x, "options", js.Any.fromFunction0(value))
      
      inline def setWithoutEmptyOption(value: Boolean): Self = StObject.set(x, "withoutEmptyOption", value.asInstanceOf[js.Any])
      
      inline def setWithoutEmptyOptionUndefined: Self = StObject.set(x, "withoutEmptyOption", js.undefined)
    }
  }
  
  trait NumberFilterProps[T /* <: js.Object */]
    extends StObject
       with TableColumnFilterProps[typings.reactBootstrapTable2Filter.anon.Comparator, T] {
    
    var comparatorClassName: js.UndefOr[String] = js.undefined
    
    var comparatorStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var comparators: js.UndefOr[js.Array[Comparator]] = js.undefined
    
    @JSName("defaultValue")
    var defaultValue_NumberFilterProps: js.UndefOr[Number] = js.undefined
    
    var numberClassName: js.UndefOr[String] = js.undefined
    
    var numberStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var options: js.UndefOr[js.Array[Double]] = js.undefined
    
    /**
      * When set to true comparator dropdown does not show a "no selection" option
      */
    var withoutEmptyComparatorOption: js.UndefOr[Boolean] = js.undefined
    
    var withoutEmptyNumberOption: js.UndefOr[Boolean] = js.undefined
  }
  object NumberFilterProps {
    
    inline def apply[T /* <: js.Object */](): NumberFilterProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NumberFilterProps[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NumberFilterProps[?], T /* <: js.Object */] (val x: Self & NumberFilterProps[T]) extends AnyVal {
      
      inline def setComparatorClassName(value: String): Self = StObject.set(x, "comparatorClassName", value.asInstanceOf[js.Any])
      
      inline def setComparatorClassNameUndefined: Self = StObject.set(x, "comparatorClassName", js.undefined)
      
      inline def setComparatorStyle(value: CSSProperties): Self = StObject.set(x, "comparatorStyle", value.asInstanceOf[js.Any])
      
      inline def setComparatorStyleUndefined: Self = StObject.set(x, "comparatorStyle", js.undefined)
      
      inline def setComparators(value: js.Array[Comparator]): Self = StObject.set(x, "comparators", value.asInstanceOf[js.Any])
      
      inline def setComparatorsUndefined: Self = StObject.set(x, "comparators", js.undefined)
      
      inline def setComparatorsVarargs(value: Comparator*): Self = StObject.set(x, "comparators", js.Array(value*))
      
      inline def setDefaultValue(value: Number): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setNumberClassName(value: String): Self = StObject.set(x, "numberClassName", value.asInstanceOf[js.Any])
      
      inline def setNumberClassNameUndefined: Self = StObject.set(x, "numberClassName", js.undefined)
      
      inline def setNumberStyle(value: CSSProperties): Self = StObject.set(x, "numberStyle", value.asInstanceOf[js.Any])
      
      inline def setNumberStyleUndefined: Self = StObject.set(x, "numberStyle", js.undefined)
      
      inline def setOptions(value: js.Array[Double]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setOptionsVarargs(value: Double*): Self = StObject.set(x, "options", js.Array(value*))
      
      inline def setWithoutEmptyComparatorOption(value: Boolean): Self = StObject.set(x, "withoutEmptyComparatorOption", value.asInstanceOf[js.Any])
      
      inline def setWithoutEmptyComparatorOptionUndefined: Self = StObject.set(x, "withoutEmptyComparatorOption", js.undefined)
      
      inline def setWithoutEmptyNumberOption(value: Boolean): Self = StObject.set(x, "withoutEmptyNumberOption", value.asInstanceOf[js.Any])
      
      inline def setWithoutEmptyNumberOptionUndefined: Self = StObject.set(x, "withoutEmptyNumberOption", js.undefined)
    }
  }
  
  type SelectFilterOptions = StringDictionary[String] | js.Array[Label]
  
  trait SelectFilterProps[T /* <: js.Object */]
    extends StObject
       with TableColumnFilterProps[String, T] {
    
    var comparator: js.UndefOr[Comparator] = js.undefined
    
    var options: SelectFilterOptions | (js.Function1[/* column */ ColumnDescription[T, Any], SelectFilterOptions])
    
    /**
      * When the default unset selection is hidden from dropdown
      */
    var withoutEmptyOption: js.UndefOr[Boolean] = js.undefined
  }
  object SelectFilterProps {
    
    inline def apply[T /* <: js.Object */](
      options: SelectFilterOptions | (js.Function1[/* column */ ColumnDescription[T, Any], SelectFilterOptions])
    ): SelectFilterProps[T] = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectFilterProps[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SelectFilterProps[?], T /* <: js.Object */] (val x: Self & SelectFilterProps[T]) extends AnyVal {
      
      inline def setComparator(value: Comparator): Self = StObject.set(x, "comparator", value.asInstanceOf[js.Any])
      
      inline def setComparatorUndefined: Self = StObject.set(x, "comparator", js.undefined)
      
      inline def setOptions(
        value: SelectFilterOptions | (js.Function1[/* column */ ColumnDescription[T, Any], SelectFilterOptions])
      ): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsFunction1(value: /* column */ ColumnDescription[T, Any] => SelectFilterOptions): Self = StObject.set(x, "options", js.Any.fromFunction1(value))
      
      inline def setOptionsVarargs(value: Label*): Self = StObject.set(x, "options", js.Array(value*))
      
      inline def setWithoutEmptyOption(value: Boolean): Self = StObject.set(x, "withoutEmptyOption", value.asInstanceOf[js.Any])
      
      inline def setWithoutEmptyOptionUndefined: Self = StObject.set(x, "withoutEmptyOption", js.undefined)
    }
  }
  
  /* Inlined react-bootstrap-table-next.react-bootstrap-table-next.TableColumnFilterProps<string, T> & std.Partial<{  caseSensitive :boolean,   comparator :react-bootstrap-table2-filter.react-bootstrap-table2-filter.Comparator,   onClick :(e : react.react.SyntheticEvent<std.Element, std.Event>): void | undefined}> */
  trait TextFilterProps[T /* <: js.Object */] extends StObject {
    
    var caseSensitive: js.UndefOr[Boolean] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var comparator: js.UndefOr[Comparator] = js.undefined
    
    var defaultValue: js.UndefOr[Any] = js.undefined
    
    var delay: js.UndefOr[Double] = js.undefined
    
    var getFilter: js.UndefOr[
        js.Function1[/* filter */ js.Function1[/* value */ String, Unit | js.Array[T]], Unit]
      ] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var onClick: js.UndefOr[js.Function1[/* e */ SyntheticEvent[Element, Event], Unit]] = js.undefined
    
    var onFilter: js.UndefOr[js.Function1[/* filterValue */ String, Unit | js.Array[T]]] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object TextFilterProps {
    
    inline def apply[T /* <: js.Object */](): TextFilterProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextFilterProps[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TextFilterProps[?], T /* <: js.Object */] (val x: Self & TextFilterProps[T]) extends AnyVal {
      
      inline def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
      
      inline def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setComparator(value: Comparator): Self = StObject.set(x, "comparator", value.asInstanceOf[js.Any])
      
      inline def setComparatorUndefined: Self = StObject.set(x, "comparator", js.undefined)
      
      inline def setDefaultValue(value: Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setGetFilter(value: /* filter */ js.Function1[/* value */ String, Unit | js.Array[T]] => Unit): Self = StObject.set(x, "getFilter", js.Any.fromFunction1(value))
      
      inline def setGetFilterUndefined: Self = StObject.set(x, "getFilter", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setOnClick(value: /* e */ SyntheticEvent[Element, Event] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnFilter(value: /* filterValue */ String => Unit | js.Array[T]): Self = StObject.set(x, "onFilter", js.Any.fromFunction1(value))
      
      inline def setOnFilterUndefined: Self = StObject.set(x, "onFilter", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
