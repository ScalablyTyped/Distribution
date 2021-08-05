package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ConsensusRegisterResponse.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IConsensusRegisterResponse extends StObject {
  
  /** ConsensusRegisterResponse chainHead */
  var chainHead: js.UndefOr[IConsensusBlock | Null] = js.undefined
  
  /** ConsensusRegisterResponse peers */
  var peers: js.UndefOr[js.Array[IConsensusPeerInfo] | Null] = js.undefined
  
  /** ConsensusRegisterResponse status */
  var status: js.UndefOr[Status | Null] = js.undefined
}
object IConsensusRegisterResponse {
  
  inline def apply(): IConsensusRegisterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConsensusRegisterResponse]
  }
  
  extension [Self <: IConsensusRegisterResponse](x: Self) {
    
    inline def setChainHead(value: IConsensusBlock): Self = StObject.set(x, "chainHead", value.asInstanceOf[js.Any])
    
    inline def setChainHeadNull: Self = StObject.set(x, "chainHead", null)
    
    inline def setChainHeadUndefined: Self = StObject.set(x, "chainHead", js.undefined)
    
    inline def setPeers(value: js.Array[IConsensusPeerInfo]): Self = StObject.set(x, "peers", value.asInstanceOf[js.Any])
    
    inline def setPeersNull: Self = StObject.set(x, "peers", null)
    
    inline def setPeersUndefined: Self = StObject.set(x, "peers", js.undefined)
    
    inline def setPeersVarargs(value: IConsensusPeerInfo*): Self = StObject.set(x, "peers", js.Array(value :_*))
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
