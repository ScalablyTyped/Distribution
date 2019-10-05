package typings.atPulumiAws.typesInputMod.wafregional

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SqlInjectionMatchSetSqlInjectionMatchTuple extends js.Object {
  /**
    * Specifies where in a web request to look for snippets of malicious SQL code.
    */
  var fieldToMatch: Input[SqlInjectionMatchSetSqlInjectionMatchTupleFieldToMatch]
  /**
    * Text transformations used to eliminate unusual formatting that attackers use in web requests in an effort to bypass AWS WAF.
    * If you specify a transformation, AWS WAF performs the transformation on `fieldToMatch` before inspecting a request for a match.
    * e.g. `CMD_LINE`, `HTML_ENTITY_DECODE` or `NONE`.
    * See [docs](https://docs.aws.amazon.com/waf/latest/APIReference/API_regional_SqlInjectionMatchTuple.html#WAF-Type-regional_SqlInjectionMatchTuple-TextTransformation)
    * for all supported values.
    */
  var textTransformation: Input[String]
}

object SqlInjectionMatchSetSqlInjectionMatchTuple {
  @scala.inline
  def apply(
    fieldToMatch: Input[SqlInjectionMatchSetSqlInjectionMatchTupleFieldToMatch],
    textTransformation: Input[String]
  ): SqlInjectionMatchSetSqlInjectionMatchTuple = {
    val __obj = js.Dynamic.literal(fieldToMatch = fieldToMatch.asInstanceOf[js.Any], textTransformation = textTransformation.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SqlInjectionMatchSetSqlInjectionMatchTuple]
  }
}

