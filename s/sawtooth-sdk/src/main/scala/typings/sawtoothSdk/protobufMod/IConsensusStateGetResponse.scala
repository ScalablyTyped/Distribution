package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ConsensusStateGetResponse.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IConsensusStateGetResponse extends StObject {
  
  /** ConsensusStateGetResponse entries */
  var entries: js.UndefOr[js.Array[IConsensusStateEntry] | Null] = js.undefined
  
  /** ConsensusStateGetResponse status */
  var status: js.UndefOr[Status | Null] = js.undefined
}
object IConsensusStateGetResponse {
  
  inline def apply(): IConsensusStateGetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConsensusStateGetResponse]
  }
  
  extension [Self <: IConsensusStateGetResponse](x: Self) {
    
    inline def setEntries(value: js.Array[IConsensusStateEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesNull: Self = StObject.set(x, "entries", null)
    
    inline def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    inline def setEntriesVarargs(value: IConsensusStateEntry*): Self = StObject.set(x, "entries", js.Array(value*))
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
