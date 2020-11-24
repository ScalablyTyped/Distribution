package typings.sawtoothSdk.protobufMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IConsensusNotifyPeerDisconnected extends js.Object {
  
  /** ConsensusNotifyPeerDisconnected peerId */
  var peerId: js.UndefOr[Uint8Array | Null] = js.native
}
object IConsensusNotifyPeerDisconnected {
  
  @scala.inline
  def apply(): IConsensusNotifyPeerDisconnected = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConsensusNotifyPeerDisconnected]
  }
  
  @scala.inline
  implicit class IConsensusNotifyPeerDisconnectedOps[Self <: IConsensusNotifyPeerDisconnected] (val x: Self) extends AnyVal {
    
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
    def setPeerId(value: Uint8Array): Self = this.set("peerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeerId: Self = this.set("peerId", js.undefined)
    
    @scala.inline
    def setPeerIdNull: Self = this.set("peerId", null)
  }
}
