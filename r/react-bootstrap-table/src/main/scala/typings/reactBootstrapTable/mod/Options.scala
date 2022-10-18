package typings.reactBootstrapTable.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.reactBootstrapTable.anon.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options[TRow /* <: js.Object */] extends StObject {
  
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
    js.Function2[/* filterConds */ js.Array[FilterData[Any]], /* result */ js.Array[TRow], Unit]
  ] = js.undefined
  
  /**
    * Assign a callback function which will be called after row delete.
    * This function takes two arguments:
    *   `rowKeys`: which means the row keys for the deleted rows
    *   `rows`: the array of row data that was deleted.
    */
  var afterDeleteRow: js.UndefOr[
    js.Function2[/* rowKeys */ js.Array[Double | String], /* rows */ js.Array[TRow], Unit]
  ] = js.undefined
  
  /**
    * Assign a callback function which will be called after inserting a row.
    * This function takes one argument: row, which means the whole row data you added.
    */
  var afterInsertRow: js.UndefOr[js.Function1[/* row */ TRow, Unit]] = js.undefined
  
  /**
    * Assign a callback function which will be called after triggering searching.
    * This function takes two argument: search and result.
    *   `search`: The search text from the user.
    *   `result`: The results after searching (array of rows that matched the search).
    */
  var afterSearch: js.UndefOr[js.Function2[/* search */ String, /* result */ js.Array[TRow], Unit]] = js.undefined
  
  /**
    * Assign a callback function that will be called after table updates.
    */
  var afterTableComplete: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Flag to indicate that the table should always show next/previous buttons even when there is not next/previous
    * page.
    */
  var alwaysShowAllBtns: js.UndefOr[Boolean] = js.undefined
  
  /**
    * You can do something before the toastr pop or even disable the toastr!!
    * Returning false or void will not trigger the toastr.
    * If you want the toastr popup, you should return true always.
    * Inputs match the EditValidatorObject.notification field types.
    */
  var beforeShowError: js.UndefOr[
    js.Function3[/* type */ EditValidatorType, /* msg */ String, /* title */ String, Boolean | Unit]
  ] = js.undefined
  
  /**
    * Button group which contain the insert, drop, show only select and export CSV buttons, these button all
    * grouped as btn-group class in bootstrap. This is a chance that you can custom this button group.
    * Give a btnGroup in options props and btnGroup only accept a function and a JSX returned value is necessary.
    * This lets you customize just the left-hand-side of the toolbar if desired.
    */
  var btnGroup: js.UndefOr[js.Function1[/* props */ ButtonGroupProps, ReactElement]] = js.undefined
  
  /**
    * Only work on enable search. If true, there will be a button beside the search input field
    * that will empty the field when clicked.
    */
  var clearSearch: js.UndefOr[Boolean] = js.undefined
  
  /**
    * You can custom the clear button for search field by giving clearSearchBtn in options props.
    * clearSearchBtn only accept a function and a JSX returned value is necessary.
    *
    * The default `ClearSearchButton` component is also exported as a component, so that you can use it as the
    * base for your own custom component.
    */
  var clearSearchBtn: js.UndefOr[
    js.Function1[
      /* onClick */ js.Function1[/* e */ MouseEvent[Any, NativeMouseEvent], Unit], 
      ReactElement
    ]
  ] = js.undefined
  
  /**
    * Customize the text on the close button in the insert modal.
    */
  var closeText: js.UndefOr[String] = js.undefined
  
  /**
    * Set the default search condition.
    */
  var defaultSearch: js.UndefOr[String] = js.undefined
  
  /**
    * Specify the default sort column.
    * Note: when using cleanSort(), this default sort column will be restored.
    */
  var defaultSortName: js.UndefOr[/* keyof TRow */ String] = js.undefined
  
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
      /* onClick */ js.Function1[/* e */ MouseEvent[Any, NativeMouseEvent], Unit], 
      ReactElement
    ]
  ] = js.undefined
  
  /**
    * Customize the text on the delete button.
    */
  var deleteText: js.UndefOr[String] = js.undefined
  
  /**
    * Expand all rows
    */
  var expandAll: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Custom class to use for the expanded content section of an expanded row. This can either be a string, or a
    * function that returns a string and takes three arguments: row, rowIndex, isExpanding.
    *   `row`: the row expanding/collapsing.
    *   `rowIndex`: index number of the row.
    *   `isExpanding`: boolean flag specifying whether the field is expanding or collapsing.
    */
  var expandBodyClass: js.UndefOr[
    String | (js.Function3[/* row */ TRow, /* rowIndex */ Double, /* isExpanding */ Boolean, String])
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
  var expandParentClass: js.UndefOr[String | (js.Function2[/* row */ TRow, /* rowIndex */ Double, String])] = js.undefined
  
  /**
    * Background color on expanded rows (css color value).
    */
  var expandRowBgColor: js.UndefOr[String] = js.undefined
  
  /**
    * Provide an array of expanded rows for the table.
    */
  var expanding: js.UndefOr[js.Array[Double | String]] = js.undefined
  
  /**
    * It's available to customize the export csv button by configuring exportCSVBtn in options props, exportCSVBtn only
    * accept a function and a JSX returned value is necessary. This function will take one argument: onClick.
    *
    * The default `ExportCSVButton` component is also exported as a component, so that you can use it as the base
    * for your custom component.
    */
  var exportCSVBtn: js.UndefOr[
    js.Function1[
      /* onClick */ js.Function1[/* e */ MouseEvent[Any, NativeMouseEvent], Unit], 
      ReactElement
    ]
  ] = js.undefined
  
  /**
    * Customize the field separator in a CSV export file. Default is ','.
    */
  var exportCSVSeparator: js.UndefOr[String] = js.undefined
  
  /**
    * Customize the text on the export csv button
    */
  var exportCSVText: js.UndefOr[String] = js.undefined
  
  /**
    * Customize the text of first page button.
    * If using the default pagination panel, this should be a string to use for the button label.
    * If creating a custom pagination panel, this is passed to the panel and can be of any type desired.
    */
  var firstPage: js.UndefOr[Any] = js.undefined
  
  /**
    * Customize the tooltip text shown when hovering over the firstPage button.
    */
  var firstPageTitle: js.UndefOr[String] = js.undefined
  
  /**
    * Assign a callback function which will be called when deleting a row.
    * It gives you a chance to customize your confirmation for row deletion.
    * This function takes two argument: next and rowKeys:
    *   `next`: If you confirm the delete, call next() to continue the process.
    *   `rowKeys` Is the row keys to be deleted, you can call the `next` function to apply this deletion.
    */
  var handleConfirmDeleteRow: js.UndefOr[
    js.Function2[/* next */ js.Function0[Unit], /* rowKeys */ js.Array[Double | String], Unit]
  ] = js.undefined
  
  /**
    * Default is false. If true, the pagination list will be hidden when there is only one page.
    */
  var hidePageListOnlyOnePage: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Hide the dropdown list for size per page, default is false.
    */
  var hideSizePerPage: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Default is false, if true means you want to ignore any editable columns when creating the insert form.
    */
  var ignoreEditable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * It's available to customize the insert button by configuring insertBtn in options props, insertBtn only
    * accept a function and a JSX returned value is necessary. This function will take one argument: onClick.
    *
    * The default `InsertButton` component is also exported as a component, so that you can use it as the base
    * for your custom component.
    */
  var insertBtn: js.UndefOr[
    js.Function1[
      /* onClick */ js.Function1[/* e */ MouseEvent[Any, NativeMouseEvent], Unit], 
      ReactElement
    ]
  ] = js.undefined
  
  /**
    * Custom message to show when the InsertModal save fails validation.
    * Default message is 'Form validate errors, please checking!'
    */
  var insertFailIndicator: js.UndefOr[String] = js.undefined
  
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
      /* validateState */ StringDictionary[String], 
      /* ignoreEditable */ Boolean, 
      ReactElement
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
    js.Function2[/* closeModal */ js.Function0[Unit], /* save */ js.Function0[Unit], ReactElement]
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
    js.Function2[/* closeModal */ js.Function0[Unit], /* save */ js.Function0[Unit], ReactElement]
  ] = js.undefined
  
  /**
    * Customize the text on the insert button.
    */
  var insertText: js.UndefOr[String] = js.undefined
  
  /**
    * Function to verify that a key being generated in the Insert Modal is a valid key.
    * If the key fails validation, return a string error message.
    * If the key is ok, return void.
    */
  var isValidKey: js.UndefOr[js.Function1[/* key */ Double | String, String | Unit]] = js.undefined
  
  /**
    * Flag to indicate that the table should keep the SizePerPage dropdown open if the table rerenders without any
    * user interaction.
    */
  var keepSizePerPageState: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Customize the text of last page button.
    * If using the default pagination panel, this should be a string to use for the button label.
    * If creating a custom pagination panel, this is passed to the panel and can be of any type desired.
    */
  var lastPage: js.UndefOr[Any] = js.undefined
  
  /**
    * Customize the tooltip text shown when hovering over the lastPage button.
    */
  var lastPageTitle: js.UndefOr[String] = js.undefined
  
  /**
    * Customize the text of next page button.
    * If using the default pagination panel, this should be a string to use for the button label.
    * If creating a custom pagination panel, this is passed to the panel and can be of any type desired.
    */
  var nextPage: js.UndefOr[Any] = js.undefined
  
  /**
    * Customize the tooltip text shown when hovering over the nextPage button.
    */
  var nextPageTitle: js.UndefOr[String] = js.undefined
  
  /**
    * Ability to disable the BOM in the exported CSV file.
    * BOM = prepend BOM for UTF-8 XML and text/ * types(including HTML) when saving the file.
    */
  var noAutoBOM: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Change the text displayed on the table if data is empty.
    */
  var noDataText: js.UndefOr[String | ReactElement] = js.undefined
  
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
      /* fieldName */ String, 
      /* import warning: importer.ImportType#apply Failed type conversion: TRow[string & keyof TRow] */ /* value */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: TRow[string & keyof TRow] */ js.Any
    ]
  ] = js.undefined
  
  /**
    * Assign a callback function which will be called when a row been deleted.
    * This function takes two arguments:
    *   `rowKeys`: keys for the rows to be deleted.
    *   `rows`: row data for the rows to be deleted.
    */
  var onDeleteRow: js.UndefOr[
    js.Function2[/* rowKeys */ js.Array[Double | String], /* rows */ js.Array[TRow], Unit]
  ] = js.undefined
  
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
      /* event */ MouseEvent[Any, NativeMouseEvent], 
      Unit
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
  var onFilterChange: js.UndefOr[js.Function1[/* filterObject */ FilterData[Any], Unit]] = js.undefined
  
  /**
    * Assign a callback function which will be called when mouse enters the table.
    */
  var onMouseEnter: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Assign a callback function which will be called when mouse leaves the table.
    */
  var onMouseLeave: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Assign a callback function which will be called after page changed.
    * This function takes two argument: page and sizePerPage.
    *   `page`: New page number
    *   `sizePerPage`: The number of rows to display in one page.
    */
  var onPageChange: js.UndefOr[js.Function2[/* page */ Double, /* sizePerPage */ Double, Unit]] = js.undefined
  
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
      /* event */ MouseEvent[Any, NativeMouseEvent], 
      Unit
    ]
  ] = js.undefined
  
  /**
    * Assign a callback function which will be called after a row double click.
    * This function takes two arguments:
    *   `row`: which is the row data that was double clicked on.
    *   `event`: the double click event.
    */
  var onRowDoubleClick: js.UndefOr[
    js.Function2[/* row */ TRow, /* event */ MouseEvent[Any, NativeMouseEvent], Unit]
  ] = js.undefined
  
  /**
    * Assign a callback function which will be called when mouse leaves a row in table.
    * This function takes two arguments:
    *   `row`: the row data the mouse entered
    *   `e`: the mouse event data
    */
  var onRowMouseOut: js.UndefOr[js.Function2[/* row */ TRow, /* e */ MouseEvent[Any, NativeMouseEvent], Unit]] = js.undefined
  
  /**
    * Assign a callback function which will be called when the mouse enters a row in table.
    * This function takes two arguments:
    *   `row`: the row data the mouse entered
    *   `e`: the mouse event data
    */
  var onRowMouseOver: js.UndefOr[js.Function2[/* row */ TRow, /* e */ MouseEvent[Any, NativeMouseEvent], Unit]] = js.undefined
  
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
  ] = js.undefined
  
  /**
    * Assign a callback function which will be called after the size per page (number of rows per page)
    * has been changed.
    * This function takes one argument: sizePerPage.
    *   `sizePerPage`: The new number of rows to display in one page.
    */
  var onSizePerPageList: js.UndefOr[js.Function1[/* sizePerPage */ Double, Unit]] = js.undefined
  
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
  ] = js.undefined
  
  /**
    * Specify that only one row should be able to be expanded at the same time.
    */
  var onlyOneExpanding: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Accept a number, which means the page you want to show as default.
    */
  var page: js.UndefOr[Double] = js.undefined
  
  /**
    * Allows you to modify where to start counting the pages, e.g. to set the first page number to 0.
    * Default is 1.
    */
  var pageStartIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * Function to customize all of components for pagination, including the sizePerPage dropdown and the
    * pagination list.
    */
  var paginationPanel: js.UndefOr[js.Function1[/* props */ PaginationPanelProps, ReactElement]] = js.undefined
  
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
    Boolean | (js.Function3[/* start */ Double, /* to */ Double, /* total */ Double, String | ReactElement])
  ] = js.undefined
  
  /**
    * Number of page buttons to show on the pagination bar, default is 5.
    * i.e. previous 2 pages + current page + next two pages = 5.
    */
  var paginationSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Customize the text of previouse page button.
    * If using the default pagination panel, this should be a string to use for the button label.
    * If creating a custom pagination panel, this is passed to the panel and can be of any type desired.
    */
  var prePage: js.UndefOr[Any] = js.undefined
  
  /**
    * Customize the tooltip text shown when hovering over the prePage button.
    */
  var prePageTitle: js.UndefOr[String] = js.undefined
  
  /**
    * Default is true. If false, during printing the toolbar is hidden.
    */
  var printToolBar: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Customize the text on the save button in the insert modal.
    */
  var saveText: js.UndefOr[String] = js.undefined
  
  /**
    * A delay for trigger search after a keyup (millisecond)
    */
  var searchDelayTime: js.UndefOr[Double] = js.undefined
  
  /**
    * You can custom the search input field only by searchField in options props. searchField only accept a
    * function and a JSX returned value is necessary.
    *
    * The default `SearchField` component is also exported as a component, so that you can use it as the base for
    * your custom component.
    */
  var searchField: js.UndefOr[js.Function1[/* props */ SearchFieldProps, ReactElement]] = js.undefined
  
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
  var searchPanel: js.UndefOr[js.Function1[/* props */ SearchPanelProps, ReactElement]] = js.undefined
  
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
      /* onClick */ js.Function1[/* e */ MouseEvent[Any, NativeMouseEvent], Unit], 
      /* showSelected */ Boolean, 
      ReactElement
    ]
  ] = js.undefined
  
  /**
    * Current chosen size per page.
    */
  var sizePerPage: js.UndefOr[Double] = js.undefined
  
  /**
    * Function to customize the sizePerPage dropdown.
    */
  var sizePerPageDropDown: js.UndefOr[js.Function1[/* props */ SizePerPageFunctionProps, ReactElement]] = js.undefined
  
  /**
    * You can change the dropdown list for size per page if you enable pagination.
    * Default is [10, 25, 30, 50].
    */
  var sizePerPageList: js.UndefOr[SizePerPageList] = js.undefined
  
  /**
    * Set to false to disable sort indicators on header columns, default is true.
    */
  var sortIndicator: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Provide the name of the column that should be sorted by.
    * If multi-column sort is active, this is an array of columns.
    * If there should be no active sort, both sortName and sortOrder should be undefined.
    */
  var sortName: js.UndefOr[(/* keyof TRow */ String) | (js.Array[/* keyof TRow */ String])] = js.undefined
  
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
  var toolBar: js.UndefOr[js.Function1[/* props */ ToolBarProps, ReactElement]] = js.undefined
  
  /**
    * Flag to indicate whether there should be buttons for First and Last page.
    */
  var withFirstAndLast: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If true, this hides the noDataText on the table when the tableis empty. Default is false.
    */
  var withoutNoDataText: js.UndefOr[Boolean] = js.undefined
}
object Options {
  
