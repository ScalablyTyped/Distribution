package typings.reactBootstrapTable.mod

import typings.react.mod.CSSProperties
import typings.react.mod.Props
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BootstrapTableProps extends Props[BootstrapTable] {
  
  /**
    * Automatically collapses open rows when doing a sort/filter/search action if those options have been specified.
    * Is an object with three possible fields: sort, filter, search. Each field is a flag to specify whether that
    * action type should cause expanded rows to close. All three fields default to false.
    */
  var autoCollapse: js.UndefOr[typings.reactBootstrapTable.anon.Filter] = js.native
  
  /**
    * Add your own class names on the react-bs-container-body class
    */
  var bodyContainerClass: js.UndefOr[String] = js.native
  
  /**
    * Add css styles to the react-bs-container-body class.
    */
  var bodyStyle: js.UndefOr[CSSProperties] = js.native
  
  /**
    * Become a borderless table by setting bordered to false, default is true.
    */
  var bordered: js.UndefOr[Boolean] = js.native
  
  /**
    * Enable cell editing on table. cellEdit accept an object which have the following properties
    */
  var cellEdit: js.UndefOr[CellEdit[_]] = js.native
  
  /**
    * Enable column filter by setting columnFilter to true, default is false.
    * If enabled, there're input text field per column under the table, user can input your filter condition by each column.
    */
  var columnFilter: js.UndefOr[Boolean] = js.native
  
  /**
    * Enable condensed by setting condensed to true. Same as Bootstrap table class .table-condensed, default is false.
    */
  var condensed: js.UndefOr[Boolean] = js.native
  
  /**
    * Add your own class names on the react-bs-table-container class
    */
  var containerClass: js.UndefOr[String] = js.native
  
  /**
    * Add css styles to the react-bs-table-container class.
    * For example: containerStyle={ { background: '#00ff00' } }
    */
  var containerStyle: js.UndefOr[CSSProperties] = js.native
  
  /**
    * Set CSV filename (e.g. items.csv). Default is spreadsheet.csv
    */
  var csvFileName: js.UndefOr[String | js.Function0[String]] = js.native
  
  /**
    * Use data to specify the data that you want to display on table.
    */
  var data: js.Array[js.Object] = js.native
  
  /**
    * Enable row deletion by setting deleteRow to true, default is false.
    * If you enable row deletion, there's a button on the upper left side of table.
    */
  var deleteRow: js.UndefOr[Boolean] = js.native
  
  /**
    * Disable writing the header row when exporting to a CSV file.
    */
  var excludeCSVHeader: js.UndefOr[Boolean] = js.native
  
  /**
    * Assign some alternative options for expand row feature, expandColumnOptions
    * only have four available property currently.
    */
  var expandColumnOptions: js.UndefOr[ExpandColumnOptions] = js.native
  
  /**
    * Tell react-bootstrap-table what's content should be rendered in the expanding
    * content. This props accept a callback function and is suppose to be return JSX
    * or String.
    * expandComponent is always used with expandableRow, both of props are enable
    * the expand row functionality on table.
    */
  var expandComponent: js.UndefOr[js.Function1[/* row */ js.Any, String | ReactElement]] = js.native
  
  /**
    * Tell react-bootstrap-table which rows are able to expand. This prop accepts
    * a callback function and is suppose to be return an Array of row keys.
    * expandableRow is always used with expandComponent, both of props are enable
    * the expand row functionality on table.
    */
  var expandableRow: js.UndefOr[js.Function1[/* row */ js.Any, Boolean]] = js.native
  
  /**
    * Enable export csv function, default is false.
    * If you enable, there's a button on the upper left side of table.
    */
  var exportCSV: js.UndefOr[Boolean] = js.native
  
  /**
    * Used to specify the total number of rows (matching current filter/sort/size per page) in a remote data source.
    * Documented in examples, but missing from the main docs. Essential for remote data pagination calculations.
    */
  var fetchInfo: js.UndefOr[FetchInfo] = js.native
  
  /**
    * Add a footer to the table.
    */
  var footer: js.UndefOr[Boolean] = js.native
  
  /**
    * Data for the table footer. Format is an array of footer rows, each containing an array of column footer data.
    */
  var footerData: js.UndefOr[js.Array[js.Array[FooterData]]] = js.native
  
  /**
    * Add your own class names on the react-bs-container-header class
    */
  var headerContainerClass: js.UndefOr[String] = js.native
  
  /**
    * Add css styles to the react-bs-container-header class.
    */
  var headerStyle: js.UndefOr[CSSProperties] = js.native
  
  /**
    * Use height to set the height of table, default is 100%. The string needs to have a unit, e.g. 'px', '%'.
    */
  var height: js.UndefOr[String] = js.native
  
  /**
    * Enable hover by setting hover to true. Same as Bootstrap table class .table-hover, default is false.
    */
  var hover: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, it will hide the pagination if there is only one page, default is false.
    */
  var ignoreSinglePage: js.UndefOr[Boolean] = js.native
  
  /**
    * Enable row insertion by setting insertRow to true, default is false.
    * If you enable row insertion, there's a button on the upper left side of table.
    */
  var insertRow: js.UndefOr[Boolean] = js.native
  
  /**
    * This prop will enable/disable the keyboard navigation cell by cell on table. This is new
    * feature from 3.0.0. Default is false. You can have a basic and simple keyboard navigation
    * feature on table by enabling keyBoardNav on BootstrapTable. For the usage of keyboard
    * navigation is you can click any cell to focus in or use ⬅ ⬆ ⬇ ➡ to natigate the cell.
    *
    * But if you want more advance features for keyboard navigation or to integrate with cell
    * editing, expand row or selection row, you may get interested to see how they work well
    * together: In the advance cases, you need to configure keyBoardNav as an object.
    */
  var keyBoardNav: js.UndefOr[Boolean | KeyboardNavigation] = js.native
  
  /**
    * Use keyField to tell table which column is unique. This is same as isKey in <TableHeaderColumn>
    * Tips: react-bootstrap-table support data manipulation(CRUD) so that we need to fetch correct row by a unique column.
    *       You need choose one of configuration to set the key field: isKey or keyField in <BootstrapTable>.
    */
  var keyField: js.UndefOr[String] = js.native
  
  /**
    * Set the maximum height of table. You need give a string with an unit(px) value like height.
    */
  var maxHeight: js.UndefOr[String] = js.native
  
  /**
    * Enable multi search by multiColumnSearch, default is false.
    * If you want to use multi search, you must enable search at first.
    * Tips: Use space to delimited search text. EX: 3 4, which means match all 3 or 4 datas in table.
    */
  var multiColumnSearch: js.UndefOr[Boolean] = js.native
  
  /**
    * Enable the multi sort on table and the number value is means max number of sorting column.
    */
  var multiColumnSort: js.UndefOr[Double] = js.native
  
  /**
    * For some options setting on this component, you can set the options attribute and give an object which contain following properties
    */
  var options: js.UndefOr[Options[_]] = js.native
  
  /**
    * Enable pagination by setting pagination to true, default is false.
    */
  var pagination: js.UndefOr[Boolean] = js.native
  
  /**
    * Normally, react-bootstrap-table handles all the data sorting/filtering/pagination/etc itself internally.
    * If this is true, you need to handle all of those manually outside the table. By default it is false.
    * This is used mostly with an external/central data store, for example Redux or a database that returns
    * already filtered/sorted/paged data.
    *
    * If a function given, which means you can choose which functionality should be handled with remote or not.Currently,
    * we have following functionality you can control: sort, pagination, cellEdit, insertRow, dropRow, filter, search,
    * exportCSV.
    */
  var remote: js.UndefOr[Boolean | (js.Function1[/* remobeObj */ RemoteObjSpec, RemoteObjSpec])] = js.native
  
  /**
    * Render react-s-alert notifications
    */
  var renderAlert: js.UndefOr[Boolean] = js.native
  
  /**
    * Specify a fix position for the vertical bar if it exist. Available is a number or Top and Bottom
    */
  var scrollTop: js.UndefOr[Double | ScrollPosition] = js.native
  
  /**
    * Enable search by setting search to true, default is false.
    * If enabled, there is a on the upper left side of the table. The default place holder is Search
    */
  var search: js.UndefOr[Boolean] = js.native
  
  /**
    * Set searchPlaceholder to change the placeholder in search field, default is Search.
    */
  var searchPlaceholder: js.UndefOr[String] = js.native
  
  /**
    * Enable row selection on table. SelectRow accept an object.
    */
  var selectRow: js.UndefOr[SelectRow[_]] = js.native
  
  /**
    * Strict search. Set this flag to apply search terms so that only rows that contain ALL terms are included in the
    * search results.
    */
  var strictSearch: js.UndefOr[Boolean] = js.native
  
  /**
    * Enable striped by setting striped to true. Same as Bootstrap table class .table-striped, default is false.
    */
  var striped: js.UndefOr[Boolean] = js.native
  
  /**
    * react-bootstrap-table separate two table element as header and body.
    * The tableBodyClass is for the table element in the body
    */
  var tableBodyClass: js.UndefOr[String] = js.native
  
  /**
    * Add your own class names on the react-bs-table class
    */
  var tableContainerClass: js.UndefOr[String] = js.native
  
  /**
    * Table footer custom class
    */
  var tableFooterClass: js.UndefOr[String] = js.native
  
  /**
    * react-bootstrap-table separate two table element as header and body.
    * The tableHeaderClass is for the table element in the header
    */
  var tableHeaderClass: js.UndefOr[String] = js.native
  
  /**
    * Add css styles to the react-bs-table class.
    */
  var tableStyle: js.UndefOr[CSSProperties] = js.native
  
  /**
    * Assign the class name of row(tr). This attribute accept a string or function and function is a better way to do more customization.
    * If a string given, means the value will be presented as the row class.
    * If a function given, will pass rowData and rowIndex as params and should return string for presenting class. for examples:
    * @example
    *    function trClassFormat(rowData,rowIndex) {
    *      return rowIndex % 2 == 0 ? "tr-odd" : "tr-even"; // return a class name.
    *    }
    */
  var trClassName: js.UndefOr[String | (js.Function2[/* rowData */ js.Any, /* rowIndex */ Double, String])] = js.native
  
  /**
    * Set a style to be used for the table rows. Example: https://github.com/AllenFang/react-bootstrap-table/blob/master/examples/js/style/tr-style-table.js
    */
  var trStyle: js.UndefOr[
    CSSProperties | (js.Function2[/* rowData */ js.Any, /* rowIndex */ Double, CSSProperties])
  ] = js.native
  
  /**
    * Bootstrap version to use, values include '3' or '4'. Defaults to '3'.
    */
  var version: js.UndefOr[BootstrapVersion] = js.native
  
  /**
    * Disable the automatic tabIndex for navigating between cells. This can be useful if you have a page with multiple
    * tables on the page, to stop the tab moving to another table. Default is false.
    */
  var withoutTabIndex: js.UndefOr[Boolean] = js.native
}
object BootstrapTableProps {
  
