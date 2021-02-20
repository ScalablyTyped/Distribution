package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ConsensusRegisterResponse.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IConsensusRegisterResponse extends StObject {
  
  /** ConsensusRegisterResponse chainHead */
  var chainHead: js.UndefOr[IConsensusBlock | Null] = js.native
  
  /** ConsensusRegisterResponse peers */
  var peers: js.UndefOr[js.Array[IConsensusPeerInfo] | Null] = js.native
  
  /** ConsensusRegisterResponse status */
  var status: js.UndefOr[Status | Null] = js.native
}
object IConsensusRegisterResponse {
  
  @scala.inline
  def apply(): IConsensusRegisterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConsensusRegisterResponse]
  }
  
  @scala.inline
  implicit class IConsensusRegisterResponseMutableBuilder[Self <: IConsensusRegisterResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChainHead(value: IConsensusBlock): Self = StObject.set(x, "chainHead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChainHeadNull: Self = StObject.set(x, "chainHead", null)
    
    @scala.inline
    def setChainHeadUndefined: Self = StObject.set(x, "chainHead", js.undefined)
    
    @scala.inline
    def setPeers(value: js.Array[IConsensusPeerInfo]): Self = StObject.set(x, "peers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeersNull: Self = StObject.set(x, "peers", null)
    
    @scala.inline
    def setPeersUndefined: Self = StObject.set(x, "peers", js.undefined)
    
    @scala.inline
    def setPeersVarargs(value: IConsensusPeerInfo*): Self = StObject.set(x, "peers", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusNull: Self = StObject.set(x, "status", null)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
