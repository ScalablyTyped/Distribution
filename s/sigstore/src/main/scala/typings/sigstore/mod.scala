package typings.sigstore

import typings.node.bufferMod.global.Buffer
import typings.sigstore.anon.Cause
import typings.sigstore.anon.Signer
import typings.sigstore.distConfigMod.SignOptions
import typings.sigstore.distConfigMod.TUFOptions
import typings.sigstore.distConfigMod.VerifyOptions
import typings.sigstore.distTypesSigstoreSerializedMod.SerializedBundle
import typings.sigstore.distTypesSigstoreSerializedMod.SerializedEnvelope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object sigstore {
    
    @JSImport("sigstore", "sigstore")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("sigstore", "sigstore.DEFAULT_FULCIO_URL")
    @js.native
    val DEFAULT_FULCIO_URL: /* "https://fulcio.sigstore.dev" */ String = js.native
    
    @JSImport("sigstore", "sigstore.DEFAULT_REKOR_URL")
    @js.native
    val DEFAULT_REKOR_URL: /* "https://rekor.sigstore.dev" */ String = js.native
    
    @JSImport("sigstore", "sigstore.InternalError")
    @js.native
    open class InternalError protected ()
      extends typings.sigstore.distSigstoreMod.InternalError {
      def this(param0: Cause) = this()
    }
    
    @JSImport("sigstore", "sigstore.PolicyError")
    @js.native
    open class PolicyError ()
      extends typings.sigstore.distSigstoreMod.PolicyError
    
    @JSImport("sigstore", "sigstore.ValidationError")
    @js.native
    open class ValidationError ()
      extends typings.sigstore.distSigstoreMod.ValidationError
    
    @JSImport("sigstore", "sigstore.VerificationError")
    @js.native
    open class VerificationError ()
      extends typings.sigstore.distSigstoreMod.VerificationError
    
    inline def attest(payload: Buffer, payloadType: String): js.Promise[SerializedBundle] = (^.asInstanceOf[js.Dynamic].applyDynamic("attest")(payload.asInstanceOf[js.Any], payloadType.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SerializedBundle]]
    inline def attest(payload: Buffer, payloadType: String, options: SignOptions): js.Promise[SerializedBundle] = (^.asInstanceOf[js.Dynamic].applyDynamic("attest")(payload.asInstanceOf[js.Any], payloadType.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SerializedBundle]]
    
    inline def sign(payload: Buffer): js.Promise[SerializedBundle] = ^.asInstanceOf[js.Dynamic].applyDynamic("sign")(payload.asInstanceOf[js.Any]).asInstanceOf[js.Promise[SerializedBundle]]
    inline def sign(payload: Buffer, options: SignOptions): js.Promise[SerializedBundle] = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(payload.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SerializedBundle]]
    
    object tuf {
      
      @JSImport("sigstore", "sigstore.tuf")
      @js.native
      val ^ : js.Any = js.native
      
      inline def getTarget(path: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTarget")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
      inline def getTarget(path: String, options: TUFOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTarget")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    }
    
    object utils {
      
      @JSImport("sigstore", "sigstore.utils")
      @js.native
      val ^ : js.Any = js.native
      
      inline def createDSSEEnvelope(payload: Buffer, payloadType: String, options: Signer): js.Promise[SerializedEnvelope] = (^.asInstanceOf[js.Dynamic].applyDynamic("createDSSEEnvelope")(payload.asInstanceOf[js.Any], payloadType.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SerializedEnvelope]]
      
      inline def createRekorEntry(dsseEnvelope: SerializedEnvelope, publicKey: String): js.Promise[SerializedBundle] = (^.asInstanceOf[js.Dynamic].applyDynamic("createRekorEntry")(dsseEnvelope.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SerializedBundle]]
      inline def createRekorEntry(dsseEnvelope: SerializedEnvelope, publicKey: String, options: SignOptions): js.Promise[SerializedBundle] = (^.asInstanceOf[js.Dynamic].applyDynamic("createRekorEntry")(dsseEnvelope.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SerializedBundle]]
    }
    
    inline def verify(bundle: SerializedBundle): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(bundle.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    inline def verify(bundle: SerializedBundle, payload: Unit, options: VerifyOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(bundle.asInstanceOf[js.Any], payload.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def verify(bundle: SerializedBundle, payload: Buffer): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(bundle.asInstanceOf[js.Any], payload.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def verify(bundle: SerializedBundle, payload: Buffer, options: VerifyOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(bundle.asInstanceOf[js.Any], payload.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  }
}
