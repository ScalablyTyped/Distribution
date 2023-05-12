package typings.sigstore.anon

import typings.sigstore.distTypesUtilityMod.OneOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaType extends StObject {
  
  var mediaType: String
  
  var verificationMaterial: (OneOf[X509CertificateChain] & TimestampVerificationData) | (Unit & TimestampVerificationData)
}
object MediaType {
  
  inline def apply(
    mediaType: String,
    verificationMaterial: (OneOf[X509CertificateChain] & TimestampVerificationData) | (Unit & TimestampVerificationData)
  ): MediaType = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], verificationMaterial = verificationMaterial.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaType] (val x: Self) extends AnyVal {
    
    inline def setMediaType(value: String): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    inline def setVerificationMaterial(
      value: (OneOf[X509CertificateChain] & TimestampVerificationData) | (Unit & TimestampVerificationData)
    ): Self = StObject.set(x, "verificationMaterial", value.asInstanceOf[js.Any])
  }
}
