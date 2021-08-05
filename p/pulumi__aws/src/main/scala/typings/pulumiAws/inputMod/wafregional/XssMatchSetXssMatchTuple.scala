package typings.pulumiAws.inputMod.wafregional

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
    * Which text transformation, if any, to perform on the web request before inspecting the request for cross-site scripting attacks.
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
