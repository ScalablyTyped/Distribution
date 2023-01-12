package typings.protobufjs.extDescriptorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFileDescriptorProto extends StObject {
  
  @JSName("package")
  var _package: js.UndefOr[String] = js.undefined
  
  var dependency: js.UndefOr[Any] = js.undefined
  
  var enumType: js.UndefOr[js.Array[IEnumDescriptorProto]] = js.undefined
  
  var `extension`: js.UndefOr[js.Array[IFieldDescriptorProto]] = js.undefined
  
  var messageType: js.UndefOr[js.Array[IDescriptorProto]] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var options: js.UndefOr[IFileOptions] = js.undefined
  
  var publicDependency: js.UndefOr[Any] = js.undefined
  
  var service: js.UndefOr[js.Array[IServiceDescriptorProto]] = js.undefined
  
  var sourceCodeInfo: js.UndefOr[Any] = js.undefined
  
  var syntax: js.UndefOr[String] = js.undefined
  
  var weakDependency: js.UndefOr[Any] = js.undefined
}
object IFileDescriptorProto {
  
  inline def apply(): IFileDescriptorProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFileDescriptorProto]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IFileDescriptorProto] (val x: Self) extends AnyVal {
    
    inline def setDependency(value: Any): Self = StObject.set(x, "dependency", value.asInstanceOf[js.Any])
    
    inline def setDependencyUndefined: Self = StObject.set(x, "dependency", js.undefined)
    
    inline def setEnumType(value: js.Array[IEnumDescriptorProto]): Self = StObject.set(x, "enumType", value.asInstanceOf[js.Any])
    
    inline def setEnumTypeUndefined: Self = StObject.set(x, "enumType", js.undefined)
    
    inline def setEnumTypeVarargs(value: IEnumDescriptorProto*): Self = StObject.set(x, "enumType", js.Array(value*))
    
    inline def setExtension(value: js.Array[IFieldDescriptorProto]): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    inline def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
    
    inline def setExtensionVarargs(value: IFieldDescriptorProto*): Self = StObject.set(x, "extension", js.Array(value*))
    
    inline def setMessageType(value: js.Array[IDescriptorProto]): Self = StObject.set(x, "messageType", value.asInstanceOf[js.Any])
    
    inline def setMessageTypeUndefined: Self = StObject.set(x, "messageType", js.undefined)
    
    inline def setMessageTypeVarargs(value: IDescriptorProto*): Self = StObject.set(x, "messageType", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOptions(value: IFileOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setPublicDependency(value: Any): Self = StObject.set(x, "publicDependency", value.asInstanceOf[js.Any])
    
    inline def setPublicDependencyUndefined: Self = StObject.set(x, "publicDependency", js.undefined)
    
    inline def setService(value: js.Array[IServiceDescriptorProto]): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
    
    inline def setServiceVarargs(value: IServiceDescriptorProto*): Self = StObject.set(x, "service", js.Array(value*))
    
    inline def setSourceCodeInfo(value: Any): Self = StObject.set(x, "sourceCodeInfo", value.asInstanceOf[js.Any])
    
    inline def setSourceCodeInfoUndefined: Self = StObject.set(x, "sourceCodeInfo", js.undefined)
    
    inline def setSyntax(value: String): Self = StObject.set(x, "syntax", value.asInstanceOf[js.Any])
    
    inline def setSyntaxUndefined: Self = StObject.set(x, "syntax", js.undefined)
    
    inline def setWeakDependency(value: Any): Self = StObject.set(x, "weakDependency", value.asInstanceOf[js.Any])
    
    inline def setWeakDependencyUndefined: Self = StObject.set(x, "weakDependency", js.undefined)
    
    inline def set_package(value: String): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
    
    inline def set_packageUndefined: Self = StObject.set(x, "package", js.undefined)
  }
}
