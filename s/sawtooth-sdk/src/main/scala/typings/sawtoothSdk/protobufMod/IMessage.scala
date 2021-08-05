package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.Message.MessageType
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMessage extends StObject {
  
  /** Message content */
  var content: js.UndefOr[Uint8Array | Null] = js.undefined
  
  /** Message correlationId */
  var correlationId: js.UndefOr[String | Null] = js.undefined
  
  /** Message messageType */
  var messageType: js.UndefOr[MessageType | Null] = js.undefined
}
object IMessage {
  
  inline def apply(): IMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMessage]
  }
  
  extension [Self <: IMessage](x: Self) {
    
    inline def setContent(value: Uint8Array): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentNull: Self = StObject.set(x, "content", null)
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setCorrelationId(value: String): Self = StObject.set(x, "correlationId", value.asInstanceOf[js.Any])
    
    inline def setCorrelationIdNull: Self = StObject.set(x, "correlationId", null)
    
    inline def setCorrelationIdUndefined: Self = StObject.set(x, "correlationId", js.undefined)
    
    inline def setMessageType(value: MessageType): Self = StObject.set(x, "messageType", value.asInstanceOf[js.Any])
    
    inline def setMessageTypeNull: Self = StObject.set(x, "messageType", null)
    
    inline def setMessageTypeUndefined: Self = StObject.set(x, "messageType", js.undefined)
  }
}
