package typings.sigstore.distTypesSigstoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PublicKeyIdentities {
  
  @JSImport("sigstore/dist/types/sigstore", "PublicKeyIdentities")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(`object`: Any): typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreVerificationMod`.PublicKeyIdentities = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreVerificationMod`.PublicKeyIdentities]
  
  inline def toJSON(message: typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreVerificationMod`.PublicKeyIdentities): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(message.asInstanceOf[js.Any]).asInstanceOf[Any]
}
