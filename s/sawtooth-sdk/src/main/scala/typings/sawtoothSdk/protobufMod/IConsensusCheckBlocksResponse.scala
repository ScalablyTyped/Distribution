package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ConsensusCheckBlocksResponse.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IConsensusCheckBlocksResponse extends StObject {
  
  /** ConsensusCheckBlocksResponse status */
  var status: js.UndefOr[Status | Null] = js.undefined
}
object IConsensusCheckBlocksResponse {
  
  inline def apply(): IConsensusCheckBlocksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConsensusCheckBlocksResponse]
  }
  
  extension [Self <: IConsensusCheckBlocksResponse](x: Self) {
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
