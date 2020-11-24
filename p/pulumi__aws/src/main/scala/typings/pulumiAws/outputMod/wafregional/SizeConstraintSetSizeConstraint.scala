package typings.pulumiAws.outputMod.wafregional

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SizeConstraintSetSizeConstraint extends js.Object {
  
  /**
    * The type of comparison you want to perform.
    * e.g. `EQ`, `NE`, `LT`, `GT`.
    * See [docs](https://docs.aws.amazon.com/waf/latest/APIReference/API_wafRegional_SizeConstraint.html) for all supported values.
    */
  var comparisonOperator: String = js.native
  
  /**
    * Specifies where in a web request to look for the size constraint.
    */
  var fieldToMatch: SizeConstraintSetSizeConstraintFieldToMatch = js.native
  
  /**
    * The size in bytes that you want to compare against the size of the specified `fieldToMatch`.
    * Valid values are between 0 - 21474836480 bytes (0 - 20 GB).
    */
  var size: Double = js.native
  
  /**
    * Text transformations used to eliminate unusual formatting that attackers use in web requests in an effort to bypass AWS WAF.
    * If you specify a transformation, AWS WAF performs the transformation on `fieldToMatch` before inspecting a request for a match.
    * e.g. `CMD_LINE`, `HTML_ENTITY_DECODE` or `NONE`.
    * See [docs](http://docs.aws.amazon.com/waf/latest/APIReference/API_SizeConstraint.html#WAF-Type-SizeConstraint-TextTransformation)
    * for all supported values.
    * **Note:** if you choose `BODY` as `type`, you must choose `NONE` because CloudFront forwards only the first 8192 bytes for inspection.
    */
  var textTransformation: String = js.native
}
object SizeConstraintSetSizeConstraint {
  
  @scala.inline
  def apply(
    comparisonOperator: String,
    fieldToMatch: SizeConstraintSetSizeConstraintFieldToMatch,
    size: Double,
    textTransformation: String
  ): SizeConstraintSetSizeConstraint = {
    val __obj = js.Dynamic.literal(comparisonOperator = comparisonOperator.asInstanceOf[js.Any], fieldToMatch = fieldToMatch.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], textTransformation = textTransformation.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizeConstraintSetSizeConstraint]
  }
  
  @scala.inline
  implicit class SizeConstraintSetSizeConstraintOps[Self <: SizeConstraintSetSizeConstraint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setComparisonOperator(value: String): Self = this.set("comparisonOperator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldToMatch(value: SizeConstraintSetSizeConstraintFieldToMatch): Self = this.set("fieldToMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextTransformation(value: String): Self = this.set("textTransformation", value.asInstanceOf[js.Any])
  }
}
