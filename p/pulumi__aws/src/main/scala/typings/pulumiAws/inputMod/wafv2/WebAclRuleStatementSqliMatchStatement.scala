package typings.pulumiAws.inputMod.wafv2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebAclRuleStatementSqliMatchStatement extends StObject {
  
  /**
    * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
    */
  var fieldToMatch: js.UndefOr[Input[WebAclRuleStatementSqliMatchStatementFieldToMatch]] = js.undefined
  
  /**
    * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
    */
  var textTransformations: Input[js.Array[Input[WebAclRuleStatementSqliMatchStatementTextTransformation]]]
}
object WebAclRuleStatementSqliMatchStatement {
  
  inline def apply(
    textTransformations: Input[js.Array[Input[WebAclRuleStatementSqliMatchStatementTextTransformation]]]
  ): WebAclRuleStatementSqliMatchStatement = {
    val __obj = js.Dynamic.literal(textTransformations = textTransformations.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclRuleStatementSqliMatchStatement]
  }
  
  extension [Self <: WebAclRuleStatementSqliMatchStatement](x: Self) {
    
    inline def setFieldToMatch(value: Input[WebAclRuleStatementSqliMatchStatementFieldToMatch]): Self = StObject.set(x, "fieldToMatch", value.asInstanceOf[js.Any])
    
    inline def setFieldToMatchUndefined: Self = StObject.set(x, "fieldToMatch", js.undefined)
    
    inline def setTextTransformations(value: Input[js.Array[Input[WebAclRuleStatementSqliMatchStatementTextTransformation]]]): Self = StObject.set(x, "textTransformations", value.asInstanceOf[js.Any])
    
    inline def setTextTransformationsVarargs(value: Input[WebAclRuleStatementSqliMatchStatementTextTransformation]*): Self = StObject.set(x, "textTransformations", js.Array(value :_*))
  }
}
