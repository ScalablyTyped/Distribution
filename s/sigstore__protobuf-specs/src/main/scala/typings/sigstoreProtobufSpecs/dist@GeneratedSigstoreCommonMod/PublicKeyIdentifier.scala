package typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreCommonMod`

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublicKeyIdentifier extends StObject {
  
  /**
    * Optional unauthenticated hint on which key to use.
    * The format of the hint must be agreed upon out of band by the
    * signer and the verifiers, and so is not subject to this
    * specification.
    * Example use-case is to specify the public key to use, from a
    * trusted key-ring.
    * Implementors are RECOMMENDED to derive the value from the public
    * key as described in RFC 6962.
    * See: <https://www.rfc-editor.org/rfc/rfc6962#section-3.2>
    */
  var hint: String
}
object PublicKeyIdentifier {
  
  inline def apply(hint: String): PublicKeyIdentifier = {
    val __obj = js.Dynamic.literal(hint = hint.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeyIdentifier]
  }
  
  @JSImport("@sigstore/protobuf-specs/dist/@/generated/sigstore_common", "PublicKeyIdentifier")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(`object`: Any): PublicKeyIdentifier = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(`object`.asInstanceOf[js.Any]).asInstanceOf[PublicKeyIdentifier]
  
  inline def toJSON(message: PublicKeyIdentifier): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(message.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PublicKeyIdentifier] (val x: Self) extends AnyVal {
    
    inline def setHint(value: String): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
  }
}
