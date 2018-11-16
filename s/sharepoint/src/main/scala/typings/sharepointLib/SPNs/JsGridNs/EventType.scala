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
  
  val OnBeforeGridDispose: OnBeforeGridDispose with java.lang.String = js.native
  val OnBeforePropertyChanged: OnBeforePropertyChanged with java.lang.String = js.native
  val OnBeginRedoDataUpdateChange: OnBeginRedoDataUpdateChange with java.lang.String = js.native
  val OnBeginRenameColumn: OnBeginRenameColumn with java.lang.String = js.native
  val OnBeginUndoDataUpdateChange: OnBeginUndoDataUpdateChange with java.lang.String = js.native
  val OnCellEditBegin: OnCellEditBegin with java.lang.String = js.native
  val OnCellEditCompleted: OnCellEditCompleted with java.lang.String = js.native
  val OnCellErrorStateChanged: OnCellErrorStateChanged with java.lang.String = js.native
  val OnCellFocusChanged: OnCellFocusChanged with java.lang.String = js.native
  val OnDoubleClick: OnDoubleClick with java.lang.String = js.native
  val OnEndRenameColumn: OnEndRenameColumn with java.lang.String = js.native
  val OnEntryRecordAdded: OnEntryRecordAdded with java.lang.String = js.native
  val OnEntryRecordCommitted: OnEntryRecordCommitted with java.lang.String = js.native
  val OnEntryRecordPropertyChanged: OnEntryRecordPropertyChanged with java.lang.String = js.native
  val OnGridErrorStateChanged: OnGridErrorStateChanged with java.lang.String = js.native
  val OnInitialChangesForChangeKeyComplete: OnInitialChangesForChangeKeyComplete with java.lang.String = js.native
  val OnPasteBegin: OnPasteBegin with java.lang.String = js.native
  val OnPasteEnd: OnPasteEnd with java.lang.String = js.native
  val OnPropertyChanged: OnPropertyChanged with java.lang.String = js.native
  val OnRecordChecked: OnRecordChecked with java.lang.String = js.native
  val OnRecordDeleted: OnRecordDeleted with java.lang.String = js.native
  val OnRecordInserted: OnRecordInserted with java.lang.String = js.native
  val OnRecordsReordered: OnRecordsReordered with java.lang.String = js.native
  val OnRightClick: OnRightClick with java.lang.String = js.native
  val OnRowErrorStateChanged: OnRowErrorStateChanged with java.lang.String = js.native
  val OnRowEscape: OnRowEscape with java.lang.String = js.native
  val OnRowFocusChanged: OnRowFocusChanged with java.lang.String = js.native
  val OnSingleCellClick: OnSingleCellClick with java.lang.String = js.native
  val OnSingleCellKeyDown: OnSingleCellKeyDown with java.lang.String = js.native
  val OnVacateChange: OnVacateChange with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.JsGridNs.EventType with java.lang.String] = js.native
}