  inline def apply[TRow /* <: js.Object */](): Options[TRow] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options[TRow]]
  }
  
  extension [Self <: Options[?], TRow /* <: js.Object */](x: Self & Options[TRow]) {
    
    inline def setAfterColumnFilter(value: (/* filterConds */ js.Array[FilterData[Any]], /* result */ js.Array[TRow]) => Unit): Self = StObject.set(x, "afterColumnFilter", js.Any.fromFunction2(value))
    
    inline def setAfterColumnFilterUndefined: Self = StObject.set(x, "afterColumnFilter", js.undefined)
    
    inline def setAfterDeleteRow(value: (/* rowKeys */ js.Array[Double | String], /* rows */ js.Array[TRow]) => Unit): Self = StObject.set(x, "afterDeleteRow", js.Any.fromFunction2(value))
    
    inline def setAfterDeleteRowUndefined: Self = StObject.set(x, "afterDeleteRow", js.undefined)
    
    inline def setAfterInsertRow(value: /* row */ TRow => Unit): Self = StObject.set(x, "afterInsertRow", js.Any.fromFunction1(value))
    
    inline def setAfterInsertRowUndefined: Self = StObject.set(x, "afterInsertRow", js.undefined)
    
    inline def setAfterSearch(value: (/* search */ String, /* result */ js.Array[TRow]) => Unit): Self = StObject.set(x, "afterSearch", js.Any.fromFunction2(value))
    
    inline def setAfterSearchUndefined: Self = StObject.set(x, "afterSearch", js.undefined)
    
    inline def setAfterTableComplete(value: () => Unit): Self = StObject.set(x, "afterTableComplete", js.Any.fromFunction0(value))
    
    inline def setAfterTableCompleteUndefined: Self = StObject.set(x, "afterTableComplete", js.undefined)
    
    inline def setAlwaysShowAllBtns(value: Boolean): Self = StObject.set(x, "alwaysShowAllBtns", value.asInstanceOf[js.Any])
    
    inline def setAlwaysShowAllBtnsUndefined: Self = StObject.set(x, "alwaysShowAllBtns", js.undefined)
    
    inline def setBeforeShowError(value: (/* type */ EditValidatorType, /* msg */ String, /* title */ String) => Boolean | Unit): Self = StObject.set(x, "beforeShowError", js.Any.fromFunction3(value))
    
    inline def setBeforeShowErrorUndefined: Self = StObject.set(x, "beforeShowError", js.undefined)
    
    inline def setBtnGroup(value: /* props */ ButtonGroupProps => ReactElement): Self = StObject.set(x, "btnGroup", js.Any.fromFunction1(value))
    
    inline def setBtnGroupUndefined: Self = StObject.set(x, "btnGroup", js.undefined)
    
    inline def setClearSearch(value: Boolean): Self = StObject.set(x, "clearSearch", value.asInstanceOf[js.Any])
    
    inline def setClearSearchBtn(value: /* onClick */ js.Function1[/* e */ MouseEvent[Any, NativeMouseEvent], Unit] => ReactElement): Self = StObject.set(x, "clearSearchBtn", js.Any.fromFunction1(value))
    
    inline def setClearSearchBtnUndefined: Self = StObject.set(x, "clearSearchBtn", js.undefined)
    
    inline def setClearSearchUndefined: Self = StObject.set(x, "clearSearch", js.undefined)
    
    inline def setCloseText(value: String): Self = StObject.set(x, "closeText", value.asInstanceOf[js.Any])
    
    inline def setCloseTextUndefined: Self = StObject.set(x, "closeText", js.undefined)
    
    inline def setDefaultSearch(value: String): Self = StObject.set(x, "defaultSearch", value.asInstanceOf[js.Any])
    
    inline def setDefaultSearchUndefined: Self = StObject.set(x, "defaultSearch", js.undefined)
    
    inline def setDefaultSortName(value: /* keyof TRow */ String): Self = StObject.set(x, "defaultSortName", value.asInstanceOf[js.Any])
    
    inline def setDefaultSortNameUndefined: Self = StObject.set(x, "defaultSortName", js.undefined)
    
    inline def setDefaultSortOrder(value: SortOrder): Self = StObject.set(x, "defaultSortOrder", value.asInstanceOf[js.Any])
    
    inline def setDefaultSortOrderUndefined: Self = StObject.set(x, "defaultSortOrder", js.undefined)
    
    inline def setDeleteBtn(value: /* onClick */ js.Function1[/* e */ MouseEvent[Any, NativeMouseEvent], Unit] => ReactElement): Self = StObject.set(x, "deleteBtn", js.Any.fromFunction1(value))
    
    inline def setDeleteBtnUndefined: Self = StObject.set(x, "deleteBtn", js.undefined)
    
    inline def setDeleteText(value: String): Self = StObject.set(x, "deleteText", value.asInstanceOf[js.Any])
    
    inline def setDeleteTextUndefined: Self = StObject.set(x, "deleteText", js.undefined)
    
    inline def setExpandAll(value: Boolean): Self = StObject.set(x, "expandAll", value.asInstanceOf[js.Any])
    
    inline def setExpandAllUndefined: Self = StObject.set(x, "expandAll", js.undefined)
    
    inline def setExpandBodyClass(
      value: String | (js.Function3[/* row */ TRow, /* rowIndex */ Double, /* isExpanding */ Boolean, String])
    ): Self = StObject.set(x, "expandBodyClass", value.asInstanceOf[js.Any])
    
    inline def setExpandBodyClassFunction3(value: (/* row */ TRow, /* rowIndex */ Double, /* isExpanding */ Boolean) => String): Self = StObject.set(x, "expandBodyClass", js.Any.fromFunction3(value))
    
    inline def setExpandBodyClassUndefined: Self = StObject.set(x, "expandBodyClass", js.undefined)
    
    inline def setExpandBy(value: ExpandBy): Self = StObject.set(x, "expandBy", value.asInstanceOf[js.Any])
    
    inline def setExpandByUndefined: Self = StObject.set(x, "expandBy", js.undefined)
    
    inline def setExpandParentClass(value: String | (js.Function2[/* row */ TRow, /* rowIndex */ Double, String])): Self = StObject.set(x, "expandParentClass", value.asInstanceOf[js.Any])
    
    inline def setExpandParentClassFunction2(value: (/* row */ TRow, /* rowIndex */ Double) => String): Self = StObject.set(x, "expandParentClass", js.Any.fromFunction2(value))
    
    inline def setExpandParentClassUndefined: Self = StObject.set(x, "expandParentClass", js.undefined)
    
    inline def setExpandRowBgColor(value: String): Self = StObject.set(x, "expandRowBgColor", value.asInstanceOf[js.Any])
    
    inline def setExpandRowBgColorUndefined: Self = StObject.set(x, "expandRowBgColor", js.undefined)
    
    inline def setExpanding(value: js.Array[Double | String]): Self = StObject.set(x, "expanding", value.asInstanceOf[js.Any])
    
    inline def setExpandingUndefined: Self = StObject.set(x, "expanding", js.undefined)
    
    inline def setExpandingVarargs(value: (Double | String)*): Self = StObject.set(x, "expanding", js.Array(value*))
    
    inline def setExportCSVBtn(value: /* onClick */ js.Function1[/* e */ MouseEvent[Any, NativeMouseEvent], Unit] => ReactElement): Self = StObject.set(x, "exportCSVBtn", js.Any.fromFunction1(value))
    
    inline def setExportCSVBtnUndefined: Self = StObject.set(x, "exportCSVBtn", js.undefined)
    
    inline def setExportCSVSeparator(value: String): Self = StObject.set(x, "exportCSVSeparator", value.asInstanceOf[js.Any])
    
    inline def setExportCSVSeparatorUndefined: Self = StObject.set(x, "exportCSVSeparator", js.undefined)
    
    inline def setExportCSVText(value: String): Self = StObject.set(x, "exportCSVText", value.asInstanceOf[js.Any])
    
    inline def setExportCSVTextUndefined: Self = StObject.set(x, "exportCSVText", js.undefined)
    
    inline def setFirstPage(value: Any): Self = StObject.set(x, "firstPage", value.asInstanceOf[js.Any])
    
    inline def setFirstPageTitle(value: String): Self = StObject.set(x, "firstPageTitle", value.asInstanceOf[js.Any])
    
    inline def setFirstPageTitleUndefined: Self = StObject.set(x, "firstPageTitle", js.undefined)
    
    inline def setFirstPageUndefined: Self = StObject.set(x, "firstPage", js.undefined)
    
    inline def setHandleConfirmDeleteRow(value: (/* next */ js.Function0[Unit], /* rowKeys */ js.Array[Double | String]) => Unit): Self = StObject.set(x, "handleConfirmDeleteRow", js.Any.fromFunction2(value))
    
    inline def setHandleConfirmDeleteRowUndefined: Self = StObject.set(x, "handleConfirmDeleteRow", js.undefined)
    
    inline def setHidePageListOnlyOnePage(value: Boolean): Self = StObject.set(x, "hidePageListOnlyOnePage", value.asInstanceOf[js.Any])
    
    inline def setHidePageListOnlyOnePageUndefined: Self = StObject.set(x, "hidePageListOnlyOnePage", js.undefined)
    
    inline def setHideSizePerPage(value: Boolean): Self = StObject.set(x, "hideSizePerPage", value.asInstanceOf[js.Any])
    
    inline def setHideSizePerPageUndefined: Self = StObject.set(x, "hideSizePerPage", js.undefined)
    
    inline def setIgnoreEditable(value: Boolean): Self = StObject.set(x, "ignoreEditable", value.asInstanceOf[js.Any])
    
    inline def setIgnoreEditableUndefined: Self = StObject.set(x, "ignoreEditable", js.undefined)
    
    inline def setInsertBtn(value: /* onClick */ js.Function1[/* e */ MouseEvent[Any, NativeMouseEvent], Unit] => ReactElement): Self = StObject.set(x, "insertBtn", js.Any.fromFunction1(value))
    
    inline def setInsertBtnUndefined: Self = StObject.set(x, "insertBtn", js.undefined)
    
    inline def setInsertFailIndicator(value: String): Self = StObject.set(x, "insertFailIndicator", value.asInstanceOf[js.Any])
    
    inline def setInsertFailIndicatorUndefined: Self = StObject.set(x, "insertFailIndicator", js.undefined)
    
    inline def setInsertModal(
      value: (/* onModalClose */ js.Function0[Unit], /* onSave */ js.Function1[/* row */ TRow, Unit], /* columns */ js.Array[InsertModalColumnDescription[TRow]], /* validateState */ StringDictionary[String], /* ignoreEditable */ Boolean) => ReactElement
    ): Self = StObject.set(x, "insertModal", js.Any.fromFunction5(value))
    
    inline def setInsertModalBody(
      value: (/* columns */ js.Array[InsertModalColumnDescription[TRow]], /* validateState */ StringDictionary[String], /* ignoreEditable */ Boolean) => ReactElement
    ): Self = StObject.set(x, "insertModalBody", js.Any.fromFunction3(value))
    
    inline def setInsertModalBodyUndefined: Self = StObject.set(x, "insertModalBody", js.undefined)
    
    inline def setInsertModalFooter(value: (/* closeModal */ js.Function0[Unit], /* save */ js.Function0[Unit]) => ReactElement): Self = StObject.set(x, "insertModalFooter", js.Any.fromFunction2(value))
    
    inline def setInsertModalFooterUndefined: Self = StObject.set(x, "insertModalFooter", js.undefined)
    
    inline def setInsertModalHeader(value: (/* closeModal */ js.Function0[Unit], /* save */ js.Function0[Unit]) => ReactElement): Self = StObject.set(x, "insertModalHeader", js.Any.fromFunction2(value))
    
    inline def setInsertModalHeaderUndefined: Self = StObject.set(x, "insertModalHeader", js.undefined)
    
    inline def setInsertModalUndefined: Self = StObject.set(x, "insertModal", js.undefined)
    
    inline def setInsertText(value: String): Self = StObject.set(x, "insertText", value.asInstanceOf[js.Any])
    
    inline def setInsertTextUndefined: Self = StObject.set(x, "insertText", js.undefined)
    
    inline def setIsValidKey(value: /* key */ Double | String => String | Unit): Self = StObject.set(x, "isValidKey", js.Any.fromFunction1(value))
    
    inline def setIsValidKeyUndefined: Self = StObject.set(x, "isValidKey", js.undefined)
    
    inline def setKeepSizePerPageState(value: Boolean): Self = StObject.set(x, "keepSizePerPageState", value.asInstanceOf[js.Any])
    
    inline def setKeepSizePerPageStateUndefined: Self = StObject.set(x, "keepSizePerPageState", js.undefined)
    
    inline def setLastPage(value: Any): Self = StObject.set(x, "lastPage", value.asInstanceOf[js.Any])
    
    inline def setLastPageTitle(value: String): Self = StObject.set(x, "lastPageTitle", value.asInstanceOf[js.Any])
    
    inline def setLastPageTitleUndefined: Self = StObject.set(x, "lastPageTitle", js.undefined)
    
    inline def setLastPageUndefined: Self = StObject.set(x, "lastPage", js.undefined)
    
    inline def setNextPage(value: Any): Self = StObject.set(x, "nextPage", value.asInstanceOf[js.Any])
    
    inline def setNextPageTitle(value: String): Self = StObject.set(x, "nextPageTitle", value.asInstanceOf[js.Any])
    
    inline def setNextPageTitleUndefined: Self = StObject.set(x, "nextPageTitle", js.undefined)
    
    inline def setNextPageUndefined: Self = StObject.set(x, "nextPage", js.undefined)
    
    inline def setNoAutoBOM(value: Boolean): Self = StObject.set(x, "noAutoBOM", value.asInstanceOf[js.Any])
    
    inline def setNoAutoBOMUndefined: Self = StObject.set(x, "noAutoBOM", js.undefined)
    
    inline def setNoDataText(value: String | ReactElement): Self = StObject.set(x, "noDataText", value.asInstanceOf[js.Any])
    
    inline def setNoDataTextUndefined: Self = StObject.set(x, "noDataText", js.undefined)
    
    inline def setOnAddRow(
      value: (/* row */ TRow, /* colInfo */ js.Array[ColumnDescription[TRow]], /* errorCallback */ js.Function1[/* message */ String, Unit]) => String | Boolean
    ): Self = StObject.set(x, "onAddRow", js.Any.fromFunction3(value))
    
    inline def setOnAddRowUndefined: Self = StObject.set(x, "onAddRow", js.undefined)
    
    inline def setOnCellEdit(
      value: (/* row */ TRow, /* fieldName */ String, /* import warning: importer.ImportType#apply Failed type conversion: TRow[string & keyof TRow] */ /* value */ js.Any) => /* import warning: importer.ImportType#apply Failed type conversion: TRow[string & keyof TRow] */ js.Any
    ): Self = StObject.set(x, "onCellEdit", js.Any.fromFunction3(value))
    
    inline def setOnCellEditUndefined: Self = StObject.set(x, "onCellEdit", js.undefined)
    
    inline def setOnDeleteRow(value: (/* rowKeys */ js.Array[Double | String], /* rows */ js.Array[TRow]) => Unit): Self = StObject.set(x, "onDeleteRow", js.Any.fromFunction2(value))
    
    inline def setOnDeleteRowUndefined: Self = StObject.set(x, "onDeleteRow", js.undefined)
    
    inline def setOnExpand(
      value: (/* rowKey */ Double | String, /* isExpand */ Boolean, /* event */ MouseEvent[Any, NativeMouseEvent]) => Unit
    ): Self = StObject.set(x, "onExpand", js.Any.fromFunction3(value))
    
    inline def setOnExpandUndefined: Self = StObject.set(x, "onExpand", js.undefined)
    
    inline def setOnExportToCSV(value: () => js.Array[TRow]): Self = StObject.set(x, "onExportToCSV", js.Any.fromFunction0(value))
    
    inline def setOnExportToCSVUndefined: Self = StObject.set(x, "onExportToCSV", js.undefined)
    
    inline def setOnFilterChange(value: /* filterObject */ FilterData[Any] => Unit): Self = StObject.set(x, "onFilterChange", js.Any.fromFunction1(value))
    
    inline def setOnFilterChangeUndefined: Self = StObject.set(x, "onFilterChange", js.undefined)
    
    inline def setOnMouseEnter(value: () => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction0(value))
    
    inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
    
    inline def setOnMouseLeave(value: () => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction0(value))
    
    inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
    
    inline def setOnPageChange(value: (/* page */ Double, /* sizePerPage */ Double) => Unit): Self = StObject.set(x, "onPageChange", js.Any.fromFunction2(value))
    
    inline def setOnPageChangeUndefined: Self = StObject.set(x, "onPageChange", js.undefined)
    
    inline def setOnRowClick(
      value: (/* row */ TRow, /* columnIndex */ Double, /* rowIndex */ Double, /* event */ MouseEvent[Any, NativeMouseEvent]) => Unit
    ): Self = StObject.set(x, "onRowClick", js.Any.fromFunction4(value))
    
    inline def setOnRowClickUndefined: Self = StObject.set(x, "onRowClick", js.undefined)
    
    inline def setOnRowDoubleClick(value: (/* row */ TRow, /* event */ MouseEvent[Any, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onRowDoubleClick", js.Any.fromFunction2(value))
    
    inline def setOnRowDoubleClickUndefined: Self = StObject.set(x, "onRowDoubleClick", js.undefined)
    
    inline def setOnRowMouseOut(value: (/* row */ TRow, /* e */ MouseEvent[Any, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onRowMouseOut", js.Any.fromFunction2(value))
    
    inline def setOnRowMouseOutUndefined: Self = StObject.set(x, "onRowMouseOut", js.undefined)
    
    inline def setOnRowMouseOver(value: (/* row */ TRow, /* e */ MouseEvent[Any, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onRowMouseOver", js.Any.fromFunction2(value))
    
    inline def setOnRowMouseOverUndefined: Self = StObject.set(x, "onRowMouseOver", js.undefined)
    
    inline def setOnSearchChange(
      value: (/* searchText */ String, /* colInfos */ js.Array[ColumnDescription[TRow]], /* multiColumnSearch */ Boolean) => Unit
    ): Self = StObject.set(x, "onSearchChange", js.Any.fromFunction3(value))
    
    inline def setOnSearchChangeUndefined: Self = StObject.set(x, "onSearchChange", js.undefined)
    
    inline def setOnSizePerPageList(value: /* sizePerPage */ Double => Unit): Self = StObject.set(x, "onSizePerPageList", js.Any.fromFunction1(value))
    
    inline def setOnSizePerPageListUndefined: Self = StObject.set(x, "onSizePerPageList", js.undefined)
    
    inline def setOnSortChange(
      value: ((/* sortName */ js.Array[/* keyof TRow */ String]) | (/* keyof TRow */ /* sortName */ String), (/* sortOrder */ js.Array[SortOrder]) | (/* sortOrder */ SortOrder)) => Unit
    ): Self = StObject.set(x, "onSortChange", js.Any.fromFunction2(value))
    
    inline def setOnSortChangeUndefined: Self = StObject.set(x, "onSortChange", js.undefined)
    
    inline def setOnlyOneExpanding(value: Boolean): Self = StObject.set(x, "onlyOneExpanding", value.asInstanceOf[js.Any])
    
    inline def setOnlyOneExpandingUndefined: Self = StObject.set(x, "onlyOneExpanding", js.undefined)
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageStartIndex(value: Double): Self = StObject.set(x, "pageStartIndex", value.asInstanceOf[js.Any])
    
    inline def setPageStartIndexUndefined: Self = StObject.set(x, "pageStartIndex", js.undefined)
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setPaginationPanel(value: /* props */ PaginationPanelProps => ReactElement): Self = StObject.set(x, "paginationPanel", js.Any.fromFunction1(value))
    
    inline def setPaginationPanelUndefined: Self = StObject.set(x, "paginationPanel", js.undefined)
    
    inline def setPaginationPosition(value: PaginationPostion): Self = StObject.set(x, "paginationPosition", value.asInstanceOf[js.Any])
    
    inline def setPaginationPositionUndefined: Self = StObject.set(x, "paginationPosition", js.undefined)
    
    inline def setPaginationShowsTotal(
      value: Boolean | (js.Function3[/* start */ Double, /* to */ Double, /* total */ Double, String | ReactElement])
    ): Self = StObject.set(x, "paginationShowsTotal", value.asInstanceOf[js.Any])
    
    inline def setPaginationShowsTotalFunction3(value: (/* start */ Double, /* to */ Double, /* total */ Double) => String | ReactElement): Self = StObject.set(x, "paginationShowsTotal", js.Any.fromFunction3(value))
    
    inline def setPaginationShowsTotalUndefined: Self = StObject.set(x, "paginationShowsTotal", js.undefined)
    
    inline def setPaginationSize(value: Double): Self = StObject.set(x, "paginationSize", value.asInstanceOf[js.Any])
    
    inline def setPaginationSizeUndefined: Self = StObject.set(x, "paginationSize", js.undefined)
    
    inline def setPrePage(value: Any): Self = StObject.set(x, "prePage", value.asInstanceOf[js.Any])
    
    inline def setPrePageTitle(value: String): Self = StObject.set(x, "prePageTitle", value.asInstanceOf[js.Any])
    
    inline def setPrePageTitleUndefined: Self = StObject.set(x, "prePageTitle", js.undefined)
    
    inline def setPrePageUndefined: Self = StObject.set(x, "prePage", js.undefined)
    
    inline def setPrintToolBar(value: Boolean): Self = StObject.set(x, "printToolBar", value.asInstanceOf[js.Any])
    
    inline def setPrintToolBarUndefined: Self = StObject.set(x, "printToolBar", js.undefined)
    
    inline def setSaveText(value: String): Self = StObject.set(x, "saveText", value.asInstanceOf[js.Any])
    
    inline def setSaveTextUndefined: Self = StObject.set(x, "saveText", js.undefined)
    
    inline def setSearchDelayTime(value: Double): Self = StObject.set(x, "searchDelayTime", value.asInstanceOf[js.Any])
    
    inline def setSearchDelayTimeUndefined: Self = StObject.set(x, "searchDelayTime", js.undefined)
    
    inline def setSearchField(value: /* props */ SearchFieldProps => ReactElement): Self = StObject.set(x, "searchField", js.Any.fromFunction1(value))
    
    inline def setSearchFieldUndefined: Self = StObject.set(x, "searchField", js.undefined)
    
    inline def setSearchPanel(value: /* props */ SearchPanelProps => ReactElement): Self = StObject.set(x, "searchPanel", js.Any.fromFunction1(value))
    
    inline def setSearchPanelUndefined: Self = StObject.set(x, "searchPanel", js.undefined)
    
    inline def setShowSelectedOnlyBtn(
      value: (/* onClick */ js.Function1[/* e */ MouseEvent[Any, NativeMouseEvent], Unit], /* showSelected */ Boolean) => ReactElement
    ): Self = StObject.set(x, "showSelectedOnlyBtn", js.Any.fromFunction2(value))
    
    inline def setShowSelectedOnlyBtnUndefined: Self = StObject.set(x, "showSelectedOnlyBtn", js.undefined)
    
    inline def setSizePerPage(value: Double): Self = StObject.set(x, "sizePerPage", value.asInstanceOf[js.Any])
    
    inline def setSizePerPageDropDown(value: /* props */ SizePerPageFunctionProps => ReactElement): Self = StObject.set(x, "sizePerPageDropDown", js.Any.fromFunction1(value))
    
    inline def setSizePerPageDropDownUndefined: Self = StObject.set(x, "sizePerPageDropDown", js.undefined)
    
    inline def setSizePerPageList(value: SizePerPageList): Self = StObject.set(x, "sizePerPageList", value.asInstanceOf[js.Any])
    
    inline def setSizePerPageListUndefined: Self = StObject.set(x, "sizePerPageList", js.undefined)
    
    inline def setSizePerPageListVarargs(value: (Double | Value)*): Self = StObject.set(x, "sizePerPageList", js.Array(value*))
    
    inline def setSizePerPageUndefined: Self = StObject.set(x, "sizePerPage", js.undefined)
    
    inline def setSortIndicator(value: Boolean): Self = StObject.set(x, "sortIndicator", value.asInstanceOf[js.Any])
    
    inline def setSortIndicatorUndefined: Self = StObject.set(x, "sortIndicator", js.undefined)
    
    inline def setSortName(value: (/* keyof TRow */ String) | (js.Array[/* keyof TRow */ String])): Self = StObject.set(x, "sortName", value.asInstanceOf[js.Any])
    
    inline def setSortNameUndefined: Self = StObject.set(x, "sortName", js.undefined)
    
    inline def setSortNameVarargs(value: (/* keyof TRow */ String)*): Self = StObject.set(x, "sortName", js.Array(value*))
    
    inline def setSortOrder(value: SortOrder | js.Array[SortOrder]): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
    
    inline def setSortOrderVarargs(value: SortOrder*): Self = StObject.set(x, "sortOrder", js.Array(value*))
    
    inline def setToolBar(value: /* props */ ToolBarProps => ReactElement): Self = StObject.set(x, "toolBar", js.Any.fromFunction1(value))
    
    inline def setToolBarUndefined: Self = StObject.set(x, "toolBar", js.undefined)
    
    inline def setWithFirstAndLast(value: Boolean): Self = StObject.set(x, "withFirstAndLast", value.asInstanceOf[js.Any])
    
    inline def setWithFirstAndLastUndefined: Self = StObject.set(x, "withFirstAndLast", js.undefined)
    
    inline def setWithoutNoDataText(value: Boolean): Self = StObject.set(x, "withoutNoDataText", value.asInstanceOf[js.Any])
    
    inline def setWithoutNoDataTextUndefined: Self = StObject.set(x, "withoutNoDataText", js.undefined)
  }
}
