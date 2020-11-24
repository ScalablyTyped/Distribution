package typings.sawtoothSdk.protobufMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGossipConsensusMessage extends js.Object {
  
  /** GossipConsensusMessage message */
  var message: js.UndefOr[Uint8Array | Null] = js.native
  
  /** GossipConsensusMessage senderId */
  var senderId: js.UndefOr[Uint8Array | Null] = js.native
  
  /** GossipConsensusMessage timeToLive */
  var timeToLive: js.UndefOr[Double | Null] = js.native
}
object IGossipConsensusMessage {
  
  @scala.inline
  def apply(): IGossipConsensusMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGossipConsensusMessage]
  }
  
  @scala.inline
  implicit class IGossipConsensusMessageOps[Self <: IGossipConsensusMessage] (val x: Self) extends AnyVal {
    
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
    def setMessage(value: Uint8Array): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setMessageNull: Self = this.set("message", null)
    
    @scala.inline
    def setSenderId(value: Uint8Array): Self = this.set("senderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSenderId: Self = this.set("senderId", js.undefined)
    
    @scala.inline
    def setSenderIdNull: Self = this.set("senderId", null)
    
    @scala.inline
    def setTimeToLive(value: Double): Self = this.set("timeToLive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeToLive: Self = this.set("timeToLive", js.undefined)
    
    @scala.inline
    def setTimeToLiveNull: Self = this.set("timeToLive", null)
  }
}
