package typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreCommonMod`

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait X509CertificateChain extends StObject {
  
  /**
    * The chain of certificates, with indices 0 to n.
    * The first certificate in the array must be the leaf
    * certificate used for signing. Any intermediate certificates
    * must be stored as offset 1 to n-1, and the root certificate at
    * position n.
    */
  var certificates: js.Array[X509Certificate]
}
object X509CertificateChain {
  
  inline def apply(certificates: js.Array[X509Certificate]): X509CertificateChain = {
    val __obj = js.Dynamic.literal(certificates = certificates.asInstanceOf[js.Any])
    __obj.asInstanceOf[X509CertificateChain]
  }
  
  @JSImport("@sigstore/protobuf-specs/dist/@/generated/sigstore_common", "X509CertificateChain")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(`object`: Any): X509CertificateChain = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(`object`.asInstanceOf[js.Any]).asInstanceOf[X509CertificateChain]
  
  inline def toJSON(message: X509CertificateChain): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(message.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @scala.inline
  implicit open class MutableBuilder[Self <: X509CertificateChain] (val x: Self) extends AnyVal {
    
    inline def setCertificates(value: js.Array[X509Certificate]): Self = StObject.set(x, "certificates", value.asInstanceOf[js.Any])
    
    inline def setCertificatesVarargs(value: X509Certificate*): Self = StObject.set(x, "certificates", js.Array(value*))
  }
}
