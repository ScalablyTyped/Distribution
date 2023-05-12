package typings.sigstore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CertificatesArray extends StObject {
  
  var certificates: js.Array[RawBytes]
}
object CertificatesArray {
  
  inline def apply(certificates: js.Array[RawBytes]): CertificatesArray = {
    val __obj = js.Dynamic.literal(certificates = certificates.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificatesArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CertificatesArray] (val x: Self) extends AnyVal {
    
    inline def setCertificates(value: js.Array[RawBytes]): Self = StObject.set(x, "certificates", value.asInstanceOf[js.Any])
    
    inline def setCertificatesVarargs(value: RawBytes*): Self = StObject.set(x, "certificates", js.Array(value*))
  }
}
