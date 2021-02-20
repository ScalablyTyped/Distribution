package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IConsensusNotifyPeerConnected extends StObject {
  
  /** ConsensusNotifyPeerConnected peerInfo */
  var peerInfo: js.UndefOr[IConsensusPeerInfo | Null] = js.native
}
object IConsensusNotifyPeerConnected {
  
  @scala.inline
  def apply(): IConsensusNotifyPeerConnected = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConsensusNotifyPeerConnected]
  }
  
  @scala.inline
  implicit class IConsensusNotifyPeerConnectedMutableBuilder[Self <: IConsensusNotifyPeerConnected] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPeerInfo(value: IConsensusPeerInfo): Self = StObject.set(x, "peerInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeerInfoNull: Self = StObject.set(x, "peerInfo", null)
    
    @scala.inline
    def setPeerInfoUndefined: Self = StObject.set(x, "peerInfo", js.undefined)
  }
}
