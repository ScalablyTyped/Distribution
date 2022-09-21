package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ConsensusBlocksGetResponse.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IConsensusBlocksGetResponse extends StObject {
  
  /** ConsensusBlocksGetResponse blocks */
  var blocks: js.UndefOr[js.Array[IConsensusBlock] | Null] = js.undefined
  
  /** ConsensusBlocksGetResponse status */
  var status: js.UndefOr[Status | Null] = js.undefined
}
object IConsensusBlocksGetResponse {
  
  inline def apply(): IConsensusBlocksGetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConsensusBlocksGetResponse]
  }
  
  extension [Self <: IConsensusBlocksGetResponse](x: Self) {
    
    inline def setBlocks(value: js.Array[IConsensusBlock]): Self = StObject.set(x, "blocks", value.asInstanceOf[js.Any])
    
    inline def setBlocksNull: Self = StObject.set(x, "blocks", null)
    
    inline def setBlocksUndefined: Self = StObject.set(x, "blocks", js.undefined)
    
    inline def setBlocksVarargs(value: IConsensusBlock*): Self = StObject.set(x, "blocks", js.Array(value*))
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
