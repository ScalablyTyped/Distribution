package typings.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGossipBlockRequest extends js.Object {
  
  /** GossipBlockRequest blockId */
  var blockId: js.UndefOr[String | Null] = js.native
  
  /** GossipBlockRequest nonce */
  var nonce: js.UndefOr[String | Null] = js.native
  
  /** GossipBlockRequest timeToLive */
  var timeToLive: js.UndefOr[Double | Null] = js.native
}
object IGossipBlockRequest {
  
  @scala.inline
  def apply(): IGossipBlockRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGossipBlockRequest]
  }
  
  @scala.inline
  implicit class IGossipBlockRequestOps[Self <: IGossipBlockRequest] (val x: Self) extends AnyVal {
    
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
    def setBlockId(value: String): Self = this.set("blockId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockId: Self = this.set("blockId", js.undefined)
    
    @scala.inline
    def setBlockIdNull: Self = this.set("blockId", null)
    
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
