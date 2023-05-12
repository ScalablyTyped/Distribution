package typings.sigstore.distTypesSigstoreMod

import typings.sigstoreProtobufSpecs.anon.DsseEnvelope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined sigstore.sigstore/dist/types/utility.WithRequired<@sigstore/protobuf-specs.@sigstore/protobuf-specs.Bundle, 'verificationMaterial'> */
trait BundleWithVerificationMaterial extends StObject {
  
  var content: js.UndefOr[typings.sigstoreProtobufSpecs.anon.MessageSignature | DsseEnvelope] = js.undefined
  
  /**
    * MUST be application/vnd.dev.sigstore.bundle+json;version=0.1
    * when encoded as JSON.
    */
  var mediaType: String
  
  /**
    * When a signer is identified by a X.509 certificate, a verifier MUST
    * verify that the signature was computed at the time the certificate
    * was valid as described in the Sigstore client spec: "Verification
    * using a Bundle".
    * <https://docs.google.com/document/d/1kbhK2qyPPk8SLavHzYSDM8-Ueul9_oxIMVFuWMWKz0E/edit#heading=h.x8bduppe89ln>
    */
  var verificationMaterial: js.UndefOr[
    typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreBundleMod`.VerificationMaterial
  ] = js.undefined
}
object BundleWithVerificationMaterial {
  
  inline def apply(mediaType: String): BundleWithVerificationMaterial = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BundleWithVerificationMaterial]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BundleWithVerificationMaterial] (val x: Self) extends AnyVal {
    
    inline def setContent(value: typings.sigstoreProtobufSpecs.anon.MessageSignature | DsseEnvelope): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setMediaType(value: String): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    inline def setVerificationMaterial(value: typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreBundleMod`.VerificationMaterial): Self = StObject.set(x, "verificationMaterial", value.asInstanceOf[js.Any])
    
    inline def setVerificationMaterialUndefined: Self = StObject.set(x, "verificationMaterial", js.undefined)
  }
}
