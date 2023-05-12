package typings.sigstore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Envelope extends StObject {
  
  /**
    * envelope
    */
  var envelope: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the hash algorithm and value encompassing the entire signed envelope
    */
  var hash: js.UndefOr[Value] = js.undefined
  
  /**
    * Specifies the hash algorithm and value covering the payload within the DSSE envelope
    */
  var payloadHash: js.UndefOr[Value] = js.undefined
}
object Envelope {
  
  inline def apply(): Envelope = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Envelope]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Envelope] (val x: Self) extends AnyVal {
    
    inline def setEnvelope(value: String): Self = StObject.set(x, "envelope", value.asInstanceOf[js.Any])
    
    inline def setEnvelopeUndefined: Self = StObject.set(x, "envelope", js.undefined)
    
    inline def setHash(value: Value): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
    
    inline def setPayloadHash(value: Value): Self = StObject.set(x, "payloadHash", value.asInstanceOf[js.Any])
    
    inline def setPayloadHashUndefined: Self = StObject.set(x, "payloadHash", js.undefined)
  }
}
