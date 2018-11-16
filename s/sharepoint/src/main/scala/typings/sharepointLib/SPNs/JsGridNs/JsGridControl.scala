package typings
package sharepointLib.SPNs.JsGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.JsGrid.JsGridControl")
@js.native
class JsGridControl protected () extends js.Object {
  def this(parentNode: stdLib.HTMLElement, bShowLoadingBanner: scala.Boolean) = this()
  /** Adds one of builtin row state indicator icons into the row header.
                  Please pass one of the values of SP.JsGrid.RowHeaderStyleId
                  Row header is the leftmost gray column of the table. */
  def AddBuiltInRowHeaderState(recordKey: scala.Double, rowHeaderStateId: java.lang.String): scala.Unit = js.native
  /** Adds a column, based on the specified grid field */
  def AddColumn(columnInfo: ColumnInfo, gridField: GridField): scala.Unit = js.native
  /** Adds the specified state into the row header.
                  There can be several row header states for one row. Only one is shown (according to the Priority).
                  Row header is the leftmost gray column of the table. */
  def AddRowHeaderState(recordKey: scala.Double, rowHeaderState: RowHeaderState): scala.Unit = js.native
  /** Returns true, if there are any errors in the JsGrid */
  def AnyErrors(): scala.Boolean = js.native
  /** Returns true, if there are any errors in a specified row */
  def AnyErrorsInRecord(recordKey: scala.Double): scala.Boolean = js.native
  // todo
  def AnyUncomittedProvisionalRecords(): scala.Boolean = js.native
  /** Returns true if there are any unsaved new record rows (aka entry rows). */
  def AnyUncommitedEntryRecords(): scala.Boolean = js.native
  /** Attach event handler to a particular event type */
  def AttachEvent(eventType: EventType, fnOnEvent: js.Function1[/* args */ IEventArgs, scala.Unit]): scala.Unit = js.native
  def CanMoveRecordsDownByOne(recordKeys: js.Any): scala.Boolean = js.native
  def CanMoveRecordsUpByOne(recordKeys: js.Any): scala.Boolean = js.native
  def ChangeKeys(oldKey: js.Any, newKey: js.Any): scala.Unit = js.native
  def Cleanup(): scala.Unit = js.native
  /** Clear all errors in the specified cell. */
  def ClearAllErrorsOnCell(recordKey: scala.Double, fieldKey: java.lang.String): scala.Unit = js.native
  /** Clear all errors in the specified row. */
  def ClearAllErrorsOnRow(recordKey: scala.Double): scala.Unit = js.native
  /** Clear specified by id error that was previously set on the specified by recordKey and fieldKey cell. */
  def ClearCellError(recordKey: scala.Double, fieldKey: java.lang.String, id: scala.Double): scala.Unit = js.native
  /** Clears undo queue, and also differencies tracker state and versions manager state. */
  def ClearChanges(): scala.Unit = js.native
  /** Clear specified by id error that was previously set on the specified by recordKey row. */
  def ClearRowError(recordKey: scala.Double, id: scala.Double): scala.Unit = js.native
  def ClearTableView(): scala.Unit = js.native
  /** Removes all new record rows (aka entry rows), including unsaved and even empty ones.
                  The latter seems to be a bug, as I haven't found any easy way to restore the empty entry row. */
  def ClearUncommitedEntryRecords(): scala.Unit = js.native
  /** Copy data from currently selected cells into the clipboard. */
  def CopyToClipboard(): scala.Unit = js.native
  def CreateAndSynchronizeToNewChangeKey(): js.Any = js.native
  def CreateDataUpdateCmd(bUseCustomInitialUpdate: scala.Boolean): js.Any = js.native
  /** Cut data from currently selected cells into the clipboard.
                  Will not work if current selection contains entry row or readonly cells. */
  def CutToClipboard(): scala.Unit = js.native
  def DeleteRecords(recordKeys: js.Any): js.Any = js.native
  def DeleteRecords(recordKeys: js.Any, optChangeKey: js.Any): js.Any = js.native
  /** Detach a previously set event handler */
  def DetachEvent(eventType: EventType, fnOnEvent: js.Any): scala.Unit = js.native
  /** Covers the grid with the semi-transparent panel, preventing any operations with it.
                  Additionally, displays loading animated gif and optMsg as the message next to it.
                  If optMsg is not specified, displays "Loading..." text. */
  def Disable(): scala.Unit = js.native
  /** Covers the grid with the semi-transparent panel, preventing any operations with it.
                  Additionally, displays loading animated gif and optMsg as the message next to it.
                  If optMsg is not specified, displays "Loading..." text. */
  def Disable(optMsg: java.lang.String): scala.Unit = js.native
  /** Disables grid editing: all the records become readonly */
  def DisableEditing(): scala.Unit = js.native
  /** Removes all event handlers and markup associated with the control */
  def Dispose(): scala.Unit = js.native
  /** Enable grid after Disable. */
  def Enable(): scala.Unit = js.native
  /** Enables grid editing */
  def EnableEditing(): scala.Unit = js.native
  def EnsurePaneWidth(): scala.Unit = js.native
  def FinalizeEditing(fnContinue: js.Function0[scala.Unit], fnError: js.Function0[scala.Unit]): scala.Unit = js.native
  /** Moves focus to the JsGrid control */
  def Focus(): scala.Unit = js.native
  def GetAllDataJson(fnOnFinished: js.Any): scala.Unit = js.native
  def GetAllDataJson(fnOnFinished: js.Any, optFnGetCellStyleID: js.Any): scala.Unit = js.native
  /** Get error message for the specified cell.
                  If many errors are set on the cell, only first is returned.
                  If there are no errors in the cell, returns null. */
  def GetCellErrorMessage(recordKey: scala.Double, fieldKey: java.lang.String): java.lang.String = js.native
  def GetChangeKeyForVersion(version: js.Any): js.Any = js.native
  def GetCheckSelectionManager(): js.Any = js.native
  /** Get ColumnInfo object by fieldKey
                  @fieldKey when working with SharePoint data sources, fieldKey corresponds to field internal name */
  def GetColumnByFieldKey(fieldKey: java.lang.String): ColumnInfo = js.native
  /** Get ColumnInfo object by fieldKey
                  @fieldKey when working with SharePoint data sources, fieldKey corresponds to field internal name */
  def GetColumnByFieldKey(fieldKey: java.lang.String, optPaneId: js.Any): ColumnInfo = js.native
  def GetColumns(): js.Array[ColumnInfo] = js.native
  def GetColumns(optPaneId: java.lang.String): js.Array[ColumnInfo] = js.native
  def GetContiguousRowSelectionWithoutEntryRecords(): sharepointLib.Anon_Begin = js.native
  def GetCurrentChangeKey(): js.Any = js.native
  /** Get current delegate. */
  def GetDelegate(delegateKey: DelegateType): js.Any = js.native
  /** Get diff tracker object that tracks changes to the grid data. */
  def GetDiffTracker(): sharepointLib.SPNs.JsGridNs.InternalNs.DiffTracker = js.native
  /** Get entry record with the specified key.
                  Entry record is a special type of record because it represents a new record that doesn't exist yet. */
  def GetEntryRecord(key: js.Any): js.Any = js.native
  def GetFocusedItem(): js.Any = js.native
  def GetGanttZoomLevel(): js.Any = js.native
  def GetHierarchyQueryObject(): js.Any = js.native
  def GetHierarchyState(bDecompressGuidKeys: scala.Boolean): js.Any = js.native
  def GetLastRecordKey(): java.lang.String = js.native
  def GetLeftColumnIndex(): js.Any = js.native
  def GetLeftColumnIndex(optPaneId: js.Any): js.Any = js.native
  def GetNodeExpandCollapseState(recordKey: scala.Double): js.Any = js.native
  def GetOutlineLevel(record: js.Any): js.Any = js.native
  /** Gets record based on the recordKey
                  @recordKey internal unique id of a row. You can get recordKey from view index via GetRecordKeyByViewIndex method. */
  def GetRecord(recordKey: scala.Double): IRecord = js.native
  /** Returns index of the system RecordIndicatorCheckBoxColumn. If not present in the view, returns null. */
  def GetRecordIndicatorCheckBoxColumnIndex(): scala.Double = js.native
  /** Get record key for a row that is specified by the viewIdx.
                  viewIdx - index of the row in the view, use GetTopRecordIndex to get the first one.
                  Returns recordKey, which is a unique numeric identifier of a row within a dataset.
                  Main difference between viewIdx and recordKey is that viewIdx is only unique within a view,
                  e.g. if you do paging, it can be same for different records.
               */
  def GetRecordKeyByViewIndex(viewIdx: scala.Double): scala.Double = js.native
  def GetReorderRange(recordKeys: js.Any): js.Any = js.native
  /** Get error message for the specified row.
                  If many errors are set on the row, only first is returned.
                  If there are no errors in the row, returns null. */
  def GetRowErrorMessage(recordKey: scala.Double): java.lang.String = js.native
  def GetSelectedColumnRanges(): js.Any = js.native
  def GetSelectedColumnRanges(optPaneId: js.Any): js.Any = js.native
  def GetSelectedRanges(): js.Any = js.native
  def GetSelectedRanges(optPaneId: js.Any): js.Any = js.native
  def GetSelectedRecordKeys(bDuplicatesAllowed: scala.Boolean): js.Any = js.native
  def GetSelectedRowRanges(): js.Any = js.native
  def GetSelectedRowRanges(optPaneId: js.Any): js.Any = js.native
  def GetSpCsrRenderCtx(): js.Any = js.native
  def GetSplitterPosition(): js.Any = js.native
  /** Get top record view index.
                  You can then use GetRecordKeyByViewIndex to convert this value into the recordKey. */
  def GetTopRecordIndex(): scala.Double = js.native
  /** Get top row index. Usually returns 0.
                  You can then use GetRecordKeyByViewIndex to convert this value into the recordKey. */
  def GetTopRowIndex(): scala.Double = js.native
  /** Get undo manager for performing undo/redo operations programmatically. */
  def GetUndoManager(): CommandManager = js.native
  def GetUnfilteredHierarchyMap(): js.Any = js.native
  /** Opposite to GetRecordKeyByViewIndex, resolves the view index of the record based on record key.
                  recordKey - unique numeric identifier of a row in the current dataset.
                  Returns viewIdx - index of the row in the current view */
  def GetViewIndexOfRecord(recordKey: scala.Double): scala.Double = js.native
  /** Get number of rows displayed in the current view. */
  def GetViewRecordCount(): scala.Double = js.native
  /** Gets number of records visible in the current view, including the entry row. */
  def GetVisibleRecordCount(): scala.Double = js.native
  /** Hide the specified column from grid */
  def HideColumn(columnKey: java.lang.String): scala.Unit = js.native
  def HideInitialLoadingBanner(): scala.Unit = js.native
  def IndentRecords(recordKeys: js.Any): js.Any = js.native
  def IndentRecords(recordKeys: js.Any, optChangeKey: js.Any): js.Any = js.native
  /** Initialize the control */
  def Init(parameters: sharepointLib.SPNs.JsGridNs.JsGridControlNs.Parameters): scala.Unit = js.native
  def InsertHiddenRecord(recordKey: scala.Double, changeKey: js.Any): js.Any = js.native
  def InsertHiddenRecord(recordKey: scala.Double, changeKey: js.Any, optAfterRecordKey: js.Any): js.Any = js.native
  def InsertProvisionalRecordAfter(afterRecordKey: scala.Double, newRecord: js.Any, initialValues: js.Any): js.Any = js.native
  def InsertProvisionalRecordBefore(beforeRecordKey: scala.Double, newRecord: js.Any, initialValues: js.Any): js.Any = js.native
  def InsertRecordAfter(afterRecordKey: scala.Double, newRecord: js.Any): js.Any = js.native
  def InsertRecordAfter(afterRecordKey: scala.Double, newRecord: js.Any, optChangeKey: js.Any): js.Any = js.native
  def InsertRecordBefore(beforeRecordKey: scala.Double, newRecord: js.Any): js.Any = js.native
  def InsertRecordBefore(beforeRecordKey: scala.Double, newRecord: js.Any, optChangeKey: js.Any): js.Any = js.native
  /** Determine whether the specified cell is editable. */
  def IsCellEditable(record: IRecord, fieldKey: java.lang.String): scala.Boolean = js.native
  /** Determine whether the specified cell is editable. */
  def IsCellEditable(record: IRecord, fieldKey: java.lang.String, optPaneId: js.Any): scala.Boolean = js.native
  def IsChangeKeyApplied(changeKey: js.Any): js.Any = js.native
  /** Determine if the specified record key identifies valid entry row. */
  def IsEntryRecord(recordKey: scala.Double): scala.Boolean = js.native
  def IsGroupingColumnKey(recordKey: scala.Double): scala.Boolean = js.native
  def IsGroupingRecordKey(recordKey: scala.Double): scala.Boolean = js.native
  /** Returns true if Init method has been executed successfully */
  def IsInitialized(): scala.Boolean = js.native
  def IsProvisionalRecordKey(recordKey: scala.Double): scala.Boolean = js.native
  /** Determines if the specified record is visible in the current view. */
  def IsRecordVisibleInView(recordKey: scala.Double): scala.Boolean = js.native
  /** Moves cursor to entry record (the row that is used to add new records) */
  def JumpToEntryRecord(): scala.Unit = js.native
  def LaunchPrintView(
    additionalScriptFiles: js.Any,
    beforeInitFnName: js.Any,
    beforeInitFnArgsObj: js.Any,
    title: java.lang.String,
    bEnableGantt: scala.Boolean
  ): scala.Unit = js.native
  def LaunchPrintView(
    additionalScriptFiles: js.Any,
    beforeInitFnName: js.Any,
    beforeInitFnArgsObj: js.Any,
    title: java.lang.String,
    bEnableGantt: scala.Boolean,
    optGanttDelegateNames: js.Any
  ): scala.Unit = js.native
  def LaunchPrintView(
    additionalScriptFiles: js.Any,
    beforeInitFnName: js.Any,
    beforeInitFnArgsObj: js.Any,
    title: java.lang.String,
    bEnableGantt: scala.Boolean,
    optGanttDelegateNames: js.Any,
    optInitTableViewParamsFnName: js.Any
  ): scala.Unit = js.native
  def LaunchPrintView(
    additionalScriptFiles: js.Any,
    beforeInitFnName: js.Any,
    beforeInitFnArgsObj: js.Any,
    title: java.lang.String,
    bEnableGantt: scala.Boolean,
    optGanttDelegateNames: js.Any,
    optInitTableViewParamsFnName: js.Any,
    optInitTableViewParamsFnArgsObj: js.Any
  ): scala.Unit = js.native
  def LaunchPrintView(
    additionalScriptFiles: js.Any,
    beforeInitFnName: js.Any,
    beforeInitFnArgsObj: js.Any,
    title: java.lang.String,
    bEnableGantt: scala.Boolean,
    optGanttDelegateNames: js.Any,
    optInitTableViewParamsFnName: js.Any,
    optInitTableViewParamsFnArgsObj: js.Any,
    optInitGanttStylesFnName: js.Any
  ): scala.Unit = js.native
  def LaunchPrintView(
    additionalScriptFiles: js.Any,
    beforeInitFnName: js.Any,
    beforeInitFnArgsObj: js.Any,
    title: java.lang.String,
    bEnableGantt: scala.Boolean,
    optGanttDelegateNames: js.Any,
    optInitTableViewParamsFnName: js.Any,
    optInitTableViewParamsFnArgsObj: js.Any,
    optInitGanttStylesFnName: js.Any,
    optInitGanttStylesFnArgsObj: js.Any
  ): scala.Unit = js.native
  def MarkPropUpdateInvalid(recordKey: scala.Double, fieldKey: js.Any, changeKey: js.Any): js.Any = js.native
  def MarkPropUpdateInvalid(recordKey: scala.Double, fieldKey: js.Any, changeKey: js.Any, optErrorMsg: js.Any): js.Any = js.native
  def MoveRecordsDownByOne(recordKeys: js.Any): js.Any = js.native
  def MoveRecordsUpByOne(recordKeys: js.Any): js.Any = js.native
  // todo
  def NotifyDataAvailable(): scala.Unit = js.native
  def NotifyHide(): scala.Unit = js.native
  def NotifyResize(): scala.Unit = js.native
  def NotifySave(): scala.Unit = js.native
  def OutdentRecords(recordKeys: js.Any): js.Any = js.native
  def OutdentRecords(recordKeys: js.Any, optChangeKey: js.Any): js.Any = js.native
  /** Paste data from clipboard into currently selected cells. */
  def PasteFromClipboard(): scala.Unit = js.native
  /** Re-render all rows in the view.
                  It can be used e.g. if you have some custom display controls and they are rendered differently depending on some external settings.
                  In this case, if you update the external settings, obviously you have to then update the view for these settings to take effect. */
  def RefreshAllRows(): scala.Unit = js.native
  /** Re-render the specified row in the view. */
  def RefreshRow(recordKey: scala.Double): scala.Unit = js.native
  /** Removes header state with specified id from the row. */
  def RemoveRowHeaderState(recordKey: scala.Double, rowHeaderStateId: java.lang.String): scala.Unit = js.native
  /** Switches column header in rename mode, showing textbox and thus giving the user possibility to rename this column. */
  def RenameColumn(columnKey: java.lang.String): scala.Unit = js.native
  def ReorderRecords(
    beginRecordKey: scala.Double,
    endRecordKey: scala.Double,
    afterRecordKey: scala.Double,
    bSelectAfterwards: scala.Boolean
  ): js.Any = js.native
  /** Replaces the control TableCache object with the provided one */
  def ResetData(cache: TableCache): scala.Unit = js.native
  def ScrollGanttToDate(date: js.Any): scala.Unit = js.native
  /** This method is used mostly when you have a rather tall JSGrid and you want to ensure that user sees
                  that some error has occured.
                  You can specify the minId or/and filter function.
                  If minId is specified, method searches for an error with first id which is greater than minId.
                  Scrolls to the Returns the id of the found record.
                  If there aren't any errors, that satisfy the conditions, method does nothing and returns null. */
  def ScrollToAndExpandNextError(): js.Any = js.native
  /** This method is used mostly when you have a rather tall JSGrid and you want to ensure that user sees
                  that some error has occured.
                  You can specify the minId or/and filter function.
                  If minId is specified, method searches for an error with first id which is greater than minId.
                  Scrolls to the Returns the id of the found record.
                  If there aren't any errors, that satisfy the conditions, method does nothing and returns null. */
  def ScrollToAndExpandNextError(minId: scala.Double): js.Any = js.native
  /** This method is used mostly when you have a rather tall JSGrid and you want to ensure that user sees
                  that some error has occured.
                  You can specify the minId or/and filter function.
                  If minId is specified, method searches for an error with first id which is greater than minId.
                  Scrolls to the Returns the id of the found record.
                  If there aren't any errors, that satisfy the conditions, method does nothing and returns null. */
  def ScrollToAndExpandNextError(
    minId: scala.Double,
    fnFilter: js.Function3[
      /* recordKey */ scala.Double, 
      /* fieldKey */ java.lang.String, 
      /* id */ scala.Double, 
      scala.Boolean
    ]
  ): js.Any = js.native
  /** Same as ScrollToAndExpandNextError, but searches within the specified record.
                  recordKey should be not null, otherwise you'll get an exception.
                  bDontExpand controls whether the error tooltip will be shown (if bDontExpand=true, tooltip will not be shown). */
  def ScrollToAndExpandNextErrorOnRecord(): js.Any = js.native
  /** Same as ScrollToAndExpandNextError, but searches within the specified record.
                  recordKey should be not null, otherwise you'll get an exception.
                  bDontExpand controls whether the error tooltip will be shown (if bDontExpand=true, tooltip will not be shown). */
  def ScrollToAndExpandNextErrorOnRecord(minId: scala.Double): js.Any = js.native
  /** Same as ScrollToAndExpandNextError, but searches within the specified record.
                  recordKey should be not null, otherwise you'll get an exception.
                  bDontExpand controls whether the error tooltip will be shown (if bDontExpand=true, tooltip will not be shown). */
  def ScrollToAndExpandNextErrorOnRecord(minId: scala.Double, recordKey: scala.Double): js.Any = js.native
  /** Same as ScrollToAndExpandNextError, but searches within the specified record.
                  recordKey should be not null, otherwise you'll get an exception.
                  bDontExpand controls whether the error tooltip will be shown (if bDontExpand=true, tooltip will not be shown). */
  def ScrollToAndExpandNextErrorOnRecord(
    minId: scala.Double,
    recordKey: scala.Double,
    fnFilter: js.Function3[
      /* recordKey */ scala.Double, 
      /* fieldKey */ java.lang.String, 
      /* id */ scala.Double, 
      scala.Boolean
    ]
  ): js.Any = js.native
  /** Same as ScrollToAndExpandNextError, but searches within the specified record.
                  recordKey should be not null, otherwise you'll get an exception.
                  bDontExpand controls whether the error tooltip will be shown (if bDontExpand=true, tooltip will not be shown). */
  def ScrollToAndExpandNextErrorOnRecord(
    minId: scala.Double,
    recordKey: scala.Double,
    fnFilter: js.Function3[
      /* recordKey */ scala.Double, 
      /* fieldKey */ java.lang.String, 
      /* id */ scala.Double, 
      scala.Boolean
    ],
    bDontExpand: scala.Boolean
  ): js.Any = js.native
  def SelectCellRange(
    rowIdx1: scala.Double,
    rowIdx2: scala.Double,
    colIdx1: scala.Double,
    colIdx2: scala.Double,
    bAppend: scala.Boolean
  ): scala.Unit = js.native
  def SelectCellRange(
    rowIdx1: scala.Double,
    rowIdx2: scala.Double,
    colIdx1: scala.Double,
    colIdx2: scala.Double,
    bAppend: scala.Boolean,
    optPaneId: java.lang.String
  ): scala.Unit = js.native
  def SelectCellRangeByKey(
    recordKey1: java.lang.String,
    recordKey2: java.lang.String,
    colKey1: js.Any,
    colKey2: js.Any,
    bAppend: scala.Boolean
  ): scala.Unit = js.native
  def SelectCellRangeByKey(
    recordKey1: java.lang.String,
    recordKey2: java.lang.String,
    colKey1: js.Any,
    colKey2: js.Any,
    bAppend: scala.Boolean,
    optPaneId: java.lang.String
  ): scala.Unit = js.native
  def SelectColumnRange(colIdx1: scala.Double, colIdx2: scala.Double, bAppend: scala.Boolean): scala.Unit = js.native
  def SelectColumnRange(colIdx1: scala.Double, colIdx2: scala.Double, bAppend: scala.Boolean, optPaneId: java.lang.String): scala.Unit = js.native
  def SelectColumnRangeByKey(colKey1: js.Any, colKey2: js.Any, bAppend: scala.Boolean): scala.Unit = js.native
  def SelectColumnRangeByKey(colKey1: js.Any, colKey2: js.Any, bAppend: scala.Boolean, optPaneId: java.lang.String): scala.Unit = js.native
  def SelectRowRange(rowIdx1: scala.Double, rowIdx2: scala.Double, bAppend: scala.Boolean): scala.Unit = js.native
  def SelectRowRange(rowIdx1: scala.Double, rowIdx2: scala.Double, bAppend: scala.Boolean, optPaneId: java.lang.String): scala.Unit = js.native
  def SelectRowRangeByKey(rowKey1: js.Any, rowKey2: js.Any, bAppend: scala.Boolean): scala.Unit = js.native
  def SelectRowRangeByKey(rowKey1: js.Any, rowKey2: js.Any, bAppend: scala.Boolean, optPaneId: java.lang.String): scala.Unit = js.native
  def SendKeyDownEvent(eventInfo: microsoftDashAjaxLib.SysNs.UINs.DomEvent): js.Any = js.native
  /** Set error for the specified by recordKey and fieldKey cell.
                  Returns id of the error, so that later you can clear the error using this id. */
  def SetCellError(recordKey: scala.Double, fieldKey: java.lang.String, errorMessage: java.lang.String): scala.Double = js.native
  /** Set a delegate. Delegates are way to replace default functionality with custom one. */
  def SetDelegate(delegateKey: DelegateType, fn: js.Any): scala.Unit = js.native
  def SetGanttZoomLevel(level: js.Any): scala.Unit = js.native
  /** Set error for the specified by recordKey row.
                  In the leftmost column of this row, exclamation mark error indicator will appear.
                  Clicking on this indicator will cause the specified error message appear in form of a reddish tooltip.
                  Returns id of the error, so that later you can clear the error using this id. */
  def SetRowError(recordKey: scala.Double, errorMessage: java.lang.String): scala.Double = js.native
  def SetRowView(rowViewParam: js.Any): scala.Unit = js.native
  def SetSplitterPosition(pos: js.Any): scala.Unit = js.native
  def SetTableView(tableViewParams: js.Any): scala.Unit = js.native
  /** Show a previously hidden column at a specified position.
                  If atIdx is not defined, column will be shown at it's previous position. */
  def ShowColumn(columnKey: java.lang.String): scala.Unit = js.native
  /** Show a previously hidden column at a specified position.
                  If atIdx is not defined, column will be shown at it's previous position. */
  def ShowColumn(columnKey: java.lang.String, atIdx: scala.Double): scala.Unit = js.native
  /** Shows a dialog where user can reorder columns and change their widths. */
  def ShowColumnConfigurationDialog(): scala.Unit = js.native
  def ShowGridErrorMsg(errorMsg: java.lang.String): scala.Unit = js.native
  def ShowInitialGridErrorMsg(errorMsg: java.lang.String): scala.Unit = js.native
  def ToggleExpandCollapse(recordKey: scala.Double): scala.Unit = js.native
  /** Switches the currently selected cell into edit mode: displays edit control and sets focus into it.
                  Returns true if success. */
  def TryBeginEdit(): scala.Boolean = js.native
  /** Try saving the new record row (aka entry row) if it was edited. */
  def TryCommitFirstEntryRecords(fnCommitComplete: js.Function0[scala.Unit]): scala.Unit = js.native
  def TryReadPropForChangeKey(recordKey: scala.Double, fieldKey: js.Any, changeKey: js.Any): js.Any = js.native
  def TryRestoreFocusAfterInsertOrDeleteColumns(origFocus: js.Any): scala.Unit = js.native
  /** Update column descriptions */
  def UpdateColumns(columnInfoCollection: ColumnInfoCollection): scala.Unit = js.native
  def UpdateProperties(propertyUpdates: js.Any, changeName: js.Any): js.Any = js.native
  def UpdateProperties(propertyUpdates: js.Any, changeName: js.Any, optChangeKey: js.Any): js.Any = js.native
}

