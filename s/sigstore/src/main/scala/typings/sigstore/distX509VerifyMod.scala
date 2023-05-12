package typings.sigstore

import typings.sigstore.distX509CertMod.x509Certificate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distX509VerifyMod {
  
  @JSImport("sigstore/dist/x509/verify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def verifyCertificateChain(opts: VerifyCertificateChainOptions): js.Array[x509Certificate] = ^.asInstanceOf[js.Dynamic].applyDynamic("verifyCertificateChain")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Array[x509Certificate]]
  
  trait VerifyCertificateChainOptions extends StObject {
    
    var certs: js.Array[x509Certificate]
    
    var trustedCerts: js.Array[x509Certificate]
    
    var validAt: js.UndefOr[js.Date] = js.undefined
  }
  object VerifyCertificateChainOptions {
    
    inline def apply(certs: js.Array[x509Certificate], trustedCerts: js.Array[x509Certificate]): VerifyCertificateChainOptions = {
      val __obj = js.Dynamic.literal(certs = certs.asInstanceOf[js.Any], trustedCerts = trustedCerts.asInstanceOf[js.Any])
      __obj.asInstanceOf[VerifyCertificateChainOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VerifyCertificateChainOptions] (val x: Self) extends AnyVal {
      
      inline def setCerts(value: js.Array[x509Certificate]): Self = StObject.set(x, "certs", value.asInstanceOf[js.Any])
      
      inline def setCertsVarargs(value: x509Certificate*): Self = StObject.set(x, "certs", js.Array(value*))
      
      inline def setTrustedCerts(value: js.Array[x509Certificate]): Self = StObject.set(x, "trustedCerts", value.asInstanceOf[js.Any])
      
      inline def setTrustedCertsVarargs(value: x509Certificate*): Self = StObject.set(x, "trustedCerts", js.Array(value*))
      
      inline def setValidAt(value: js.Date): Self = StObject.set(x, "validAt", value.asInstanceOf[js.Any])
      
      inline def setValidAtUndefined: Self = StObject.set(x, "validAt", js.undefined)
    }
  }
}
