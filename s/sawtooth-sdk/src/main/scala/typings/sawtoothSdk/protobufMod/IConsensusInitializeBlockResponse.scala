package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ConsensusInitializeBlockResponse.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IConsensusInitializeBlockResponse extends StObject {
  
  /** ConsensusInitializeBlockResponse status */
  var status: js.UndefOr[Status | Null] = js.undefined
}
object IConsensusInitializeBlockResponse {
  
  @scala.inline
  def apply(): IConsensusInitializeBlockResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConsensusInitializeBlockResponse]
  }
  
  @scala.inline
  implicit class IConsensusInitializeBlockResponseMutableBuilder[Self <: IConsensusInitializeBlockResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusNull: Self = StObject.set(x, "status", null)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
