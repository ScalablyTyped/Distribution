package typings.atPulumiAws.typesOutputMod.wafregionalNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizeConstraintSetSizeConstraint extends js.Object {
  /**
    * The type of comparison you want to perform.
    * e.g. `EQ`, `NE`, `LT`, `GT`.
    * See [docs](http://docs.aws.amazon.com/waf/latest/APIReference/API_SizeConstraint.html#WAF-Type-SizeConstraint-ComparisonOperator) for all supported values.
    */
  var comparisonOperator: String
  /**
    * Specifies where in a web request to look for the size constraint.
    */
  var fieldToMatch: SizeConstraintSetSizeConstraintFieldToMatch
  /**
    * The size in bytes that you want to compare against the size of the specified `fieldToMatch`.
    * Valid values are between 0 - 21474836480 bytes (0 - 20 GB).
    */
  var size: Double
  /**
    * Text transformations used to eliminate unusual formatting that attackers use in web requests in an effort to bypass AWS WAF.
    * If you specify a transformation, AWS WAF performs the transformation on `fieldToMatch` before inspecting a request for a match.
    * e.g. `CMD_LINE`, `HTML_ENTITY_DECODE` or `NONE`.
    * See [docs](http://docs.aws.amazon.com/waf/latest/APIReference/API_SizeConstraint.html#WAF-Type-SizeConstraint-TextTransformation)
    * for all supported values.
    * **Note:** if you choose `BODY` as `type`, you must choose `NONE` because CloudFront forwards only the first 8192 bytes for inspection.
    */
  var textTransformation: String
}

object SizeConstraintSetSizeConstraint {
  @scala.inline
  def apply(
    comparisonOperator: String,
    fieldToMatch: SizeConstraintSetSizeConstraintFieldToMatch,
    size: Double,
    textTransformation: String
  ): SizeConstraintSetSizeConstraint = {
    val __obj = js.Dynamic.literal(comparisonOperator = comparisonOperator, fieldToMatch = fieldToMatch, size = size, textTransformation = textTransformation)
  
    __obj.asInstanceOf[SizeConstraintSetSizeConstraint]
  }
}

