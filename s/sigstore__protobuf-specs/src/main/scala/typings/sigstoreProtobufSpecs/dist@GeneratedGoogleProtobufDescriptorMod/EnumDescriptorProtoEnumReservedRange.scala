package typings.sigstoreProtobufSpecs.`dist@GeneratedGoogleProtobufDescriptorMod`

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumDescriptorProtoEnumReservedRange extends StObject {
  
  /** Inclusive. */
  var end: Double
  
  /** Inclusive. */
  var start: Double
}
object EnumDescriptorProtoEnumReservedRange {
  
  inline def apply(end: Double, start: Double): EnumDescriptorProtoEnumReservedRange = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumDescriptorProtoEnumReservedRange]
  }
  
  @JSImport("@sigstore/protobuf-specs/dist/@/generated/google/protobuf/descriptor", "EnumDescriptorProto_EnumReservedRange")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(`object`: Any): EnumDescriptorProtoEnumReservedRange = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(`object`.asInstanceOf[js.Any]).asInstanceOf[EnumDescriptorProtoEnumReservedRange]
  
  inline def toJSON(message: EnumDescriptorProtoEnumReservedRange): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(message.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnumDescriptorProtoEnumReservedRange] (val x: Self) extends AnyVal {
    
    inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
