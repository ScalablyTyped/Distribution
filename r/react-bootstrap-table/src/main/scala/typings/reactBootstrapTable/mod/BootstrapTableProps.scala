package typings.reactBootstrapTable.mod

import typings.react.mod.CSSProperties
import typings.react.mod.Props
import typings.react.mod.ReactElement
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
  implicit class BootstrapTablePropsOps[Self <: BootstrapTableProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDataVarargs(value: js.Object*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[js.Object]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoCollapse(value: typings.reactBootstrapTable.anon.Filter): Self = this.set("autoCollapse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoCollapse: Self = this.set("autoCollapse", js.undefined)
    
    @scala.inline
    def setBodyContainerClass(value: String): Self = this.set("bodyContainerClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBodyContainerClass: Self = this.set("bodyContainerClass", js.undefined)
    
    @scala.inline
    def setBodyStyle(value: CSSProperties): Self = this.set("bodyStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBodyStyle: Self = this.set("bodyStyle", js.undefined)
    
    @scala.inline
    def setBordered(value: Boolean): Self = this.set("bordered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBordered: Self = this.set("bordered", js.undefined)
    
    @scala.inline
    def setCellEdit(value: CellEdit[_]): Self = this.set("cellEdit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellEdit: Self = this.set("cellEdit", js.undefined)
    
    @scala.inline
    def setColumnFilter(value: Boolean): Self = this.set("columnFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnFilter: Self = this.set("columnFilter", js.undefined)
    
    @scala.inline
    def setCondensed(value: Boolean): Self = this.set("condensed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCondensed: Self = this.set("condensed", js.undefined)
    
    @scala.inline
    def setContainerClass(value: String): Self = this.set("containerClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerClass: Self = this.set("containerClass", js.undefined)
    
    @scala.inline
    def setContainerStyle(value: CSSProperties): Self = this.set("containerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerStyle: Self = this.set("containerStyle", js.undefined)
    
    @scala.inline
    def setCsvFileNameFunction0(value: () => String): Self = this.set("csvFileName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCsvFileName(value: String | js.Function0[String]): Self = this.set("csvFileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCsvFileName: Self = this.set("csvFileName", js.undefined)
    
    @scala.inline
    def setDeleteRow(value: Boolean): Self = this.set("deleteRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteRow: Self = this.set("deleteRow", js.undefined)
    
    @scala.inline
    def setExcludeCSVHeader(value: Boolean): Self = this.set("excludeCSVHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludeCSVHeader: Self = this.set("excludeCSVHeader", js.undefined)
    
    @scala.inline
    def setExpandColumnOptions(value: ExpandColumnOptions): Self = this.set("expandColumnOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpandColumnOptions: Self = this.set("expandColumnOptions", js.undefined)
    
    @scala.inline
    def setExpandComponent(value: /* row */ js.Any => String | ReactElement): Self = this.set("expandComponent", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteExpandComponent: Self = this.set("expandComponent", js.undefined)
    
    @scala.inline
    def setExpandableRow(value: /* row */ js.Any => Boolean): Self = this.set("expandableRow", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteExpandableRow: Self = this.set("expandableRow", js.undefined)
    
    @scala.inline
    def setExportCSV(value: Boolean): Self = this.set("exportCSV", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExportCSV: Self = this.set("exportCSV", js.undefined)
    
    @scala.inline
    def setFetchInfo(value: FetchInfo): Self = this.set("fetchInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFetchInfo: Self = this.set("fetchInfo", js.undefined)
    
    @scala.inline
    def setFooter(value: Boolean): Self = this.set("footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFooter: Self = this.set("footer", js.undefined)
    
    @scala.inline
    def setFooterDataVarargs(value: js.Array[FooterData]*): Self = this.set("footerData", js.Array(value :_*))
    
    @scala.inline
    def setFooterData(value: js.Array[js.Array[FooterData]]): Self = this.set("footerData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFooterData: Self = this.set("footerData", js.undefined)
    
    @scala.inline
    def setHeaderContainerClass(value: String): Self = this.set("headerContainerClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderContainerClass: Self = this.set("headerContainerClass", js.undefined)
    
    @scala.inline
    def setHeaderStyle(value: CSSProperties): Self = this.set("headerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderStyle: Self = this.set("headerStyle", js.undefined)
    
    @scala.inline
    def setHeight(value: String): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setHover(value: Boolean): Self = this.set("hover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHover: Self = this.set("hover", js.undefined)
    
    @scala.inline
    def setIgnoreSinglePage(value: Boolean): Self = this.set("ignoreSinglePage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreSinglePage: Self = this.set("ignoreSinglePage", js.undefined)
    
    @scala.inline
    def setInsertRow(value: Boolean): Self = this.set("insertRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertRow: Self = this.set("insertRow", js.undefined)
    
    @scala.inline
    def setKeyBoardNav(value: Boolean | KeyboardNavigation): Self = this.set("keyBoardNav", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyBoardNav: Self = this.set("keyBoardNav", js.undefined)
    
    @scala.inline
    def setKeyField(value: String): Self = this.set("keyField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyField: Self = this.set("keyField", js.undefined)
    
    @scala.inline
    def setMaxHeight(value: String): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    
    @scala.inline
    def setMultiColumnSearch(value: Boolean): Self = this.set("multiColumnSearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiColumnSearch: Self = this.set("multiColumnSearch", js.undefined)
    
    @scala.inline
    def setMultiColumnSort(value: Double): Self = this.set("multiColumnSort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiColumnSort: Self = this.set("multiColumnSort", js.undefined)
    
    @scala.inline
    def setOptions(value: Options[_]): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setPagination(value: Boolean): Self = this.set("pagination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePagination: Self = this.set("pagination", js.undefined)
    
    @scala.inline
    def setRemoteFunction1(value: /* remobeObj */ RemoteObjSpec => RemoteObjSpec): Self = this.set("remote", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemote(value: Boolean | (js.Function1[/* remobeObj */ RemoteObjSpec, RemoteObjSpec])): Self = this.set("remote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemote: Self = this.set("remote", js.undefined)
    
    @scala.inline
    def setRenderAlert(value: Boolean): Self = this.set("renderAlert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderAlert: Self = this.set("renderAlert", js.undefined)
    
    @scala.inline
    def setScrollTop(value: Double | ScrollPosition): Self = this.set("scrollTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollTop: Self = this.set("scrollTop", js.undefined)
    
    @scala.inline
    def setSearch(value: Boolean): Self = this.set("search", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearch: Self = this.set("search", js.undefined)
    
    @scala.inline
    def setSearchPlaceholder(value: String): Self = this.set("searchPlaceholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchPlaceholder: Self = this.set("searchPlaceholder", js.undefined)
    
    @scala.inline
    def setSelectRow(value: SelectRow[_]): Self = this.set("selectRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectRow: Self = this.set("selectRow", js.undefined)
    
    @scala.inline
    def setStrictSearch(value: Boolean): Self = this.set("strictSearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrictSearch: Self = this.set("strictSearch", js.undefined)
    
    @scala.inline
    def setStriped(value: Boolean): Self = this.set("striped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStriped: Self = this.set("striped", js.undefined)
    
    @scala.inline
    def setTableBodyClass(value: String): Self = this.set("tableBodyClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableBodyClass: Self = this.set("tableBodyClass", js.undefined)
    
    @scala.inline
    def setTableContainerClass(value: String): Self = this.set("tableContainerClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableContainerClass: Self = this.set("tableContainerClass", js.undefined)
    
    @scala.inline
    def setTableFooterClass(value: String): Self = this.set("tableFooterClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableFooterClass: Self = this.set("tableFooterClass", js.undefined)
    
    @scala.inline
    def setTableHeaderClass(value: String): Self = this.set("tableHeaderClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableHeaderClass: Self = this.set("tableHeaderClass", js.undefined)
    
    @scala.inline
    def setTableStyle(value: CSSProperties): Self = this.set("tableStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableStyle: Self = this.set("tableStyle", js.undefined)
    
    @scala.inline
    def setTrClassNameFunction2(value: (/* rowData */ js.Any, /* rowIndex */ Double) => String): Self = this.set("trClassName", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTrClassName(value: String | (js.Function2[/* rowData */ js.Any, /* rowIndex */ Double, String])): Self = this.set("trClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrClassName: Self = this.set("trClassName", js.undefined)
    
    @scala.inline
    def setTrStyleFunction2(value: (/* rowData */ js.Any, /* rowIndex */ Double) => CSSProperties): Self = this.set("trStyle", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTrStyle(value: CSSProperties | (js.Function2[/* rowData */ js.Any, /* rowIndex */ Double, CSSProperties])): Self = this.set("trStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrStyle: Self = this.set("trStyle", js.undefined)
    
    @scala.inline
    def setVersion(value: BootstrapVersion): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
    
    @scala.inline
    def setWithoutTabIndex(value: Boolean): Self = this.set("withoutTabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithoutTabIndex: Self = this.set("withoutTabIndex", js.undefined)
  }
}
