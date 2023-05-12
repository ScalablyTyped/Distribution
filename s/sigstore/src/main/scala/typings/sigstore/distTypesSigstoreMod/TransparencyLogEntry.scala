package typings.sigstore.distTypesSigstoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TransparencyLogEntry {
  
  @JSImport("sigstore/dist/types/sigstore", "TransparencyLogEntry")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(`object`: Any): typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreRekorMod`.TransparencyLogEntry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreRekorMod`.TransparencyLogEntry]
  
  inline def toJSON(message: typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreRekorMod`.TransparencyLogEntry): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(message.asInstanceOf[js.Any]).asInstanceOf[Any]
}
