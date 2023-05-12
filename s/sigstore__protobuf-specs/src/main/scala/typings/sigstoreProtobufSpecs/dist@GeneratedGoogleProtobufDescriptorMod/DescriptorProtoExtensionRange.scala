package typings.sigstoreProtobufSpecs.`dist@GeneratedGoogleProtobufDescriptorMod`

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescriptorProtoExtensionRange extends StObject {
  
  /** Exclusive. */
  var end: Double
  
  var options: js.UndefOr[ExtensionRangeOptions] = js.undefined
  
  /** Inclusive. */
  var start: Double
}
object DescriptorProtoExtensionRange {
  
  inline def apply(end: Double, start: Double): DescriptorProtoExtensionRange = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescriptorProtoExtensionRange]
  }
  
  @JSImport("@sigstore/protobuf-specs/dist/@/generated/google/protobuf/descriptor", "DescriptorProto_ExtensionRange")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(`object`: Any): DescriptorProtoExtensionRange = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(`object`.asInstanceOf[js.Any]).asInstanceOf[DescriptorProtoExtensionRange]
  
  inline def toJSON(message: DescriptorProtoExtensionRange): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(message.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescriptorProtoExtensionRange] (val x: Self) extends AnyVal {
    
    inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: ExtensionRangeOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
