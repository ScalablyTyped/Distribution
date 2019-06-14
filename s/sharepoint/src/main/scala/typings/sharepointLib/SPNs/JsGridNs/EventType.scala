package typings
package sharepointLib.SPNs.JsGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EventType extends js.Object

@JSGlobal("SP.JsGrid.EventType")
@js.native
object EventType extends js.Object {
  @js.native
  sealed trait OnBeforeGridDispose
    extends sharepointLib.SPNs.JsGridNs.EventType
  
  @js.native
  sealed trait OnBeforePropertyChanged
    extends sharepointLib.SPNs.JsGridNs.EventType
  
  @js.native
  sealed trait OnBeginRedoDataUpdateChange
    extends sharepointLib.SPNs.JsGridNs.EventType
  
  @js.native
  sealed trait OnBeginRenameColumn
    extends sharepointLib.SPNs.JsGridNs.EventType
  
  @js.native
  sealed trait OnBeginUndoDataUpdateChange
    extends sharepointLib.SPNs.JsGridNs.EventType
  
  @js.native
  sealed trait OnCellEditBegin
    extends sharepointLib.SPNs.JsGridNs.EventType
  
  @js.native
  sealed trait OnCellEditCompleted
    extends sharepointLib.SPNs.JsGridNs.EventType
  
  @js.native
  sealed trait OnCellErrorStateChanged
    extends sharepointLib.SPNs.JsGridNs.EventType
  
  @js.native
  sealed trait OnCellFocusChanged
    extends sharepointLib.SPNs.JsGridNs.EventType
  
  @js.native
  sealed trait OnDoubleClick
    extends sharepointLib.SPNs.JsGridNs.EventType
  
  @js.native
  sealed trait OnEndRenameColumn
    extends sharepointLib.SPNs.JsGridNs.EventType
  
  @js.native
  sealed trait OnEntryRecordAdded
    extends sharepointLib.SPNs.JsGridNs.EventType
  
  @js.native
  sealed trait OnEntryRecordCommitted
    extends sharepointLib.SPNs.JsGridNs.EventType
  
  @js.native
  sealed trait OnEntryRecordPropertyChanged
    extends sharepointLib.SPNs.JsGridNs.EventType
  
  @js.native
  sealed trait OnGridErrorStateChanged
    extends sharepointLib.SPNs.JsGridNs.EventType
  
  @js.native
  sealed trait OnInitialChangesForChangeKeyComplete
    extends sharepointLib.SPNs.JsGridNs.EventType
  
  @js.native
  sealed trait OnPasteBegin
    extends sharepointLib.SPNs.JsGridNs.EventType
  
  @js.native
  sealed trait OnPasteEnd
    extends sharepointLib.SPNs.JsGridNs.EventType
  
  @js.native
  sealed trait OnPropertyChanged
    extends sharepointLib.SPNs.JsGridNs.EventType
  
  @js.native
  sealed trait OnRecordChecked
    extends sharepointLib.SPNs.JsGridNs.EventType
  
  @js.native
  sealed trait OnRecordDeleted
    extends sharepointLib.SPNs.JsGridNs.EventType
  
  @js.native
  sealed trait OnRecordInserted
    extends sharepointLib.SPNs.JsGridNs.EventType
  
  @js.native
  sealed trait OnRecordsReordered
    extends sharepointLib.SPNs.JsGridNs.EventType
  
  @js.native
  sealed trait OnRightClick
    extends sharepointLib.SPNs.JsGridNs.EventType
  
  @js.native
  sealed trait OnRowErrorStateChanged
    extends sharepointLib.SPNs.JsGridNs.EventType
  
  @js.native
  sealed trait OnRowEscape
    extends sharepointLib.SPNs.JsGridNs.EventType
  
  @js.native
  sealed trait OnRowFocusChanged
    extends sharepointLib.SPNs.JsGridNs.EventType
  
  @js.native
  sealed trait OnSingleCellClick
    extends sharepointLib.SPNs.JsGridNs.EventType
  
  @js.native
  sealed trait OnSingleCellKeyDown
    extends sharepointLib.SPNs.JsGridNs.EventType
  
  @js.native
  sealed trait OnVacateChange
    extends sharepointLib.SPNs.JsGridNs.EventType
  
  /* 15 */ val OnBeforeGridDispose: OnBeforeGridDispose with scala.Double = js.native
  /* 22 */ val OnBeforePropertyChanged: OnBeforePropertyChanged with scala.Double = js.native
  /* 28 */ val OnBeginRedoDataUpdateChange: OnBeginRedoDataUpdateChange with scala.Double = js.native
  /* 24 */ val OnBeginRenameColumn: OnBeginRenameColumn with scala.Double = js.native
  /* 29 */ val OnBeginUndoDataUpdateChange: OnBeginUndoDataUpdateChange with scala.Double = js.native
  /* 2 */ val OnCellEditBegin: OnCellEditBegin with scala.Double = js.native
  /* 3 */ val OnCellEditCompleted: OnCellEditCompleted with scala.Double = js.native
  /* 9 */ val OnCellErrorStateChanged: OnCellErrorStateChanged with scala.Double = js.native
  /* 0 */ val OnCellFocusChanged: OnCellFocusChanged with scala.Double = js.native
  /* 14 */ val OnDoubleClick: OnDoubleClick with scala.Double = js.native
  /* 25 */ val OnEndRenameColumn: OnEndRenameColumn with scala.Double = js.native
  /* 10 */ val OnEntryRecordAdded: OnEntryRecordAdded with scala.Double = js.native
  /* 11 */ val OnEntryRecordCommitted: OnEntryRecordCommitted with scala.Double = js.native
  /* 12 */ val OnEntryRecordPropertyChanged: OnEntryRecordPropertyChanged with scala.Double = js.native
  /* 19 */ val OnGridErrorStateChanged: OnGridErrorStateChanged with scala.Double = js.native
  /* 17 */ val OnInitialChangesForChangeKeyComplete: OnInitialChangesForChangeKeyComplete with scala.Double = js.native
  /* 26 */ val OnPasteBegin: OnPasteBegin with scala.Double = js.native
  /* 27 */ val OnPasteEnd: OnPasteEnd with scala.Double = js.native
  /* 5 */ val OnPropertyChanged: OnPropertyChanged with scala.Double = js.native
  /* 8 */ val OnRecordChecked: OnRecordChecked with scala.Double = js.native
  /* 7 */ val OnRecordDeleted: OnRecordDeleted with scala.Double = js.native
  /* 6 */ val OnRecordInserted: OnRecordInserted with scala.Double = js.native
  /* 21 */ val OnRecordsReordered: OnRecordsReordered with scala.Double = js.native
  /* 4 */ val OnRightClick: OnRightClick with scala.Double = js.native
  /* 13 */ val OnRowErrorStateChanged: OnRowErrorStateChanged with scala.Double = js.native
  /* 23 */ val OnRowEscape: OnRowEscape with scala.Double = js.native
  /* 1 */ val OnRowFocusChanged: OnRowFocusChanged with scala.Double = js.native
  /* 16 */ val OnSingleCellClick: OnSingleCellClick with scala.Double = js.native
  /* 20 */ val OnSingleCellKeyDown: OnSingleCellKeyDown with scala.Double = js.native
  /* 18 */ val OnVacateChange: OnVacateChange with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.JsGridNs.EventType with scala.Double] = js.native
}

