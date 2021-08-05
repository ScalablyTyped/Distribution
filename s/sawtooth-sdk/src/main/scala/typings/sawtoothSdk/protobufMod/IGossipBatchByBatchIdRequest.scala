package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IGossipBatchByBatchIdRequest extends StObject {
  
  /** GossipBatchByBatchIdRequest id */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /** GossipBatchByBatchIdRequest nonce */
  var nonce: js.UndefOr[String | Null] = js.undefined
  
  /** GossipBatchByBatchIdRequest timeToLive */
  var timeToLive: js.UndefOr[Double | Null] = js.undefined
}
object IGossipBatchByBatchIdRequest {
  
  inline def apply(): IGossipBatchByBatchIdRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGossipBatchByBatchIdRequest]
  }
  
  extension [Self <: IGossipBatchByBatchIdRequest](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    inline def setNonceNull: Self = StObject.set(x, "nonce", null)
    
    inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
    
    inline def setTimeToLive(value: Double): Self = StObject.set(x, "timeToLive", value.asInstanceOf[js.Any])
    
    inline def setTimeToLiveNull: Self = StObject.set(x, "timeToLive", null)
    
    inline def setTimeToLiveUndefined: Self = StObject.set(x, "timeToLive", js.undefined)
  }
}
