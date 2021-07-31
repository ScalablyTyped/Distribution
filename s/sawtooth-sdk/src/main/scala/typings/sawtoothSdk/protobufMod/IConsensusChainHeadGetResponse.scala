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
  
  @scala.inline
  def apply(): IConsensusChainHeadGetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConsensusChainHeadGetResponse]
  }
  
  @scala.inline
  implicit class IConsensusChainHeadGetResponseMutableBuilder[Self <: IConsensusChainHeadGetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlock(value: IConsensusBlock): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockNull: Self = StObject.set(x, "block", null)
    
    @scala.inline
    def setBlockUndefined: Self = StObject.set(x, "block", js.undefined)
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusNull: Self = StObject.set(x, "status", null)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
