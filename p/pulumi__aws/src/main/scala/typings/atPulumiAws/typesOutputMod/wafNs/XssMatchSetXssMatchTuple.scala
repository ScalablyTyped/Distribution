package typings.atPulumiAws.typesOutputMod.wafNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XssMatchSetXssMatchTuple extends js.Object {
  /**
    * Specifies where in a web request to look for cross-site scripting attacks.
    */
  var fieldToMatch: XssMatchSetXssMatchTupleFieldToMatch
  /**
    * Text transformations used to eliminate unusual formatting that attackers use in web requests in an effort to bypass AWS WAF.
    * If you specify a transformation, AWS WAF performs the transformation on `targetString` before inspecting a request for a match.
    * e.g. `CMD_LINE`, `HTML_ENTITY_DECODE` or `NONE`.
    * See [docs](http://docs.aws.amazon.com/waf/latest/APIReference/API_XssMatchTuple.html#WAF-Type-XssMatchTuple-TextTransformation)
    * for all supported values.
    */
  var textTransformation: String
}

object XssMatchSetXssMatchTuple {
  @scala.inline
  def apply(fieldToMatch: XssMatchSetXssMatchTupleFieldToMatch, textTransformation: String): XssMatchSetXssMatchTuple = {
    val __obj = js.Dynamic.literal(fieldToMatch = fieldToMatch, textTransformation = textTransformation)
  
    __obj.asInstanceOf[XssMatchSetXssMatchTuple]
  }
}

