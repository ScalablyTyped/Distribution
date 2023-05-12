package typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreCommonMod`

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HashOutput extends StObject {
  
  var algorithm: HashAlgorithm
  
  /**
    * This is the raw octets of the message digest as computed by
    * the hash algorithm.
    */
  var digest: Buffer
}
object HashOutput {
  
  inline def apply(algorithm: HashAlgorithm, digest: Buffer): HashOutput = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], digest = digest.asInstanceOf[js.Any])
    __obj.asInstanceOf[HashOutput]
  }
  
  @JSImport("@sigstore/protobuf-specs/dist/@/generated/sigstore_common", "HashOutput")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(`object`: Any): HashOutput = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(`object`.asInstanceOf[js.Any]).asInstanceOf[HashOutput]
  
  inline def toJSON(message: HashOutput): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(message.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HashOutput] (val x: Self) extends AnyVal {
    
    inline def setAlgorithm(value: HashAlgorithm): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    inline def setDigest(value: Buffer): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
  }
}
