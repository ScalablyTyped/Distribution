package typings.sigstoreProtobufSpecs.`dist@GeneratedGoogleProtobufDescriptorMod`

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescriptorProtoReservedRange extends StObject {
  
  /** Exclusive. */
  var end: Double
  
  /** Inclusive. */
  var start: Double
}
object DescriptorProtoReservedRange {
  
  inline def apply(end: Double, start: Double): DescriptorProtoReservedRange = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescriptorProtoReservedRange]
  }
  
  @JSImport("@sigstore/protobuf-specs/dist/@/generated/google/protobuf/descriptor", "DescriptorProto_ReservedRange")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(`object`: Any): DescriptorProtoReservedRange = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(`object`.asInstanceOf[js.Any]).asInstanceOf[DescriptorProtoReservedRange]
  
  inline def toJSON(message: DescriptorProtoReservedRange): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(message.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescriptorProtoReservedRange] (val x: Self) extends AnyVal {
    
    inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
