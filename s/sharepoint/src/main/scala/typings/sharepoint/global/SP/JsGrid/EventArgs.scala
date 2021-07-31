package typings.sharepoint.global.SP.JsGrid

import typings.microsoftAjax.Sys.UI.DomEvent
import typings.sharepoint.SP.JsGrid.IChangeKey
import typings.sharepoint.SP.JsGrid.IPropertyType
import typings.sharepoint.SP.JsGrid.Internal.PropertyUpdate
import typings.sharepoint.SP.Utilities.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object EventArgs {
  
  @JSGlobal("SP.JsGrid.EventArgs.CellEditBegin")
  @js.native
  class CellEditBegin protected ()
    extends StObject
       with typings.sharepoint.SP.JsGrid.EventArgs.CellEditBegin {
    def this(recordKey: Double, fieldKey: String) = this()
    
    /* CompleteClass */
    var fieldKey: String = js.native
    
    /* CompleteClass */
    var recordKey: Double = js.native
  }
  
  @JSGlobal("SP.JsGrid.EventArgs.CellEditCompleted")
  @js.native
  class CellEditCompleted protected ()
    extends StObject
       with typings.sharepoint.SP.JsGrid.EventArgs.CellEditCompleted {
    def this(recordKey: Double, fieldKey: String, changeKey: IChangeKey, bCancelled: Boolean) = this()
    
    /* CompleteClass */
    var bCancelled: Boolean = js.native
    
    /* CompleteClass */
    var changeKey: IChangeKey = js.native
    
    /* CompleteClass */
    var fieldKey: String = js.native
    
    /* CompleteClass */
    var recordKey: Double = js.native
  }
  
  @JSGlobal("SP.JsGrid.EventArgs.CellFocusChanged")
  @js.native
  class CellFocusChanged protected ()
    extends StObject
       with typings.sharepoint.SP.JsGrid.EventArgs.CellFocusChanged {
    def this(newRecordKey: Double, newFieldKey: String, oldRecordKey: Double, oldFieldKey: String) = this()
    
    /* CompleteClass */
    var newFieldKey: String = js.native
    
    /* CompleteClass */
    var newRecordKey: Double = js.native
    
    /* CompleteClass */
    var oldFieldKey: String = js.native
    
    /* CompleteClass */
    var oldRecordKey: Double = js.native
  }
  
  @JSGlobal("SP.JsGrid.EventArgs.Click")
  @js.native
  class Click protected ()
    extends StObject
       with typings.sharepoint.SP.JsGrid.EventArgs.Click {
    def this(
      eventInfo: DomEvent,
      context: typings.sharepoint.SP.JsGrid.ClickContext,
      recordKey: Double,
      fieldKey: String
    ) = this()
    
    /* CompleteClass */
    var context: typings.sharepoint.SP.JsGrid.ClickContext = js.native
    
    /* CompleteClass */
    var eventInfo: DomEvent = js.native
    
    /* CompleteClass */
    var fieldKey: String = js.native
    
    /* CompleteClass */
    var recordKey: Double = js.native
  }
  
  @JSGlobal("SP.JsGrid.EventArgs.GridErrorStateChanged")
  @js.native
  class GridErrorStateChanged protected ()
    extends StObject
       with typings.sharepoint.SP.JsGrid.EventArgs.GridErrorStateChanged {
    def this(bAnyErrors: Boolean) = this()
    
    /* CompleteClass */
    var bAnyErrors: Boolean = js.native
  }
  
  @JSGlobal("SP.JsGrid.EventArgs.OnBeginRedoDataUpdateChange")
  @js.native
  class OnBeginRedoDataUpdateChange protected ()
    extends StObject
       with typings.sharepoint.SP.JsGrid.EventArgs.OnBeginRedoDataUpdateChange {
    def this(changeKey: IChangeKey) = this()
    
    /* CompleteClass */
    var changeKey: IChangeKey = js.native
  }
  
  @JSGlobal("SP.JsGrid.EventArgs.OnBeginUndoDataUpdateChange")
  @js.native
  class OnBeginUndoDataUpdateChange protected ()
    extends StObject
       with typings.sharepoint.SP.JsGrid.EventArgs.OnBeginUndoDataUpdateChange {
    def this(changeKey: IChangeKey) = this()
    
    /* CompleteClass */
    var changeKey: IChangeKey = js.native
  }
  
  @JSGlobal("SP.JsGrid.EventArgs.OnCellErrorStateChanged")
  @js.native
  class OnCellErrorStateChanged protected ()
    extends StObject
       with typings.sharepoint.SP.JsGrid.EventArgs.OnCellErrorStateChanged {
    def this(
      recordKey: Double,
      fieldKey: String,
      bAddingError: Boolean,
      bCellCurrentlyHasError: Boolean,
      bCellHadError: Boolean,
      errorId: Double
    ) = this()
    
    /* CompleteClass */
    var bAddingError: Boolean = js.native
    
    /* CompleteClass */
    var bCellCurrentlyHasError: Boolean = js.native
    
    /* CompleteClass */
    var bCellHadError: Boolean = js.native
    
    /* CompleteClass */
    var errorId: Double = js.native
    
    /* CompleteClass */
    var fieldKey: String = js.native
    
    /* CompleteClass */
    var recordKey: Double = js.native
  }
  
  @JSGlobal("SP.JsGrid.EventArgs.OnEndRenameColumn")
  @js.native
  class OnEndRenameColumn protected ()
    extends StObject
       with typings.sharepoint.SP.JsGrid.EventArgs.OnEndRenameColumn {
    def this(columnKey: String, originalColumnTitle: String, newColumnTitle: String) = this()
    
    /* CompleteClass */
    var columnKey: String = js.native
    
    /* CompleteClass */
    var newColumnTitle: String = js.native
    
    /* CompleteClass */
    var originalColumnTitle: String = js.native
  }
  
  @JSGlobal("SP.JsGrid.EventArgs.OnEntryRecordAdded")
  @js.native
  class OnEntryRecordAdded protected ()
    extends StObject
       with typings.sharepoint.SP.JsGrid.EventArgs.OnEntryRecordAdded {
    def this(recordKey: Double) = this()
    
    /* CompleteClass */
    var recordKey: Double = js.native
  }
  
  @JSGlobal("SP.JsGrid.EventArgs.OnEntryRecordCommitted")
  @js.native
  class OnEntryRecordCommitted protected ()
    extends StObject
       with typings.sharepoint.SP.JsGrid.EventArgs.OnEntryRecordCommitted {
    def this(origRecKey: String, recordKey: Double, changeKey: IChangeKey) = this()
    
    /* CompleteClass */
    var changeKey: IChangeKey = js.native
    
    /* CompleteClass */
    var originalRecordKey: Double = js.native
    
    /* CompleteClass */
    var recordKey: Double = js.native
  }
  
  @JSGlobal("SP.JsGrid.EventArgs.OnRecordsReordered")
  @js.native
  class OnRecordsReordered protected ()
    extends StObject
       with typings.sharepoint.SP.JsGrid.EventArgs.OnRecordsReordered {
    def this(recordKeys: js.Array[String], changeKey: IChangeKey) = this()
    
    /* CompleteClass */
    var changeKey: IChangeKey = js.native
    
    /* CompleteClass */
    var reorderedKeys: js.Array[String] = js.native
  }
  
  @JSGlobal("SP.JsGrid.EventArgs.OnRowErrorStateChanged")
  @js.native
  class OnRowErrorStateChanged protected ()
    extends StObject
       with typings.sharepoint.SP.JsGrid.EventArgs.OnRowErrorStateChanged {
    def this(
      recordKey: Double,
      bAddingError: Boolean,
      bErrorCurrentlyInRow: Boolean,
      bRowHadError: Boolean,
      errorId: Double,
      message: String
    ) = this()
    
    /* CompleteClass */
    var bAddingError: Boolean = js.native
    
    /* CompleteClass */
    var bErrorCurrentlyInRow: Boolean = js.native
    
    /* CompleteClass */
    var bRowHadError: Boolean = js.native
    
    /* CompleteClass */
    var errorId: Double = js.native
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var recordKey: Double = js.native
  }
  
  @JSGlobal("SP.JsGrid.EventArgs.OnRowEscape")
  @js.native
  class OnRowEscape protected ()
    extends StObject
       with typings.sharepoint.SP.JsGrid.EventArgs.OnRowEscape {
    def this(recordKey: Double) = this()
    
    /* CompleteClass */
    var recordKey: Double = js.native
  }
  
  @JSGlobal("SP.JsGrid.EventArgs.PendingChangeKeyInitiallyComplete")
  @js.native
  class PendingChangeKeyInitiallyComplete protected ()
    extends StObject
       with typings.sharepoint.SP.JsGrid.EventArgs.PendingChangeKeyInitiallyComplete {
    def this(changeKey: IChangeKey) = this()
    
    /* CompleteClass */
    var changeKey: IChangeKey = js.native
  }
  
  @JSGlobal("SP.JsGrid.EventArgs.PropertyChanged")
  @js.native
  class PropertyChanged protected ()
    extends StObject
       with typings.sharepoint.SP.JsGrid.EventArgs.PropertyChanged {
    def this(
      recordKey: Double,
      fieldKey: String,
      oldProp: PropertyUpdate,
      newProp: PropertyUpdate,
      propType: IPropertyType,
      changeKey: IChangeKey,
      validationState: typings.sharepoint.SP.JsGrid.ValidationState
    ) = this()
    
    /* CompleteClass */
    var changeKey: IChangeKey = js.native
    
    /* CompleteClass */
    var fieldKey: String = js.native
    
    /* CompleteClass */
    var newProp: PropertyUpdate = js.native
    
    /* CompleteClass */
    var oldProp: PropertyUpdate = js.native
    
    /* CompleteClass */
    var propType: IPropertyType = js.native
    
    /* CompleteClass */
    var recordKey: Double = js.native
    
    /* CompleteClass */
    var validationState: typings.sharepoint.SP.JsGrid.ValidationState = js.native
  }
  
  @JSGlobal("SP.JsGrid.EventArgs.RecordChecked")
  @js.native
  class RecordChecked protected ()
    extends StObject
       with typings.sharepoint.SP.JsGrid.EventArgs.RecordChecked {
    def this(recordKeySet: Set, bChecked: Boolean) = this()
    
    /* CompleteClass */
    var bChecked: Boolean = js.native
    
    /* CompleteClass */
    var recordKeySet: Set = js.native
  }
  
  @JSGlobal("SP.JsGrid.EventArgs.RecordDeleted")
  @js.native
  class RecordDeleted protected ()
    extends StObject
       with typings.sharepoint.SP.JsGrid.EventArgs.RecordDeleted {
    def this(recordKey: Double, recordIdx: Double, changeKey: IChangeKey) = this()
    
    /* CompleteClass */
    var changeKey: IChangeKey = js.native
    
    /* CompleteClass */
    var recordIdx: Double = js.native
    
    /* CompleteClass */
    var recordKey: Double = js.native
  }
  
  @JSGlobal("SP.JsGrid.EventArgs.RecordInserted")
  @js.native
  class RecordInserted protected ()
    extends StObject
       with typings.sharepoint.SP.JsGrid.EventArgs.RecordInserted {
    def this(recordKey: Double, recordIdx: Double, afterRecordKey: Double, changeKey: IChangeKey) = this()
    
    /* CompleteClass */
    var afterRecordKey: Double = js.native
    
    /* CompleteClass */
    var changeKey: IChangeKey = js.native
    
    /* CompleteClass */
    var recordIdx: Double = js.native
    
    /* CompleteClass */
    var recordKey: Double = js.native
  }
  
  @JSGlobal("SP.JsGrid.EventArgs.RowFocusChanged")
  @js.native
  class RowFocusChanged protected ()
    extends StObject
       with typings.sharepoint.SP.JsGrid.EventArgs.RowFocusChanged {
    def this(newRecordKey: Double, oldRecordKey: Double) = this()
    
    /* CompleteClass */
    var newRecordKey: Double = js.native
    
    /* CompleteClass */
    var oldRecordKey: Double = js.native
  }
  
  @JSGlobal("SP.JsGrid.EventArgs.SingleCellClick")
  @js.native
  class SingleCellClick protected ()
    extends StObject
       with typings.sharepoint.SP.JsGrid.EventArgs.SingleCellClick {
    def this(eventInfo: DomEvent, recordKey: Double, fieldKey: String) = this()
    
    /* CompleteClass */
    var eventInfo: DomEvent = js.native
    
    /* CompleteClass */
    var fieldKey: String = js.native
    
    /* CompleteClass */
    var recordKey: Double = js.native
  }
  
  @JSGlobal("SP.JsGrid.EventArgs.SingleCellKeyDown")
  @js.native
  class SingleCellKeyDown protected ()
    extends StObject
       with typings.sharepoint.SP.JsGrid.EventArgs.SingleCellKeyDown {
    def this(eventInfo: DomEvent, recordKey: Double, fieldKey: String) = this()
    
    /* CompleteClass */
    var eventInfo: DomEvent = js.native
    
    /* CompleteClass */
    var fieldKey: String = js.native
    
    /* CompleteClass */
    var recordKey: Double = js.native
  }
  
  @JSGlobal("SP.JsGrid.EventArgs.VacateChange")
  @js.native
  class VacateChange protected ()
    extends StObject
       with typings.sharepoint.SP.JsGrid.EventArgs.VacateChange {
    def this(changeKey: IChangeKey) = this()
    
    /* CompleteClass */
    var changeKey: IChangeKey = js.native
  }
}
