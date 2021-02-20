package typings.sawtoothSdk.protobufMod

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IConsensusSendToRequest extends StObject {
  
  /** ConsensusSendToRequest message */
  var message: js.UndefOr[IConsensusPeerMessage | Null] = js.native
  
  /** ConsensusSendToRequest peerId */
  var peerId: js.UndefOr[Uint8Array | Null] = js.native
}
object IConsensusSendToRequest {
  
  @scala.inline
  def apply(): IConsensusSendToRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConsensusSendToRequest]
  }
  
  @scala.inline
  implicit class IConsensusSendToRequestMutableBuilder[Self <: IConsensusSendToRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: IConsensusPeerMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageNull: Self = StObject.set(x, "message", null)
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setPeerId(value: Uint8Array): Self = StObject.set(x, "peerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeerIdNull: Self = StObject.set(x, "peerId", null)
    
    @scala.inline
    def setPeerIdUndefined: Self = StObject.set(x, "peerId", js.undefined)
  }
}
