package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ConsensusCommitBlockResponse.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IConsensusCommitBlockResponse extends StObject {
  
  /** ConsensusCommitBlockResponse status */
  var status: js.UndefOr[Status | Null] = js.undefined
}
object IConsensusCommitBlockResponse {
  
  @scala.inline
  def apply(): IConsensusCommitBlockResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConsensusCommitBlockResponse]
  }
  
  @scala.inline
  implicit class IConsensusCommitBlockResponseMutableBuilder[Self <: IConsensusCommitBlockResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusNull: Self = StObject.set(x, "status", null)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
