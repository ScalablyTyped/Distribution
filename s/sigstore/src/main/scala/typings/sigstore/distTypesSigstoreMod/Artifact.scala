package typings.sigstore.distTypesSigstoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Artifact {
  
  @JSImport("sigstore/dist/types/sigstore", "Artifact")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(`object`: Any): typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreVerificationMod`.Artifact = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreVerificationMod`.Artifact]
  
  inline def toJSON(message: typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreVerificationMod`.Artifact): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(message.asInstanceOf[js.Any]).asInstanceOf[Any]
}
