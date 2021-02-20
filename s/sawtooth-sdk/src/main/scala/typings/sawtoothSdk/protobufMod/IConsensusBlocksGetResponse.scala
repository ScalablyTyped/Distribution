package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ConsensusBlocksGetResponse.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IConsensusBlocksGetResponse extends StObject {
  
  /** ConsensusBlocksGetResponse blocks */
  var blocks: js.UndefOr[js.Array[IConsensusBlock] | Null] = js.native
  
  /** ConsensusBlocksGetResponse status */
  var status: js.UndefOr[Status | Null] = js.native
}
object IConsensusBlocksGetResponse {
  
  @scala.inline
  def apply(): IConsensusBlocksGetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConsensusBlocksGetResponse]
  }
  
  @scala.inline
  implicit class IConsensusBlocksGetResponseMutableBuilder[Self <: IConsensusBlocksGetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlocks(value: js.Array[IConsensusBlock]): Self = StObject.set(x, "blocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlocksNull: Self = StObject.set(x, "blocks", null)
    
    @scala.inline
    def setBlocksUndefined: Self = StObject.set(x, "blocks", js.undefined)
    
    @scala.inline
    def setBlocksVarargs(value: IConsensusBlock*): Self = StObject.set(x, "blocks", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusNull: Self = StObject.set(x, "status", null)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
