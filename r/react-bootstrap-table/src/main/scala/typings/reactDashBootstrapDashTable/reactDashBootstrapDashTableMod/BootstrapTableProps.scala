package typings.reactDashBootstrapDashTable.reactDashBootstrapDashTableMod

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.Key
import typings.react.reactMod.LegacyRef
import typings.react.reactMod.Props
import typings.react.reactMod.ReactElement
import typings.react.reactMod.ReactNode
import typings.reactDashBootstrapDashTable.Anon_Filter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BootstrapTableProps extends Props[BootstrapTable] {
  /**
  	 * Automatically collapses open rows when doing a sort/filter/search action if those options have been specified.
  	 * Is an object with three possible fields: sort, filter, search. Each field is a flag to specify whether that
  	 * action type should cause expanded rows to close. All three fields default to false.
  	 */
  var autoCollapse: js.UndefOr[Anon_Filter] = js.undefined
  /**
  	 * Add your own class names on the react-bs-container-body class
  	 */
  var bodyContainerClass: js.UndefOr[String] = js.undefined
  /**
  	 * Add css styles to the react-bs-container-body class.
  	 */
  var bodyStyle: js.UndefOr[CSSProperties] = js.undefined
  /**
  	 * Become a borderless table by setting bordered to false, default is true.
  	 */
  var bordered: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Enable cell editing on table. cellEdit accept an object which have the following properties
  	 */
  var cellEdit: js.UndefOr[CellEdit[_]] = js.undefined
  /**
  	 * Enable column filter by setting columnFilter to true, default is false.
  	 * If enabled, there're input text field per column under the table, user can input your filter condition by each column.
  	 */
  var columnFilter: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Enable condensed by setting condensed to true. Same as Bootstrap table class .table-condensed, default is false.
  	 */
  var condensed: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Add your own class names on the react-bs-table-container class
  	 */
  var containerClass: js.UndefOr[String] = js.undefined
  /**
  	 * Add css styles to the react-bs-table-container class.
  	 * For example: containerStyle={ { background: '#00ff00' } }
  	 */
  var containerStyle: js.UndefOr[CSSProperties] = js.undefined
  /**
  	 * Set CSV filename (e.g. items.csv). Default is spreadsheet.csv
  	 */
  var csvFileName: js.UndefOr[String | js.Function0[String]] = js.undefined
  /**
  	 * Use data to specify the data that you want to display on table.
  	 */
  var data: js.Array[js.Object]
  /**
  	 * Enable row deletion by setting deleteRow to true, default is false.
  	 * If you enable row deletion, there's a button on the upper left side of table.
  	 */
  var deleteRow: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Disable writing the header row when exporting to a CSV file.
  	 */
  var excludeCSVHeader: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Assign some alternative options for expand row feature, expandColumnOptions
  	 * only have four available property currently.
  	 */
  var expandColumnOptions: js.UndefOr[ExpandColumnOptions] = js.undefined
  /**
  	 * Tell react-bootstrap-table what's content should be rendered in the expanding
  	 * content. This props accept a callback function and is suppose to be return JSX
  	 * or String.
  	 * expandComponent is always used with expandableRow, both of props are enable
  	 * the expand row functionality on table.
  	 */
  var expandComponent: js.UndefOr[js.Function1[/* row */ js.Any, String | ReactElement]] = js.undefined
  /**
  	 * Tell react-bootstrap-table which rows are able to expand. This prop accepts
  	 * a callback function and is suppose to be return an Array of row keys.
  	 * expandableRow is always used with expandComponent, both of props are enable
  	 * the expand row functionality on table.
  	 */
  var expandableRow: js.UndefOr[js.Function1[/* row */ js.Any, Boolean]] = js.undefined
  /**
  	 * Enable export csv function, default is false.
  	 * If you enable, there's a button on the upper left side of table.
  	 */
  var exportCSV: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Used to specify the total number of rows (matching current filter/sort/size per page) in a remote data source.
  	 * Documented in examples, but missing from the main docs. Essential for remote data pagination calculations.
  	 */
  var fetchInfo: js.UndefOr[FetchInfo] = js.undefined
  /**
  	 * Add a footer to the table.
  	 */
  var footer: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Data for the table footer. Format is an array of footer rows, each containing an array of column footer data.
  	 */
  var footerData: js.UndefOr[js.Array[js.Array[FooterData]]] = js.undefined
  /**
  	 * Add your own class names on the react-bs-container-header class
  	 */
  var headerContainerClass: js.UndefOr[String] = js.undefined
  /**
  	 * Add css styles to the react-bs-container-header class.
  	 */
  var headerStyle: js.UndefOr[CSSProperties] = js.undefined
  /**
  	 * Use height to set the height of table, default is 100%. The string needs to have a unit, e.g. 'px', '%'.
  	 */
  var height: js.UndefOr[String] = js.undefined
  /**
  	 * Enable hover by setting hover to true. Same as Bootstrap table class .table-hover, default is false.
  	 */
  var hover: js.UndefOr[Boolean] = js.undefined
  /**
  	 * If true, it will hide the pagination if there is only one page, default is false.
  	 */
  var ignoreSinglePage: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Enable row insertion by setting insertRow to true, default is false.
  	 * If you enable row insertion, there's a button on the upper left side of table.
  	 */
  var insertRow: js.UndefOr[Boolean] = js.undefined
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
  var keyBoardNav: js.UndefOr[Boolean | KeyboardNavigation] = js.undefined
  /**
  	 * Use keyField to tell table which column is unique. This is same as isKey in <TableHeaderColumn>
  	 * Tips: react-bootstrap-table support data manipulation(CRUD) so that we need to fetch correct row by a unique column.
  	 *       You need choose one of configuration to set the key field: isKey or keyField in <BootstrapTable>.
  	 */
  var keyField: js.UndefOr[String] = js.undefined
  /**
  	 * Set the maximum height of table. You need give a string with an unit(px) value like height.
  	 */
  var maxHeight: js.UndefOr[String] = js.undefined
  /**
  	 * Enable multi search by multiColumnSearch, default is false.
  	 * If you want to use multi search, you must enable search at first.
  	 * Tips: Use space to delimited search text. EX: 3 4, which means match all 3 or 4 datas in table.
  	 */
  var multiColumnSearch: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Enable the multi sort on table and the number value is means max number of sorting column.
  	 */
  var multiColumnSort: js.UndefOr[Double] = js.undefined
  /**
  	 * For some options setting on this component, you can set the options attribute and give an object which contain following properties
  	 */
  var options: js.UndefOr[Options[_]] = js.undefined
  /**
  	 * Enable pagination by setting pagination to true, default is false.
  	 */
  var pagination: js.UndefOr[Boolean] = js.undefined
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
  var remote: js.UndefOr[Boolean | (js.Function1[/* remobeObj */ RemoteObjSpec, RemoteObjSpec])] = js.undefined
  /**
  	 * Render react-s-alert notifications
  	 */
  var renderAlert: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Specify a fix position for the vertical bar if it exist. Available is a number or Top and Bottom
  	 */
  var scrollTop: js.UndefOr[Double | ScrollPosition] = js.undefined
  /**
  	 * Enable search by setting search to true, default is false.
  	 * If enabled, there is a on the upper left side of the table. The default place holder is Search
  	 */
  var search: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Set searchPlaceholder to change the placeholder in search field, default is Search.
  	 */
  var searchPlaceholder: js.UndefOr[String] = js.undefined
  /**
  	 * Enable row selection on table. SelectRow accept an object.
  	 */
  var selectRow: js.UndefOr[SelectRow[_]] = js.undefined
  /**
  	 * Strict search. Set this flag to apply search terms so that only rows that contain ALL terms are included in the
  	 * search results.
  	 */
  var strictSearch: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Enable striped by setting striped to true. Same as Bootstrap table class .table-striped, default is false.
  	 */
  var striped: js.UndefOr[Boolean] = js.undefined
  /**
  	 * react-bootstrap-table separate two table element as header and body.
  	 * The tableBodyClass is for the table element in the body
  	 */
  var tableBodyClass: js.UndefOr[String] = js.undefined
  /**
  	 * Add your own class names on the react-bs-table class
  	 */
  var tableContainerClass: js.UndefOr[String] = js.undefined
  /**
  	 * Table footer custom class
  	 */
  var tableFooterClass: js.UndefOr[String] = js.undefined
  /**
  	 * react-bootstrap-table separate two table element as header and body.
  	 * The tableHeaderClass is for the table element in the header
  	 */
  var tableHeaderClass: js.UndefOr[String] = js.undefined
  /**
  	 * Add css styles to the react-bs-table class.
  	 */
  var tableStyle: js.UndefOr[CSSProperties] = js.undefined
  /**
  	 * Assign the class name of row(tr). This attribute accept a string or function and function is a better way to do more customization.
  	 * If a string given, means the value will be presented as the row class.
  	 * If a function given, will pass rowData and rowIndex as params and should return string for presenting class. for examples:
  	 * @example
  	 *    function trClassFormat(rowData,rowIndex) {
  	 *      return rowIndex % 2 == 0 ? "tr-odd" : "tr-even"; // return a class name.
  	 *    }
  	 */
  var trClassName: js.UndefOr[String | (js.Function2[/* rowData */ js.Any, /* rowIndex */ Double, String])] = js.undefined
  /**
  	 * Set a style to be used for the table rows. Example: https://github.com/AllenFang/react-bootstrap-table/blob/master/examples/js/style/tr-style-table.js
  	 */
  var trStyle: js.UndefOr[
    CSSProperties | (js.Function2[/* rowData */ js.Any, /* rowIndex */ Double, CSSProperties])
  ] = js.undefined
  /**
  	 * Bootstrap version to use, values include '3' or '4'. Defaults to '3'.
  	 */
  var version: js.UndefOr[BootstrapVersion] = js.undefined
  /**
  	 * Disable the automatic tabIndex for navigating between cells. This can be useful if you have a page with multiple
  	 * tables on the page, to stop the tab moving to another table. Default is false.
  	 */
  var withoutTabIndex: js.UndefOr[Boolean] = js.undefined
}

