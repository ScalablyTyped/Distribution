package typings.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGossipBatchByTransactionIdRequest extends js.Object {
  
  /** GossipBatchByTransactionIdRequest ids */
  var ids: js.UndefOr[js.Array[String] | Null] = js.native
  
  /** GossipBatchByTransactionIdRequest nonce */
  var nonce: js.UndefOr[String | Null] = js.native
  
  /** GossipBatchByTransactionIdRequest timeToLive */
  var timeToLive: js.UndefOr[Double | Null] = js.native
}
object IGossipBatchByTransactionIdRequest {
  
  @scala.inline
  def apply(): IGossipBatchByTransactionIdRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGossipBatchByTransactionIdRequest]
  }
  
  @scala.inline
  implicit class IGossipBatchByTransactionIdRequestOps[Self <: IGossipBatchByTransactionIdRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIdsVarargs(value: String*): Self = this.set("ids", js.Array(value :_*))
    
    @scala.inline
    def setIds(value: js.Array[String]): Self = this.set("ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIds: Self = this.set("ids", js.undefined)
    
    @scala.inline
    def setIdsNull: Self = this.set("ids", null)
    
    @scala.inline
    def setNonce(value: String): Self = this.set("nonce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNonce: Self = this.set("nonce", js.undefined)
    
    @scala.inline
    def setNonceNull: Self = this.set("nonce", null)
    
    @scala.inline
    def setTimeToLive(value: Double): Self = this.set("timeToLive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeToLive: Self = this.set("timeToLive", js.undefined)
    
    @scala.inline
    def setTimeToLiveNull: Self = this.set("timeToLive", null)
  }
}
