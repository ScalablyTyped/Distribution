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
  
  @scala.inline
  def apply(): IGossipBlockRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGossipBlockRequest]
  }
  
  @scala.inline
  implicit class IGossipBlockRequestMutableBuilder[Self <: IGossipBlockRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlockId(value: String): Self = StObject.set(x, "blockId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockIdNull: Self = StObject.set(x, "blockId", null)
    
    @scala.inline
    def setBlockIdUndefined: Self = StObject.set(x, "blockId", js.undefined)
    
    @scala.inline
    def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonceNull: Self = StObject.set(x, "nonce", null)
    
    @scala.inline
    def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
    
    @scala.inline
    def setTimeToLive(value: Double): Self = StObject.set(x, "timeToLive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeToLiveNull: Self = StObject.set(x, "timeToLive", null)
    
    @scala.inline
    def setTimeToLiveUndefined: Self = StObject.set(x, "timeToLive", js.undefined)
  }
}
