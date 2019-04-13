package typings
package reactDashBootstrapDashTableLib.reactDashBootstrapDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    js.Function2[/* filterConds */ js.Array[FilterData[_]], /* result */ js.Array[TRow], scala.Unit]
  ] = js.undefined
  /**
  	 * Assign a callback function which will be called after row delete.
  	 * This function takes two arguments:
  	 *   `rowKeys`: which means the row keys for the deleted rows
  	 *   `rows`: the array of row data that was deleted.
  	 */
  var afterDeleteRow: js.UndefOr[
    js.Function2[
      /* rowKeys */ js.Array[scala.Double | java.lang.String], 
      /* rows */ js.Array[TRow], 
      scala.Unit
    ]
  ] = js.undefined
  /**
  	 * Assign a callback function which will be called after inserting a row.
  	 * This function takes one argument: row, which means the whole row data you added.
  	 */
  var afterInsertRow: js.UndefOr[js.Function1[/* row */ TRow, scala.Unit]] = js.undefined
  /**
  	 * Assign a callback function which will be called after triggering searching.
  	 * This function takes two argument: search and result.
  	 *   `search`: The search text from the user.
  	 *   `result`: The results after searching (array of rows that matched the search).
  	 */
  var afterSearch: js.UndefOr[
    js.Function2[/* search */ java.lang.String, /* result */ js.Array[TRow], scala.Unit]
  ] = js.undefined
  /**
  	 * Assign a callback function that will be called after table updates.
  	 */
  var afterTableComplete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
  	 * Flag to indicate that the table should always show next/previous buttons even when there is not next/previous
  	 * page.
  	 */
  var alwaysShowAllBtns: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * You can do something before the toastr pop or even disable the toastr!!
  	 * Returning false or void will not trigger the toastr.
  	 * If you want the toastr popup, you should return true always.
  	 * Inputs match the EditValidatorObject.notification field types.
  	 */
  var beforeShowError: js.UndefOr[
    js.Function3[
      /* type */ EditValidatorType, 
      /* msg */ java.lang.String, 
      /* title */ java.lang.String, 
      scala.Boolean | scala.Unit
    ]
  ] = js.undefined
  /**
  	 * Button group which contain the insert, drop, show only select and export CSV buttons, these button all
  	 * grouped as btn-group class in bootstrap. This is a chance that you can custom this button group.
  	 * Give a btnGroup in options props and btnGroup only accept a function and a JSX returned value is necessary.
  	 * This lets you customize just the left-hand-side of the toolbar if desired.
  	 */
  var btnGroup: js.UndefOr[js.Function1[/* props */ ButtonGroupProps, reactLib.reactMod.ReactElement[_]]] = js.undefined
  /**
  	 * Only work on enable search. If true, there will be a button beside the search input field
  	 * that will empty the field when clicked.
  	 */
  var clearSearch: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * You can custom the clear button for search field by giving clearSearchBtn in options props.
  	 * clearSearchBtn only accept a function and a JSX returned value is necessary.
  	 *
  	 * The default `ClearSearchButton` component is also exported as a component, so that you can use it as the
  	 * base for your own custom component.
  	 */
  var clearSearchBtn: js.UndefOr[
    js.Function1[
      /* onClick */ js.Function1[/* e */ reactLib.reactMod.MouseEvent[_, reactLib.NativeMouseEvent], scala.Unit], 
      reactLib.reactMod.ReactElement[_]
    ]
  ] = js.undefined
  /**
  	 * Customize the text on the close button in the insert modal.
  	 */
  var closeText: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Set the default search condition.
  	 */
  var defaultSearch: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Specify the default sort column.
  	 * Note: when using cleanSort(), this default sort column will be restored.
  	 */
  var defaultSortName: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Assign a default sort order.
  	 * Note: when using cleanSort(), this default sort order will be restored.
  	 */
  var defaultSortOrder: js.UndefOr[SortOrder] = js.undefined
  /**
  	 * It's available to customize delete button by configuring deleteBtn in options props, deleteBtn onl<y
  	 * accept a function and a JSX returned value is necessary. This function will take one argument: onClick.
  	 *
  	 * The default `DeleteButton` component is also exported as a component, so that you can use it as the base
  	 * for your custom component.
  	 */
  var deleteBtn: js.UndefOr[
    js.Function1[
      /* onClick */ js.Function1[/* e */ reactLib.reactMod.MouseEvent[_, reactLib.NativeMouseEvent], scala.Unit], 
      reactLib.reactMod.ReactElement[_]
    ]
  ] = js.undefined
  /**
  	 * Customize the text on the delete button.
  	 */
  var deleteText: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Expand all rows
  	 */
  var expandAll: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Custom class to use for the expanded content section of an expanded row. This can either be a string, or a
  	 * function that returns a string and takes three arguments: row, rowIndex, isExpanding.
  	 *   `row`: the row expanding/collapsing.
  	 *   `rowIndex`: index number of the row.
  	 *   `isExpanding`: boolean flag specifying whether the field is expanding or collapsing.
  	 */
  var expandBodyClass: js.UndefOr[
    java.lang.String | (js.Function3[
      /* row */ TRow, 
      /* rowIndex */ scala.Double, 
      /* isExpanding */ scala.Boolean, 
      java.lang.String
    ])
  ] = js.undefined
  /**
  	 * Tell react-bootstrap-table how to trigger expanding by clicking on 'row' or 'column' level.
  	 * If the value is 'column', by default all the columns are expandable. If you want to specify some columns as
  	 * unexpandable, check expandable.
  	 * Default is 'row'.
  	 */
  var expandBy: js.UndefOr[ExpandBy] = js.undefined
  /**
  	 * Custom class to use for the row itself for an expanded row when it has been expanded. This can either be a
  	 * string, or a function that returns a string and takes two arguments: row and rowIndex.
  	 *   `row`: the expanded row.
  	 *   `rowIndex`: index number of the row.
  	 */
  var expandParentClass: js.UndefOr[
    java.lang.String | (js.Function2[/* row */ TRow, /* rowIndex */ scala.Double, java.lang.String])
  ] = js.undefined
  /**
  	 * Background color on expanded rows (css color value).
  	 */
  var expandRowBgColor: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Provide an array of expanded rows for the table.
  	 */
  var expanding: js.UndefOr[js.Array[scala.Double | java.lang.String]] = js.undefined
  /**
  	 * It's available to customize the export csv button by configuring exportCSVBtn in options props, exportCSVBtn only
  	 * accept a function and a JSX returned value is necessary. This function will take one argument: onClick.
  	 *
  	 * The default `ExportCSVButton` component is also exported as a component, so that you can use it as the base
  	 * for your custom component.
  	 */
  var exportCSVBtn: js.UndefOr[
    js.Function1[
      /* onClick */ js.Function1[/* e */ reactLib.reactMod.MouseEvent[_, reactLib.NativeMouseEvent], scala.Unit], 
      reactLib.reactMod.ReactElement[_]
    ]
  ] = js.undefined
  /**
  	 * Customize the field separator in a CSV export file. Default is ','.
  	 */
  var exportCSVSeparator: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Customize the text on the export csv button
  	 */
  var exportCSVText: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Customize the text of first page button.
  	 * If using the default pagination panel, this should be a string to use for the button label.
  	 * If creating a custom pagination panel, this is passed to the panel and can be of any type desired.
  	 */
  var firstPage: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Customize the tooltip text shown when hovering over the firstPage button.
  	 */
  var firstPageTitle: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Assign a callback function which will be called when deleting a row.
  	 * It gives you a chance to customize your confirmation for row deletion.
  	 * This function takes two argument: next and rowKeys:
  	 *   `next`: If you confirm the delete, call next() to continue the process.
  	 *   `rowKeys` Is the row keys to be deleted, you can call the `next` function to apply this deletion.
  	 */
  var handleConfirmDeleteRow: js.UndefOr[
    js.Function2[
      /* next */ js.Function0[scala.Unit], 
      /* rowKeys */ js.Array[scala.Double | java.lang.String], 
      scala.Unit
    ]
  ] = js.undefined
  /**
  	 * Default is false. If true, the pagination list will be hidden when there is only one page.
  	 */
  var hidePageListOnlyOnePage: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Hide the dropdown list for size per page, default is false.
  	 */
  var hideSizePerPage: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Default is false, if true means you want to ignore any editable columns when creating the insert form.
  	 */
  var ignoreEditable: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * It's available to customize the insert button by configuring insertBtn in options props, insertBtn only
  	 * accept a function and a JSX returned value is necessary. This function will take one argument: onClick.
  	 *
  	 * The default `InsertButton` component is also exported as a component, so that you can use it as the base
  	 * for your custom component.
  	 */
  var insertBtn: js.UndefOr[
    js.Function1[
      /* onClick */ js.Function1[/* e */ reactLib.reactMod.MouseEvent[_, reactLib.NativeMouseEvent], scala.Unit], 
      reactLib.reactMod.ReactElement[_]
    ]
  ] = js.undefined
  /**
  	 * Custom message to show when the InsertModal save fails validation.
  	 * Default message is 'Form validate errors, please checking!'
  	 */
  var insertFailIndicator: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * You can customize everything in the insert modal via options.insertModal and we give you the event
  	 * callback, props and some informations: onModalClose, onSave, columns, validateState, ignoreEditable
  	 * @see https://github.com/AllenFang/react-bootstrap-table/blob/master/examples/js/custom/insert-modal/custom-insert-modal.js
  	 */
  var insertModal: js.UndefOr[
    js.Function5[
      /* onModalClose */ js.Function0[scala.Unit], 
      /* onSave */ js.Function1[/* row */ TRow, scala.Unit], 
      /* columns */ js.Array[InsertModalColumnDescription[TRow]], 
      /* validateState */ org.scalablytyped.runtime.StringDictionary[java.lang.String], 
      /* ignoreEditable */ scala.Boolean, 
      reactLib.reactMod.ReactElement[_]
    ]
  ] = js.undefined
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
      /* validateState */ org.scalablytyped.runtime.StringDictionary[java.lang.String], 
      /* ignoreEditable */ scala.Boolean, 
      reactLib.reactMod.ReactElement[(reactLib.reactMod.Component[_, js.Object, _]) with ModalBodyInterface[TRow]]
    ]
  ] = js.undefined
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
    js.Function2[
      /* closeModal */ js.Function0[scala.Unit], 
      /* save */ js.Function0[scala.Unit], 
      reactLib.reactMod.ReactElement[_]
    ]
  ] = js.undefined
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
    js.Function2[
      /* closeModal */ js.Function0[scala.Unit], 
      /* save */ js.Function0[scala.Unit], 
      reactLib.reactMod.ReactElement[_]
    ]
  ] = js.undefined
  /**
  	 * Customize the text on the insert button.
  	 */
  var insertText: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Function to verify that a key being generated in the Insert Modal is a valid key.
  	 * If the key fails validation, return a string error message.
  	 * If the key is ok, return void.
  	 */
  var isValidKey: js.UndefOr[
    js.Function1[/* key */ scala.Double | java.lang.String, java.lang.String | scala.Unit]
  ] = js.undefined
  /**
  	 * Flag to indicate that the table should keep the SizePerPage dropdown open if the table rerenders without any
  	 * user interaction.
  	 */
  var keepSizePerPageState: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Customize the text of last page button.
  	 * If using the default pagination panel, this should be a string to use for the button label.
  	 * If creating a custom pagination panel, this is passed to the panel and can be of any type desired.
  	 */
  var lastPage: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Customize the tooltip text shown when hovering over the lastPage button.
  	 */
  var lastPageTitle: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Customize the text of next page button.
  	 * If using the default pagination panel, this should be a string to use for the button label.
  	 * If creating a custom pagination panel, this is passed to the panel and can be of any type desired.
  	 */
  var nextPage: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Customize the tooltip text shown when hovering over the nextPage button.
  	 */
  var nextPageTitle: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Ability to disable the BOM in the exported CSV file.
  	 * BOM = prepend BOM for UTF-8 XML and text/ * types(including HTML) when saving the file.
  	 */
  var noAutoBOM: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Change the text displayed on the table if data is empty.
  	 */
  var noDataText: js.UndefOr[java.lang.String | reactLib.reactMod.ReactElement[_]] = js.undefined
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
      /* errorCallback */ js.Function1[/* message */ java.lang.String, scala.Unit], 
      java.lang.String | scala.Boolean
    ]
  ] = js.undefined
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
      /* fieldName */ java.lang.String, 
      /* import warning: ImportType.apply Failed type conversion: TRow[string & keyof TRow] */ /* value */ js.Any, 
      /* import warning: ImportType.apply Failed type conversion: TRow[string & keyof TRow] */ js.Any
    ]
  ] = js.undefined
  /**
  	 * Assign a callback function which will be called when a row been deleted.
  	 * This function takes two arguments:
  	 *   `rowKeys`: keys for the rows to be deleted.
  	 *   `rows`: row data for the rows to be deleted.
  	 */
  var onDeleteRow: js.UndefOr[
    js.Function2[
      /* rowKeys */ js.Array[scala.Double | java.lang.String], 
      /* rows */ js.Array[TRow], 
      scala.Unit
    ]
  ] = js.undefined
  /**
  	 * Set a function to be called when expanding or collapsing a row. This function takes three arguments:
  	 *   `rowKey`: dataField key for the row that is expanding or collapsing.
  	 *   `isExpand`: True if the row is expanding, false if it is collapsing.
  	 *   `event`: The click event.
  	 */
  var onExpand: js.UndefOr[
    js.Function3[
      /* rowKey */ scala.Double | java.lang.String, 
      /* isExpand */ scala.Boolean, 
      /* event */ reactLib.reactMod.MouseEvent[_, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  /**
  	 * Assign a callback function which will be called when the export csv button is clicked.
  	 * In this function, you need to return an array of rows to be exported.
  	 */
  var onExportToCSV: js.UndefOr[js.Function0[js.Array[TRow]]] = js.undefined
  /**
  	 * Assign a callback function which will be called when a filter condition changes.
  	 * This function takes one argument: filterObj which is an object which take dataField
  	 * as object key and the value is the filter condition.
  	 */
  var onFilterChange: js.UndefOr[js.Function1[/* filterObject */ FilterData[_], scala.Unit]] = js.undefined
  /**
  	 * Assign a callback function which will be called when mouse enters the table.
  	 */
  var onMouseEnter: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
  	 * Assign a callback function which will be called when mouse leaves the table.
  	 */
  var onMouseLeave: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
  	 * Assign a callback function which will be called after page changed.
  	 * This function takes two argument: page and sizePerPage.
  	 *   `page`: New page number
  	 *   `sizePerPage`: The number of rows to display in one page.
  	 */
  var onPageChange: js.UndefOr[
    js.Function2[/* page */ scala.Double, /* sizePerPage */ scala.Double, scala.Unit]
  ] = js.undefined
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
      /* columnIndex */ scala.Double, 
      /* rowIndex */ scala.Double, 
      /* event */ reactLib.reactMod.MouseEvent[_, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  /**
  	 * Assign a callback function which will be called after a row double click.
  	 * This function takes two arguments:
  	 *   `row`: which is the row data that was double clicked on.
  	 *   `event`: the double click event.
  	 */
  var onRowDoubleClick: js.UndefOr[
    js.Function2[
      /* row */ TRow, 
      /* event */ reactLib.reactMod.MouseEvent[_, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  /**
  	 * Assign a callback function which will be called when mouse leaves a row in table.
  	 * This function takes two arguments:
  	 *   `row`: the row data the mouse entered
  	 *   `e`: the mouse event data
  	 */
  var onRowMouseOut: js.UndefOr[
    js.Function2[
      /* row */ TRow, 
      /* e */ reactLib.reactMod.MouseEvent[_, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  /**
  	 * Assign a callback function which will be called when the mouse enters a row in table.
  	 * This function takes two arguments:
  	 *   `row`: the row data the mouse entered
  	 *   `e`: the mouse event data
  	 */
  var onRowMouseOver: js.UndefOr[
    js.Function2[
      /* row */ TRow, 
      /* e */ reactLib.reactMod.MouseEvent[_, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
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
      /* searchText */ java.lang.String, 
      /* colInfos */ js.Array[ColumnDescription[TRow]], 
      /* multiColumnSearch */ scala.Boolean, 
      scala.Unit
    ]
  ] = js.undefined
  /**
  	 * Assign a callback function which will be called after the size per page (number of rows per page)
  	 * has been changed.
  	 * This function takes one argument: sizePerPage.
  	 *   `sizePerPage`: The new number of rows to display in one page.
  	 */
  var onSizePerPageList: js.UndefOr[js.Function1[/* sizePerPage */ scala.Double, scala.Unit]] = js.undefined
  /**
  	 * Assign a callback function which will be called after triggering sorting.
  	 * This function takes two argument: `sortName` and `sortOrder`.
  	 *   `sortName`: The sort column name, or array of column names if multi-column sort is active.
  	 *   `sortOrder`: The sort ordering, or array of ordering if multi-column sort is active.
  	 */
  var onSortChange: js.UndefOr[
    (js.Function2[/* sortName */ java.lang.String, /* sortOrder */ SortOrder, scala.Unit]) | (js.Function2[
      /* sortName */ js.Array[java.lang.String], 
      /* sortOrder */ js.Array[SortOrder], 
      scala.Unit
    ])
  ] = js.undefined
  /**
  	 * Specify that only one row should be able to be expanded at the same time.
  	 */
  var onlyOneExpanding: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Accept a number, which means the page you want to show as default.
  	 */
  var page: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Allows you to modify where to start counting the pages, e.g. to set the first page number to 0.
  	 * Default is 1.
  	 */
  var pageStartIndex: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Function to customize all of components for pagination, including the sizePerPage dropdown and the
  	 * pagination list.
  	 */
  var paginationPanel: js.UndefOr[
    js.Function1[/* props */ PaginationPanelProps, reactLib.reactMod.ReactElement[_]]
  ] = js.undefined
  /**
  	 * Location for the pagination panel to be displayed. Options are 'top' (above the table), 'bottom'
  	 * (below the table) and 'both' (above and below the table).
  	 */
  var paginationPosition: js.UndefOr[PaginationPostion] = js.undefined
  /**
  	 * Display a short text showing the total number of rows and current lines displayed,
  	 * default is false. If you want to customize this short text, you can give a function
  	 * and this function take three arguments:
  	 *  `start`: Current start index
  	 *  `to`: Current end index
  	 *  `total`: The total data volume.
  	 */
  var paginationShowsTotal: js.UndefOr[
    scala.Boolean | (js.Function3[
      /* start */ scala.Double, 
      /* to */ scala.Double, 
      /* total */ scala.Double, 
      java.lang.String | reactLib.reactMod.ReactElement[_]
    ])
  ] = js.undefined
  /**
  	 * Number of page buttons to show on the pagination bar, default is 5.
  	 * i.e. previous 2 pages + current page + next two pages = 5.
  	 */
  var paginationSize: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Customize the text of previouse page button.
  	 * If using the default pagination panel, this should be a string to use for the button label.
  	 * If creating a custom pagination panel, this is passed to the panel and can be of any type desired.
  	 */
  var prePage: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Customize the tooltip text shown when hovering over the prePage button.
  	 */
  var prePageTitle: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Default is true. If false, during printing the toolbar is hidden.
  	 */
  var printToolBar: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Customize the text on the save button in the insert modal.
  	 */
  var saveText: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * A delay for trigger search after a keyup (millisecond)
  	 */
  var searchDelayTime: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * You can custom the search input field only by searchField in options props. searchField only accept a
  	 * function and a JSX returned value is necessary.
  	 *
  	 * The default `SearchField` component is also exported as a component, so that you can use it as the base for
  	 * your custom component.
  	 */
  var searchField: js.UndefOr[
    js.Function1[
      /* props */ SearchFieldProps, 
      reactLib.reactMod.ReactElement[(reactLib.reactMod.Component[_, js.Object, _]) with SearchFieldInterface]
    ]
  ] = js.undefined
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
  var searchPanel: js.UndefOr[js.Function1[/* props */ SearchPanelProps, reactLib.reactMod.ReactElement[_]]] = js.undefined
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
      /* onClick */ js.Function1[/* e */ reactLib.reactMod.MouseEvent[_, reactLib.NativeMouseEvent], scala.Unit], 
      /* showSelected */ scala.Boolean, 
      reactLib.reactMod.ReactElement[_]
    ]
  ] = js.undefined
  /**
  	 * Current chosen size per page.
  	 */
  var sizePerPage: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Function to customize the sizePerPage dropdown.
  	 */
  var sizePerPageDropDown: js.UndefOr[
    js.Function1[/* props */ SizePerPageFunctionProps, reactLib.reactMod.ReactElement[_]]
  ] = js.undefined
  /**
  	 * You can change the dropdown list for size per page if you enable pagination.
  	 * Default is [10, 25, 30, 50].
  	 */
  var sizePerPageList: js.UndefOr[SizePerPageList] = js.undefined
  /**
  	 * Set to false to disable sort indicators on header columns, default is true.
  	 */
  var sortIndicator: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Provide the name of the column that should be sorted by.
  	 * If multi-column sort is active, this is an array of columns.
  	 * If there should be no active sort, both sortName and sortOrder should be undefined.
  	 */
  var sortName: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Specify whether the sort should be ascending or descending.
  	 * If multi-column sort is active, this is an array of sortOrder items.
  	 * If there should be no active sort, both sortName and sortOrder should be undefined.
  	 */
  var sortOrder: js.UndefOr[SortOrder | js.Array[SortOrder]] = js.undefined
  /**
  	 * ToolBar is the area on the top of table, it contain the search panel, buttons for data manipulation.
  	 * After v3.0.0, you can custom all the components in the ToolBar also itself too.
  	 * Give a toolBar in options props and toolBar only accept a function and a JSX returned value is necessary.
  	 */
  var toolBar: js.UndefOr[js.Function1[/* props */ ToolBarProps, reactLib.reactMod.ReactElement[_]]] = js.undefined
  /**
  	 * Flag to indicate whether there should be buttons for First and Last page.
  	 */
  var withFirstAndLast: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * If true, this hides the noDataText on the table when the tableis empty. Default is false.
  	 */
  var withoutNoDataText: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply[TRow /* <: js.Object */](
    afterColumnFilter: (/* filterConds */ js.Array[FilterData[_]], /* result */ js.Array[TRow]) => scala.Unit = null,
    afterDeleteRow: (/* rowKeys */ js.Array[scala.Double | java.lang.String], /* rows */ js.Array[TRow]) => scala.Unit = null,
    afterInsertRow: /* row */ TRow => scala.Unit = null,
    afterSearch: (/* search */ java.lang.String, /* result */ js.Array[TRow]) => scala.Unit = null,
    afterTableComplete: () => scala.Unit = null,
    alwaysShowAllBtns: js.UndefOr[scala.Boolean] = js.undefined,
    beforeShowError: (/* type */ EditValidatorType, /* msg */ java.lang.String, /* title */ java.lang.String) => scala.Boolean | scala.Unit = null,
    btnGroup: /* props */ ButtonGroupProps => reactLib.reactMod.ReactElement[_] = null,
    clearSearch: js.UndefOr[scala.Boolean] = js.undefined,
    clearSearchBtn: /* onClick */ js.Function1[/* e */ reactLib.reactMod.MouseEvent[_, reactLib.NativeMouseEvent], scala.Unit] => reactLib.reactMod.ReactElement[_] = null,
    closeText: java.lang.String = null,
    defaultSearch: java.lang.String = null,
    defaultSortName: java.lang.String = null,
    defaultSortOrder: SortOrder = null,
    deleteBtn: /* onClick */ js.Function1[/* e */ reactLib.reactMod.MouseEvent[_, reactLib.NativeMouseEvent], scala.Unit] => reactLib.reactMod.ReactElement[_] = null,
    deleteText: java.lang.String = null,
    expandAll: js.UndefOr[scala.Boolean] = js.undefined,
    expandBodyClass: java.lang.String | (js.Function3[
      /* row */ TRow, 
      /* rowIndex */ scala.Double, 
      /* isExpanding */ scala.Boolean, 
      java.lang.String
    ]) = null,
    expandBy: ExpandBy = null,
    expandParentClass: java.lang.String | (js.Function2[/* row */ TRow, /* rowIndex */ scala.Double, java.lang.String]) = null,
    expandRowBgColor: java.lang.String = null,
    expanding: js.Array[scala.Double | java.lang.String] = null,
    exportCSVBtn: /* onClick */ js.Function1[/* e */ reactLib.reactMod.MouseEvent[_, reactLib.NativeMouseEvent], scala.Unit] => reactLib.reactMod.ReactElement[_] = null,
    exportCSVSeparator: java.lang.String = null,
    exportCSVText: java.lang.String = null,
    firstPage: js.Any = null,
    firstPageTitle: java.lang.String = null,
    handleConfirmDeleteRow: (/* next */ js.Function0[scala.Unit], /* rowKeys */ js.Array[scala.Double | java.lang.String]) => scala.Unit = null,
    hidePageListOnlyOnePage: js.UndefOr[scala.Boolean] = js.undefined,
    hideSizePerPage: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreEditable: js.UndefOr[scala.Boolean] = js.undefined,
    insertBtn: /* onClick */ js.Function1[/* e */ reactLib.reactMod.MouseEvent[_, reactLib.NativeMouseEvent], scala.Unit] => reactLib.reactMod.ReactElement[_] = null,
    insertFailIndicator: java.lang.String = null,
    insertModal: (/* onModalClose */ js.Function0[scala.Unit], /* onSave */ js.Function1[/* row */ TRow, scala.Unit], /* columns */ js.Array[InsertModalColumnDescription[TRow]], /* validateState */ org.scalablytyped.runtime.StringDictionary[java.lang.String], /* ignoreEditable */ scala.Boolean) => reactLib.reactMod.ReactElement[_] = null,
    insertModalBody: (/* columns */ js.Array[InsertModalColumnDescription[TRow]], /* validateState */ org.scalablytyped.runtime.StringDictionary[java.lang.String], /* ignoreEditable */ scala.Boolean) => reactLib.reactMod.ReactElement[(reactLib.reactMod.Component[_, js.Object, _]) with ModalBodyInterface[TRow]] = null,
    insertModalFooter: (/* closeModal */ js.Function0[scala.Unit], /* save */ js.Function0[scala.Unit]) => reactLib.reactMod.ReactElement[_] = null,
    insertModalHeader: (/* closeModal */ js.Function0[scala.Unit], /* save */ js.Function0[scala.Unit]) => reactLib.reactMod.ReactElement[_] = null,
    insertText: java.lang.String = null,
    isValidKey: /* key */ scala.Double | java.lang.String => java.lang.String | scala.Unit = null,
    keepSizePerPageState: js.UndefOr[scala.Boolean] = js.undefined,
    lastPage: js.Any = null,
    lastPageTitle: java.lang.String = null,
    nextPage: js.Any = null,
    nextPageTitle: java.lang.String = null,
    noAutoBOM: js.UndefOr[scala.Boolean] = js.undefined,
    noDataText: java.lang.String | reactLib.reactMod.ReactElement[_] = null,
    onAddRow: (/* row */ TRow, /* colInfo */ js.Array[ColumnDescription[TRow]], /* errorCallback */ js.Function1[/* message */ java.lang.String, scala.Unit]) => java.lang.String | scala.Boolean = null,
    onCellEdit: (/* row */ TRow, /* fieldName */ java.lang.String, /* import warning: ImportType.apply Failed type conversion: TRow[string & keyof TRow] */ /* value */ js.Any) => /* import warning: ImportType.apply Failed type conversion: TRow[string & keyof TRow] */ js.Any = null,
    onDeleteRow: (/* rowKeys */ js.Array[scala.Double | java.lang.String], /* rows */ js.Array[TRow]) => scala.Unit = null,
    onExpand: (/* rowKey */ scala.Double | java.lang.String, /* isExpand */ scala.Boolean, /* event */ reactLib.reactMod.MouseEvent[_, reactLib.NativeMouseEvent]) => scala.Unit = null,
    onExportToCSV: () => js.Array[TRow] = null,
    onFilterChange: /* filterObject */ FilterData[_] => scala.Unit = null,
    onMouseEnter: () => scala.Unit = null,
    onMouseLeave: () => scala.Unit = null,
    onPageChange: (/* page */ scala.Double, /* sizePerPage */ scala.Double) => scala.Unit = null,
    onRowClick: (/* row */ TRow, /* columnIndex */ scala.Double, /* rowIndex */ scala.Double, /* event */ reactLib.reactMod.MouseEvent[_, reactLib.NativeMouseEvent]) => scala.Unit = null,
    onRowDoubleClick: (/* row */ TRow, /* event */ reactLib.reactMod.MouseEvent[_, reactLib.NativeMouseEvent]) => scala.Unit = null,
    onRowMouseOut: (/* row */ TRow, /* e */ reactLib.reactMod.MouseEvent[_, reactLib.NativeMouseEvent]) => scala.Unit = null,
    onRowMouseOver: (/* row */ TRow, /* e */ reactLib.reactMod.MouseEvent[_, reactLib.NativeMouseEvent]) => scala.Unit = null,
    onSearchChange: (/* searchText */ java.lang.String, /* colInfos */ js.Array[ColumnDescription[TRow]], /* multiColumnSearch */ scala.Boolean) => scala.Unit = null,
    onSizePerPageList: /* sizePerPage */ scala.Double => scala.Unit = null,
    onSortChange: (js.Function2[/* sortName */ java.lang.String, /* sortOrder */ SortOrder, scala.Unit]) | (js.Function2[
      /* sortName */ js.Array[java.lang.String], 
      /* sortOrder */ js.Array[SortOrder], 
      scala.Unit
    ]) = null,
    onlyOneExpanding: js.UndefOr[scala.Boolean] = js.undefined,
    page: scala.Int | scala.Double = null,
    pageStartIndex: scala.Int | scala.Double = null,
    paginationPanel: /* props */ PaginationPanelProps => reactLib.reactMod.ReactElement[_] = null,
    paginationPosition: PaginationPostion = null,
    paginationShowsTotal: scala.Boolean | (js.Function3[
      /* start */ scala.Double, 
      /* to */ scala.Double, 
      /* total */ scala.Double, 
      java.lang.String | reactLib.reactMod.ReactElement[_]
    ]) = null,
    paginationSize: scala.Int | scala.Double = null,
    prePage: js.Any = null,
    prePageTitle: java.lang.String = null,
    printToolBar: js.UndefOr[scala.Boolean] = js.undefined,
    saveText: java.lang.String = null,
    searchDelayTime: scala.Int | scala.Double = null,
    searchField: /* props */ SearchFieldProps => reactLib.reactMod.ReactElement[(reactLib.reactMod.Component[_, js.Object, _]) with SearchFieldInterface] = null,
    searchPanel: /* props */ SearchPanelProps => reactLib.reactMod.ReactElement[_] = null,
    showSelectedOnlyBtn: (/* onClick */ js.Function1[/* e */ reactLib.reactMod.MouseEvent[_, reactLib.NativeMouseEvent], scala.Unit], /* showSelected */ scala.Boolean) => reactLib.reactMod.ReactElement[_] = null,
    sizePerPage: scala.Int | scala.Double = null,
    sizePerPageDropDown: /* props */ SizePerPageFunctionProps => reactLib.reactMod.ReactElement[_] = null,
    sizePerPageList: SizePerPageList = null,
    sortIndicator: js.UndefOr[scala.Boolean] = js.undefined,
    sortName: java.lang.String = null,
    sortOrder: SortOrder | js.Array[SortOrder] = null,
    toolBar: /* props */ ToolBarProps => reactLib.reactMod.ReactElement[_] = null,
    withFirstAndLast: js.UndefOr[scala.Boolean] = js.undefined,
    withoutNoDataText: js.UndefOr[scala.Boolean] = js.undefined
  ): Options[TRow] = {
    val __obj = js.Dynamic.literal()
    if (afterColumnFilter != null) __obj.updateDynamic("afterColumnFilter")(js.Any.fromFunction2(afterColumnFilter))
    if (afterDeleteRow != null) __obj.updateDynamic("afterDeleteRow")(js.Any.fromFunction2(afterDeleteRow))
    if (afterInsertRow != null) __obj.updateDynamic("afterInsertRow")(js.Any.fromFunction1(afterInsertRow))
    if (afterSearch != null) __obj.updateDynamic("afterSearch")(js.Any.fromFunction2(afterSearch))
    if (afterTableComplete != null) __obj.updateDynamic("afterTableComplete")(js.Any.fromFunction0(afterTableComplete))
    if (!js.isUndefined(alwaysShowAllBtns)) __obj.updateDynamic("alwaysShowAllBtns")(alwaysShowAllBtns)
    if (beforeShowError != null) __obj.updateDynamic("beforeShowError")(js.Any.fromFunction3(beforeShowError))
    if (btnGroup != null) __obj.updateDynamic("btnGroup")(js.Any.fromFunction1(btnGroup))
    if (!js.isUndefined(clearSearch)) __obj.updateDynamic("clearSearch")(clearSearch)
    if (clearSearchBtn != null) __obj.updateDynamic("clearSearchBtn")(js.Any.fromFunction1(clearSearchBtn))
    if (closeText != null) __obj.updateDynamic("closeText")(closeText)
    if (defaultSearch != null) __obj.updateDynamic("defaultSearch")(defaultSearch)
    if (defaultSortName != null) __obj.updateDynamic("defaultSortName")(defaultSortName)
    if (defaultSortOrder != null) __obj.updateDynamic("defaultSortOrder")(defaultSortOrder)
    if (deleteBtn != null) __obj.updateDynamic("deleteBtn")(js.Any.fromFunction1(deleteBtn))
    if (deleteText != null) __obj.updateDynamic("deleteText")(deleteText)
    if (!js.isUndefined(expandAll)) __obj.updateDynamic("expandAll")(expandAll)
    if (expandBodyClass != null) __obj.updateDynamic("expandBodyClass")(expandBodyClass.asInstanceOf[js.Any])
    if (expandBy != null) __obj.updateDynamic("expandBy")(expandBy)
    if (expandParentClass != null) __obj.updateDynamic("expandParentClass")(expandParentClass.asInstanceOf[js.Any])
    if (expandRowBgColor != null) __obj.updateDynamic("expandRowBgColor")(expandRowBgColor)
    if (expanding != null) __obj.updateDynamic("expanding")(expanding)
    if (exportCSVBtn != null) __obj.updateDynamic("exportCSVBtn")(js.Any.fromFunction1(exportCSVBtn))
    if (exportCSVSeparator != null) __obj.updateDynamic("exportCSVSeparator")(exportCSVSeparator)
    if (exportCSVText != null) __obj.updateDynamic("exportCSVText")(exportCSVText)
    if (firstPage != null) __obj.updateDynamic("firstPage")(firstPage)
    if (firstPageTitle != null) __obj.updateDynamic("firstPageTitle")(firstPageTitle)
    if (handleConfirmDeleteRow != null) __obj.updateDynamic("handleConfirmDeleteRow")(js.Any.fromFunction2(handleConfirmDeleteRow))
    if (!js.isUndefined(hidePageListOnlyOnePage)) __obj.updateDynamic("hidePageListOnlyOnePage")(hidePageListOnlyOnePage)
    if (!js.isUndefined(hideSizePerPage)) __obj.updateDynamic("hideSizePerPage")(hideSizePerPage)
    if (!js.isUndefined(ignoreEditable)) __obj.updateDynamic("ignoreEditable")(ignoreEditable)
    if (insertBtn != null) __obj.updateDynamic("insertBtn")(js.Any.fromFunction1(insertBtn))
    if (insertFailIndicator != null) __obj.updateDynamic("insertFailIndicator")(insertFailIndicator)
    if (insertModal != null) __obj.updateDynamic("insertModal")(js.Any.fromFunction5(insertModal))
    if (insertModalBody != null) __obj.updateDynamic("insertModalBody")(js.Any.fromFunction3(insertModalBody))
    if (insertModalFooter != null) __obj.updateDynamic("insertModalFooter")(js.Any.fromFunction2(insertModalFooter))
    if (insertModalHeader != null) __obj.updateDynamic("insertModalHeader")(js.Any.fromFunction2(insertModalHeader))
    if (insertText != null) __obj.updateDynamic("insertText")(insertText)
    if (isValidKey != null) __obj.updateDynamic("isValidKey")(js.Any.fromFunction1(isValidKey))
    if (!js.isUndefined(keepSizePerPageState)) __obj.updateDynamic("keepSizePerPageState")(keepSizePerPageState)
    if (lastPage != null) __obj.updateDynamic("lastPage")(lastPage)
    if (lastPageTitle != null) __obj.updateDynamic("lastPageTitle")(lastPageTitle)
    if (nextPage != null) __obj.updateDynamic("nextPage")(nextPage)
    if (nextPageTitle != null) __obj.updateDynamic("nextPageTitle")(nextPageTitle)
    if (!js.isUndefined(noAutoBOM)) __obj.updateDynamic("noAutoBOM")(noAutoBOM)
    if (noDataText != null) __obj.updateDynamic("noDataText")(noDataText.asInstanceOf[js.Any])
    if (onAddRow != null) __obj.updateDynamic("onAddRow")(js.Any.fromFunction3(onAddRow))
    if (onCellEdit != null) __obj.updateDynamic("onCellEdit")(js.Any.fromFunction3(onCellEdit))
    if (onDeleteRow != null) __obj.updateDynamic("onDeleteRow")(js.Any.fromFunction2(onDeleteRow))
    if (onExpand != null) __obj.updateDynamic("onExpand")(js.Any.fromFunction3(onExpand))
    if (onExportToCSV != null) __obj.updateDynamic("onExportToCSV")(js.Any.fromFunction0(onExportToCSV))
    if (onFilterChange != null) __obj.updateDynamic("onFilterChange")(js.Any.fromFunction1(onFilterChange))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction0(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction0(onMouseLeave))
    if (onPageChange != null) __obj.updateDynamic("onPageChange")(js.Any.fromFunction2(onPageChange))
    if (onRowClick != null) __obj.updateDynamic("onRowClick")(js.Any.fromFunction4(onRowClick))
    if (onRowDoubleClick != null) __obj.updateDynamic("onRowDoubleClick")(js.Any.fromFunction2(onRowDoubleClick))
    if (onRowMouseOut != null) __obj.updateDynamic("onRowMouseOut")(js.Any.fromFunction2(onRowMouseOut))
    if (onRowMouseOver != null) __obj.updateDynamic("onRowMouseOver")(js.Any.fromFunction2(onRowMouseOver))
    if (onSearchChange != null) __obj.updateDynamic("onSearchChange")(js.Any.fromFunction3(onSearchChange))
    if (onSizePerPageList != null) __obj.updateDynamic("onSizePerPageList")(js.Any.fromFunction1(onSizePerPageList))
    if (onSortChange != null) __obj.updateDynamic("onSortChange")(onSortChange.asInstanceOf[js.Any])
    if (!js.isUndefined(onlyOneExpanding)) __obj.updateDynamic("onlyOneExpanding")(onlyOneExpanding)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (pageStartIndex != null) __obj.updateDynamic("pageStartIndex")(pageStartIndex.asInstanceOf[js.Any])
    if (paginationPanel != null) __obj.updateDynamic("paginationPanel")(js.Any.fromFunction1(paginationPanel))
    if (paginationPosition != null) __obj.updateDynamic("paginationPosition")(paginationPosition)
    if (paginationShowsTotal != null) __obj.updateDynamic("paginationShowsTotal")(paginationShowsTotal.asInstanceOf[js.Any])
    if (paginationSize != null) __obj.updateDynamic("paginationSize")(paginationSize.asInstanceOf[js.Any])
    if (prePage != null) __obj.updateDynamic("prePage")(prePage)
    if (prePageTitle != null) __obj.updateDynamic("prePageTitle")(prePageTitle)
    if (!js.isUndefined(printToolBar)) __obj.updateDynamic("printToolBar")(printToolBar)
    if (saveText != null) __obj.updateDynamic("saveText")(saveText)
    if (searchDelayTime != null) __obj.updateDynamic("searchDelayTime")(searchDelayTime.asInstanceOf[js.Any])
    if (searchField != null) __obj.updateDynamic("searchField")(js.Any.fromFunction1(searchField))
    if (searchPanel != null) __obj.updateDynamic("searchPanel")(js.Any.fromFunction1(searchPanel))
    if (showSelectedOnlyBtn != null) __obj.updateDynamic("showSelectedOnlyBtn")(js.Any.fromFunction2(showSelectedOnlyBtn))
    if (sizePerPage != null) __obj.updateDynamic("sizePerPage")(sizePerPage.asInstanceOf[js.Any])
    if (sizePerPageDropDown != null) __obj.updateDynamic("sizePerPageDropDown")(js.Any.fromFunction1(sizePerPageDropDown))
    if (sizePerPageList != null) __obj.updateDynamic("sizePerPageList")(sizePerPageList.asInstanceOf[js.Any])
    if (!js.isUndefined(sortIndicator)) __obj.updateDynamic("sortIndicator")(sortIndicator)
    if (sortName != null) __obj.updateDynamic("sortName")(sortName)
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder.asInstanceOf[js.Any])
    if (toolBar != null) __obj.updateDynamic("toolBar")(js.Any.fromFunction1(toolBar))
    if (!js.isUndefined(withFirstAndLast)) __obj.updateDynamic("withFirstAndLast")(withFirstAndLast)
    if (!js.isUndefined(withoutNoDataText)) __obj.updateDynamic("withoutNoDataText")(withoutNoDataText)
    __obj.asInstanceOf[Options[TRow]]
  }
}

