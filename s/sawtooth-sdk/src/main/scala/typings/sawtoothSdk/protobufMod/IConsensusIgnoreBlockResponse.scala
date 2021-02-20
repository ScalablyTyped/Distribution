package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ConsensusIgnoreBlockResponse.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IConsensusIgnoreBlockResponse extends StObject {
  
  /** ConsensusIgnoreBlockResponse status */
  var status: js.UndefOr[Status | Null] = js.native
}
object IConsensusIgnoreBlockResponse {
  
  @scala.inline
  def apply(): IConsensusIgnoreBlockResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConsensusIgnoreBlockResponse]
  }
  
  @scala.inline
  implicit class IConsensusIgnoreBlockResponseMutableBuilder[Self <: IConsensusIgnoreBlockResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusNull: Self = StObject.set(x, "status", null)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
