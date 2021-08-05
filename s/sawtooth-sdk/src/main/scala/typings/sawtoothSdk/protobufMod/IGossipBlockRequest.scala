package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IGossipBlockRequest extends StObject {
  
  /** GossipBlockRequest blockId */
  var blockId: js.UndefOr[String | Null] = js.undefined
  
  /** GossipBlockRequest nonce */
  var nonce: js.UndefOr[String | Null] = js.undefined
  
  /** GossipBlockRequest timeToLive */
  var timeToLive: js.UndefOr[Double | Null] = js.undefined
}
object IGossipBlockRequest {
  
  inline def apply(): IGossipBlockRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGossipBlockRequest]
  }
  
  extension [Self <: IGossipBlockRequest](x: Self) {
    
    inline def setBlockId(value: String): Self = StObject.set(x, "blockId", value.asInstanceOf[js.Any])
    
    inline def setBlockIdNull: Self = StObject.set(x, "blockId", null)
    
    inline def setBlockIdUndefined: Self = StObject.set(x, "blockId", js.undefined)
    
    inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    inline def setNonceNull: Self = StObject.set(x, "nonce", null)
    
    inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
    
    inline def setTimeToLive(value: Double): Self = StObject.set(x, "timeToLive", value.asInstanceOf[js.Any])
    
    inline def setTimeToLiveNull: Self = StObject.set(x, "timeToLive", null)
    
    inline def setTimeToLiveUndefined: Self = StObject.set(x, "timeToLive", js.undefined)
  }
}
