package typings.sigstore

import typings.sigstore.distTypesSigstoreMod.VerifiableTransparencyLogEntry
import typings.sigstoreProtobufSpecs.anon.DsseEnvelope
import typings.sigstoreProtobufSpecs.anon.MessageSignature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTlogVerifyBodyMod {
  
  @JSImport("sigstore/dist/tlog/verify/body", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def verifyTLogBody(entry: VerifiableTransparencyLogEntry): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("verifyTLogBody")(entry.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def verifyTLogBody(entry: VerifiableTransparencyLogEntry, bundleContent: DsseEnvelope): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyTLogBody")(entry.asInstanceOf[js.Any], bundleContent.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def verifyTLogBody(entry: VerifiableTransparencyLogEntry, bundleContent: MessageSignature): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyTLogBody")(entry.asInstanceOf[js.Any], bundleContent.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
