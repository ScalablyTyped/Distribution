package typings.sharepoint.global.SP.JsGrid

import typings.microsoftAjax.Sys.UI.DomEvent
import typings.sharepoint.SP.JsGrid.IChangeKey
import typings.sharepoint.SP.JsGrid.IPropertyType
import typings.sharepoint.SP.JsGrid.Internal.PropertyUpdate
import typings.sharepoint.SP.Utilities.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object EventArgs {
  
  @JSGlobal("SP.JsGrid.EventArgs.CellEditBegin")
  @js.native
  class CellEditBegin protected ()
    extends typings.sharepoint.SP.JsGrid.EventArgs.CellEditBegin {
    def this(recordKey: Double, fieldKey: String) = this()
  }
  
  @JSGlobal("SP.JsGrid.EventArgs.CellEditCompleted")
  @js.native
  class CellEditCompleted protected ()
    extends typings.sharepoint.SP.JsGrid.EventArgs.CellEditCompleted {
    def this(recordKey: Double, fieldKey: String, changeKey: IChangeKey, bCancelled: Boolean) = this()
  }
  
  @JSGlobal("SP.JsGrid.EventArgs.CellFocusChanged")
  @js.native
  class CellFocusChanged protected ()
    extends typings.sharepoint.SP.JsGrid.EventArgs.CellFocusChanged {
    def this(newRecordKey: Double, newFieldKey: String, oldRecordKey: Double, oldFieldKey: String) = this()
  }
  
  @JSGlobal("SP.JsGrid.EventArgs.Click")
  @js.native
  class Click protected ()
    extends typings.sharepoint.SP.JsGrid.EventArgs.Click {
    def this(
      eventInfo: DomEvent,
      context: typings.sharepoint.SP.JsGrid.ClickContext,
      recordKey: Double,
      fieldKey: String
    ) = this()
  }
  
  @JSGlobal("SP.JsGrid.EventArgs.GridErrorStateChanged")
  @js.native
  class GridErrorStateChanged protected ()
    extends typings.sharepoint.SP.JsGrid.EventArgs.GridErrorStateChanged {
    def this(bAnyErrors: Boolean) = this()
  }
  
  @JSGlobal("SP.JsGrid.EventArgs.OnBeginRedoDataUpdateChange")
  @js.native
  class OnBeginRedoDataUpdateChange protected ()
    extends typings.sharepoint.SP.JsGrid.EventArgs.OnBeginRedoDataUpdateChange {
    def this(changeKey: IChangeKey) = this()
  }
  
  @JSGlobal("SP.JsGrid.EventArgs.OnBeginUndoDataUpdateChange")
  @js.native
  class OnBeginUndoDataUpdateChange protected ()
    extends typings.sharepoint.SP.JsGrid.EventArgs.OnBeginUndoDataUpdateChange {
    def this(changeKey: IChangeKey) = this()
  }
  
  @JSGlobal("SP.JsGrid.EventArgs.OnCellErrorStateChanged")
  @js.native
  class OnCellErrorStateChanged protected ()
    extends typings.sharepoint.SP.JsGrid.EventArgs.OnCellErrorStateChanged {
    def this(
      recordKey: Double,
      fieldKey: String,
      bAddingError: Boolean,
      bCellCurrentlyHasError: Boolean,
      bCellHadError: Boolean,
      errorId: Double
    ) = this()
  }
  
  @JSGlobal("SP.JsGrid.EventArgs.OnEndRenameColumn")
  @js.native
  class OnEndRenameColumn protected ()
    extends typings.sharepoint.SP.JsGrid.EventArgs.OnEndRenameColumn {
    def this(columnKey: String, originalColumnTitle: String, newColumnTitle: String) = this()
  }
  
  @JSGlobal("SP.JsGrid.EventArgs.OnEntryRecordAdded")
  @js.native
  class OnEntryRecordAdded protected ()
    extends typings.sharepoint.SP.JsGrid.EventArgs.OnEntryRecordAdded {
    def this(recordKey: Double) = this()
  }
  
  @JSGlobal("SP.JsGrid.EventArgs.OnEntryRecordCommitted")
  @js.native
  class OnEntryRecordCommitted protected ()
    extends typings.sharepoint.SP.JsGrid.EventArgs.OnEntryRecordCommitted {
    def this(origRecKey: String, recordKey: Double, changeKey: IChangeKey) = this()
  }
  
  @JSGlobal("SP.JsGrid.EventArgs.OnRecordsReordered")
  @js.native
  class OnRecordsReordered protected ()
    extends typings.sharepoint.SP.JsGrid.EventArgs.OnRecordsReordered {
    def this(recordKeys: js.Array[String], changeKey: IChangeKey) = this()
  }
  
  @JSGlobal("SP.JsGrid.EventArgs.OnRowErrorStateChanged")
  @js.native
  class OnRowErrorStateChanged protected ()
    extends typings.sharepoint.SP.JsGrid.EventArgs.OnRowErrorStateChanged {
    def this(
      recordKey: Double,
      bAddingError: Boolean,
      bErrorCurrentlyInRow: Boolean,
      bRowHadError: Boolean,
      errorId: Double,
      message: String
    ) = this()
  }
  
  @JSGlobal("SP.JsGrid.EventArgs.OnRowEscape")
  @js.native
  class OnRowEscape protected ()
    extends typings.sharepoint.SP.JsGrid.EventArgs.OnRowEscape {
    def this(recordKey: Double) = this()
  }
  
  @JSGlobal("SP.JsGrid.EventArgs.PendingChangeKeyInitiallyComplete")
  @js.native
  class PendingChangeKeyInitiallyComplete protected ()
    extends typings.sharepoint.SP.JsGrid.EventArgs.PendingChangeKeyInitiallyComplete {
    def this(changeKey: IChangeKey) = this()
  }
  
  @JSGlobal("SP.JsGrid.EventArgs.PropertyChanged")
  @js.native
  class PropertyChanged protected ()
    extends typings.sharepoint.SP.JsGrid.EventArgs.PropertyChanged {
    def this(
      recordKey: Double,
      fieldKey: String,
      oldProp: PropertyUpdate,
      newProp: PropertyUpdate,
      propType: IPropertyType,
      changeKey: IChangeKey,
      validationState: typings.sharepoint.SP.JsGrid.ValidationState
    ) = this()
  }
  
  @JSGlobal("SP.JsGrid.EventArgs.RecordChecked")
  @js.native
  class RecordChecked protected ()
    extends typings.sharepoint.SP.JsGrid.EventArgs.RecordChecked {
    def this(recordKeySet: Set, bChecked: Boolean) = this()
  }
  
  @JSGlobal("SP.JsGrid.EventArgs.RecordDeleted")
  @js.native
  class RecordDeleted protected ()
    extends typings.sharepoint.SP.JsGrid.EventArgs.RecordDeleted {
    def this(recordKey: Double, recordIdx: Double, changeKey: IChangeKey) = this()
  }
  
  @JSGlobal("SP.JsGrid.EventArgs.RecordInserted")
  @js.native
  class RecordInserted protected ()
    extends typings.sharepoint.SP.JsGrid.EventArgs.RecordInserted {
    def this(recordKey: Double, recordIdx: Double, afterRecordKey: Double, changeKey: IChangeKey) = this()
  }
  
  @JSGlobal("SP.JsGrid.EventArgs.RowFocusChanged")
  @js.native
  class RowFocusChanged protected ()
    extends typings.sharepoint.SP.JsGrid.EventArgs.RowFocusChanged {
    def this(newRecordKey: Double, oldRecordKey: Double) = this()
  }
  
  @JSGlobal("SP.JsGrid.EventArgs.SingleCellClick")
  @js.native
  class SingleCellClick protected ()
    extends typings.sharepoint.SP.JsGrid.EventArgs.SingleCellClick {
    def this(eventInfo: DomEvent, recordKey: Double, fieldKey: String) = this()
  }
  
  @JSGlobal("SP.JsGrid.EventArgs.SingleCellKeyDown")
  @js.native
  class SingleCellKeyDown protected ()
    extends typings.sharepoint.SP.JsGrid.EventArgs.SingleCellKeyDown {
    def this(eventInfo: DomEvent, recordKey: Double, fieldKey: String) = this()
  }
  
  @JSGlobal("SP.JsGrid.EventArgs.VacateChange")
  @js.native
  class VacateChange protected ()
    extends typings.sharepoint.SP.JsGrid.EventArgs.VacateChange {
    def this(changeKey: IChangeKey) = this()
  }
}
