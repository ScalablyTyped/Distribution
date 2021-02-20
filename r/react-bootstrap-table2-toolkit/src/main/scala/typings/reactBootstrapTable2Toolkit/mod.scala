package typings.reactBootstrapTable2Toolkit

import typings.react.mod.CSSProperties
import typings.react.mod.Context
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactBootstrapTable2Toolkit.anon.Bootstrap4
import typings.reactBootstrapTable2Toolkit.anon.Columns
import typings.reactBootstrapTable2Toolkit.anon.OnExport
import typings.reactBootstrapTableNext.mod.ColumnDescription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-bootstrap-table2-toolkit", JSImport.Default)
  @js.native
  def default(props: TableToolkitProps[_]): ReactElement | Null = js.native
  
  object CSVExport {
    
    @JSImport("react-bootstrap-table2-toolkit", "CSVExport.ExportCSVButton")
    @js.native
    def ExportCSVButton(props: ExportCSVButtonProps): ReactElement | Null = js.native
  }
  
  object ColumnToggle {
    
    @JSImport("react-bootstrap-table2-toolkit", "ColumnToggle.ToggleList")
    @js.native
    def ToggleList(props: ToggleListProps): ReactElement | Null = js.native
  }
  
  object Search {
    
    @JSImport("react-bootstrap-table2-toolkit", "Search.ClearSearchButton")
    @js.native
    def ClearSearchButton(props: ClearSearchButtonProps): ReactElement | Null = js.native
    
    @JSImport("react-bootstrap-table2-toolkit", "Search.SearchBar")
    @js.native
    def SearchBar(props: SearchBarProps): ReactElement | Null = js.native
  }
  
  @JSImport("react-bootstrap-table2-toolkit", "ToolkitContext")
  @js.native
  val ToolkitContext: Context[ToolkitContextType] = js.native
  
  @js.native
  trait CSVProps extends StObject {
    
    /**
      * default is text/plain;charset=utf-8
      */
    var blobType: js.UndefOr[String] = js.native
    
    var exportAll: js.UndefOr[Boolean] = js.native
    
    var fileName: js.UndefOr[String] = js.native
    
    var ignoreHeader: js.UndefOr[Boolean] = js.native
    
    var noAutoBOM: js.UndefOr[Boolean] = js.native
    
    var onlyExportFiltered: js.UndefOr[Boolean] = js.native
    
    var onlyExportSelection: js.UndefOr[Boolean] = js.native
    
    var separator: js.UndefOr[String] = js.native
  }
  object CSVProps {
    
    @scala.inline
    def apply(): CSVProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CSVProps]
    }
    
    @scala.inline
    implicit class CSVPropsMutableBuilder[Self <: CSVProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlobType(value: String): Self = StObject.set(x, "blobType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlobTypeUndefined: Self = StObject.set(x, "blobType", js.undefined)
      
      @scala.inline
      def setExportAll(value: Boolean): Self = StObject.set(x, "exportAll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExportAllUndefined: Self = StObject.set(x, "exportAll", js.undefined)
      
      @scala.inline
      def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
      
      @scala.inline
      def setIgnoreHeader(value: Boolean): Self = StObject.set(x, "ignoreHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreHeaderUndefined: Self = StObject.set(x, "ignoreHeader", js.undefined)
      
      @scala.inline
      def setNoAutoBOM(value: Boolean): Self = StObject.set(x, "noAutoBOM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoAutoBOMUndefined: Self = StObject.set(x, "noAutoBOM", js.undefined)
      
      @scala.inline
      def setOnlyExportFiltered(value: Boolean): Self = StObject.set(x, "onlyExportFiltered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnlyExportFilteredUndefined: Self = StObject.set(x, "onlyExportFiltered", js.undefined)
      
      @scala.inline
      def setOnlyExportSelection(value: Boolean): Self = StObject.set(x, "onlyExportSelection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnlyExportSelectionUndefined: Self = StObject.set(x, "onlyExportSelection", js.undefined)
      
      @scala.inline
      def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
    }
  }
  
  @js.native
  trait ClearSearchButtonProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var onClear: js.UndefOr[js.Function0[Unit]] = js.native
    
    var text: js.UndefOr[String] = js.native
  }
  object ClearSearchButtonProps {
    
    @scala.inline
    def apply(): ClearSearchButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClearSearchButtonProps]
    }
    
    @scala.inline
    implicit class ClearSearchButtonPropsMutableBuilder[Self <: ClearSearchButtonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setOnClear(value: () => Unit): Self = StObject.set(x, "onClear", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnClearUndefined: Self = StObject.set(x, "onClear", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  @js.native
  trait ExportCSVButtonProps extends StObject {
    
    var children: ReactNode = js.native
    
    var className: js.UndefOr[String] = js.native
    
    def onExport(): Unit = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object ExportCSVButtonProps {
    
    @scala.inline
    def apply(onExport: () => Unit): ExportCSVButtonProps = {
      val __obj = js.Dynamic.literal(onExport = js.Any.fromFunction0(onExport))
      __obj.asInstanceOf[ExportCSVButtonProps]
    }
    
    @scala.inline
    implicit class ExportCSVButtonPropsMutableBuilder[Self <: ExportCSVButtonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setOnExport(value: () => Unit): Self = StObject.set(x, "onExport", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  @js.native
  trait InjectedSearchProps extends StObject {
    
    def onClear(): Unit = js.native
    
    def onSearch(`val`: String): Unit = js.native
    
    var searchText: String = js.native
  }
  object InjectedSearchProps {
    
    @scala.inline
    def apply(onClear: () => Unit, onSearch: String => Unit, searchText: String): InjectedSearchProps = {
      val __obj = js.Dynamic.literal(onClear = js.Any.fromFunction0(onClear), onSearch = js.Any.fromFunction1(onSearch), searchText = searchText.asInstanceOf[js.Any])
      __obj.asInstanceOf[InjectedSearchProps]
    }
    
    @scala.inline
    implicit class InjectedSearchPropsMutableBuilder[Self <: InjectedSearchProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnClear(value: () => Unit): Self = StObject.set(x, "onClear", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnSearch(value: String => Unit): Self = StObject.set(x, "onSearch", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSearchText(value: String): Self = StObject.set(x, "searchText", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SearchBarProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var delay: js.UndefOr[Double] = js.native
    
    def onSearch(searchText: String): Unit = js.native
    
    var placeholder: js.UndefOr[String] = js.native
    
    var searchText: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var tableId: js.UndefOr[String] = js.native
  }
  object SearchBarProps {
    
    @scala.inline
    def apply(onSearch: String => Unit): SearchBarProps = {
      val __obj = js.Dynamic.literal(onSearch = js.Any.fromFunction1(onSearch))
      __obj.asInstanceOf[SearchBarProps]
    }
    
    @scala.inline
    implicit class SearchBarPropsMutableBuilder[Self <: SearchBarProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setOnSearch(value: String => Unit): Self = StObject.set(x, "onSearch", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setSearchText(value: String): Self = StObject.set(x, "searchText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchTextUndefined: Self = StObject.set(x, "searchText", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTableId(value: String): Self = StObject.set(x, "tableId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableIdUndefined: Self = StObject.set(x, "tableId", js.undefined)
    }
  }
  
  @js.native
  trait SearchMatchProps[T /* <: js.Object */] extends StObject {
    
    var column: ColumnDescription[T, _] = js.native
    
    var row: T = js.native
    
    var searchText: String = js.native
    
    var value: String = js.native
  }
  object SearchMatchProps {
    
    @scala.inline
    def apply[T /* <: js.Object */](column: ColumnDescription[T, _], row: T, searchText: String, value: String): SearchMatchProps[T] = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], searchText = searchText.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchMatchProps[T]]
    }
    
    @scala.inline
    implicit class SearchMatchPropsMutableBuilder[Self <: SearchMatchProps[_], T /* <: js.Object */] (val x: Self with SearchMatchProps[T]) extends AnyVal {
      
      @scala.inline
      def setColumn(value: ColumnDescription[T, _]): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRow(value: T): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchText(value: String): Self = StObject.set(x, "searchText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TableSearchProps[T /* <: js.Object */] extends StObject {
    
    var customMatchFunc: js.UndefOr[js.Function1[/* props */ SearchMatchProps[T], Boolean]] = js.native
    
    var defaultSearch: js.UndefOr[String] = js.native
    
    var onColumnMatch: js.UndefOr[js.Function1[/* props */ SearchMatchProps[T], Unit]] = js.native
    
    var placeholder: js.UndefOr[String] = js.native
    
    var searchFormatted: js.UndefOr[Boolean] = js.native
  }
  object TableSearchProps {
    
    @scala.inline
    def apply[T /* <: js.Object */](): TableSearchProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableSearchProps[T]]
    }
    
    @scala.inline
    implicit class TableSearchPropsMutableBuilder[Self <: TableSearchProps[_], T /* <: js.Object */] (val x: Self with TableSearchProps[T]) extends AnyVal {
      
      @scala.inline
      def setCustomMatchFunc(value: /* props */ SearchMatchProps[T] => Boolean): Self = StObject.set(x, "customMatchFunc", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCustomMatchFuncUndefined: Self = StObject.set(x, "customMatchFunc", js.undefined)
      
      @scala.inline
      def setDefaultSearch(value: String): Self = StObject.set(x, "defaultSearch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultSearchUndefined: Self = StObject.set(x, "defaultSearch", js.undefined)
      
      @scala.inline
      def setOnColumnMatch(value: /* props */ SearchMatchProps[T] => Unit): Self = StObject.set(x, "onColumnMatch", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnColumnMatchUndefined: Self = StObject.set(x, "onColumnMatch", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setSearchFormatted(value: Boolean): Self = StObject.set(x, "searchFormatted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchFormattedUndefined: Self = StObject.set(x, "searchFormatted", js.undefined)
    }
  }
  
  @js.native
  trait TableToolkitProps[T /* <: js.Object */] extends StObject {
    
    var bootstrap4: js.UndefOr[Boolean] = js.native
    
    def children(props: ToolkitContextType): Element = js.native
    
    var columnToggle: js.UndefOr[Boolean] = js.native
    
    var columns: js.Array[ColumnDescription[T, _]] = js.native
    
    var data: js.Array[T] = js.native
    
    var exportCSV: js.UndefOr[Boolean | CSVProps] = js.native
    
    var keyField: /* keyof T */ String = js.native
    
    var ref: js.UndefOr[js.Any] = js.native
    
    var search: js.UndefOr[TableSearchProps[T] | Boolean] = js.native
  }
  object TableToolkitProps {
    
    @scala.inline
    def apply[T /* <: js.Object */](
      children: ToolkitContextType => Element,
      columns: js.Array[ColumnDescription[T, _]],
      data: js.Array[T],
      keyField: /* keyof T */ String
    ): TableToolkitProps[T] = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), columns = columns.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], keyField = keyField.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableToolkitProps[T]]
    }
    
    @scala.inline
    implicit class TableToolkitPropsMutableBuilder[Self <: TableToolkitProps[_], T /* <: js.Object */] (val x: Self with TableToolkitProps[T]) extends AnyVal {
      
      @scala.inline
      def setBootstrap4(value: Boolean): Self = StObject.set(x, "bootstrap4", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBootstrap4Undefined: Self = StObject.set(x, "bootstrap4", js.undefined)
      
      @scala.inline
      def setChildren(value: ToolkitContextType => Element): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setColumnToggle(value: Boolean): Self = StObject.set(x, "columnToggle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnToggleUndefined: Self = StObject.set(x, "columnToggle", js.undefined)
      
      @scala.inline
      def setColumns(value: js.Array[ColumnDescription[T, _]]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsVarargs(value: (ColumnDescription[T, js.Any])*): Self = StObject.set(x, "columns", js.Array(value :_*))
      
      @scala.inline
      def setData(value: js.Array[T]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataVarargs(value: T*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setExportCSV(value: Boolean | CSVProps): Self = StObject.set(x, "exportCSV", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExportCSVUndefined: Self = StObject.set(x, "exportCSV", js.undefined)
      
      @scala.inline
      def setKeyField(value: /* keyof T */ String): Self = StObject.set(x, "keyField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRef(value: js.Any): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      @scala.inline
      def setSearch(value: TableSearchProps[T] | Boolean): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
    }
  }
  
  @js.native
  trait ToggleListProps extends StObject {
    
    var btnClassName: js.UndefOr[String] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var columns: js.Array[ColumnDescription[_, _]] = js.native
    
    var contextual: js.UndefOr[String] = js.native
    
    def onColumnToggle(dataField: String): Unit = js.native
    
    /**
      * array of toggled columns
      */
    var toggles: js.Array[Boolean] = js.native
  }
  object ToggleListProps {
    
    @scala.inline
    def apply(
      columns: js.Array[ColumnDescription[_, _]],
      onColumnToggle: String => Unit,
      toggles: js.Array[Boolean]
    ): ToggleListProps = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], onColumnToggle = js.Any.fromFunction1(onColumnToggle), toggles = toggles.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToggleListProps]
    }
    
    @scala.inline
    implicit class ToggleListPropsMutableBuilder[Self <: ToggleListProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBtnClassName(value: String): Self = StObject.set(x, "btnClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBtnClassNameUndefined: Self = StObject.set(x, "btnClassName", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setColumns(value: js.Array[ColumnDescription[_, _]]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsVarargs(value: (ColumnDescription[js.Any, js.Any])*): Self = StObject.set(x, "columns", js.Array(value :_*))
      
      @scala.inline
      def setContextual(value: String): Self = StObject.set(x, "contextual", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextualUndefined: Self = StObject.set(x, "contextual", js.undefined)
      
      @scala.inline
      def setOnColumnToggle(value: String => Unit): Self = StObject.set(x, "onColumnToggle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setToggles(value: js.Array[Boolean]): Self = StObject.set(x, "toggles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTogglesVarargs(value: Boolean*): Self = StObject.set(x, "toggles", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ToolkitContextType extends StObject {
    
    var baseProps: Bootstrap4 = js.native
    
    var columnToggleProps: Columns = js.native
    
    var csvProps: OnExport = js.native
    
    var searchProps: InjectedSearchProps = js.native
  }
  object ToolkitContextType {
    
    @scala.inline
    def apply(
      baseProps: Bootstrap4,
      columnToggleProps: Columns,
      csvProps: OnExport,
      searchProps: InjectedSearchProps
    ): ToolkitContextType = {
      val __obj = js.Dynamic.literal(baseProps = baseProps.asInstanceOf[js.Any], columnToggleProps = columnToggleProps.asInstanceOf[js.Any], csvProps = csvProps.asInstanceOf[js.Any], searchProps = searchProps.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToolkitContextType]
    }
    
    @scala.inline
    implicit class ToolkitContextTypeMutableBuilder[Self <: ToolkitContextType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBaseProps(value: Bootstrap4): Self = StObject.set(x, "baseProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnToggleProps(value: Columns): Self = StObject.set(x, "columnToggleProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCsvProps(value: OnExport): Self = StObject.set(x, "csvProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchProps(value: InjectedSearchProps): Self = StObject.set(x, "searchProps", value.asInstanceOf[js.Any])
    }
  }
}
