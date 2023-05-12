package typings.sigstoreProtobufSpecs.`dist@GeneratedGoogleProtobufDescriptorMod`

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceOptions extends StObject {
  
  /**
    * Is this service deprecated?
    * Depending on the target platform, this can emit Deprecated annotations
    * for the service, or it will be completely ignored; in the very least,
    * this is a formalization for deprecating services.
    */
  var deprecated: Boolean
  
  /** The parser stores options it doesn't recognize here. See above. */
  var uninterpretedOption: js.Array[UninterpretedOption]
}
object ServiceOptions {
  
  inline def apply(deprecated: Boolean, uninterpretedOption: js.Array[UninterpretedOption]): ServiceOptions = {
    val __obj = js.Dynamic.literal(deprecated = deprecated.asInstanceOf[js.Any], uninterpretedOption = uninterpretedOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceOptions]
  }
  
  @JSImport("@sigstore/protobuf-specs/dist/@/generated/google/protobuf/descriptor", "ServiceOptions")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(`object`: Any): ServiceOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(`object`.asInstanceOf[js.Any]).asInstanceOf[ServiceOptions]
  
  inline def toJSON(message: ServiceOptions): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(message.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServiceOptions] (val x: Self) extends AnyVal {
    
    inline def setDeprecated(value: Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
    
    inline def setUninterpretedOption(value: js.Array[UninterpretedOption]): Self = StObject.set(x, "uninterpretedOption", value.asInstanceOf[js.Any])
    
    inline def setUninterpretedOptionVarargs(value: UninterpretedOption*): Self = StObject.set(x, "uninterpretedOption", js.Array(value*))
  }
}
