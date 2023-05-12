package typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreCommonMod`

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublicKey extends StObject {
  
  /** Key encoding and signature algorithm to use for this key. */
  var keyDetails: PublicKeyDetails
  
  /**
    * DER-encoded public key, encoding method is specified by the
    * key_details attribute.
    */
  var rawBytes: js.UndefOr[Buffer] = js.undefined
  
  /** Optional validity period for this key. */
  var validFor: js.UndefOr[TimeRange] = js.undefined
}
object PublicKey {
  
  inline def apply(keyDetails: PublicKeyDetails): PublicKey = {
    val __obj = js.Dynamic.literal(keyDetails = keyDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKey]
  }
  
  @JSImport("@sigstore/protobuf-specs/dist/@/generated/sigstore_common", "PublicKey")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(`object`: Any): PublicKey = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(`object`.asInstanceOf[js.Any]).asInstanceOf[PublicKey]
  
  inline def toJSON(message: PublicKey): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(message.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PublicKey] (val x: Self) extends AnyVal {
    
    inline def setKeyDetails(value: PublicKeyDetails): Self = StObject.set(x, "keyDetails", value.asInstanceOf[js.Any])
    
    inline def setRawBytes(value: Buffer): Self = StObject.set(x, "rawBytes", value.asInstanceOf[js.Any])
    
    inline def setRawBytesUndefined: Self = StObject.set(x, "rawBytes", js.undefined)
    
    inline def setValidFor(value: TimeRange): Self = StObject.set(x, "validFor", value.asInstanceOf[js.Any])
    
    inline def setValidForUndefined: Self = StObject.set(x, "validFor", js.undefined)
  }
}
