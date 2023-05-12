package typings.sigstore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Payload extends StObject {
  
  /**
    * payload of the envelope
    */
  var payload: js.UndefOr[String] = js.undefined
  
  /**
    * type describing the payload
    */
  var payloadType: String
  
  /**
    * collection of all signatures of the envelope's payload
    *
    * @minItems 1
    */
  var signatures: Array[Keyid]
}
object Payload {
  
  inline def apply(payloadType: String, signatures: Array[Keyid]): Payload = {
    val __obj = js.Dynamic.literal(payloadType = payloadType.asInstanceOf[js.Any], signatures = signatures.asInstanceOf[js.Any])
    __obj.asInstanceOf[Payload]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Payload] (val x: Self) extends AnyVal {
    
    inline def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadType(value: String): Self = StObject.set(x, "payloadType", value.asInstanceOf[js.Any])
    
    inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    inline def setSignatures(value: Array[Keyid]): Self = StObject.set(x, "signatures", value.asInstanceOf[js.Any])
  }
}
