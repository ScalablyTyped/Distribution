package typings.reactBootstrapTable.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.reactBootstrapTable.anon.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options[TRow /* <: js.Object */] extends js.Object {
  
  /**
    * Assign a callback function which will be called after triggering column filtering.
    * This function takes two arguments: filterConds and result.
    *   `filterConds`: It's an array object which contain all column filter conditions.
    *   `result`: The results after filtering.
    *
    * This function only work when you enable columnFilter on <BootstrapTable> or define
    * a filter on <TableHeaderColumn>.
    */
  var afterColumnFilter: js.UndefOr[
    js.Function2[/* filterConds */ js.Array[FilterData[_]], /* result */ js.Array[TRow], Unit]
  ] = js.native
  
  /**
    * Assign a callback function which will be called after row delete.
    * This function takes two arguments:
    *   `rowKeys`: which means the row keys for the deleted rows
    *   `rows`: the array of row data that was deleted.
    */
  var afterDeleteRow: js.UndefOr[
    js.Function2[/* rowKeys */ js.Array[Double | String], /* rows */ js.Array[TRow], Unit]
  ] = js.native
  
  /**
    * Assign a callback function which will be called after inserting a row.
    * This function takes one argument: row, which means the whole row data you added.
    */
  var afterInsertRow: js.UndefOr[js.Function1[/* row */ TRow, Unit]] = js.native
  
  /**
    * Assign a callback function which will be called after triggering searching.
    * This function takes two argument: search and result.
    *   `search`: The search text from the user.
    *   `result`: The results after searching (array of rows that matched the search).
    */
  var afterSearch: js.UndefOr[js.Function2[/* search */ String, /* result */ js.Array[TRow], Unit]] = js.native
  
  /**
    * Assign a callback function that will be called after table updates.
    */
  var afterTableComplete: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Flag to indicate that the table should always show next/previous buttons even when there is not next/previous
    * page.
    */
  var alwaysShowAllBtns: js.UndefOr[Boolean] = js.native
  
  /**
    * You can do something before the toastr pop or even disable the toastr!!
    * Returning false or void will not trigger the toastr.
    * If you want the toastr popup, you should return true always.
    * Inputs match the EditValidatorObject.notification field types.
    */
  var beforeShowError: js.UndefOr[
    js.Function3[/* type */ EditValidatorType, /* msg */ String, /* title */ String, Boolean | Unit]
  ] = js.native
  
  /**
    * Button group which contain the insert, drop, show only select and export CSV buttons, these button all
    * grouped as btn-group class in bootstrap. This is a chance that you can custom this button group.
    * Give a btnGroup in options props and btnGroup only accept a function and a JSX returned value is necessary.
    * This lets you customize just the left-hand-side of the toolbar if desired.
    */
  var btnGroup: js.UndefOr[js.Function1[/* props */ ButtonGroupProps, ReactElement]] = js.native
  
  /**
    * Only work on enable search. If true, there will be a button beside the search input field
    * that will empty the field when clicked.
    */
  var clearSearch: js.UndefOr[Boolean] = js.native
  
  /**
    * You can custom the clear button for search field by giving clearSearchBtn in options props.
    * clearSearchBtn only accept a function and a JSX returned value is necessary.
    *
    * The default `ClearSearchButton` component is also exported as a component, so that you can use it as the
    * base for your own custom component.
    */
  var clearSearchBtn: js.UndefOr[
    js.Function1[
      /* onClick */ js.Function1[/* e */ MouseEvent[_, NativeMouseEvent], Unit], 
      ReactElement
    ]
  ] = js.native
  
  /**
    * Customize the text on the close button in the insert modal.
    */
  var closeText: js.UndefOr[String] = js.native
  
  /**
    * Set the default search condition.
    */
  var defaultSearch: js.UndefOr[String] = js.native
  
  /**
    * Specify the default sort column.
    * Note: when using cleanSort(), this default sort column will be restored.
    */
  var defaultSortName: js.UndefOr[/* keyof TRow */ String] = js.native
  
  /**
    * Assign a default sort order.
    * Note: when using cleanSort(), this default sort order will be restored.
    */
  var defaultSortOrder: js.UndefOr[SortOrder] = js.native
  
  /**
    * It's available to customize delete button by configuring deleteBtn in options props, deleteBtn onl<y
    * accept a function and a JSX returned value is necessary. This function will take one argument: onClick.
    *
    * The default `DeleteButton` component is also exported as a component, so that you can use it as the base
    * for your custom component.
    */
  var deleteBtn: js.UndefOr[
    js.Function1[
      /* onClick */ js.Function1[/* e */ MouseEvent[_, NativeMouseEvent], Unit], 
      ReactElement
    ]
  ] = js.native
  
  /**
    * Customize the text on the delete button.
    */
  var deleteText: js.UndefOr[String] = js.native
  
  /**
    * Expand all rows
    */
  var expandAll: js.UndefOr[Boolean] = js.native
  
  /**
    * Custom class to use for the expanded content section of an expanded row. This can either be a string, or a
    * function that returns a string and takes three arguments: row, rowIndex, isExpanding.
    *   `row`: the row expanding/collapsing.
    *   `rowIndex`: index number of the row.
    *   `isExpanding`: boolean flag specifying whether the field is expanding or collapsing.
    */
  var expandBodyClass: js.UndefOr[
    String | (js.Function3[/* row */ TRow, /* rowIndex */ Double, /* isExpanding */ Boolean, String])
  ] = js.native
  
  /**
    * Tell react-bootstrap-table how to trigger expanding by clicking on 'row' or 'column' level.
    * If the value is 'column', by default all the columns are expandable. If you want to specify some columns as
    * unexpandable, check expandable.
    * Default is 'row'.
    */
  var expandBy: js.UndefOr[ExpandBy] = js.native
  
  /**
    * Custom class to use for the row itself for an expanded row when it has been expanded. This can either be a
    * string, or a function that returns a string and takes two arguments: row and rowIndex.
    *   `row`: the expanded row.
    *   `rowIndex`: index number of the row.
    */
  var expandParentClass: js.UndefOr[String | (js.Function2[/* row */ TRow, /* rowIndex */ Double, String])] = js.native
  
  /**
    * Background color on expanded rows (css color value).
    */
  var expandRowBgColor: js.UndefOr[String] = js.native
  
  /**
    * Provide an array of expanded rows for the table.
    */
  var expanding: js.UndefOr[js.Array[Double | String]] = js.native
  
  /**
    * It's available to customize the export csv button by configuring exportCSVBtn in options props, exportCSVBtn only
    * accept a function and a JSX returned value is necessary. This function will take one argument: onClick.
    *
    * The default `ExportCSVButton` component is also exported as a component, so that you can use it as the base
    * for your custom component.
    */
  var exportCSVBtn: js.UndefOr[
    js.Function1[
      /* onClick */ js.Function1[/* e */ MouseEvent[_, NativeMouseEvent], Unit], 
      ReactElement
    ]
  ] = js.native
  
  /**
    * Customize the field separator in a CSV export file. Default is ','.
    */
  var exportCSVSeparator: js.UndefOr[String] = js.native
  
  /**
    * Customize the text on the export csv button
    */
  var exportCSVText: js.UndefOr[String] = js.native
  
  /**
    * Customize the text of first page button.
    * If using the default pagination panel, this should be a string to use for the button label.
    * If creating a custom pagination panel, this is passed to the panel and can be of any type desired.
    */
  var firstPage: js.UndefOr[js.Any] = js.native
  
  /**
    * Customize the tooltip text shown when hovering over the firstPage button.
    */
  var firstPageTitle: js.UndefOr[String] = js.native
  
  /**
    * Assign a callback function which will be called when deleting a row.
    * It gives you a chance to customize your confirmation for row deletion.
    * This function takes two argument: next and rowKeys:
    *   `next`: If you confirm the delete, call next() to continue the process.
    *   `rowKeys` Is the row keys to be deleted, you can call the `next` function to apply this deletion.
    */
  var handleConfirmDeleteRow: js.UndefOr[
    js.Function2[/* next */ js.Function0[Unit], /* rowKeys */ js.Array[Double | String], Unit]
  ] = js.native
  
  /**
    * Default is false. If true, the pagination list will be hidden when there is only one page.
    */
  var hidePageListOnlyOnePage: js.UndefOr[Boolean] = js.native
  
  /**
    * Hide the dropdown list for size per page, default is false.
    */
  var hideSizePerPage: js.UndefOr[Boolean] = js.native
  
  /**
    * Default is false, if true means you want to ignore any editable columns when creating the insert form.
    */
  var ignoreEditable: js.UndefOr[Boolean] = js.native
  
  /**
    * It's available to customize the insert button by configuring insertBtn in options props, insertBtn only
    * accept a function and a JSX returned value is necessary. This function will take one argument: onClick.
    *
    * The default `InsertButton` component is also exported as a component, so that you can use it as the base
    * for your custom component.
    */
  var insertBtn: js.UndefOr[
    js.Function1[
      /* onClick */ js.Function1[/* e */ MouseEvent[_, NativeMouseEvent], Unit], 
      ReactElement
    ]
  ] = js.native
  
  /**
    * Custom message to show when the InsertModal save fails validation.
    * Default message is 'Form validate errors, please checking!'
    */
  var insertFailIndicator: js.UndefOr[String] = js.native
  
  /**
    * You can customize everything in the insert modal via options.insertModal and we give you the event
    * callback, props and some informations: onModalClose, onSave, columns, validateState, ignoreEditable
    * @see https://github.com/AllenFang/react-bootstrap-table/blob/master/examples/js/custom/insert-modal/custom-insert-modal.js
    */
  var insertModal: js.UndefOr[
    js.Function5[
      /* onModalClose */ js.Function0[Unit], 
      /* onSave */ js.Function1[/* row */ TRow, Unit], 
      /* columns */ js.Array[InsertModalColumnDescription[TRow]], 
      /* validateState */ StringDictionary[String], 
      /* ignoreEditable */ Boolean, 
      ReactElement
    ]
  ] = js.native
  
  /**
    * You can customize the body of the insert modal via options.insertModalBody and we give you the following
    * arguments: columns, validateState {[fieldname]: errorMsg}, ignoreEditable
    *
    * Note: There is no exported Insert Modal Body component - if you are customising this, you need to create your
    * own body component. That component needs to implement a `getFieldValue` method that returns the new row data. It
    * will be called by react-bootstrap-table when the save button is clicked in the insert modal window.
    */
  var insertModalBody: js.UndefOr[
    js.Function3[
      /* columns */ js.Array[InsertModalColumnDescription[TRow]], 
      /* validateState */ StringDictionary[String], 
      /* ignoreEditable */ Boolean, 
      ReactElement
    ]
  ] = js.native
  
  /**
    * It's available to custom the footer of insert modal by configuring options.insertModalFooter. It only accepts
    * a function and a JSX returned value is necessary. This function will take two arguments: closeModal and save.
    *   `closeModal`: callback function to trigger closing the modal window.
    *   `save`: callback function to trigger saving the new row data.
    *
    * The default `InsertModalFooter` component is also exported as a component, so that you can use it as the base
    * for your own custom component.
    */
  var insertModalFooter: js.UndefOr[
    js.Function2[/* closeModal */ js.Function0[Unit], /* save */ js.Function0[Unit], ReactElement]
  ] = js.native
  
  /**
    * It's available to custom the header of insert modal by configuring options.insertModalHeader. It only accepts
    * a function and a JSX returned value is necessary. This function will take two arguments: closeModal and save.
    *   `closeModal`: callback function to trigger closing the modal window.
    *   `save`: callback function to trigger saving the new row data.
    *
    * The default `InsertModalHeader` component is also exported as a component, so that you can use it as the base
    * for your own custom component.
    */
  var insertModalHeader: js.UndefOr[
    js.Function2[/* closeModal */ js.Function0[Unit], /* save */ js.Function0[Unit], ReactElement]
  ] = js.native
  
  /**
    * Customize the text on the insert button.
    */
  var insertText: js.UndefOr[String] = js.native
  
  /**
    * Function to verify that a key being generated in the Insert Modal is a valid key.
    * If the key fails validation, return a string error message.
    * If the key is ok, return void.
    */
  var isValidKey: js.UndefOr[js.Function1[/* key */ Double | String, String | Unit]] = js.native
  
  /**
    * Flag to indicate that the table should keep the SizePerPage dropdown open if the table rerenders without any
    * user interaction.
    */
  var keepSizePerPageState: js.UndefOr[Boolean] = js.native
  
  /**
    * Customize the text of last page button.
    * If using the default pagination panel, this should be a string to use for the button label.
    * If creating a custom pagination panel, this is passed to the panel and can be of any type desired.
    */
  var lastPage: js.UndefOr[js.Any] = js.native
  
  /**
    * Customize the tooltip text shown when hovering over the lastPage button.
    */
  var lastPageTitle: js.UndefOr[String] = js.native
  
  /**
    * Customize the text of next page button.
    * If using the default pagination panel, this should be a string to use for the button label.
    * If creating a custom pagination panel, this is passed to the panel and can be of any type desired.
    */
  var nextPage: js.UndefOr[js.Any] = js.native
  
  /**
    * Customize the tooltip text shown when hovering over the nextPage button.
    */
  var nextPageTitle: js.UndefOr[String] = js.native
  
  /**
    * Ability to disable the BOM in the exported CSV file.
    * BOM = prepend BOM for UTF-8 XML and text/ * types(including HTML) when saving the file.
    */
  var noAutoBOM: js.UndefOr[Boolean] = js.native
  
  /**
    * Change the text displayed on the table if data is empty.
    */
  var noDataText: js.UndefOr[String | ReactElement] = js.native
  
  /**
    * Assign a callback function which will be called when a row is added. This function
    * takes three arguments:
    *   `row`: which represents the new row data
    *   `colInfos`: Array of Column Descriptions for the table.
    *   `errorCallback`: Function to call to provide an async error message if the Add fails.
    * The function should either return a string immediately, or return false and then return a string through the
    * error callback function later.
    */
  var onAddRow: js.UndefOr[
    js.Function3[
      /* row */ TRow, 
      /* colInfo */ js.Array[ColumnDescription[TRow]], 
      /* errorCallback */ js.Function1[/* message */ String, Unit], 
      String | Boolean
    ]
  ] = js.native
  
  /**
    * Callback when the value in a cell has been modified. It accepts a function that takes three arguments:
    *   `row`: row that is being edited.
    *   `fieldName`: column dataField for the cell being edited.
    *   `value`: new value for the cell.
    * The function allows you to make further modifications to the cell value prior to it being saved. You need to
    * return the final cell value to use.
    */
  var onCellEdit: js.UndefOr[
    js.Function3[
      /* row */ TRow, 
      /* fieldName */ String, 
      /* import warning: importer.ImportType#apply Failed type conversion: TRow[string & keyof TRow] */ /* value */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: TRow[string & keyof TRow] */ js.Any
    ]
  ] = js.native
  
  /**
    * Assign a callback function which will be called when a row been deleted.
    * This function takes two arguments:
    *   `rowKeys`: keys for the rows to be deleted.
    *   `rows`: row data for the rows to be deleted.
    */
  var onDeleteRow: js.UndefOr[
    js.Function2[/* rowKeys */ js.Array[Double | String], /* rows */ js.Array[TRow], Unit]
  ] = js.native
  
  /**
    * Set a function to be called when expanding or collapsing a row. This function takes three arguments:
    *   `rowKey`: dataField key for the row that is expanding or collapsing.
    *   `isExpand`: True if the row is expanding, false if it is collapsing.
    *   `event`: The click event.
    */
  var onExpand: js.UndefOr[
    js.Function3[
      /* rowKey */ Double | String, 
      /* isExpand */ Boolean, 
      /* event */ MouseEvent[_, NativeMouseEvent], 
      Unit
    ]
  ] = js.native
  
  /**
    * Assign a callback function which will be called when the export csv button is clicked.
    * In this function, you need to return an array of rows to be exported.
    */
  var onExportToCSV: js.UndefOr[js.Function0[js.Array[TRow]]] = js.native
  
  /**
    * Assign a callback function which will be called when a filter condition changes.
    * This function takes one argument: filterObj which is an object which take dataField
    * as object key and the value is the filter condition.
    */
  var onFilterChange: js.UndefOr[js.Function1[/* filterObject */ FilterData[_], Unit]] = js.native
  
  /**
    * Assign a callback function which will be called when mouse enters the table.
    */
  var onMouseEnter: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Assign a callback function which will be called when mouse leaves the table.
    */
  var onMouseLeave: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Assign a callback function which will be called after page changed.
    * This function takes two argument: page and sizePerPage.
    *   `page`: New page number
    *   `sizePerPage`: The number of rows to display in one page.
    */
  var onPageChange: js.UndefOr[js.Function2[/* page */ Double, /* sizePerPage */ Double, Unit]] = js.native
  
  /**
    * Assign a callback function which will be called after a row click.
    * This function takes four arguments:
    *   `row`: which is the row data that was clicked on.
    *   `columnIndex`: index of the column that was clicked on.
    *   `rowIndex`: index of the row that was clicked on.
    *   `event`: the click event.
    */
  var onRowClick: js.UndefOr[
    js.Function4[
      /* row */ TRow, 
      /* columnIndex */ Double, 
      /* rowIndex */ Double, 
      /* event */ MouseEvent[_, NativeMouseEvent], 
      Unit
    ]
  ] = js.native
  
  /**
    * Assign a callback function which will be called after a row double click.
    * This function takes two arguments:
    *   `row`: which is the row data that was double clicked on.
    *   `event`: the double click event.
    */
  var onRowDoubleClick: js.UndefOr[js.Function2[/* row */ TRow, /* event */ MouseEvent[_, NativeMouseEvent], Unit]] = js.native
  
  /**
    * Assign a callback function which will be called when mouse leaves a row in table.
    * This function takes two arguments:
    *   `row`: the row data the mouse entered
    *   `e`: the mouse event data
    */
  var onRowMouseOut: js.UndefOr[js.Function2[/* row */ TRow, /* e */ MouseEvent[_, NativeMouseEvent], Unit]] = js.native
  
  /**
    * Assign a callback function which will be called when the mouse enters a row in table.
    * This function takes two arguments:
    *   `row`: the row data the mouse entered
    *   `e`: the mouse event data
    */
  var onRowMouseOver: js.UndefOr[js.Function2[/* row */ TRow, /* e */ MouseEvent[_, NativeMouseEvent], Unit]] = js.native
  
  /**
    * Assign a callback function which will be called when search text changes. This function takes
    * three argument:
    *   `searchText`: the text from the search field.
    *   `colInfos`: Array of column settings (e.g. filterFormatted, etc).
    *   `multiColumnSearch`: True if multiple column search is enabled.
    * In most cases, you only need to use searchText. This function usually used for remote searching.
    */
  var onSearchChange: js.UndefOr[
    js.Function3[
      /* searchText */ String, 
      /* colInfos */ js.Array[ColumnDescription[TRow]], 
      /* multiColumnSearch */ Boolean, 
      Unit
    ]
  ] = js.native
  
  /**
    * Assign a callback function which will be called after the size per page (number of rows per page)
    * has been changed.
    * This function takes one argument: sizePerPage.
    *   `sizePerPage`: The new number of rows to display in one page.
    */
  var onSizePerPageList: js.UndefOr[js.Function1[/* sizePerPage */ Double, Unit]] = js.native
  
  /**
    * Assign a callback function which will be called after triggering sorting.
    * This function takes two argument: `sortName` and `sortOrder`.
    *   `sortName`: The sort column name, or array of column names if multi-column sort is active.
    *   `sortOrder`: The sort ordering, or array of ordering if multi-column sort is active.
    */
  var onSortChange: js.UndefOr[
    js.Function2[
      (/* sortName */ js.Array[/* keyof TRow */ String]) | (/* keyof TRow */ /* sortName */ String), 
      (/* sortOrder */ js.Array[SortOrder]) | (/* sortOrder */ SortOrder), 
      Unit
    ]
  ] = js.native
  
  /**
    * Specify that only one row should be able to be expanded at the same time.
    */
  var onlyOneExpanding: js.UndefOr[Boolean] = js.native
  
  /**
    * Accept a number, which means the page you want to show as default.
    */
  var page: js.UndefOr[Double] = js.native
  
  /**
    * Allows you to modify where to start counting the pages, e.g. to set the first page number to 0.
    * Default is 1.
    */
  var pageStartIndex: js.UndefOr[Double] = js.native
  
  /**
    * Function to customize all of components for pagination, including the sizePerPage dropdown and the
    * pagination list.
    */
  var paginationPanel: js.UndefOr[js.Function1[/* props */ PaginationPanelProps, ReactElement]] = js.native
  
  /**
    * Location for the pagination panel to be displayed. Options are 'top' (above the table), 'bottom'
    * (below the table) and 'both' (above and below the table).
    */
  var paginationPosition: js.UndefOr[PaginationPostion] = js.native
  
  /**
    * Display a short text showing the total number of rows and current lines displayed,
    * default is false. If you want to customize this short text, you can give a function
    * and this function take three arguments:
    *  `start`: Current start index
    *  `to`: Current end index
    *  `total`: The total data volume.
    */
  var paginationShowsTotal: js.UndefOr[
    Boolean | (js.Function3[/* start */ Double, /* to */ Double, /* total */ Double, String | ReactElement])
  ] = js.native
  
  /**
    * Number of page buttons to show on the pagination bar, default is 5.
    * i.e. previous 2 pages + current page + next two pages = 5.
    */
  var paginationSize: js.UndefOr[Double] = js.native
  
  /**
    * Customize the text of previouse page button.
    * If using the default pagination panel, this should be a string to use for the button label.
    * If creating a custom pagination panel, this is passed to the panel and can be of any type desired.
    */
  var prePage: js.UndefOr[js.Any] = js.native
  
  /**
    * Customize the tooltip text shown when hovering over the prePage button.
    */
  var prePageTitle: js.UndefOr[String] = js.native
  
  /**
    * Default is true. If false, during printing the toolbar is hidden.
    */
  var printToolBar: js.UndefOr[Boolean] = js.native
  
  /**
    * Customize the text on the save button in the insert modal.
    */
  var saveText: js.UndefOr[String] = js.native
  
  /**
    * A delay for trigger search after a keyup (millisecond)
    */
  var searchDelayTime: js.UndefOr[Double] = js.native
  
  /**
    * You can custom the search input field only by searchField in options props. searchField only accept a
    * function and a JSX returned value is necessary.
    *
    * The default `SearchField` component is also exported as a component, so that you can use it as the base for
    * your custom component.
    */
  var searchField: js.UndefOr[js.Function1[/* props */ SearchFieldProps, ReactElement]] = js.native
  
  /**
    * You can custom the whole search panel(right side) by searchPanel in options props. searchPanel only accept
    * a function and a JSX returned value is necessary. This function will take one argument: props, that contains:
    *   `searchField`: the default search field component
    *   `clearBtn`: the default clear button component
    *   `defaultValue`: the default text for the search field
    *   `placeholder`: the default placeholder text for the search field
    *   `clearBtnClick`: the callback function to use when the clear search button is clicked
    *   `search`: the callback function for triggering the search, which takes the search text as an input.
    */
  var searchPanel: js.UndefOr[js.Function1[/* props */ SearchPanelProps, ReactElement]] = js.native
  
  /**
    * It's available to custom select only toggle button by configuring showSelectedOnlyBtn in options props.
    * showSelectedOnlyBtn only accept a function and a JSX returned value is necessary.
    * This function will take two argument: onClick and showSelected.
    *
    * The default `ShowSelectedOnlyButton` component is also exported as a component, so that you can use it as
    * the base for your custom component.
    */
  var showSelectedOnlyBtn: js.UndefOr[
    js.Function2[
      /* onClick */ js.Function1[/* e */ MouseEvent[_, NativeMouseEvent], Unit], 
      /* showSelected */ Boolean, 
      ReactElement
    ]
  ] = js.native
  
  /**
    * Current chosen size per page.
    */
  var sizePerPage: js.UndefOr[Double] = js.native
  
  /**
    * Function to customize the sizePerPage dropdown.
    */
  var sizePerPageDropDown: js.UndefOr[js.Function1[/* props */ SizePerPageFunctionProps, ReactElement]] = js.native
  
  /**
    * You can change the dropdown list for size per page if you enable pagination.
    * Default is [10, 25, 30, 50].
    */
  var sizePerPageList: js.UndefOr[SizePerPageList] = js.native
  
  /**
    * Set to false to disable sort indicators on header columns, default is true.
    */
  var sortIndicator: js.UndefOr[Boolean] = js.native
  
  /**
    * Provide the name of the column that should be sorted by.
    * If multi-column sort is active, this is an array of columns.
    * If there should be no active sort, both sortName and sortOrder should be undefined.
    */
  var sortName: js.UndefOr[(/* keyof TRow */ String) | (js.Array[/* keyof TRow */ String])] = js.native
  
  /**
    * Specify whether the sort should be ascending or descending.
    * If multi-column sort is active, this is an array of sortOrder items.
    * If there should be no active sort, both sortName and sortOrder should be undefined.
    */
  var sortOrder: js.UndefOr[SortOrder | js.Array[SortOrder]] = js.native
  
  /**
    * ToolBar is the area on the top of table, it contain the search panel, buttons for data manipulation.
    * After v3.0.0, you can custom all the components in the ToolBar also itself too.
    * Give a toolBar in options props and toolBar only accept a function and a JSX returned value is necessary.
    */
  var toolBar: js.UndefOr[js.Function1[/* props */ ToolBarProps, ReactElement]] = js.native
  
  /**
    * Flag to indicate whether there should be buttons for First and Last page.
    */
  var withFirstAndLast: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, this hides the noDataText on the table when the tableis empty. Default is false.
    */
  var withoutNoDataText: js.UndefOr[Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply[TRow /* <: js.Object */](): Options[TRow] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options[TRow]]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options[_], TRow /* <: js.Object */] (val x: Self with Options[TRow]) extends AnyVal {
    
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
    def setAfterColumnFilter(value: (/* filterConds */ js.Array[FilterData[_]], /* result */ js.Array[TRow]) => Unit): Self = this.set("afterColumnFilter", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteAfterColumnFilter: Self = this.set("afterColumnFilter", js.undefined)
    
    @scala.inline
    def setAfterDeleteRow(value: (/* rowKeys */ js.Array[Double | String], /* rows */ js.Array[TRow]) => Unit): Self = this.set("afterDeleteRow", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteAfterDeleteRow: Self = this.set("afterDeleteRow", js.undefined)
    
    @scala.inline
    def setAfterInsertRow(value: /* row */ TRow => Unit): Self = this.set("afterInsertRow", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAfterInsertRow: Self = this.set("afterInsertRow", js.undefined)
    
    @scala.inline
    def setAfterSearch(value: (/* search */ String, /* result */ js.Array[TRow]) => Unit): Self = this.set("afterSearch", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteAfterSearch: Self = this.set("afterSearch", js.undefined)
    
    @scala.inline
    def setAfterTableComplete(value: () => Unit): Self = this.set("afterTableComplete", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteAfterTableComplete: Self = this.set("afterTableComplete", js.undefined)
    
    @scala.inline
    def setAlwaysShowAllBtns(value: Boolean): Self = this.set("alwaysShowAllBtns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlwaysShowAllBtns: Self = this.set("alwaysShowAllBtns", js.undefined)
    
    @scala.inline
    def setBeforeShowError(value: (/* type */ EditValidatorType, /* msg */ String, /* title */ String) => Boolean | Unit): Self = this.set("beforeShowError", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteBeforeShowError: Self = this.set("beforeShowError", js.undefined)
    
    @scala.inline
    def setBtnGroup(value: /* props */ ButtonGroupProps => ReactElement): Self = this.set("btnGroup", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBtnGroup: Self = this.set("btnGroup", js.undefined)
    
    @scala.inline
    def setClearSearch(value: Boolean): Self = this.set("clearSearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClearSearch: Self = this.set("clearSearch", js.undefined)
    
    @scala.inline
    def setClearSearchBtn(value: /* onClick */ js.Function1[/* e */ MouseEvent[_, NativeMouseEvent], Unit] => ReactElement): Self = this.set("clearSearchBtn", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteClearSearchBtn: Self = this.set("clearSearchBtn", js.undefined)
    
    @scala.inline
    def setCloseText(value: String): Self = this.set("closeText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseText: Self = this.set("closeText", js.undefined)
    
    @scala.inline
    def setDefaultSearch(value: String): Self = this.set("defaultSearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultSearch: Self = this.set("defaultSearch", js.undefined)
    
    @scala.inline
    def setDefaultSortName(value: /* keyof TRow */ String): Self = this.set("defaultSortName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultSortName: Self = this.set("defaultSortName", js.undefined)
    
    @scala.inline
    def setDefaultSortOrder(value: SortOrder): Self = this.set("defaultSortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultSortOrder: Self = this.set("defaultSortOrder", js.undefined)
    
    @scala.inline
    def setDeleteBtn(value: /* onClick */ js.Function1[/* e */ MouseEvent[_, NativeMouseEvent], Unit] => ReactElement): Self = this.set("deleteBtn", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDeleteBtn: Self = this.set("deleteBtn", js.undefined)
    
    @scala.inline
    def setDeleteText(value: String): Self = this.set("deleteText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteText: Self = this.set("deleteText", js.undefined)
    
    @scala.inline
    def setExpandAll(value: Boolean): Self = this.set("expandAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpandAll: Self = this.set("expandAll", js.undefined)
    
    @scala.inline
    def setExpandBodyClassFunction3(value: (/* row */ TRow, /* rowIndex */ Double, /* isExpanding */ Boolean) => String): Self = this.set("expandBodyClass", js.Any.fromFunction3(value))
    
    @scala.inline
    def setExpandBodyClass(
      value: String | (js.Function3[/* row */ TRow, /* rowIndex */ Double, /* isExpanding */ Boolean, String])
    ): Self = this.set("expandBodyClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpandBodyClass: Self = this.set("expandBodyClass", js.undefined)
    
    @scala.inline
    def setExpandBy(value: ExpandBy): Self = this.set("expandBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpandBy: Self = this.set("expandBy", js.undefined)
    
    @scala.inline
    def setExpandParentClassFunction2(value: (/* row */ TRow, /* rowIndex */ Double) => String): Self = this.set("expandParentClass", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExpandParentClass(value: String | (js.Function2[/* row */ TRow, /* rowIndex */ Double, String])): Self = this.set("expandParentClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpandParentClass: Self = this.set("expandParentClass", js.undefined)
    
    @scala.inline
    def setExpandRowBgColor(value: String): Self = this.set("expandRowBgColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpandRowBgColor: Self = this.set("expandRowBgColor", js.undefined)
    
    @scala.inline
    def setExpandingVarargs(value: (Double | String)*): Self = this.set("expanding", js.Array(value :_*))
    
    @scala.inline
    def setExpanding(value: js.Array[Double | String]): Self = this.set("expanding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpanding: Self = this.set("expanding", js.undefined)
    
    @scala.inline
    def setExportCSVBtn(value: /* onClick */ js.Function1[/* e */ MouseEvent[_, NativeMouseEvent], Unit] => ReactElement): Self = this.set("exportCSVBtn", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteExportCSVBtn: Self = this.set("exportCSVBtn", js.undefined)
    
    @scala.inline
    def setExportCSVSeparator(value: String): Self = this.set("exportCSVSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExportCSVSeparator: Self = this.set("exportCSVSeparator", js.undefined)
    
    @scala.inline
    def setExportCSVText(value: String): Self = this.set("exportCSVText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExportCSVText: Self = this.set("exportCSVText", js.undefined)
    
    @scala.inline
    def setFirstPage(value: js.Any): Self = this.set("firstPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstPage: Self = this.set("firstPage", js.undefined)
    
    @scala.inline
    def setFirstPageTitle(value: String): Self = this.set("firstPageTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstPageTitle: Self = this.set("firstPageTitle", js.undefined)
    
    @scala.inline
    def setHandleConfirmDeleteRow(value: (/* next */ js.Function0[Unit], /* rowKeys */ js.Array[Double | String]) => Unit): Self = this.set("handleConfirmDeleteRow", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteHandleConfirmDeleteRow: Self = this.set("handleConfirmDeleteRow", js.undefined)
    
    @scala.inline
    def setHidePageListOnlyOnePage(value: Boolean): Self = this.set("hidePageListOnlyOnePage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHidePageListOnlyOnePage: Self = this.set("hidePageListOnlyOnePage", js.undefined)
    
    @scala.inline
    def setHideSizePerPage(value: Boolean): Self = this.set("hideSizePerPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideSizePerPage: Self = this.set("hideSizePerPage", js.undefined)
    
    @scala.inline
    def setIgnoreEditable(value: Boolean): Self = this.set("ignoreEditable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreEditable: Self = this.set("ignoreEditable", js.undefined)
    
    @scala.inline
    def setInsertBtn(value: /* onClick */ js.Function1[/* e */ MouseEvent[_, NativeMouseEvent], Unit] => ReactElement): Self = this.set("insertBtn", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteInsertBtn: Self = this.set("insertBtn", js.undefined)
    
    @scala.inline
    def setInsertFailIndicator(value: String): Self = this.set("insertFailIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertFailIndicator: Self = this.set("insertFailIndicator", js.undefined)
    
    @scala.inline
    def setInsertModal(
      value: (/* onModalClose */ js.Function0[Unit], /* onSave */ js.Function1[/* row */ TRow, Unit], /* columns */ js.Array[InsertModalColumnDescription[TRow]], /* validateState */ StringDictionary[String], /* ignoreEditable */ Boolean) => ReactElement
    ): Self = this.set("insertModal", js.Any.fromFunction5(value))
    
    @scala.inline
    def deleteInsertModal: Self = this.set("insertModal", js.undefined)
    
    @scala.inline
    def setInsertModalBody(
      value: (/* columns */ js.Array[InsertModalColumnDescription[TRow]], /* validateState */ StringDictionary[String], /* ignoreEditable */ Boolean) => ReactElement
    ): Self = this.set("insertModalBody", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteInsertModalBody: Self = this.set("insertModalBody", js.undefined)
    
    @scala.inline
    def setInsertModalFooter(value: (/* closeModal */ js.Function0[Unit], /* save */ js.Function0[Unit]) => ReactElement): Self = this.set("insertModalFooter", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteInsertModalFooter: Self = this.set("insertModalFooter", js.undefined)
    
    @scala.inline
    def setInsertModalHeader(value: (/* closeModal */ js.Function0[Unit], /* save */ js.Function0[Unit]) => ReactElement): Self = this.set("insertModalHeader", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteInsertModalHeader: Self = this.set("insertModalHeader", js.undefined)
    
    @scala.inline
    def setInsertText(value: String): Self = this.set("insertText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertText: Self = this.set("insertText", js.undefined)
    
    @scala.inline
    def setIsValidKey(value: /* key */ Double | String => String | Unit): Self = this.set("isValidKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteIsValidKey: Self = this.set("isValidKey", js.undefined)
    
    @scala.inline
    def setKeepSizePerPageState(value: Boolean): Self = this.set("keepSizePerPageState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepSizePerPageState: Self = this.set("keepSizePerPageState", js.undefined)
    
    @scala.inline
    def setLastPage(value: js.Any): Self = this.set("lastPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastPage: Self = this.set("lastPage", js.undefined)
    
    @scala.inline
    def setLastPageTitle(value: String): Self = this.set("lastPageTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastPageTitle: Self = this.set("lastPageTitle", js.undefined)
    
    @scala.inline
    def setNextPage(value: js.Any): Self = this.set("nextPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPage: Self = this.set("nextPage", js.undefined)
    
    @scala.inline
    def setNextPageTitle(value: String): Self = this.set("nextPageTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageTitle: Self = this.set("nextPageTitle", js.undefined)
    
    @scala.inline
    def setNoAutoBOM(value: Boolean): Self = this.set("noAutoBOM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoAutoBOM: Self = this.set("noAutoBOM", js.undefined)
    
    @scala.inline
    def setNoDataText(value: String | ReactElement): Self = this.set("noDataText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoDataText: Self = this.set("noDataText", js.undefined)
    
    @scala.inline
    def setOnAddRow(
      value: (/* row */ TRow, /* colInfo */ js.Array[ColumnDescription[TRow]], /* errorCallback */ js.Function1[/* message */ String, Unit]) => String | Boolean
    ): Self = this.set("onAddRow", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnAddRow: Self = this.set("onAddRow", js.undefined)
    
    @scala.inline
    def setOnCellEdit(
      value: (/* row */ TRow, /* fieldName */ String, /* import warning: importer.ImportType#apply Failed type conversion: TRow[string & keyof TRow] */ /* value */ js.Any) => /* import warning: importer.ImportType#apply Failed type conversion: TRow[string & keyof TRow] */ js.Any
    ): Self = this.set("onCellEdit", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnCellEdit: Self = this.set("onCellEdit", js.undefined)
    
    @scala.inline
    def setOnDeleteRow(value: (/* rowKeys */ js.Array[Double | String], /* rows */ js.Array[TRow]) => Unit): Self = this.set("onDeleteRow", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnDeleteRow: Self = this.set("onDeleteRow", js.undefined)
    
    @scala.inline
    def setOnExpand(
      value: (/* rowKey */ Double | String, /* isExpand */ Boolean, /* event */ MouseEvent[_, NativeMouseEvent]) => Unit
    ): Self = this.set("onExpand", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnExpand: Self = this.set("onExpand", js.undefined)
    
    @scala.inline
    def setOnExportToCSV(value: () => js.Array[TRow]): Self = this.set("onExportToCSV", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnExportToCSV: Self = this.set("onExportToCSV", js.undefined)
    
    @scala.inline
    def setOnFilterChange(value: /* filterObject */ FilterData[_] => Unit): Self = this.set("onFilterChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFilterChange: Self = this.set("onFilterChange", js.undefined)
    
    @scala.inline
    def setOnMouseEnter(value: () => Unit): Self = this.set("onMouseEnter", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnMouseEnter: Self = this.set("onMouseEnter", js.undefined)
    
    @scala.inline
    def setOnMouseLeave(value: () => Unit): Self = this.set("onMouseLeave", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnMouseLeave: Self = this.set("onMouseLeave", js.undefined)
    
    @scala.inline
    def setOnPageChange(value: (/* page */ Double, /* sizePerPage */ Double) => Unit): Self = this.set("onPageChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnPageChange: Self = this.set("onPageChange", js.undefined)
    
    @scala.inline
    def setOnRowClick(
      value: (/* row */ TRow, /* columnIndex */ Double, /* rowIndex */ Double, /* event */ MouseEvent[_, NativeMouseEvent]) => Unit
    ): Self = this.set("onRowClick", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteOnRowClick: Self = this.set("onRowClick", js.undefined)
    
    @scala.inline
    def setOnRowDoubleClick(value: (/* row */ TRow, /* event */ MouseEvent[_, NativeMouseEvent]) => Unit): Self = this.set("onRowDoubleClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnRowDoubleClick: Self = this.set("onRowDoubleClick", js.undefined)
    
    @scala.inline
    def setOnRowMouseOut(value: (/* row */ TRow, /* e */ MouseEvent[_, NativeMouseEvent]) => Unit): Self = this.set("onRowMouseOut", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnRowMouseOut: Self = this.set("onRowMouseOut", js.undefined)
    
    @scala.inline
    def setOnRowMouseOver(value: (/* row */ TRow, /* e */ MouseEvent[_, NativeMouseEvent]) => Unit): Self = this.set("onRowMouseOver", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnRowMouseOver: Self = this.set("onRowMouseOver", js.undefined)
    
    @scala.inline
    def setOnSearchChange(
      value: (/* searchText */ String, /* colInfos */ js.Array[ColumnDescription[TRow]], /* multiColumnSearch */ Boolean) => Unit
    ): Self = this.set("onSearchChange", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnSearchChange: Self = this.set("onSearchChange", js.undefined)
    
    @scala.inline
    def setOnSizePerPageList(value: /* sizePerPage */ Double => Unit): Self = this.set("onSizePerPageList", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSizePerPageList: Self = this.set("onSizePerPageList", js.undefined)
    
    @scala.inline
    def setOnSortChange(
      value: ((/* sortName */ js.Array[/* keyof TRow */ String]) | (/* keyof TRow */ /* sortName */ String), (/* sortOrder */ js.Array[SortOrder]) | (/* sortOrder */ SortOrder)) => Unit
    ): Self = this.set("onSortChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnSortChange: Self = this.set("onSortChange", js.undefined)
    
    @scala.inline
    def setOnlyOneExpanding(value: Boolean): Self = this.set("onlyOneExpanding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnlyOneExpanding: Self = this.set("onlyOneExpanding", js.undefined)
    
    @scala.inline
    def setPage(value: Double): Self = this.set("page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePage: Self = this.set("page", js.undefined)
    
    @scala.inline
    def setPageStartIndex(value: Double): Self = this.set("pageStartIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageStartIndex: Self = this.set("pageStartIndex", js.undefined)
    
    @scala.inline
    def setPaginationPanel(value: /* props */ PaginationPanelProps => ReactElement): Self = this.set("paginationPanel", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePaginationPanel: Self = this.set("paginationPanel", js.undefined)
    
    @scala.inline
    def setPaginationPosition(value: PaginationPostion): Self = this.set("paginationPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaginationPosition: Self = this.set("paginationPosition", js.undefined)
    
    @scala.inline
    def setPaginationShowsTotalFunction3(value: (/* start */ Double, /* to */ Double, /* total */ Double) => String | ReactElement): Self = this.set("paginationShowsTotal", js.Any.fromFunction3(value))
    
    @scala.inline
    def setPaginationShowsTotal(
      value: Boolean | (js.Function3[/* start */ Double, /* to */ Double, /* total */ Double, String | ReactElement])
    ): Self = this.set("paginationShowsTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaginationShowsTotal: Self = this.set("paginationShowsTotal", js.undefined)
    
    @scala.inline
    def setPaginationSize(value: Double): Self = this.set("paginationSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaginationSize: Self = this.set("paginationSize", js.undefined)
    
    @scala.inline
    def setPrePage(value: js.Any): Self = this.set("prePage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrePage: Self = this.set("prePage", js.undefined)
    
    @scala.inline
    def setPrePageTitle(value: String): Self = this.set("prePageTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrePageTitle: Self = this.set("prePageTitle", js.undefined)
    
    @scala.inline
    def setPrintToolBar(value: Boolean): Self = this.set("printToolBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrintToolBar: Self = this.set("printToolBar", js.undefined)
    
    @scala.inline
    def setSaveText(value: String): Self = this.set("saveText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSaveText: Self = this.set("saveText", js.undefined)
    
    @scala.inline
    def setSearchDelayTime(value: Double): Self = this.set("searchDelayTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchDelayTime: Self = this.set("searchDelayTime", js.undefined)
    
    @scala.inline
    def setSearchField(value: /* props */ SearchFieldProps => ReactElement): Self = this.set("searchField", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSearchField: Self = this.set("searchField", js.undefined)
    
    @scala.inline
    def setSearchPanel(value: /* props */ SearchPanelProps => ReactElement): Self = this.set("searchPanel", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSearchPanel: Self = this.set("searchPanel", js.undefined)
    
    @scala.inline
    def setShowSelectedOnlyBtn(
      value: (/* onClick */ js.Function1[/* e */ MouseEvent[_, NativeMouseEvent], Unit], /* showSelected */ Boolean) => ReactElement
    ): Self = this.set("showSelectedOnlyBtn", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteShowSelectedOnlyBtn: Self = this.set("showSelectedOnlyBtn", js.undefined)
    
    @scala.inline
    def setSizePerPage(value: Double): Self = this.set("sizePerPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizePerPage: Self = this.set("sizePerPage", js.undefined)
    
    @scala.inline
    def setSizePerPageDropDown(value: /* props */ SizePerPageFunctionProps => ReactElement): Self = this.set("sizePerPageDropDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSizePerPageDropDown: Self = this.set("sizePerPageDropDown", js.undefined)
    
    @scala.inline
    def setSizePerPageListVarargs(value: (Double | Text)*): Self = this.set("sizePerPageList", js.Array(value :_*))
    
    @scala.inline
    def setSizePerPageList(value: SizePerPageList): Self = this.set("sizePerPageList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizePerPageList: Self = this.set("sizePerPageList", js.undefined)
    
    @scala.inline
    def setSortIndicator(value: Boolean): Self = this.set("sortIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortIndicator: Self = this.set("sortIndicator", js.undefined)
    
    @scala.inline
    def setSortNameVarargs(value: (/* keyof TRow */ String)*): Self = this.set("sortName", js.Array(value :_*))
    
    @scala.inline
    def setSortName(value: (/* keyof TRow */ String) | (js.Array[/* keyof TRow */ String])): Self = this.set("sortName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortName: Self = this.set("sortName", js.undefined)
    
    @scala.inline
    def setSortOrderVarargs(value: SortOrder*): Self = this.set("sortOrder", js.Array(value :_*))
    
    @scala.inline
    def setSortOrder(value: SortOrder | js.Array[SortOrder]): Self = this.set("sortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortOrder: Self = this.set("sortOrder", js.undefined)
    
    @scala.inline
    def setToolBar(value: /* props */ ToolBarProps => ReactElement): Self = this.set("toolBar", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteToolBar: Self = this.set("toolBar", js.undefined)
    
    @scala.inline
    def setWithFirstAndLast(value: Boolean): Self = this.set("withFirstAndLast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithFirstAndLast: Self = this.set("withFirstAndLast", js.undefined)
    
    @scala.inline
    def setWithoutNoDataText(value: Boolean): Self = this.set("withoutNoDataText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithoutNoDataText: Self = this.set("withoutNoDataText", js.undefined)
  }
}
