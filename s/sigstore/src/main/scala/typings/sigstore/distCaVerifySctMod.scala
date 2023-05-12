package typings.sigstore

import typings.sigstore.distX509CertMod.x509Certificate
import typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreTrustrootMod`.TransparencyLogInstance
import typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreVerificationMod`.ArtifactVerificationOptionsCtlogOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCaVerifySctMod {
  
  @JSImport("sigstore/dist/ca/verify/sct", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def verifySCTs(
    certificateChain: js.Array[x509Certificate],
    ctLogs: js.Array[TransparencyLogInstance],
    options: ArtifactVerificationOptionsCtlogOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verifySCTs")(certificateChain.asInstanceOf[js.Any], ctLogs.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
