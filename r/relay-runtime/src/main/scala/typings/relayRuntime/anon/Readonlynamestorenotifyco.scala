package typings.relayRuntime.anon

import typings.relayRuntime.relayRuntimeStrings.storeDotnotifyDotcomplete
import typings.relayRuntime.relayRuntimeTypesMod.DataID
import typings.relayRuntime.relayStoreTypesMod.LogEvent
import typings.relayRuntime.relayStoreTypesMod.UpdatedRecords
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  name :'store.notify.complete',   updatedRecordIDs :relay-runtime.relay-runtime/lib/store/RelayStoreTypes.UpdatedRecords,   invalidatedRecordIDs :std.Set<relay-runtime.relay-runtime/lib/util/RelayRuntimeTypes.DataID>}> */
@js.native
trait Readonlynamestorenotifyco extends LogEvent {
  
  val invalidatedRecordIDs: Set[DataID] = js.native
  
  val name: storeDotnotifyDotcomplete = js.native
  
  val updatedRecordIDs: UpdatedRecords = js.native
}
object Readonlynamestorenotifyco {
  
  @scala.inline
  def apply(
    invalidatedRecordIDs: Set[DataID],
    name: storeDotnotifyDotcomplete,
    updatedRecordIDs: UpdatedRecords
  ): Readonlynamestorenotifyco = {
    val __obj = js.Dynamic.literal(invalidatedRecordIDs = invalidatedRecordIDs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], updatedRecordIDs = updatedRecordIDs.asInstanceOf[js.Any])
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
