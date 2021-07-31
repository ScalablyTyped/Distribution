package typings.pulumiAws.inputMod.waf

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ByteMatchSetByteMatchTuple extends StObject {
  
  /**
    * The part of a web request that you want to search, such as a specified header or a query string.
    */
  var fieldToMatch: Input[ByteMatchSetByteMatchTupleFieldToMatch]
  
  /**
    * Within the portion of a web request that you want to search
    * (for example, in the query string, if any), specify where you want to search.
    * e.g. `CONTAINS`, `CONTAINS_WORD` or `EXACTLY`.
    * See [docs](http://docs.aws.amazon.com/waf/latest/APIReference/API_ByteMatchTuple.html#WAF-Type-ByteMatchTuple-PositionalConstraint)
    * for all supported values.
    */
  var positionalConstraint: Input[String]
  
  /**
    * The value that you want to search for. e.g. `HEADER`, `METHOD` or `BODY`.
    * See [docs](http://docs.aws.amazon.com/waf/latest/APIReference/API_ByteMatchTuple.html#WAF-Type-ByteMatchTuple-TargetString)
    * for all supported values.
    */
  var targetString: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Text transformations used to eliminate unusual formatting that attackers use in web requests in an effort to bypass AWS WAF.
    * If you specify a transformation, AWS WAF performs the transformation on `targetString` before inspecting a request for a match.
    * e.g. `CMD_LINE`, `HTML_ENTITY_DECODE` or `NONE`.
    * See [docs](http://docs.aws.amazon.com/waf/latest/APIReference/API_ByteMatchTuple.html#WAF-Type-ByteMatchTuple-TextTransformation)
    * for all supported values.
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
