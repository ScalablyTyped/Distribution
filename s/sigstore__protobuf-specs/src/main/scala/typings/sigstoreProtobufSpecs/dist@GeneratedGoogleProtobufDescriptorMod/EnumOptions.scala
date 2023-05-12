package typings.sigstoreProtobufSpecs.`dist@GeneratedGoogleProtobufDescriptorMod`

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumOptions extends StObject {
  
  /**
    * Set this option to true to allow mapping different tag names to the same
    * value.
    */
  var allowAlias: Boolean
  
  /**
    * Is this enum deprecated?
    * Depending on the target platform, this can emit Deprecated annotations
    * for the enum, or it will be completely ignored; in the very least, this
    * is a formalization for deprecating enums.
    */
  var deprecated: Boolean
  
  /** The parser stores options it doesn't recognize here. See above. */
  var uninterpretedOption: js.Array[UninterpretedOption]
}
object EnumOptions {
  
  inline def apply(allowAlias: Boolean, deprecated: Boolean, uninterpretedOption: js.Array[UninterpretedOption]): EnumOptions = {
    val __obj = js.Dynamic.literal(allowAlias = allowAlias.asInstanceOf[js.Any], deprecated = deprecated.asInstanceOf[js.Any], uninterpretedOption = uninterpretedOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumOptions]
  }
  
  @JSImport("@sigstore/protobuf-specs/dist/@/generated/google/protobuf/descriptor", "EnumOptions")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(`object`: Any): EnumOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(`object`.asInstanceOf[js.Any]).asInstanceOf[EnumOptions]
  
  inline def toJSON(message: EnumOptions): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(message.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnumOptions] (val x: Self) extends AnyVal {
    
    inline def setAllowAlias(value: Boolean): Self = StObject.set(x, "allowAlias", value.asInstanceOf[js.Any])
    
    inline def setDeprecated(value: Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
    
    inline def setUninterpretedOption(value: js.Array[UninterpretedOption]): Self = StObject.set(x, "uninterpretedOption", value.asInstanceOf[js.Any])
    
    inline def setUninterpretedOptionVarargs(value: UninterpretedOption*): Self = StObject.set(x, "uninterpretedOption", js.Array(value*))
  }
}
