package typings.sigstore.anon

import typings.sigstore.distTypesSigstoreSerializedMod.SerializedDSSEEnvelope
import typings.sigstore.distTypesSigstoreSerializedMod.SerializedMessageSignature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DsseEnvelope extends StObject {
  
  var dsseEnvelope: SerializedDSSEEnvelope
  
  var messageSignature: SerializedMessageSignature
}
object DsseEnvelope {
  
  inline def apply(dsseEnvelope: SerializedDSSEEnvelope, messageSignature: SerializedMessageSignature): DsseEnvelope = {
    val __obj = js.Dynamic.literal(dsseEnvelope = dsseEnvelope.asInstanceOf[js.Any], messageSignature = messageSignature.asInstanceOf[js.Any])
    __obj.asInstanceOf[DsseEnvelope]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DsseEnvelope] (val x: Self) extends AnyVal {
    
    inline def setDsseEnvelope(value: SerializedDSSEEnvelope): Self = StObject.set(x, "dsseEnvelope", value.asInstanceOf[js.Any])
    
    inline def setMessageSignature(value: SerializedMessageSignature): Self = StObject.set(x, "messageSignature", value.asInstanceOf[js.Any])
  }
}
