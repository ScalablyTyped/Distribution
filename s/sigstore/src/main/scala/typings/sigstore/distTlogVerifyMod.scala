package typings.sigstore

import typings.sigstore.distTypesSigstoreMod.BundleWithVerificationMaterial
import typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreTrustrootMod`.TrustedRoot
import typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreVerificationMod`.ArtifactVerificationOptionsTlogOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTlogVerifyMod {
  
  @JSImport("sigstore/dist/tlog/verify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def verifyTLogEntries(
    bundle: BundleWithVerificationMaterial,
    trustedRoot: TrustedRoot,
    options: ArtifactVerificationOptionsTlogOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyTLogEntries")(bundle.asInstanceOf[js.Any], trustedRoot.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
