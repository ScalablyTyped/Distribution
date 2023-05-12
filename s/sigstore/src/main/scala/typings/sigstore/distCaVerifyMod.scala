package typings.sigstore

import typings.sigstore.distTypesSigstoreMod.BundleWithCertificateChain
import typings.sigstore.distTypesSigstoreMod.CAArtifactVerificationOptions
import typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreTrustrootMod`.TrustedRoot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCaVerifyMod {
  
  @JSImport("sigstore/dist/ca/verify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def verifySigningCertificate(
    bundle: BundleWithCertificateChain,
    trustedRoot: TrustedRoot,
    options: CAArtifactVerificationOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verifySigningCertificate")(bundle.asInstanceOf[js.Any], trustedRoot.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
