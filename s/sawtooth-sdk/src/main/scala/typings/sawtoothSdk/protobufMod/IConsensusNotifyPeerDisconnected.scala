package typings.sawtoothSdk.protobufMod

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IConsensusNotifyPeerDisconnected extends StObject {
  
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
  implicit class IConsensusNotifyPeerDisconnectedMutableBuilder[Self <: IConsensusNotifyPeerDisconnected] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPeerId(value: Uint8Array): Self = StObject.set(x, "peerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeerIdNull: Self = StObject.set(x, "peerId", null)
    
    @scala.inline
    def setPeerIdUndefined: Self = StObject.set(x, "peerId", js.undefined)
  }
}
