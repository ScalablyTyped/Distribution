package typings.sigstoreProtobufSpecs.`dist@GeneratedGoogleProtobufDescriptorMod`

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceDescriptorProto extends StObject {
  
  var method: js.Array[MethodDescriptorProto]
  
  var name: String
  
  var options: js.UndefOr[ServiceOptions] = js.undefined
}
object ServiceDescriptorProto {
  
  inline def apply(method: js.Array[MethodDescriptorProto], name: String): ServiceDescriptorProto = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceDescriptorProto]
  }
  
  @JSImport("@sigstore/protobuf-specs/dist/@/generated/google/protobuf/descriptor", "ServiceDescriptorProto")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(`object`: Any): ServiceDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(`object`.asInstanceOf[js.Any]).asInstanceOf[ServiceDescriptorProto]
  
  inline def toJSON(message: ServiceDescriptorProto): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(message.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServiceDescriptorProto] (val x: Self) extends AnyVal {
    
    inline def setMethod(value: js.Array[MethodDescriptorProto]): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodVarargs(value: MethodDescriptorProto*): Self = StObject.set(x, "method", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: ServiceOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
