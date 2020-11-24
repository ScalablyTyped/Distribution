package typings.relayRuntime.anon

import typings.relayRuntime.relayRuntimeStrings.storeDotnotifyDotcomplete
import typings.relayRuntime.relayRuntimeTypesMod.DataID
import typings.relayRuntime.relayStoreTypesMod.LogEvent
import typings.relayRuntime.relayStoreTypesMod.UpdatedRecords
import typings.std.Set
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
  implicit class ReadonlynamestorenotifycoOps[Self <: Readonlynamestorenotifyco] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInvalidatedRecordIDs(value: Set[DataID]): Self = this.set("invalidatedRecordIDs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: storeDotnotifyDotcomplete): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedRecordIDs(value: UpdatedRecords): Self = this.set("updatedRecordIDs", value.asInstanceOf[js.Any])
  }
}
