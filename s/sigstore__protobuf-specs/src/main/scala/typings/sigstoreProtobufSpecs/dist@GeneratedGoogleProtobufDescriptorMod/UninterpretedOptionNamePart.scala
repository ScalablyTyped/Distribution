package typings.sigstoreProtobufSpecs.`dist@GeneratedGoogleProtobufDescriptorMod`

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UninterpretedOptionNamePart extends StObject {
  
  var isExtension: Boolean
  
  var namePart: String
}
object UninterpretedOptionNamePart {
  
  inline def apply(isExtension: Boolean, namePart: String): UninterpretedOptionNamePart = {
    val __obj = js.Dynamic.literal(isExtension = isExtension.asInstanceOf[js.Any], namePart = namePart.asInstanceOf[js.Any])
    __obj.asInstanceOf[UninterpretedOptionNamePart]
  }
  
  @JSImport("@sigstore/protobuf-specs/dist/@/generated/google/protobuf/descriptor", "UninterpretedOption_NamePart")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(`object`: Any): UninterpretedOptionNamePart = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(`object`.asInstanceOf[js.Any]).asInstanceOf[UninterpretedOptionNamePart]
  
  inline def toJSON(message: UninterpretedOptionNamePart): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(message.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UninterpretedOptionNamePart] (val x: Self) extends AnyVal {
    
    inline def setIsExtension(value: Boolean): Self = StObject.set(x, "isExtension", value.asInstanceOf[js.Any])
    
    inline def setNamePart(value: String): Self = StObject.set(x, "namePart", value.asInstanceOf[js.Any])
  }
}
