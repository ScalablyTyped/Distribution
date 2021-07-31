package typings.relayRuntime.anon

import typings.relayRuntime.relayRuntimeStrings.storeDotnotifyDotcomplete
import typings.relayRuntime.relayRuntimeTypesMod.DataID
import typings.relayRuntime.relayStoreTypesMod.LogEvent
import typings.relayRuntime.relayStoreTypesMod.UpdatedRecords
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  name :'store.notify.complete',   updatedRecordIDs :relay-runtime.relay-runtime/lib/store/RelayStoreTypes.UpdatedRecords,   invalidatedRecordIDs :std.Set<relay-runtime.relay-runtime/lib/util/RelayRuntimeTypes.DataID>}> */
trait Readonlynamestorenotifyco
  extends StObject
     with LogEvent {
  
  val invalidatedRecordIDs: Set[DataID]
  
  val name: storeDotnotifyDotcomplete
  
  val updatedRecordIDs: UpdatedRecords
}
object Readonlynamestorenotifyco {
  
  @scala.inline
  def apply(invalidatedRecordIDs: Set[DataID], updatedRecordIDs: UpdatedRecords): Readonlynamestorenotifyco = {
    val __obj = js.Dynamic.literal(invalidatedRecordIDs = invalidatedRecordIDs.asInstanceOf[js.Any], name = "store.notify.complete", updatedRecordIDs = updatedRecordIDs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Readonlynamestorenotifyco]
  }
  
  @scala.inline
  implicit class ReadonlynamestorenotifycoMutableBuilder[Self <: Readonlynamestorenotifyco] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInvalidatedRecordIDs(value: Set[DataID]): Self = StObject.set(x, "invalidatedRecordIDs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: storeDotnotifyDotcomplete): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedRecordIDs(value: UpdatedRecords): Self = StObject.set(x, "updatedRecordIDs", value.asInstanceOf[js.Any])
  }
}
