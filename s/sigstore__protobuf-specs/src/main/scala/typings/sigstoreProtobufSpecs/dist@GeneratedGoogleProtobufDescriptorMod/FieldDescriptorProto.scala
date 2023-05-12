package typings.sigstoreProtobufSpecs.`dist@GeneratedGoogleProtobufDescriptorMod`

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldDescriptorProto extends StObject {
  
  /**
    * For numeric types, contains the original text representation of the value.
    * For booleans, "true" or "false".
    * For strings, contains the default text contents (not escaped in any way).
    * For bytes, contains the C escaped value.  All bytes >= 128 are escaped.
    */
  var defaultValue: String
  
  /**
    * For extensions, this is the name of the type being extended.  It is
    * resolved in the same manner as type_name.
    */
  var extendee: String
  
  /**
    * JSON name of this field. The value is set by protocol compiler. If the
    * user has set a "json_name" option on this field, that option's value
    * will be used. Otherwise, it's deduced from the field's name by converting
    * it to camelCase.
    */
  var jsonName: String
  
  var label: FieldDescriptorProtoLabel
  
  var name: String
  
  var number: Double
  
  /**
    * If set, gives the index of a oneof in the containing type's oneof_decl
    * list.  This field is a member of that oneof.
    */
  var oneofIndex: Double
  
  var options: js.UndefOr[FieldOptions] = js.undefined
  
  /**
    * If true, this is a proto3 "optional". When a proto3 field is optional, it
    * tracks presence regardless of field type.
    *
    * When proto3_optional is true, this field must be belong to a oneof to
    * signal to old proto3 clients that presence is tracked for this field. This
    * oneof is known as a "synthetic" oneof, and this field must be its sole
    * member (each proto3 optional field gets its own synthetic oneof). Synthetic
    * oneofs exist in the descriptor only, and do not generate any API. Synthetic
    * oneofs must be ordered after all "real" oneofs.
    *
    * For message fields, proto3_optional doesn't create any semantic change,
    * since non-repeated message fields always track presence. However it still
    * indicates the semantic detail of whether the user wrote "optional" or not.
    * This can be useful for round-tripping the .proto file. For consistency we
    * give message fields a synthetic oneof also, even though it is not required
    * to track presence. This is especially important because the parser can't
    * tell if a field is a message or an enum, so it must always create a
    * synthetic oneof.
    *
    * Proto2 optional fields do not set this flag, because they already indicate
    * optional with `LABEL_OPTIONAL`.
    */
  var proto3Optional: Boolean
  
  /**
    * If type_name is set, this need not be set.  If both this and type_name
    * are set, this must be one of TYPE_ENUM, TYPE_MESSAGE or TYPE_GROUP.
    */
  var `type`: FieldDescriptorProtoType
  
  /**
    * For message and enum types, this is the name of the type.  If the name
    * starts with a '.', it is fully-qualified.  Otherwise, C++-like scoping
    * rules are used to find the type (i.e. first the nested types within this
    * message are searched, then within the parent, on up to the root
    * namespace).
    */
  var typeName: String
}
object FieldDescriptorProto {
  
  inline def apply(
    defaultValue: String,
    extendee: String,
    jsonName: String,
    label: FieldDescriptorProtoLabel,
    name: String,
    number: Double,
    oneofIndex: Double,
    proto3Optional: Boolean,
    `type`: FieldDescriptorProtoType,
    typeName: String
  ): FieldDescriptorProto = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], extendee = extendee.asInstanceOf[js.Any], jsonName = jsonName.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], oneofIndex = oneofIndex.asInstanceOf[js.Any], proto3Optional = proto3Optional.asInstanceOf[js.Any], typeName = typeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldDescriptorProto]
  }
  
  @JSImport("@sigstore/protobuf-specs/dist/@/generated/google/protobuf/descriptor", "FieldDescriptorProto")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(`object`: Any): FieldDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(`object`.asInstanceOf[js.Any]).asInstanceOf[FieldDescriptorProto]
  
  inline def toJSON(message: FieldDescriptorProto): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(message.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FieldDescriptorProto] (val x: Self) extends AnyVal {
    
    inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setExtendee(value: String): Self = StObject.set(x, "extendee", value.asInstanceOf[js.Any])
    
    inline def setJsonName(value: String): Self = StObject.set(x, "jsonName", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: FieldDescriptorProtoLabel): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setOneofIndex(value: Double): Self = StObject.set(x, "oneofIndex", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: FieldOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setProto3Optional(value: Boolean): Self = StObject.set(x, "proto3Optional", value.asInstanceOf[js.Any])
    
    inline def setType(value: FieldDescriptorProtoType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeName(value: String): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
  }
}
