package typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreCommonMod`

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RFC3161SignedTimestamp extends StObject {
  
  /**
    * Signed timestamp is the DER encoded TimeStampResponse.
    * See https://www.rfc-editor.org/rfc/rfc3161.html#section-2.4.2
    */
  var signedTimestamp: Buffer
}
object RFC3161SignedTimestamp {
  
  inline def apply(signedTimestamp: Buffer): RFC3161SignedTimestamp = {
    val __obj = js.Dynamic.literal(signedTimestamp = signedTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[RFC3161SignedTimestamp]
  }
  
  @JSImport("@sigstore/protobuf-specs/dist/@/generated/sigstore_common", "RFC3161SignedTimestamp")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(`object`: Any): RFC3161SignedTimestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(`object`.asInstanceOf[js.Any]).asInstanceOf[RFC3161SignedTimestamp]
  
  inline def toJSON(message: RFC3161SignedTimestamp): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(message.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RFC3161SignedTimestamp] (val x: Self) extends AnyVal {
    
    inline def setSignedTimestamp(value: Buffer): Self = StObject.set(x, "signedTimestamp", value.asInstanceOf[js.Any])
  }
}
