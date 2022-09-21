package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IConsensusPeerMessage extends StObject {
  
  /** ConsensusPeerMessage content */
  var content: js.UndefOr[js.typedarray.Uint8Array | Null] = js.undefined
  
  /** ConsensusPeerMessage messageType */
  var messageType: js.UndefOr[String | Null] = js.undefined
  
  /** ConsensusPeerMessage name */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /** ConsensusPeerMessage version */
  var version: js.UndefOr[String | Null] = js.undefined
}
object IConsensusPeerMessage {
  
  inline def apply(): IConsensusPeerMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConsensusPeerMessage]
  }
  
  extension [Self <: IConsensusPeerMessage](x: Self) {
    
    inline def setContent(value: js.typedarray.Uint8Array): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentNull: Self = StObject.set(x, "content", null)
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setMessageType(value: String): Self = StObject.set(x, "messageType", value.asInstanceOf[js.Any])
    
    inline def setMessageTypeNull: Self = StObject.set(x, "messageType", null)
    
    inline def setMessageTypeUndefined: Self = StObject.set(x, "messageType", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
