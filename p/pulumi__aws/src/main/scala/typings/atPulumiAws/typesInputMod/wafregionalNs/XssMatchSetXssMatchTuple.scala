package typings.atPulumiAws.typesInputMod.wafregionalNs

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
    * Which text transformation, if any, to perform on the web request before inspecting the request for cross-site scripting attacks.
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

