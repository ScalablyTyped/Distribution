package typings.sigstore.distTypesSigstoreMod

import typings.sigstore.anon.VerificationMaterialconte
import typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreBundleMod`.Bundle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BundleWithCertificateChain
  extends StObject
     with Bundle {
  
  @JSName("verificationMaterial")
  var verificationMaterial_BundleWithCertificateChain: VerificationMaterialconte
}
object BundleWithCertificateChain {
  
  inline def apply(mediaType: String, verificationMaterial: VerificationMaterialconte): BundleWithCertificateChain = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], verificationMaterial = verificationMaterial.asInstanceOf[js.Any])
    __obj.asInstanceOf[BundleWithCertificateChain]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BundleWithCertificateChain] (val x: Self) extends AnyVal {
    
    inline def setVerificationMaterial(value: VerificationMaterialconte): Self = StObject.set(x, "verificationMaterial", value.asInstanceOf[js.Any])
  }
}
