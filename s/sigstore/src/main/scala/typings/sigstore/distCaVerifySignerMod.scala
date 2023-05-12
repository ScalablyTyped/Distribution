package typings.sigstore

import typings.sigstore.distX509CertMod.x509Certificate
import typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreVerificationMod`.CertificateIdentities
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCaVerifySignerMod {
  
  @JSImport("sigstore/dist/ca/verify/signer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def verifySignerIdentity(signingCert: x509Certificate, identities: CertificateIdentities): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verifySignerIdentity")(signingCert.asInstanceOf[js.Any], identities.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
