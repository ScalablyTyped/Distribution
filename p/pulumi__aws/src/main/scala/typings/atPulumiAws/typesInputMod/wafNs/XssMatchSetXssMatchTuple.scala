package typings.atPulumiAws.typesInputMod.wafNs

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XssMatchSetXssMatchTuple extends js.Object {
  /**
    * Specifies where in a web request to look for cross-site scripting attacks.
    */
  var fieldToMatch: Input[XssMatchSetXssMatchTupleFieldToMatch]
  /**
    * Text transformations used to eliminate unusual formatting that attackers use in web requests in an effort to bypass AWS WAF.
    * If you specify a transformation, AWS WAF performs the transformation on `targetString` before inspecting a request for a match.
    * e.g. `CMD_LINE`, `HTML_ENTITY_DECODE` or `NONE`.
    * See [docs](http://docs.aws.amazon.com/waf/latest/APIReference/API_XssMatchTuple.html#WAF-Type-XssMatchTuple-TextTransformation)
    * for all supported values.
    */
  var textTransformation: Input[String]
}

object XssMatchSetXssMatchTuple {
  @scala.inline
  def apply(fieldToMatch: Input[XssMatchSetXssMatchTupleFieldToMatch], textTransformation: Input[String]): XssMatchSetXssMatchTuple = {
    val __obj = js.Dynamic.literal(fieldToMatch = fieldToMatch.asInstanceOf[js.Any], textTransformation = textTransformation.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[XssMatchSetXssMatchTuple]
  }
}

