package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IGossipConsensusMessage extends StObject {
  
  /** GossipConsensusMessage message */
  var message: js.UndefOr[js.typedarray.Uint8Array | Null] = js.undefined
  
  /** GossipConsensusMessage senderId */
  var senderId: js.UndefOr[js.typedarray.Uint8Array | Null] = js.undefined
  
  /** GossipConsensusMessage timeToLive */
  var timeToLive: js.UndefOr[Double | Null] = js.undefined
}
object IGossipConsensusMessage {
  
  inline def apply(): IGossipConsensusMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGossipConsensusMessage]
  }
  
  extension [Self <: IGossipConsensusMessage](x: Self) {
    
    inline def setMessage(value: js.typedarray.Uint8Array): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageNull: Self = StObject.set(x, "message", null)
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setSenderId(value: js.typedarray.Uint8Array): Self = StObject.set(x, "senderId", value.asInstanceOf[js.Any])
    
    inline def setSenderIdNull: Self = StObject.set(x, "senderId", null)
    
    inline def setSenderIdUndefined: Self = StObject.set(x, "senderId", js.undefined)
    
    inline def setTimeToLive(value: Double): Self = StObject.set(x, "timeToLive", value.asInstanceOf[js.Any])
    
    inline def setTimeToLiveNull: Self = StObject.set(x, "timeToLive", null)
    
    inline def setTimeToLiveUndefined: Self = StObject.set(x, "timeToLive", js.undefined)
  }
}
