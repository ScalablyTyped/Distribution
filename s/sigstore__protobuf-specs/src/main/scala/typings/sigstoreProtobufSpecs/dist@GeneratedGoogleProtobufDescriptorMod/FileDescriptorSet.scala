package typings.sigstoreProtobufSpecs.`dist@GeneratedGoogleProtobufDescriptorMod`

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileDescriptorSet extends StObject {
  
  var file: js.Array[FileDescriptorProto]
}
object FileDescriptorSet {
  
  inline def apply(file: js.Array[FileDescriptorProto]): FileDescriptorSet = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileDescriptorSet]
  }
  
  @JSImport("@sigstore/protobuf-specs/dist/@/generated/google/protobuf/descriptor", "FileDescriptorSet")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(`object`: Any): FileDescriptorSet = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(`object`.asInstanceOf[js.Any]).asInstanceOf[FileDescriptorSet]
  
  inline def toJSON(message: FileDescriptorSet): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(message.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FileDescriptorSet] (val x: Self) extends AnyVal {
    
    inline def setFile(value: js.Array[FileDescriptorProto]): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileVarargs(value: FileDescriptorProto*): Self = StObject.set(x, "file", js.Array(value*))
  }
}
