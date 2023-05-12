package typings.sigstoreProtobufSpecs.`dist@GeneratedGoogleProtobufDescriptorMod`

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescriptorProto extends StObject {
  
  var enumType: js.Array[EnumDescriptorProto]
  
  var `extension`: js.Array[FieldDescriptorProto]
  
  var extensionRange: js.Array[DescriptorProtoExtensionRange]
  
  var field: js.Array[FieldDescriptorProto]
  
  var name: String
  
  var nestedType: js.Array[DescriptorProto]
  
  var oneofDecl: js.Array[OneofDescriptorProto]
  
  var options: js.UndefOr[MessageOptions] = js.undefined
  
  /**
    * Reserved field names, which may not be used by fields in the same message.
    * A given name may only be reserved once.
    */
  var reservedName: js.Array[String]
  
  var reservedRange: js.Array[DescriptorProtoReservedRange]
}
object DescriptorProto {
  
  inline def apply(
    enumType: js.Array[EnumDescriptorProto],
    `extension`: js.Array[FieldDescriptorProto],
    extensionRange: js.Array[DescriptorProtoExtensionRange],
    field: js.Array[FieldDescriptorProto],
    name: String,
    nestedType: js.Array[DescriptorProto],
    oneofDecl: js.Array[OneofDescriptorProto],
    reservedName: js.Array[String],
    reservedRange: js.Array[DescriptorProtoReservedRange]
  ): DescriptorProto = {
    val __obj = js.Dynamic.literal(enumType = enumType.asInstanceOf[js.Any], extensionRange = extensionRange.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nestedType = nestedType.asInstanceOf[js.Any], oneofDecl = oneofDecl.asInstanceOf[js.Any], reservedName = reservedName.asInstanceOf[js.Any], reservedRange = reservedRange.asInstanceOf[js.Any])
    __obj.updateDynamic("extension")(`extension`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescriptorProto]
  }
  
  @JSImport("@sigstore/protobuf-specs/dist/@/generated/google/protobuf/descriptor", "DescriptorProto")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(`object`: Any): DescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(`object`.asInstanceOf[js.Any]).asInstanceOf[DescriptorProto]
  
  inline def toJSON(message: DescriptorProto): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(message.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescriptorProto] (val x: Self) extends AnyVal {
    
    inline def setEnumType(value: js.Array[EnumDescriptorProto]): Self = StObject.set(x, "enumType", value.asInstanceOf[js.Any])
    
    inline def setEnumTypeVarargs(value: EnumDescriptorProto*): Self = StObject.set(x, "enumType", js.Array(value*))
    
    inline def setExtension(value: js.Array[FieldDescriptorProto]): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    inline def setExtensionRange(value: js.Array[DescriptorProtoExtensionRange]): Self = StObject.set(x, "extensionRange", value.asInstanceOf[js.Any])
    
    inline def setExtensionRangeVarargs(value: DescriptorProtoExtensionRange*): Self = StObject.set(x, "extensionRange", js.Array(value*))
    
    inline def setExtensionVarargs(value: FieldDescriptorProto*): Self = StObject.set(x, "extension", js.Array(value*))
    
    inline def setField(value: js.Array[FieldDescriptorProto]): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldVarargs(value: FieldDescriptorProto*): Self = StObject.set(x, "field", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNestedType(value: js.Array[DescriptorProto]): Self = StObject.set(x, "nestedType", value.asInstanceOf[js.Any])
    
    inline def setNestedTypeVarargs(value: DescriptorProto*): Self = StObject.set(x, "nestedType", js.Array(value*))
    
    inline def setOneofDecl(value: js.Array[OneofDescriptorProto]): Self = StObject.set(x, "oneofDecl", value.asInstanceOf[js.Any])
    
    inline def setOneofDeclVarargs(value: OneofDescriptorProto*): Self = StObject.set(x, "oneofDecl", js.Array(value*))
    
    inline def setOptions(value: MessageOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setReservedName(value: js.Array[String]): Self = StObject.set(x, "reservedName", value.asInstanceOf[js.Any])
    
    inline def setReservedNameVarargs(value: String*): Self = StObject.set(x, "reservedName", js.Array(value*))
    
    inline def setReservedRange(value: js.Array[DescriptorProtoReservedRange]): Self = StObject.set(x, "reservedRange", value.asInstanceOf[js.Any])
    
    inline def setReservedRangeVarargs(value: DescriptorProtoReservedRange*): Self = StObject.set(x, "reservedRange", js.Array(value*))
  }
}
