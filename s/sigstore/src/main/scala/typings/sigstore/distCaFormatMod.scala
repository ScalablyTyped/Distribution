package typings.sigstore

import typings.node.bufferMod.global.Buffer
import typings.node.cryptoMod.KeyObject
import typings.sigstore.distExternalFulcioMod.SigningCertificateRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCaFormatMod {
  
  @JSImport("sigstore/dist/ca/format", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def toCertificateRequest(identityToken: String, publicKey: KeyObject, challenge: Buffer): SigningCertificateRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("toCertificateRequest")(identityToken.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], challenge.asInstanceOf[js.Any])).asInstanceOf[SigningCertificateRequest]
}
