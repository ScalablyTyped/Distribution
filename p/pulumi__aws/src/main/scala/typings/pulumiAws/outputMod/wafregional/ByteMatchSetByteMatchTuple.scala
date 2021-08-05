package typings.pulumiAws.outputMod.wafregional

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ByteMatchSetByteMatchTuple extends StObject {
  
  /**
    * Settings for the ByteMatchTuple. FieldToMatch documented below.
    */
  var fieldToMatch: ByteMatchSetByteMatchTupleFieldToMatch
  
  /**
    * Within the portion of a web request that you want to search.
    */
  var positionalConstraint: String
  
  /**
    * The value that you want AWS WAF to search for. The maximum length of the value is 50 bytes.
    */
  var targetString: js.UndefOr[String] = js.undefined
  
  /**
    * The formatting way for web request.
    */
  var textTransformation: String
}
object ByteMatchSetByteMatchTuple {
  
  inline def apply(
    fieldToMatch: ByteMatchSetByteMatchTupleFieldToMatch,
    positionalConstraint: String,
    textTransformation: String
  ): ByteMatchSetByteMatchTuple = {
    val __obj = js.Dynamic.literal(fieldToMatch = fieldToMatch.asInstanceOf[js.Any], positionalConstraint = positionalConstraint.asInstanceOf[js.Any], textTransformation = textTransformation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ByteMatchSetByteMatchTuple]
  }
  
  extension [Self <: ByteMatchSetByteMatchTuple](x: Self) {
    
    inline def setFieldToMatch(value: ByteMatchSetByteMatchTupleFieldToMatch): Self = StObject.set(x, "fieldToMatch", value.asInstanceOf[js.Any])
    
    inline def setPositionalConstraint(value: String): Self = StObject.set(x, "positionalConstraint", value.asInstanceOf[js.Any])
    
    inline def setTargetString(value: String): Self = StObject.set(x, "targetString", value.asInstanceOf[js.Any])
    
    inline def setTargetStringUndefined: Self = StObject.set(x, "targetString", js.undefined)
    
    inline def setTextTransformation(value: String): Self = StObject.set(x, "textTransformation", value.asInstanceOf[js.Any])
  }
}