object BootstrapTableProps {
  @scala.inline
  def apply(
    data: js.Array[js.Object],
    autoCollapse: Anon_Filter = null,
    bodyContainerClass: String = null,
    bodyStyle: CSSProperties = null,
    bordered: js.UndefOr[Boolean] = js.undefined,
    cellEdit: CellEdit[_] = null,
    children: ReactNode = null,
    columnFilter: js.UndefOr[Boolean] = js.undefined,
    condensed: js.UndefOr[Boolean] = js.undefined,
    containerClass: String = null,
    containerStyle: CSSProperties = null,
    csvFileName: String | js.Function0[String] = null,
    deleteRow: js.UndefOr[Boolean] = js.undefined,
    excludeCSVHeader: js.UndefOr[Boolean] = js.undefined,
    expandColumnOptions: ExpandColumnOptions = null,
    expandComponent: /* row */ js.Any => String | ReactElement = null,
    expandableRow: /* row */ js.Any => Boolean = null,
    exportCSV: js.UndefOr[Boolean] = js.undefined,
    fetchInfo: FetchInfo = null,
    footer: js.UndefOr[Boolean] = js.undefined,
    footerData: js.Array[js.Array[FooterData]] = null,
    headerContainerClass: String = null,
    headerStyle: CSSProperties = null,
    height: String = null,
    hover: js.UndefOr[Boolean] = js.undefined,
    ignoreSinglePage: js.UndefOr[Boolean] = js.undefined,
    insertRow: js.UndefOr[Boolean] = js.undefined,
    key: Key = null,
    keyBoardNav: Boolean | KeyboardNavigation = null,
    keyField: String = null,
    maxHeight: String = null,
    multiColumnSearch: js.UndefOr[Boolean] = js.undefined,
    multiColumnSort: Int | Double = null,
    options: Options[_] = null,
    pagination: js.UndefOr[Boolean] = js.undefined,
    ref: LegacyRef[BootstrapTable] = null,
    remote: Boolean | (js.Function1[/* remobeObj */ RemoteObjSpec, RemoteObjSpec]) = null,
    renderAlert: js.UndefOr[Boolean] = js.undefined,
    scrollTop: Double | ScrollPosition = null,
    search: js.UndefOr[Boolean] = js.undefined,
    searchPlaceholder: String = null,
    selectRow: SelectRow[_] = null,
    strictSearch: js.UndefOr[Boolean] = js.undefined,
    striped: js.UndefOr[Boolean] = js.undefined,
    tableBodyClass: String = null,
    tableContainerClass: String = null,
    tableFooterClass: String = null,
    tableHeaderClass: String = null,
    tableStyle: CSSProperties = null,
    trClassName: String | (js.Function2[/* rowData */ js.Any, /* rowIndex */ Double, String]) = null,
    trStyle: CSSProperties | (js.Function2[/* rowData */ js.Any, /* rowIndex */ Double, CSSProperties]) = null,
    version: BootstrapVersion = null,
    withoutTabIndex: js.UndefOr[Boolean] = js.undefined
  ): BootstrapTableProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (autoCollapse != null) __obj.updateDynamic("autoCollapse")(autoCollapse.asInstanceOf[js.Any])
    if (bodyContainerClass != null) __obj.updateDynamic("bodyContainerClass")(bodyContainerClass.asInstanceOf[js.Any])
    if (bodyStyle != null) __obj.updateDynamic("bodyStyle")(bodyStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(bordered)) __obj.updateDynamic("bordered")(bordered.asInstanceOf[js.Any])
    if (cellEdit != null) __obj.updateDynamic("cellEdit")(cellEdit.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(columnFilter)) __obj.updateDynamic("columnFilter")(columnFilter.asInstanceOf[js.Any])
    if (!js.isUndefined(condensed)) __obj.updateDynamic("condensed")(condensed.asInstanceOf[js.Any])
    if (containerClass != null) __obj.updateDynamic("containerClass")(containerClass.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (csvFileName != null) __obj.updateDynamic("csvFileName")(csvFileName.asInstanceOf[js.Any])
    if (!js.isUndefined(deleteRow)) __obj.updateDynamic("deleteRow")(deleteRow.asInstanceOf[js.Any])
    if (!js.isUndefined(excludeCSVHeader)) __obj.updateDynamic("excludeCSVHeader")(excludeCSVHeader.asInstanceOf[js.Any])
    if (expandColumnOptions != null) __obj.updateDynamic("expandColumnOptions")(expandColumnOptions.asInstanceOf[js.Any])
    if (expandComponent != null) __obj.updateDynamic("expandComponent")(js.Any.fromFunction1(expandComponent))
    if (expandableRow != null) __obj.updateDynamic("expandableRow")(js.Any.fromFunction1(expandableRow))
    if (!js.isUndefined(exportCSV)) __obj.updateDynamic("exportCSV")(exportCSV.asInstanceOf[js.Any])
    if (fetchInfo != null) __obj.updateDynamic("fetchInfo")(fetchInfo.asInstanceOf[js.Any])
    if (!js.isUndefined(footer)) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (footerData != null) __obj.updateDynamic("footerData")(footerData.asInstanceOf[js.Any])
    if (headerContainerClass != null) __obj.updateDynamic("headerContainerClass")(headerContainerClass.asInstanceOf[js.Any])
    if (headerStyle != null) __obj.updateDynamic("headerStyle")(headerStyle.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hover)) __obj.updateDynamic("hover")(hover.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreSinglePage)) __obj.updateDynamic("ignoreSinglePage")(ignoreSinglePage.asInstanceOf[js.Any])
    if (!js.isUndefined(insertRow)) __obj.updateDynamic("insertRow")(insertRow.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (keyBoardNav != null) __obj.updateDynamic("keyBoardNav")(keyBoardNav.asInstanceOf[js.Any])
    if (keyField != null) __obj.updateDynamic("keyField")(keyField.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(multiColumnSearch)) __obj.updateDynamic("multiColumnSearch")(multiColumnSearch.asInstanceOf[js.Any])
    if (multiColumnSort != null) __obj.updateDynamic("multiColumnSort")(multiColumnSort.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (!js.isUndefined(pagination)) __obj.updateDynamic("pagination")(pagination.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (remote != null) __obj.updateDynamic("remote")(remote.asInstanceOf[js.Any])
    if (!js.isUndefined(renderAlert)) __obj.updateDynamic("renderAlert")(renderAlert.asInstanceOf[js.Any])
    if (scrollTop != null) __obj.updateDynamic("scrollTop")(scrollTop.asInstanceOf[js.Any])
    if (!js.isUndefined(search)) __obj.updateDynamic("search")(search.asInstanceOf[js.Any])
    if (searchPlaceholder != null) __obj.updateDynamic("searchPlaceholder")(searchPlaceholder.asInstanceOf[js.Any])
    if (selectRow != null) __obj.updateDynamic("selectRow")(selectRow.asInstanceOf[js.Any])
    if (!js.isUndefined(strictSearch)) __obj.updateDynamic("strictSearch")(strictSearch.asInstanceOf[js.Any])
    if (!js.isUndefined(striped)) __obj.updateDynamic("striped")(striped.asInstanceOf[js.Any])
    if (tableBodyClass != null) __obj.updateDynamic("tableBodyClass")(tableBodyClass.asInstanceOf[js.Any])
    if (tableContainerClass != null) __obj.updateDynamic("tableContainerClass")(tableContainerClass.asInstanceOf[js.Any])
    if (tableFooterClass != null) __obj.updateDynamic("tableFooterClass")(tableFooterClass.asInstanceOf[js.Any])
    if (tableHeaderClass != null) __obj.updateDynamic("tableHeaderClass")(tableHeaderClass.asInstanceOf[js.Any])
    if (tableStyle != null) __obj.updateDynamic("tableStyle")(tableStyle.asInstanceOf[js.Any])
    if (trClassName != null) __obj.updateDynamic("trClassName")(trClassName.asInstanceOf[js.Any])
    if (trStyle != null) __obj.updateDynamic("trStyle")(trStyle.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (!js.isUndefined(withoutTabIndex)) __obj.updateDynamic("withoutTabIndex")(withoutTabIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapTableProps]
  }
}