  @scala.inline
  def apply(data: js.Array[js.Object]): BootstrapTableProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapTableProps]
  }
  
  @scala.inline
  implicit class BootstrapTablePropsMutableBuilder[Self <: BootstrapTableProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoCollapse(value: typings.reactBootstrapTable.anon.Filter): Self = StObject.set(x, "autoCollapse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoCollapseUndefined: Self = StObject.set(x, "autoCollapse", js.undefined)
    
    @scala.inline
    def setBodyContainerClass(value: String): Self = StObject.set(x, "bodyContainerClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyContainerClassUndefined: Self = StObject.set(x, "bodyContainerClass", js.undefined)
    
    @scala.inline
    def setBodyStyle(value: CSSProperties): Self = StObject.set(x, "bodyStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyStyleUndefined: Self = StObject.set(x, "bodyStyle", js.undefined)
    
    @scala.inline
    def setBordered(value: Boolean): Self = StObject.set(x, "bordered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderedUndefined: Self = StObject.set(x, "bordered", js.undefined)
    
    @scala.inline
    def setCellEdit(value: CellEdit[_]): Self = StObject.set(x, "cellEdit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellEditUndefined: Self = StObject.set(x, "cellEdit", js.undefined)
    
    @scala.inline
    def setColumnFilter(value: Boolean): Self = StObject.set(x, "columnFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnFilterUndefined: Self = StObject.set(x, "columnFilter", js.undefined)
    
    @scala.inline
    def setCondensed(value: Boolean): Self = StObject.set(x, "condensed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCondensedUndefined: Self = StObject.set(x, "condensed", js.undefined)
    
    @scala.inline
    def setContainerClass(value: String): Self = StObject.set(x, "containerClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerClassUndefined: Self = StObject.set(x, "containerClass", js.undefined)
    
    @scala.inline
    def setContainerStyle(value: CSSProperties): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
    
    @scala.inline
    def setCsvFileName(value: String | js.Function0[String]): Self = StObject.set(x, "csvFileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCsvFileNameFunction0(value: () => String): Self = StObject.set(x, "csvFileName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCsvFileNameUndefined: Self = StObject.set(x, "csvFileName", js.undefined)
    
    @scala.inline
    def setData(value: js.Array[js.Object]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: js.Object*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setDeleteRow(value: Boolean): Self = StObject.set(x, "deleteRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteRowUndefined: Self = StObject.set(x, "deleteRow", js.undefined)
    
    @scala.inline
    def setExcludeCSVHeader(value: Boolean): Self = StObject.set(x, "excludeCSVHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeCSVHeaderUndefined: Self = StObject.set(x, "excludeCSVHeader", js.undefined)
    
    @scala.inline
    def setExpandColumnOptions(value: ExpandColumnOptions): Self = StObject.set(x, "expandColumnOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandColumnOptionsUndefined: Self = StObject.set(x, "expandColumnOptions", js.undefined)
    
    @scala.inline
    def setExpandComponent(value: /* row */ js.Any => String | ReactElement): Self = StObject.set(x, "expandComponent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExpandComponentUndefined: Self = StObject.set(x, "expandComponent", js.undefined)
    
    @scala.inline
    def setExpandableRow(value: /* row */ js.Any => Boolean): Self = StObject.set(x, "expandableRow", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExpandableRowUndefined: Self = StObject.set(x, "expandableRow", js.undefined)
    
    @scala.inline
    def setExportCSV(value: Boolean): Self = StObject.set(x, "exportCSV", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportCSVUndefined: Self = StObject.set(x, "exportCSV", js.undefined)
    
    @scala.inline
    def setFetchInfo(value: FetchInfo): Self = StObject.set(x, "fetchInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFetchInfoUndefined: Self = StObject.set(x, "fetchInfo", js.undefined)
    
    @scala.inline
    def setFooter(value: Boolean): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterData(value: js.Array[js.Array[FooterData]]): Self = StObject.set(x, "footerData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterDataUndefined: Self = StObject.set(x, "footerData", js.undefined)
    
    @scala.inline
    def setFooterDataVarargs(value: js.Array[FooterData]*): Self = StObject.set(x, "footerData", js.Array(value :_*))
    
    @scala.inline
    def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    @scala.inline
    def setHeaderContainerClass(value: String): Self = StObject.set(x, "headerContainerClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderContainerClassUndefined: Self = StObject.set(x, "headerContainerClass", js.undefined)
    
    @scala.inline
    def setHeaderStyle(value: CSSProperties): Self = StObject.set(x, "headerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderStyleUndefined: Self = StObject.set(x, "headerStyle", js.undefined)
    
    @scala.inline
    def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setHover(value: Boolean): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
    
    @scala.inline
    def setIgnoreSinglePage(value: Boolean): Self = StObject.set(x, "ignoreSinglePage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreSinglePageUndefined: Self = StObject.set(x, "ignoreSinglePage", js.undefined)
    
    @scala.inline
    def setInsertRow(value: Boolean): Self = StObject.set(x, "insertRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertRowUndefined: Self = StObject.set(x, "insertRow", js.undefined)
    
    @scala.inline
    def setKeyBoardNav(value: Boolean | KeyboardNavigation): Self = StObject.set(x, "keyBoardNav", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyBoardNavUndefined: Self = StObject.set(x, "keyBoardNav", js.undefined)
    
    @scala.inline
    def setKeyField(value: String): Self = StObject.set(x, "keyField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyFieldUndefined: Self = StObject.set(x, "keyField", js.undefined)
    
    @scala.inline
    def setMaxHeight(value: String): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    @scala.inline
    def setMultiColumnSearch(value: Boolean): Self = StObject.set(x, "multiColumnSearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiColumnSearchUndefined: Self = StObject.set(x, "multiColumnSearch", js.undefined)
    
    @scala.inline
    def setMultiColumnSort(value: Double): Self = StObject.set(x, "multiColumnSort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiColumnSortUndefined: Self = StObject.set(x, "multiColumnSort", js.undefined)
    
    @scala.inline
    def setOptions(value: Options[_]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setPagination(value: Boolean): Self = StObject.set(x, "pagination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaginationUndefined: Self = StObject.set(x, "pagination", js.undefined)
    
    @scala.inline
    def setRemote(value: Boolean | (js.Function1[/* remobeObj */ RemoteObjSpec, RemoteObjSpec])): Self = StObject.set(x, "remote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteFunction1(value: /* remobeObj */ RemoteObjSpec => RemoteObjSpec): Self = StObject.set(x, "remote", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoteUndefined: Self = StObject.set(x, "remote", js.undefined)
    
    @scala.inline
    def setRenderAlert(value: Boolean): Self = StObject.set(x, "renderAlert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderAlertUndefined: Self = StObject.set(x, "renderAlert", js.undefined)
    
    @scala.inline
    def setScrollTop(value: Double | ScrollPosition): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollTopUndefined: Self = StObject.set(x, "scrollTop", js.undefined)
    
    @scala.inline
    def setSearch(value: Boolean): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchPlaceholder(value: String): Self = StObject.set(x, "searchPlaceholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchPlaceholderUndefined: Self = StObject.set(x, "searchPlaceholder", js.undefined)
    
    @scala.inline
    def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
    
    @scala.inline
    def setSelectRow(value: SelectRow[_]): Self = StObject.set(x, "selectRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectRowUndefined: Self = StObject.set(x, "selectRow", js.undefined)
    
    @scala.inline
    def setStrictSearch(value: Boolean): Self = StObject.set(x, "strictSearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrictSearchUndefined: Self = StObject.set(x, "strictSearch", js.undefined)
    
    @scala.inline
    def setStriped(value: Boolean): Self = StObject.set(x, "striped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStripedUndefined: Self = StObject.set(x, "striped", js.undefined)
    
    @scala.inline
    def setTableBodyClass(value: String): Self = StObject.set(x, "tableBodyClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableBodyClassUndefined: Self = StObject.set(x, "tableBodyClass", js.undefined)
    
    @scala.inline
    def setTableContainerClass(value: String): Self = StObject.set(x, "tableContainerClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableContainerClassUndefined: Self = StObject.set(x, "tableContainerClass", js.undefined)
    
    @scala.inline
    def setTableFooterClass(value: String): Self = StObject.set(x, "tableFooterClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableFooterClassUndefined: Self = StObject.set(x, "tableFooterClass", js.undefined)
    
    @scala.inline
    def setTableHeaderClass(value: String): Self = StObject.set(x, "tableHeaderClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableHeaderClassUndefined: Self = StObject.set(x, "tableHeaderClass", js.undefined)
    
    @scala.inline
    def setTableStyle(value: CSSProperties): Self = StObject.set(x, "tableStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableStyleUndefined: Self = StObject.set(x, "tableStyle", js.undefined)
    
    @scala.inline
    def setTrClassName(value: String | (js.Function2[/* rowData */ js.Any, /* rowIndex */ Double, String])): Self = StObject.set(x, "trClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrClassNameFunction2(value: (/* rowData */ js.Any, /* rowIndex */ Double) => String): Self = StObject.set(x, "trClassName", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTrClassNameUndefined: Self = StObject.set(x, "trClassName", js.undefined)
    
    @scala.inline
    def setTrStyle(value: CSSProperties | (js.Function2[/* rowData */ js.Any, /* rowIndex */ Double, CSSProperties])): Self = StObject.set(x, "trStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrStyleFunction2(value: (/* rowData */ js.Any, /* rowIndex */ Double) => CSSProperties): Self = StObject.set(x, "trStyle", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTrStyleUndefined: Self = StObject.set(x, "trStyle", js.undefined)
    
    @scala.inline
    def setVersion(value: BootstrapVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    @scala.inline
    def setWithoutTabIndex(value: Boolean): Self = StObject.set(x, "withoutTabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithoutTabIndexUndefined: Self = StObject.set(x, "withoutTabIndex", js.undefined)
  }
}
