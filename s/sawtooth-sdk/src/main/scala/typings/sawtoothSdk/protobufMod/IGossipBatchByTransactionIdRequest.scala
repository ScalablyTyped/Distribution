package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IGossipBatchByTransactionIdRequest extends StObject {
  
  /** GossipBatchByTransactionIdRequest ids */
  var ids: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /** GossipBatchByTransactionIdRequest nonce */
  var nonce: js.UndefOr[String | Null] = js.undefined
  
  /** GossipBatchByTransactionIdRequest timeToLive */
  var timeToLive: js.UndefOr[Double | Null] = js.undefined
}
object IGossipBatchByTransactionIdRequest {
  
  @scala.inline
  def apply(): IGossipBatchByTransactionIdRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGossipBatchByTransactionIdRequest]
  }
  
  @scala.inline
  implicit class IGossipBatchByTransactionIdRequestMutableBuilder[Self <: IGossipBatchByTransactionIdRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdsNull: Self = StObject.set(x, "ids", null)
    
    @scala.inline
    def setIdsUndefined: Self = StObject.set(x, "ids", js.undefined)
    
    @scala.inline
    def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value :_*))
    
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
