package typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreCommonMod`

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageSignature extends StObject {
  
  /** Message digest can be used to identify the artifact. */
  var messageDigest: js.UndefOr[HashOutput] = js.undefined
  
  /**
    * The raw bytes as returned from the signature algorithm.
    * The signature algorithm (and so the format of the signature bytes)
    * are determined by the contents of the 'verification_material',
    * either a key-pair or a certificate. If using a certificate, the
    * certificate contains the required information on the signature
    * algorithm.
    * When using a key pair, the algorithm MUST be part of the public
    * key, which MUST be communicated out-of-band.
    */
  var signature: Buffer
}
object MessageSignature {
  
  inline def apply(signature: Buffer): MessageSignature = {
    val __obj = js.Dynamic.literal(signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageSignature]
  }
  
  @JSImport("@sigstore/protobuf-specs/dist/@/generated/sigstore_common", "MessageSignature")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(`object`: Any): MessageSignature = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(`object`.asInstanceOf[js.Any]).asInstanceOf[MessageSignature]
  
  inline def toJSON(message: MessageSignature): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(message.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MessageSignature] (val x: Self) extends AnyVal {
    
    inline def setMessageDigest(value: HashOutput): Self = StObject.set(x, "messageDigest", value.asInstanceOf[js.Any])
    
    inline def setMessageDigestUndefined: Self = StObject.set(x, "messageDigest", js.undefined)
    
    inline def setSignature(value: Buffer): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
  }
}
