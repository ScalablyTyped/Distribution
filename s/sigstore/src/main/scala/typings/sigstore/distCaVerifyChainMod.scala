package typings.sigstore

import typings.sigstore.distX509CertMod.x509Certificate
import typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreCommonMod`.X509Certificate
import typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreTrustrootMod`.CertificateAuthority
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCaVerifyChainMod {
  
  @JSImport("sigstore/dist/ca/verify/chain", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def verifyChain(bundleCerts: js.Array[X509Certificate], certificateAuthorities: js.Array[CertificateAuthority]): js.Array[x509Certificate] = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyChain")(bundleCerts.asInstanceOf[js.Any], certificateAuthorities.asInstanceOf[js.Any])).asInstanceOf[js.Array[x509Certificate]]
}
