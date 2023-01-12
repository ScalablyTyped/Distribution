package typings.protobufjs.extDescriptorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFileDescriptorSet extends StObject {
  
  var file: js.Array[IFileDescriptorProto]
}
object IFileDescriptorSet {
  
  inline def apply(file: js.Array[IFileDescriptorProto]): IFileDescriptorSet = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileDescriptorSet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IFileDescriptorSet] (val x: Self) extends AnyVal {
    
    inline def setFile(value: js.Array[IFileDescriptorProto]): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileVarargs(value: IFileDescriptorProto*): Self = StObject.set(x, "file", js.Array(value*))
  }
}
