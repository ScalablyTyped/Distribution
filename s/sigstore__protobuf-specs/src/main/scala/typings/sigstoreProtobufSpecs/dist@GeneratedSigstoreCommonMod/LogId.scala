package typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreCommonMod`

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogId extends StObject {
  
  /**
    * The unique id of the log, represented as the SHA-256 hash
    * of the log's public key, computed over the DER encoding.
    * <https://www.rfc-editor.org/rfc/rfc6962#section-3.2>
    */
  var keyId: Buffer
}
object LogId {
  
  inline def apply(keyId: Buffer): LogId = {
    val __obj = js.Dynamic.literal(keyId = keyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogId]
  }
  
  @JSImport("@sigstore/protobuf-specs/dist/@/generated/sigstore_common", "LogId")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(`object`: Any): LogId = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(`object`.asInstanceOf[js.Any]).asInstanceOf[LogId]
  
  inline def toJSON(message: LogId): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(message.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LogId] (val x: Self) extends AnyVal {
    
    inline def setKeyId(value: Buffer): Self = StObject.set(x, "keyId", value.asInstanceOf[js.Any])
  }
}
