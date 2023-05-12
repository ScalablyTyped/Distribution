package typings.sigstore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait X509CertificateChain extends StObject {
  
  var publicKey: Hint
  
  var x509CertificateChain: CertificatesArray
}
object X509CertificateChain {
  
  inline def apply(publicKey: Hint, x509CertificateChain: CertificatesArray): X509CertificateChain = {
    val __obj = js.Dynamic.literal(publicKey = publicKey.asInstanceOf[js.Any], x509CertificateChain = x509CertificateChain.asInstanceOf[js.Any])
    __obj.asInstanceOf[X509CertificateChain]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: X509CertificateChain] (val x: Self) extends AnyVal {
    
    inline def setPublicKey(value: Hint): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    
    inline def setX509CertificateChain(value: CertificatesArray): Self = StObject.set(x, "x509CertificateChain", value.asInstanceOf[js.Any])
  }
}
