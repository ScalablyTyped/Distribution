package typings.pulumiAws.inputMod.waf

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SizeConstraintSetSizeConstraint extends StObject {
  
  /**
    * The type of comparison you want to perform.
    * e.g. `EQ`, `NE`, `LT`, `GT`.
    * See [docs](https://docs.aws.amazon.com/waf/latest/APIReference/API_wafRegional_SizeConstraint.html) for all supported values.
    */
  var comparisonOperator: Input[String]
  
  /**
    * Specifies where in a web request to look for the size constraint.
    */
  var fieldToMatch: Input[SizeConstraintSetSizeConstraintFieldToMatch]
  
  /**
    * The size in bytes that you want to compare against the size of the specified `fieldToMatch`.
    * Valid values are between 0 - 21474836480 bytes (0 - 20 GB).
    */
  var size: Input[Double]
  
  /**
    * Text transformations used to eliminate unusual formatting that attackers use in web requests in an effort to bypass AWS WAF.
    * If you specify a transformation, AWS WAF performs the transformation on `fieldToMatch` before inspecting a request for a match.
    * e.g. `CMD_LINE`, `HTML_ENTITY_DECODE` or `NONE`.
    * See [docs](http://docs.aws.amazon.com/waf/latest/APIReference/API_SizeConstraint.html#WAF-Type-SizeConstraint-TextTransformation)
    * for all supported values.
    * **Note:** if you choose `BODY` as `type`, you must choose `NONE` because CloudFront forwards only the first 8192 bytes for inspection.
    */
  var textTransformation: Input[String]
}
object SizeConstraintSetSizeConstraint {
  
  @scala.inline
  def apply(
    comparisonOperator: Input[String],
    fieldToMatch: Input[SizeConstraintSetSizeConstraintFieldToMatch],
    size: Input[Double],
    textTransformation: Input[String]
  ): SizeConstraintSetSizeConstraint = {
    val __obj = js.Dynamic.literal(comparisonOperator = comparisonOperator.asInstanceOf[js.Any], fieldToMatch = fieldToMatch.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], textTransformation = textTransformation.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizeConstraintSetSizeConstraint]
  }
  
  @scala.inline
  implicit class SizeConstraintSetSizeConstraintMutableBuilder[Self <: SizeConstraintSetSizeConstraint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComparisonOperator(value: Input[String]): Self = StObject.set(x, "comparisonOperator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldToMatch(value: Input[SizeConstraintSetSizeConstraintFieldToMatch]): Self = StObject.set(x, "fieldToMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Input[Double]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextTransformation(value: Input[String]): Self = StObject.set(x, "textTransformation", value.asInstanceOf[js.Any])
  }
}
