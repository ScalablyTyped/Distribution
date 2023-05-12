package typings.sigstoreProtobufSpecs.`dist@GeneratedGoogleProtobufDescriptorMod`

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtensionRangeOptions extends StObject {
  
  /** The parser stores options it doesn't recognize here. See above. */
  var uninterpretedOption: js.Array[UninterpretedOption]
}
object ExtensionRangeOptions {
  
  inline def apply(uninterpretedOption: js.Array[UninterpretedOption]): ExtensionRangeOptions = {
    val __obj = js.Dynamic.literal(uninterpretedOption = uninterpretedOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionRangeOptions]
  }
  
  @JSImport("@sigstore/protobuf-specs/dist/@/generated/google/protobuf/descriptor", "ExtensionRangeOptions")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(`object`: Any): ExtensionRangeOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(`object`.asInstanceOf[js.Any]).asInstanceOf[ExtensionRangeOptions]
  
  inline def toJSON(message: ExtensionRangeOptions): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(message.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExtensionRangeOptions] (val x: Self) extends AnyVal {
    
    inline def setUninterpretedOption(value: js.Array[UninterpretedOption]): Self = StObject.set(x, "uninterpretedOption", value.asInstanceOf[js.Any])
    
    inline def setUninterpretedOptionVarargs(value: UninterpretedOption*): Self = StObject.set(x, "uninterpretedOption", js.Array(value*))
  }
}
