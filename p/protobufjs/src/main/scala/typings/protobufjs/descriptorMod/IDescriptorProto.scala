package typings.protobufjs.descriptorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDescriptorProto extends StObject {
  
  var enumType: js.UndefOr[js.Array[IEnumDescriptorProto]] = js.native
  
  var extension: js.UndefOr[js.Array[IFieldDescriptorProto]] = js.native
  
  var extensionRange: js.UndefOr[js.Array[IDescriptorProtoExtensionRange]] = js.native
  
  var field: js.UndefOr[js.Array[IFieldDescriptorProto]] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var nestedType: js.UndefOr[js.Array[IDescriptorProto]] = js.native
  
  var oneofDecl: js.UndefOr[js.Array[IOneofDescriptorProto]] = js.native
  
  var options: js.UndefOr[IMessageOptions] = js.native
  
  var reservedName: js.UndefOr[js.Array[String]] = js.native
  
  var reservedRange: js.UndefOr[js.Array[IDescriptorProtoReservedRange]] = js.native
}
object IDescriptorProto {
  
  @scala.inline
  def apply(): IDescriptorProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDescriptorProto]
  }
  
  @scala.inline
  implicit class IDescriptorProtoMutableBuilder[Self <: IDescriptorProto] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumType(value: js.Array[IEnumDescriptorProto]): Self = StObject.set(x, "enumType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnumTypeUndefined: Self = StObject.set(x, "enumType", js.undefined)
    
    @scala.inline
    def setEnumTypeVarargs(value: IEnumDescriptorProto*): Self = StObject.set(x, "enumType", js.Array(value :_*))
    
    @scala.inline
    def setExtension(value: js.Array[IFieldDescriptorProto]): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionRange(value: js.Array[IDescriptorProtoExtensionRange]): Self = StObject.set(x, "extensionRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionRangeUndefined: Self = StObject.set(x, "extensionRange", js.undefined)
    
    @scala.inline
    def setExtensionRangeVarargs(value: IDescriptorProtoExtensionRange*): Self = StObject.set(x, "extensionRange", js.Array(value :_*))
    
    @scala.inline
    def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
    
    @scala.inline
    def setExtensionVarargs(value: IFieldDescriptorProto*): Self = StObject.set(x, "extension", js.Array(value :_*))
    
    @scala.inline
    def setField(value: js.Array[IFieldDescriptorProto]): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    @scala.inline
    def setFieldVarargs(value: IFieldDescriptorProto*): Self = StObject.set(x, "field", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNestedType(value: js.Array[IDescriptorProto]): Self = StObject.set(x, "nestedType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNestedTypeUndefined: Self = StObject.set(x, "nestedType", js.undefined)
    
    @scala.inline
    def setNestedTypeVarargs(value: IDescriptorProto*): Self = StObject.set(x, "nestedType", js.Array(value :_*))
    
    @scala.inline
    def setOneofDecl(value: js.Array[IOneofDescriptorProto]): Self = StObject.set(x, "oneofDecl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOneofDeclUndefined: Self = StObject.set(x, "oneofDecl", js.undefined)
    
    @scala.inline
    def setOneofDeclVarargs(value: IOneofDescriptorProto*): Self = StObject.set(x, "oneofDecl", js.Array(value :_*))
    
    @scala.inline
    def setOptions(value: IMessageOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setReservedName(value: js.Array[String]): Self = StObject.set(x, "reservedName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservedNameUndefined: Self = StObject.set(x, "reservedName", js.undefined)
    
    @scala.inline
    def setReservedNameVarargs(value: String*): Self = StObject.set(x, "reservedName", js.Array(value :_*))
    
    @scala.inline
    def setReservedRange(value: js.Array[IDescriptorProtoReservedRange]): Self = StObject.set(x, "reservedRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservedRangeUndefined: Self = StObject.set(x, "reservedRange", js.undefined)
    
    @scala.inline
    def setReservedRangeVarargs(value: IDescriptorProtoReservedRange*): Self = StObject.set(x, "reservedRange", js.Array(value :_*))
  }
}
