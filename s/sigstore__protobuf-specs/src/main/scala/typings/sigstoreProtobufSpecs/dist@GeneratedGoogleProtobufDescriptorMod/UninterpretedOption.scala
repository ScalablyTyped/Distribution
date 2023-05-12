package typings.sigstoreProtobufSpecs.`dist@GeneratedGoogleProtobufDescriptorMod`

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UninterpretedOption extends StObject {
  
  var aggregateValue: String
  
  var doubleValue: Double
  
  /**
    * The value of the uninterpreted option, in whatever type the tokenizer
    * identified it as during parsing. Exactly one of these should be set.
    */
  var identifierValue: String
  
  var name: js.Array[UninterpretedOptionNamePart]
  
  var negativeIntValue: String
  
  var positiveIntValue: String
  
  var stringValue: Buffer
}
object UninterpretedOption {
  
  inline def apply(
    aggregateValue: String,
    doubleValue: Double,
    identifierValue: String,
    name: js.Array[UninterpretedOptionNamePart],
    negativeIntValue: String,
    positiveIntValue: String,
    stringValue: Buffer
  ): UninterpretedOption = {
    val __obj = js.Dynamic.literal(aggregateValue = aggregateValue.asInstanceOf[js.Any], doubleValue = doubleValue.asInstanceOf[js.Any], identifierValue = identifierValue.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], negativeIntValue = negativeIntValue.asInstanceOf[js.Any], positiveIntValue = positiveIntValue.asInstanceOf[js.Any], stringValue = stringValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[UninterpretedOption]
  }
  
  @JSImport("@sigstore/protobuf-specs/dist/@/generated/google/protobuf/descriptor", "UninterpretedOption")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(`object`: Any): UninterpretedOption = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(`object`.asInstanceOf[js.Any]).asInstanceOf[UninterpretedOption]
  
  inline def toJSON(message: UninterpretedOption): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(message.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UninterpretedOption] (val x: Self) extends AnyVal {
    
    inline def setAggregateValue(value: String): Self = StObject.set(x, "aggregateValue", value.asInstanceOf[js.Any])
    
    inline def setDoubleValue(value: Double): Self = StObject.set(x, "doubleValue", value.asInstanceOf[js.Any])
    
    inline def setIdentifierValue(value: String): Self = StObject.set(x, "identifierValue", value.asInstanceOf[js.Any])
    
    inline def setName(value: js.Array[UninterpretedOptionNamePart]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameVarargs(value: UninterpretedOptionNamePart*): Self = StObject.set(x, "name", js.Array(value*))
    
    inline def setNegativeIntValue(value: String): Self = StObject.set(x, "negativeIntValue", value.asInstanceOf[js.Any])
    
    inline def setPositiveIntValue(value: String): Self = StObject.set(x, "positiveIntValue", value.asInstanceOf[js.Any])
    
    inline def setStringValue(value: Buffer): Self = StObject.set(x, "stringValue", value.asInstanceOf[js.Any])
  }
}
