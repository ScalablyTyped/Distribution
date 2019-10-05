package typings.atPulumiAws.typesOutputMod.wafregional

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegexMatchSetRegexMatchTuple extends js.Object {
  /**
    * The part of a web request that you want to search, such as a specified header or a query string.
    */
  var fieldToMatch: RegexMatchSetRegexMatchTupleFieldToMatch
  /**
    * The ID of a [Regex Pattern Set](https://www.terraform.io/docs/providers/aws/r/waf_regex_pattern_set.html).
    */
  var regexPatternSetId: String
  /**
    * Text transformations used to eliminate unusual formatting that attackers use in web requests in an effort to bypass AWS WAF.
    * e.g. `CMD_LINE`, `HTML_ENTITY_DECODE` or `NONE`.
    * See [docs](http://docs.aws.amazon.com/waf/latest/APIReference/API_ByteMatchTuple.html#WAF-Type-ByteMatchTuple-TextTransformation)
    * for all supported values.
    */
  var textTransformation: String
}

object RegexMatchSetRegexMatchTuple {
  @scala.inline
  def apply(
    fieldToMatch: RegexMatchSetRegexMatchTupleFieldToMatch,
    regexPatternSetId: String,
    textTransformation: String
  ): RegexMatchSetRegexMatchTuple = {
    val __obj = js.Dynamic.literal(fieldToMatch = fieldToMatch, regexPatternSetId = regexPatternSetId, textTransformation = textTransformation)
  
    __obj.asInstanceOf[RegexMatchSetRegexMatchTuple]
  }
}

