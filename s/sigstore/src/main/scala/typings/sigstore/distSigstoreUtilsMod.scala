package typings.sigstore

import typings.node.bufferMod.global.Buffer
import typings.sigstore.anon.Signer
import typings.sigstore.distConfigMod.SignOptions
import typings.sigstore.distTypesSigstoreSerializedMod.SerializedBundle
import typings.sigstore.distTypesSigstoreSerializedMod.SerializedEnvelope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSigstoreUtilsMod {
  
  @JSImport("sigstore/dist/sigstore-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createDSSEEnvelope(payload: Buffer, payloadType: String, options: Signer): js.Promise[SerializedEnvelope] = (^.asInstanceOf[js.Dynamic].applyDynamic("createDSSEEnvelope")(payload.asInstanceOf[js.Any], payloadType.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SerializedEnvelope]]
  
  inline def createRekorEntry(dsseEnvelope: SerializedEnvelope, publicKey: String): js.Promise[SerializedBundle] = (^.asInstanceOf[js.Dynamic].applyDynamic("createRekorEntry")(dsseEnvelope.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SerializedBundle]]
  inline def createRekorEntry(dsseEnvelope: SerializedEnvelope, publicKey: String, options: SignOptions): js.Promise[SerializedBundle] = (^.asInstanceOf[js.Dynamic].applyDynamic("createRekorEntry")(dsseEnvelope.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SerializedBundle]]
}
