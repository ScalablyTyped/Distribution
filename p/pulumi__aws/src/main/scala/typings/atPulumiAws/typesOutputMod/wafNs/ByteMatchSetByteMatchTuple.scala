package typings.atPulumiAws.typesOutputMod.wafNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ByteMatchSetByteMatchTuple extends js.Object {
  /**
    * The part of a web request that you want to search, such as a specified header or a query string.
    */
  var fieldToMatch: ByteMatchSetByteMatchTupleFieldToMatch
  /**
    * Within the portion of a web request that you want to search
    * (for example, in the query string, if any), specify where you want to search.
    * e.g. `CONTAINS`, `CONTAINS_WORD` or `EXACTLY`.
    * See [docs](http://docs.aws.amazon.com/waf/latest/APIReference/API_ByteMatchTuple.html#WAF-Type-ByteMatchTuple-PositionalConstraint)
    * for all supported values.
    */
  var positionalConstraint: String
  /**
    * The value that you want to search for. e.g. `HEADER`, `METHOD` or `BODY`.
    * See [docs](http://docs.aws.amazon.com/waf/latest/APIReference/API_ByteMatchTuple.html#WAF-Type-ByteMatchTuple-TargetString)
    * for all supported values.
    */
  var targetString: js.UndefOr[String] = js.undefined
  /**
    * Text transformations used to eliminate unusual formatting that attackers use in web requests in an effort to bypass AWS WAF.
    * If you specify a transformation, AWS WAF performs the transformation on `targetString` before inspecting a request for a match.
    * e.g. `CMD_LINE`, `HTML_ENTITY_DECODE` or `NONE`.
    * See [docs](http://docs.aws.amazon.com/waf/latest/APIReference/API_ByteMatchTuple.html#WAF-Type-ByteMatchTuple-TextTransformation)
    * for all supported values.
    */
  var textTransformation: String
}

object ByteMatchSetByteMatchTuple {
  @scala.inline
  def apply(
    fieldToMatch: ByteMatchSetByteMatchTupleFieldToMatch,
    positionalConstraint: String,
    textTransformation: String,
    targetString: String = null
  ): ByteMatchSetByteMatchTuple = {
    val __obj = js.Dynamic.literal(fieldToMatch = fieldToMatch, positionalConstraint = positionalConstraint, textTransformation = textTransformation)
    if (targetString != null) __obj.updateDynamic("targetString")(targetString)
    __obj.asInstanceOf[ByteMatchSetByteMatchTuple]
  }
}

