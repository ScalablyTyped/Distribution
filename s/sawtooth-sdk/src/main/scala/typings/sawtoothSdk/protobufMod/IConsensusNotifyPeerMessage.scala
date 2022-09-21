package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IConsensusNotifyPeerMessage extends StObject {
  
  /** ConsensusNotifyPeerMessage message */
  var message: js.UndefOr[IConsensusPeerMessage | Null] = js.undefined
  
  /** ConsensusNotifyPeerMessage senderId */
  var senderId: js.UndefOr[js.typedarray.Uint8Array | Null] = js.undefined
}
object IConsensusNotifyPeerMessage {
  
  inline def apply(): IConsensusNotifyPeerMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConsensusNotifyPeerMessage]
  }
  
  extension [Self <: IConsensusNotifyPeerMessage](x: Self) {
    
    inline def setMessage(value: IConsensusPeerMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageNull: Self = StObject.set(x, "message", null)
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setSenderId(value: js.typedarray.Uint8Array): Self = StObject.set(x, "senderId", value.asInstanceOf[js.Any])
    
    inline def setSenderIdNull: Self = StObject.set(x, "senderId", null)
    
    inline def setSenderIdUndefined: Self = StObject.set(x, "senderId", js.undefined)
  }
}
