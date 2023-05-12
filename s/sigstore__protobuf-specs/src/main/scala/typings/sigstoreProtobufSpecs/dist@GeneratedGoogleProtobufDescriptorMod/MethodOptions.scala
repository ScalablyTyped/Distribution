package typings.sigstoreProtobufSpecs.`dist@GeneratedGoogleProtobufDescriptorMod`

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MethodOptions extends StObject {
  
  /**
    * Is this method deprecated?
    * Depending on the target platform, this can emit Deprecated annotations
    * for the method, or it will be completely ignored; in the very least,
    * this is a formalization for deprecating methods.
    */
  var deprecated: Boolean
  
  var idempotencyLevel: MethodOptionsIdempotencyLevel
  
  /** The parser stores options it doesn't recognize here. See above. */
  var uninterpretedOption: js.Array[UninterpretedOption]
}
object MethodOptions {
  
  inline def apply(
    deprecated: Boolean,
    idempotencyLevel: MethodOptionsIdempotencyLevel,
    uninterpretedOption: js.Array[UninterpretedOption]
  ): MethodOptions = {
    val __obj = js.Dynamic.literal(deprecated = deprecated.asInstanceOf[js.Any], idempotencyLevel = idempotencyLevel.asInstanceOf[js.Any], uninterpretedOption = uninterpretedOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[MethodOptions]
  }
  
  @JSImport("@sigstore/protobuf-specs/dist/@/generated/google/protobuf/descriptor", "MethodOptions")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(`object`: Any): MethodOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(`object`.asInstanceOf[js.Any]).asInstanceOf[MethodOptions]
  
  inline def toJSON(message: MethodOptions): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(message.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MethodOptions] (val x: Self) extends AnyVal {
    
    inline def setDeprecated(value: Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
    
    inline def setIdempotencyLevel(value: MethodOptionsIdempotencyLevel): Self = StObject.set(x, "idempotencyLevel", value.asInstanceOf[js.Any])
    
    inline def setUninterpretedOption(value: js.Array[UninterpretedOption]): Self = StObject.set(x, "uninterpretedOption", value.asInstanceOf[js.Any])
    
    inline def setUninterpretedOptionVarargs(value: UninterpretedOption*): Self = StObject.set(x, "uninterpretedOption", js.Array(value*))
  }
}
