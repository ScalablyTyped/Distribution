package typings.pulumiAws.inputMod.waf

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XssMatchSetXssMatchTuple extends StObject {
  
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
  
  inline def apply(fieldToMatch: Input[XssMatchSetXssMatchTupleFieldToMatch], textTransformation: Input[String]): XssMatchSetXssMatchTuple = {
    val __obj = js.Dynamic.literal(fieldToMatch = fieldToMatch.asInstanceOf[js.Any], textTransformation = textTransformation.asInstanceOf[js.Any])
    __obj.asInstanceOf[XssMatchSetXssMatchTuple]
  }
  
  extension [Self <: XssMatchSetXssMatchTuple](x: Self) {
    
    inline def setFieldToMatch(value: Input[XssMatchSetXssMatchTupleFieldToMatch]): Self = StObject.set(x, "fieldToMatch", value.asInstanceOf[js.Any])
    
    inline def setTextTransformation(value: Input[String]): Self = StObject.set(x, "textTransformation", value.asInstanceOf[js.Any])
  }
}
