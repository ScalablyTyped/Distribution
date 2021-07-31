package typings.protobufjs.descriptorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFileDescriptorProto extends StObject {
  
  @JSName("package")
  var _package: js.UndefOr[String] = js.undefined
  
  var dependency: js.UndefOr[js.Any] = js.undefined
  
  var enumType: js.UndefOr[js.Array[IEnumDescriptorProto]] = js.undefined
  
  var `extension`: js.UndefOr[js.Array[IFieldDescriptorProto]] = js.undefined
  
  var messageType: js.UndefOr[js.Array[IDescriptorProto]] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var options: js.UndefOr[IFileOptions] = js.undefined
  
  var publicDependency: js.UndefOr[js.Any] = js.undefined
  
  var service: js.UndefOr[js.Array[IServiceDescriptorProto]] = js.undefined
  
  var sourceCodeInfo: js.UndefOr[js.Any] = js.undefined
  
  var syntax: js.UndefOr[String] = js.undefined
  
  var weakDependency: js.UndefOr[js.Any] = js.undefined
}
object IFileDescriptorProto {
  
  @scala.inline
  def apply(): IFileDescriptorProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFileDescriptorProto]
  }
  
  @scala.inline
  implicit class IFileDescriptorProtoMutableBuilder[Self <: IFileDescriptorProto] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDependency(value: js.Any): Self = StObject.set(x, "dependency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDependencyUndefined: Self = StObject.set(x, "dependency", js.undefined)
    
    @scala.inline
    def setEnumType(value: js.Array[IEnumDescriptorProto]): Self = StObject.set(x, "enumType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnumTypeUndefined: Self = StObject.set(x, "enumType", js.undefined)
    
    @scala.inline
    def setEnumTypeVarargs(value: IEnumDescriptorProto*): Self = StObject.set(x, "enumType", js.Array(value :_*))
    
    @scala.inline
    def setExtension(value: js.Array[IFieldDescriptorProto]): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
    
    @scala.inline
    def setExtensionVarargs(value: IFieldDescriptorProto*): Self = StObject.set(x, "extension", js.Array(value :_*))
    
    @scala.inline
    def setMessageType(value: js.Array[IDescriptorProto]): Self = StObject.set(x, "messageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageTypeUndefined: Self = StObject.set(x, "messageType", js.undefined)
    
    @scala.inline
    def setMessageTypeVarargs(value: IDescriptorProto*): Self = StObject.set(x, "messageType", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOptions(value: IFileOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setPublicDependency(value: js.Any): Self = StObject.set(x, "publicDependency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicDependencyUndefined: Self = StObject.set(x, "publicDependency", js.undefined)
    
    @scala.inline
    def setService(value: js.Array[IServiceDescriptorProto]): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
    
    @scala.inline
    def setServiceVarargs(value: IServiceDescriptorProto*): Self = StObject.set(x, "service", js.Array(value :_*))
    
    @scala.inline
    def setSourceCodeInfo(value: js.Any): Self = StObject.set(x, "sourceCodeInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceCodeInfoUndefined: Self = StObject.set(x, "sourceCodeInfo", js.undefined)
    
    @scala.inline
    def setSyntax(value: String): Self = StObject.set(x, "syntax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyntaxUndefined: Self = StObject.set(x, "syntax", js.undefined)
    
    @scala.inline
    def setWeakDependency(value: js.Any): Self = StObject.set(x, "weakDependency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeakDependencyUndefined: Self = StObject.set(x, "weakDependency", js.undefined)
    
    @scala.inline
    def set_package(value: String): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_packageUndefined: Self = StObject.set(x, "package", js.undefined)
  }
}
