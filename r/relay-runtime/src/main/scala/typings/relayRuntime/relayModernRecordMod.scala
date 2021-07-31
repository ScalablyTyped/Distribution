package typings.relayRuntime

import typings.relayRuntime.relayRuntimeTypesMod.DataID
import typings.relayRuntime.relayStoreTypesMod.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relayModernRecordMod {
  
  @JSImport("relay-runtime/lib/store/RelayModernRecord", "RelayModernRecord")
  @js.native
  class RelayModernRecord () extends StObject {
    
    /**
      * Clone a record.
      */
    def clone(record: Record): Record = js.native
    
    /**
      * Copies all fields from `source` to `sink`, excluding `__id` and `__typename`.
      *
      * NOTE: This function does not treat `id` specially. To preserve the id,
      * manually reset it after calling this function. Also note that values are
      * copied by reference and not value; callers should ensure that values are
      * copied on write.
      */
    def copyFields(source: Record, sink: Record): Unit = js.native
    
    /**
      * Create a new record.
      */
    def create(dataID: DataID, typeName: String): Record = js.native
    
    /**
      * Prevent modifications to the record. Attempts to call `set*` functions on a
      * frozen record will fatal at runtime.
      */
    def freeze(record: Record): Unit = js.native
    
    /**
      * Get the record's `id` if available or the client-generated identifier.
      */
    def getDataID(record: Record): DataID = js.native
    
    /**
      * Get the value of a field as a reference to another record. Throws if the
      * field has a different type.
      */
    def getLinkedRecordID(record: Record, storageKey: String): DataID | Null = js.native
    
    /**
      * Get the value of a field as a list of references to other records. Throws if
      * the field has a different type.
      */
    def getLinkedRecordIDs(record: Record, storageKey: String): js.Array[DataID] | Null = js.native
    
    /**
      * Get the concrete type of the record.
      */
    def getType(record: Record): String = js.native
    
    /**
      * Get a scalar (non-link) field value.
      */
    def getValue(record: Record, storageKey: String): js.Any = js.native
    
    /**
      * Returns a new record with the contents of the given records. Fields in the
      * second record will overwrite identical fields in the first record.
      */
    def merge(record1: Record, record2: Record): Record = js.native
    
    /**
      * Set the value of a field to a reference to another record.
      */
    def setLinkedRecordID(record: Record, storageKey: String, linkedID: DataID): Unit = js.native
    
    /**
      * Set the value of a field to a list of references other records.
      */
    def setLinkedRecordIDs(record: Record, storageKey: String): Unit = js.native
    def setLinkedRecordIDs(record: Record, storageKey: String, linkedIDs: js.Array[DataID]): Unit = js.native
    
    /**
      * Set the value of a storageKey to a scalar.
      */
    def setValue(record: Record, storageKey: String, value: js.Any): Unit = js.native
    
    /**
      * Compares the fields of a previous and new record, returning either the
      * previous record if all fields are equal or a new record (with merged fields)
      * if any fields have changed.
      */
    def update(prevRecord: Record, nextRecord: Record): Record = js.native
  }
}
