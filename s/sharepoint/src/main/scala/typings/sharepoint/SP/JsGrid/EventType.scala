package typings.sharepoint.SP.JsGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EventType extends js.Object

@JSGlobal("SP.JsGrid.EventType")
@js.native
object EventType extends js.Object {
  @js.native
  sealed trait OnBeforeGridDispose extends EventType
  
  @js.native
  sealed trait OnBeforePropertyChanged extends EventType
  
  @js.native
  sealed trait OnBeginRedoDataUpdateChange extends EventType
  
  @js.native
  sealed trait OnBeginRenameColumn extends EventType
  
  @js.native
  sealed trait OnBeginUndoDataUpdateChange extends EventType
  
  @js.native
  sealed trait OnCellEditBegin extends EventType
  
  @js.native
  sealed trait OnCellEditCompleted extends EventType
  
  @js.native
  sealed trait OnCellErrorStateChanged extends EventType
  
  @js.native
  sealed trait OnCellFocusChanged extends EventType
  
  @js.native
  sealed trait OnDoubleClick extends EventType
  
  @js.native
  sealed trait OnEndRenameColumn extends EventType
  
  @js.native
  sealed trait OnEntryRecordAdded extends EventType
  
  @js.native
  sealed trait OnEntryRecordCommitted extends EventType
  
  @js.native
  sealed trait OnEntryRecordPropertyChanged extends EventType
  
  @js.native
  sealed trait OnGridErrorStateChanged extends EventType
  
  @js.native
  sealed trait OnInitialChangesForChangeKeyComplete extends EventType
  
  @js.native
  sealed trait OnPasteBegin extends EventType
  
  @js.native
  sealed trait OnPasteEnd extends EventType
  
  @js.native
  sealed trait OnPropertyChanged extends EventType
  
  @js.native
  sealed trait OnRecordChecked extends EventType
  
  @js.native
  sealed trait OnRecordDeleted extends EventType
  
  @js.native
  sealed trait OnRecordInserted extends EventType
  
  @js.native
  sealed trait OnRecordsReordered extends EventType
  
  @js.native
  sealed trait OnRightClick extends EventType
  
  @js.native
  sealed trait OnRowErrorStateChanged extends EventType
  
  @js.native
  sealed trait OnRowEscape extends EventType
  
  @js.native
  sealed trait OnRowFocusChanged extends EventType
  
  @js.native
  sealed trait OnSingleCellClick extends EventType
  
  @js.native
  sealed trait OnSingleCellKeyDown extends EventType
  
  @js.native
  sealed trait OnVacateChange extends EventType
  
  /* 15 */ val OnBeforeGridDispose: typings.sharepoint.SP.JsGrid.EventType.OnBeforeGridDispose with Double = js.native
  /* 22 */ val OnBeforePropertyChanged: typings.sharepoint.SP.JsGrid.EventType.OnBeforePropertyChanged with Double = js.native
  /* 28 */ val OnBeginRedoDataUpdateChange: typings.sharepoint.SP.JsGrid.EventType.OnBeginRedoDataUpdateChange with Double = js.native
  /* 24 */ val OnBeginRenameColumn: typings.sharepoint.SP.JsGrid.EventType.OnBeginRenameColumn with Double = js.native
  /* 29 */ val OnBeginUndoDataUpdateChange: typings.sharepoint.SP.JsGrid.EventType.OnBeginUndoDataUpdateChange with Double = js.native
  /* 2 */ val OnCellEditBegin: typings.sharepoint.SP.JsGrid.EventType.OnCellEditBegin with Double = js.native
  /* 3 */ val OnCellEditCompleted: typings.sharepoint.SP.JsGrid.EventType.OnCellEditCompleted with Double = js.native
  /* 9 */ val OnCellErrorStateChanged: typings.sharepoint.SP.JsGrid.EventType.OnCellErrorStateChanged with Double = js.native
  /* 0 */ val OnCellFocusChanged: typings.sharepoint.SP.JsGrid.EventType.OnCellFocusChanged with Double = js.native
  /* 14 */ val OnDoubleClick: typings.sharepoint.SP.JsGrid.EventType.OnDoubleClick with Double = js.native
  /* 25 */ val OnEndRenameColumn: typings.sharepoint.SP.JsGrid.EventType.OnEndRenameColumn with Double = js.native
  /* 10 */ val OnEntryRecordAdded: typings.sharepoint.SP.JsGrid.EventType.OnEntryRecordAdded with Double = js.native
  /* 11 */ val OnEntryRecordCommitted: typings.sharepoint.SP.JsGrid.EventType.OnEntryRecordCommitted with Double = js.native
  /* 12 */ val OnEntryRecordPropertyChanged: typings.sharepoint.SP.JsGrid.EventType.OnEntryRecordPropertyChanged with Double = js.native
  /* 19 */ val OnGridErrorStateChanged: typings.sharepoint.SP.JsGrid.EventType.OnGridErrorStateChanged with Double = js.native
  /* 17 */ val OnInitialChangesForChangeKeyComplete: typings.sharepoint.SP.JsGrid.EventType.OnInitialChangesForChangeKeyComplete with Double = js.native
  /* 26 */ val OnPasteBegin: typings.sharepoint.SP.JsGrid.EventType.OnPasteBegin with Double = js.native
  /* 27 */ val OnPasteEnd: typings.sharepoint.SP.JsGrid.EventType.OnPasteEnd with Double = js.native
  /* 5 */ val OnPropertyChanged: typings.sharepoint.SP.JsGrid.EventType.OnPropertyChanged with Double = js.native
  /* 8 */ val OnRecordChecked: typings.sharepoint.SP.JsGrid.EventType.OnRecordChecked with Double = js.native
  /* 7 */ val OnRecordDeleted: typings.sharepoint.SP.JsGrid.EventType.OnRecordDeleted with Double = js.native
  /* 6 */ val OnRecordInserted: typings.sharepoint.SP.JsGrid.EventType.OnRecordInserted with Double = js.native
  /* 21 */ val OnRecordsReordered: typings.sharepoint.SP.JsGrid.EventType.OnRecordsReordered with Double = js.native
  /* 4 */ val OnRightClick: typings.sharepoint.SP.JsGrid.EventType.OnRightClick with Double = js.native
  /* 13 */ val OnRowErrorStateChanged: typings.sharepoint.SP.JsGrid.EventType.OnRowErrorStateChanged with Double = js.native
  /* 23 */ val OnRowEscape: typings.sharepoint.SP.JsGrid.EventType.OnRowEscape with Double = js.native
  /* 1 */ val OnRowFocusChanged: typings.sharepoint.SP.JsGrid.EventType.OnRowFocusChanged with Double = js.native
  /* 16 */ val OnSingleCellClick: typings.sharepoint.SP.JsGrid.EventType.OnSingleCellClick with Double = js.native
  /* 20 */ val OnSingleCellKeyDown: typings.sharepoint.SP.JsGrid.EventType.OnSingleCellKeyDown with Double = js.native
  /* 18 */ val OnVacateChange: typings.sharepoint.SP.JsGrid.EventType.OnVacateChange with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EventType with Double] = js.native
}

