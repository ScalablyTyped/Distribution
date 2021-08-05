package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IConsensusNotifyPeerConnected extends StObject {
  
  /** ConsensusNotifyPeerConnected peerInfo */
  var peerInfo: js.UndefOr[IConsensusPeerInfo | Null] = js.undefined
}
object IConsensusNotifyPeerConnected {
  
  inline def apply(): IConsensusNotifyPeerConnected = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConsensusNotifyPeerConnected]
  }
  
  extension [Self <: IConsensusNotifyPeerConnected](x: Self) {
    
    inline def setPeerInfo(value: IConsensusPeerInfo): Self = StObject.set(x, "peerInfo", value.asInstanceOf[js.Any])
    
    inline def setPeerInfoNull: Self = StObject.set(x, "peerInfo", null)
    
    inline def setPeerInfoUndefined: Self = StObject.set(x, "peerInfo", js.undefined)
  }
}
