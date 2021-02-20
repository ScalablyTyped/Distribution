package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ConsensusCheckBlocksResponse.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IConsensusCheckBlocksResponse extends StObject {
  
  /** ConsensusCheckBlocksResponse status */
  var status: js.UndefOr[Status | Null] = js.native
}
object IConsensusCheckBlocksResponse {
  
  @scala.inline
  def apply(): IConsensusCheckBlocksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConsensusCheckBlocksResponse]
  }
  
  @scala.inline
  implicit class IConsensusCheckBlocksResponseMutableBuilder[Self <: IConsensusCheckBlocksResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusNull: Self = StObject.set(x, "status", null)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
