package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ConsensusChainHeadGetResponse.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IConsensusChainHeadGetResponse extends StObject {
  
  /** ConsensusChainHeadGetResponse block */
  var block: js.UndefOr[IConsensusBlock | Null] = js.undefined
  
  /** ConsensusChainHeadGetResponse status */
  var status: js.UndefOr[Status | Null] = js.undefined
}
object IConsensusChainHeadGetResponse {
  
  inline def apply(): IConsensusChainHeadGetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConsensusChainHeadGetResponse]
  }
  
  extension [Self <: IConsensusChainHeadGetResponse](x: Self) {
    
    inline def setBlock(value: IConsensusBlock): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
    
    inline def setBlockNull: Self = StObject.set(x, "block", null)
    
    inline def setBlockUndefined: Self = StObject.set(x, "block", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
