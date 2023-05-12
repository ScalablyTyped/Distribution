package typings.sigstoreProtobufSpecs.`dist@GeneratedGoogleProtobufDescriptorMod`

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumDescriptorProto extends StObject {
  
  var name: String
  
  var options: js.UndefOr[EnumOptions] = js.undefined
  
  /**
    * Reserved enum value names, which may not be reused. A given name may only
    * be reserved once.
    */
  var reservedName: js.Array[String]
  
  /**
    * Range of reserved numeric values. Reserved numeric values may not be used
    * by enum values in the same enum declaration. Reserved ranges may not
    * overlap.
    */
  var reservedRange: js.Array[EnumDescriptorProtoEnumReservedRange]
  
  var value: js.Array[EnumValueDescriptorProto]
}
object EnumDescriptorProto {
  
  inline def apply(
    name: String,
    reservedName: js.Array[String],
    reservedRange: js.Array[EnumDescriptorProtoEnumReservedRange],
    value: js.Array[EnumValueDescriptorProto]
  ): EnumDescriptorProto = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], reservedName = reservedName.asInstanceOf[js.Any], reservedRange = reservedRange.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumDescriptorProto]
  }
  
  @JSImport("@sigstore/protobuf-specs/dist/@/generated/google/protobuf/descriptor", "EnumDescriptorProto")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(`object`: Any): EnumDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(`object`.asInstanceOf[js.Any]).asInstanceOf[EnumDescriptorProto]
  
  inline def toJSON(message: EnumDescriptorProto): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(message.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnumDescriptorProto] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: EnumOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setReservedName(value: js.Array[String]): Self = StObject.set(x, "reservedName", value.asInstanceOf[js.Any])
    
    inline def setReservedNameVarargs(value: String*): Self = StObject.set(x, "reservedName", js.Array(value*))
    
    inline def setReservedRange(value: js.Array[EnumDescriptorProtoEnumReservedRange]): Self = StObject.set(x, "reservedRange", value.asInstanceOf[js.Any])
    
    inline def setReservedRangeVarargs(value: EnumDescriptorProtoEnumReservedRange*): Self = StObject.set(x, "reservedRange", js.Array(value*))
    
    inline def setValue(value: js.Array[EnumValueDescriptorProto]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueVarargs(value: EnumValueDescriptorProto*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
