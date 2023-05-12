package typings.sigstore

import typings.sigstore.distTypesSigstoreMod.VerifiableTransparencyLogEntry
import typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreTrustrootMod`.TransparencyLogInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTlogVerifySetMod {
  
  @JSImport("sigstore/dist/tlog/verify/set", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def verifyTLogSET(entry: VerifiableTransparencyLogEntry, tlogs: js.Array[TransparencyLogInstance]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyTLogSET")(entry.asInstanceOf[js.Any], tlogs.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
