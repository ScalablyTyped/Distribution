package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IConsensusNotifyPeerDisconnected extends StObject {
  
  /** ConsensusNotifyPeerDisconnected peerId */
  var peerId: js.UndefOr[js.typedarray.Uint8Array | Null] = js.undefined
}
object IConsensusNotifyPeerDisconnected {
  
  inline def apply(): IConsensusNotifyPeerDisconnected = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConsensusNotifyPeerDisconnected]
  }
  
  extension [Self <: IConsensusNotifyPeerDisconnected](x: Self) {
    
    inline def setPeerId(value: js.typedarray.Uint8Array): Self = StObject.set(x, "peerId", value.asInstanceOf[js.Any])
    
    inline def setPeerIdNull: Self = StObject.set(x, "peerId", null)
    
    inline def setPeerIdUndefined: Self = StObject.set(x, "peerId", js.undefined)
  }
}
