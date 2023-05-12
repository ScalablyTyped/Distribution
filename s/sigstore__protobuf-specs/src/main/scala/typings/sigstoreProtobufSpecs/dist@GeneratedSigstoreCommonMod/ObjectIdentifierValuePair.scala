package typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreCommonMod`

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectIdentifierValuePair extends StObject {
  
  var oid: js.UndefOr[ObjectIdentifier] = js.undefined
  
  var value: Buffer
}
object ObjectIdentifierValuePair {
  
  inline def apply(value: Buffer): ObjectIdentifierValuePair = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectIdentifierValuePair]
  }
  
  @JSImport("@sigstore/protobuf-specs/dist/@/generated/sigstore_common", "ObjectIdentifierValuePair")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(`object`: Any): ObjectIdentifierValuePair = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(`object`.asInstanceOf[js.Any]).asInstanceOf[ObjectIdentifierValuePair]
  
  inline def toJSON(message: ObjectIdentifierValuePair): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(message.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ObjectIdentifierValuePair] (val x: Self) extends AnyVal {
    
    inline def setOid(value: ObjectIdentifier): Self = StObject.set(x, "oid", value.asInstanceOf[js.Any])
    
    inline def setOidUndefined: Self = StObject.set(x, "oid", js.undefined)
    
    inline def setValue(value: Buffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
