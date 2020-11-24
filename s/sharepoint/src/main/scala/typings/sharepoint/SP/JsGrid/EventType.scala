package typings.sharepoint.SP.JsGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
