package typings.sigstore.distTypesSigstoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ArtifactVerificationOptions {
  
  @JSImport("sigstore/dist/types/sigstore", "ArtifactVerificationOptions")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(`object`: Any): typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreVerificationMod`.ArtifactVerificationOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreVerificationMod`.ArtifactVerificationOptions]
  
  inline def toJSON(
    message: typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreVerificationMod`.ArtifactVerificationOptions
  ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(message.asInstanceOf[js.Any]).asInstanceOf[Any]
}
