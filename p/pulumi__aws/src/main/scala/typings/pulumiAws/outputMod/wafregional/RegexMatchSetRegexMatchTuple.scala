package typings.pulumiAws.outputMod.wafregional

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegexMatchSetRegexMatchTuple extends js.Object {
  /**
    * The part of a web request that you want to search, such as a specified header or a query string.
    */
  var fieldToMatch: RegexMatchSetRegexMatchTupleFieldToMatch = js.native
  /**
    * The ID of a `WAF Regex Pattern Set`.
    */
  var regexPatternSetId: String = js.native
  /**
    * Text transformations used to eliminate unusual formatting that attackers use in web requests in an effort to bypass AWS WAF.
    * e.g. `CMD_LINE`, `HTML_ENTITY_DECODE` or `NONE`.
    * See [docs](http://docs.aws.amazon.com/waf/latest/APIReference/API_ByteMatchTuple.html#WAF-Type-ByteMatchTuple-TextTransformation)
    * for all supported values.
    */
  var textTransformation: String = js.native
}

object RegexMatchSetRegexMatchTuple {
  @scala.inline
  def apply(
    fieldToMatch: RegexMatchSetRegexMatchTupleFieldToMatch,
    regexPatternSetId: String,
    textTransformation: String
  ): RegexMatchSetRegexMatchTuple = {
    val __obj = js.Dynamic.literal(fieldToMatch = fieldToMatch.asInstanceOf[js.Any], regexPatternSetId = regexPatternSetId.asInstanceOf[js.Any], textTransformation = textTransformation.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegexMatchSetRegexMatchTuple]
  }
  @scala.inline
  implicit class RegexMatchSetRegexMatchTupleOps[Self <: RegexMatchSetRegexMatchTuple] (val x: Self) extends AnyVal {
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
    def setFieldToMatch(value: RegexMatchSetRegexMatchTupleFieldToMatch): Self = this.set("fieldToMatch", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegexPatternSetId(value: String): Self = this.set("regexPatternSetId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextTransformation(value: String): Self = this.set("textTransformation", value.asInstanceOf[js.Any])
  }
  
}

