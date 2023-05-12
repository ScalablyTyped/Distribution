package typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreCommonMod`

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait X509Certificate extends StObject {
  
  /** DER-encoded X.509 certificate. */
  var rawBytes: Buffer
}
object X509Certificate {
  
  inline def apply(rawBytes: Buffer): X509Certificate = {
    val __obj = js.Dynamic.literal(rawBytes = rawBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[X509Certificate]
  }
  
  @JSImport("@sigstore/protobuf-specs/dist/@/generated/sigstore_common", "X509Certificate")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(`object`: Any): X509Certificate = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(`object`.asInstanceOf[js.Any]).asInstanceOf[X509Certificate]
  
  inline def toJSON(message: X509Certificate): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(message.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @scala.inline
  implicit open class MutableBuilder[Self <: X509Certificate] (val x: Self) extends AnyVal {
    
    inline def setRawBytes(value: Buffer): Self = StObject.set(x, "rawBytes", value.asInstanceOf[js.Any])
  }
}
