package typings.sawtoothSdk.protobufMod

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IConsensusNotifyPeerMessage extends StObject {
  
  /** ConsensusNotifyPeerMessage message */
  var message: js.UndefOr[IConsensusPeerMessage | Null] = js.undefined
  
  /** ConsensusNotifyPeerMessage senderId */
  var senderId: js.UndefOr[Uint8Array | Null] = js.undefined
}
object IConsensusNotifyPeerMessage {
  
  @scala.inline
  def apply(): IConsensusNotifyPeerMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConsensusNotifyPeerMessage]
  }
  
  @scala.inline
  implicit class IConsensusNotifyPeerMessageMutableBuilder[Self <: IConsensusNotifyPeerMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: IConsensusPeerMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageNull: Self = StObject.set(x, "message", null)
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setSenderId(value: Uint8Array): Self = StObject.set(x, "senderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSenderIdNull: Self = StObject.set(x, "senderId", null)
    
    @scala.inline
    def setSenderIdUndefined: Self = StObject.set(x, "senderId", js.undefined)
  }
}
