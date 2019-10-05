package typings.atPulumiAws.typesInputMod.wafregional

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegexMatchSetRegexMatchTuple extends js.Object {
  /**
    * The part of a web request that you want to search, such as a specified header or a query string.
    */
  var fieldToMatch: Input[RegexMatchSetRegexMatchTupleFieldToMatch]
  /**
    * The ID of a [Regex Pattern Set](https://www.terraform.io/docs/providers/aws/r/waf_regex_pattern_set.html).
    */
  var regexPatternSetId: Input[String]
  /**
    * Text transformations used to eliminate unusual formatting that attackers use in web requests in an effort to bypass AWS WAF.
    * e.g. `CMD_LINE`, `HTML_ENTITY_DECODE` or `NONE`.
    * See [docs](http://docs.aws.amazon.com/waf/latest/APIReference/API_ByteMatchTuple.html#WAF-Type-ByteMatchTuple-TextTransformation)
    * for all supported values.
    */
  var textTransformation: Input[String]
}

object RegexMatchSetRegexMatchTuple {
  @scala.inline
  def apply(
    fieldToMatch: Input[RegexMatchSetRegexMatchTupleFieldToMatch],
    regexPatternSetId: Input[String],
    textTransformation: Input[String]
  ): RegexMatchSetRegexMatchTuple = {
    val __obj = js.Dynamic.literal(fieldToMatch = fieldToMatch.asInstanceOf[js.Any], regexPatternSetId = regexPatternSetId.asInstanceOf[js.Any], textTransformation = textTransformation.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RegexMatchSetRegexMatchTuple]
  }
}

