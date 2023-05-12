package typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreCommonMod`

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectIdentifier extends StObject {
  
  var id: js.Array[Double]
}
object ObjectIdentifier {
  
  inline def apply(id: js.Array[Double]): ObjectIdentifier = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectIdentifier]
  }
  
  @JSImport("@sigstore/protobuf-specs/dist/@/generated/sigstore_common", "ObjectIdentifier")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(`object`: Any): ObjectIdentifier = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(`object`.asInstanceOf[js.Any]).asInstanceOf[ObjectIdentifier]
  
  inline def toJSON(message: ObjectIdentifier): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(message.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ObjectIdentifier] (val x: Self) extends AnyVal {
    
    inline def setId(value: js.Array[Double]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdVarargs(value: Double*): Self = StObject.set(x, "id", js.Array(value*))
  }
}
