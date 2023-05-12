package typings.sigstore

import typings.node.bufferMod.global.Buffer
import typings.sigstore.distTypesSigstoreMod.RequiredArtifactVerificationOptions
import typings.sigstore.distTypesSigstoreValidateMod.ValidBundle
import typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreTrustrootMod`.TrustedRoot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distVerifyMod {
  
  @JSImport("sigstore/dist/verify", "Verifier")
  @js.native
  open class Verifier protected () extends StObject {
    def this(trustedRoot: TrustedRoot) = this()
    def this(trustedRoot: TrustedRoot, keySelector: KeySelector) = this()
    
    /* private */ var getPublicKey: Any = js.native
    
    /* private */ var keySelector: Any = js.native
    
    /* private */ var trustedRoot: Any = js.native
    
    def verify(bundle: ValidBundle, options: RequiredArtifactVerificationOptions): Unit = js.native
    def verify(bundle: ValidBundle, options: RequiredArtifactVerificationOptions, data: Buffer): Unit = js.native
    
    /* private */ var verifyArtifactSignature: Any = js.native
    
    /* private */ var verifySigningCertificate: Any = js.native
    
    /* private */ var verifyTLogEntries: Any = js.native
  }
  
  type KeySelector = js.Function1[/* hint */ String, js.UndefOr[String | Buffer]]
}
