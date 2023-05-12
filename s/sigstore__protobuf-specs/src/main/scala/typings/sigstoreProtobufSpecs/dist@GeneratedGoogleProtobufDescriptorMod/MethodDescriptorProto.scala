package typings.sigstoreProtobufSpecs.`dist@GeneratedGoogleProtobufDescriptorMod`

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MethodDescriptorProto extends StObject {
  
  /** Identifies if client streams multiple client messages */
  var clientStreaming: Boolean
  
  /**
    * Input and output type names.  These are resolved in the same way as
    * FieldDescriptorProto.type_name, but must refer to a message type.
    */
  var inputType: String
  
  var name: String
  
  var options: js.UndefOr[MethodOptions] = js.undefined
  
  var outputType: String
  
  /** Identifies if server streams multiple server messages */
  var serverStreaming: Boolean
}
object MethodDescriptorProto {
  
  inline def apply(
    clientStreaming: Boolean,
    inputType: String,
    name: String,
    outputType: String,
    serverStreaming: Boolean
  ): MethodDescriptorProto = {
    val __obj = js.Dynamic.literal(clientStreaming = clientStreaming.asInstanceOf[js.Any], inputType = inputType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], outputType = outputType.asInstanceOf[js.Any], serverStreaming = serverStreaming.asInstanceOf[js.Any])
    __obj.asInstanceOf[MethodDescriptorProto]
  }
  
  @JSImport("@sigstore/protobuf-specs/dist/@/generated/google/protobuf/descriptor", "MethodDescriptorProto")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(`object`: Any): MethodDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(`object`.asInstanceOf[js.Any]).asInstanceOf[MethodDescriptorProto]
  
  inline def toJSON(message: MethodDescriptorProto): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(message.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MethodDescriptorProto] (val x: Self) extends AnyVal {
    
    inline def setClientStreaming(value: Boolean): Self = StObject.set(x, "clientStreaming", value.asInstanceOf[js.Any])
    
    inline def setInputType(value: String): Self = StObject.set(x, "inputType", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: MethodOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setOutputType(value: String): Self = StObject.set(x, "outputType", value.asInstanceOf[js.Any])
    
    inline def setServerStreaming(value: Boolean): Self = StObject.set(x, "serverStreaming", value.asInstanceOf[js.Any])
  }
}
