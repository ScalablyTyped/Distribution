package typings.pulumiAws.inputMod.wafregional

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ByteMatchSetByteMatchTuple extends StObject {
  
  /**
    * Settings for the ByteMatchTuple. FieldToMatch documented below.
    */
  var fieldToMatch: Input[ByteMatchSetByteMatchTupleFieldToMatch]
  
  /**
    * Within the portion of a web request that you want to search.
    */
  var positionalConstraint: Input[String]
  
  /**
    * The value that you want AWS WAF to search for. The maximum length of the value is 50 bytes.
    */
  var targetString: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The formatting way for web request.
    */
  var textTransformation: Input[String]
}
object ByteMatchSetByteMatchTuple {
  
  @scala.inline
  def apply(
    fieldToMatch: Input[ByteMatchSetByteMatchTupleFieldToMatch],
    positionalConstraint: Input[String],
    textTransformation: Input[String]
  ): ByteMatchSetByteMatchTuple = {
    val __obj = js.Dynamic.literal(fieldToMatch = fieldToMatch.asInstanceOf[js.Any], positionalConstraint = positionalConstraint.asInstanceOf[js.Any], textTransformation = textTransformation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ByteMatchSetByteMatchTuple]
  }
  
  @scala.inline
  implicit class ByteMatchSetByteMatchTupleMutableBuilder[Self <: ByteMatchSetByteMatchTuple] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFieldToMatch(value: Input[ByteMatchSetByteMatchTupleFieldToMatch]): Self = StObject.set(x, "fieldToMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionalConstraint(value: Input[String]): Self = StObject.set(x, "positionalConstraint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetString(value: Input[String]): Self = StObject.set(x, "targetString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetStringUndefined: Self = StObject.set(x, "targetString", js.undefined)
    
    @scala.inline
    def setTextTransformation(value: Input[String]): Self = StObject.set(x, "textTransformation", value.asInstanceOf[js.Any])
  }
}
