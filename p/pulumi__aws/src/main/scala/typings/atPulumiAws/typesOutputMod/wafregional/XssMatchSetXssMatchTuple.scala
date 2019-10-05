package typings.atPulumiAws.typesOutputMod.wafregional

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XssMatchSetXssMatchTuple extends js.Object {
  /**
    * Specifies where in a web request to look for cross-site scripting attacks.
    */
  var fieldToMatch: XssMatchSetXssMatchTupleFieldToMatch
  /**
    * Which text transformation, if any, to perform on the web request before inspecting the request for cross-site scripting attacks.
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

