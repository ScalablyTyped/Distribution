package typings.pulumiAws.outputMod.wafv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebAclRuleStatementOrStatementStatementSqliMatchStatement extends StObject {
  
  /**
    * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
    */
  var fieldToMatch: js.UndefOr[WebAclRuleStatementOrStatementStatementSqliMatchStatementFieldToMatch] = js.undefined
  
  /**
    * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
    */
  var textTransformations: js.Array[WebAclRuleStatementOrStatementStatementSqliMatchStatementTextTransformation]
}
object WebAclRuleStatementOrStatementStatementSqliMatchStatement {
  
  inline def apply(
    textTransformations: js.Array[WebAclRuleStatementOrStatementStatementSqliMatchStatementTextTransformation]
  ): WebAclRuleStatementOrStatementStatementSqliMatchStatement = {
    val __obj = js.Dynamic.literal(textTransformations = textTransformations.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclRuleStatementOrStatementStatementSqliMatchStatement]
  }
  
  extension [Self <: WebAclRuleStatementOrStatementStatementSqliMatchStatement](x: Self) {
    
    inline def setFieldToMatch(value: WebAclRuleStatementOrStatementStatementSqliMatchStatementFieldToMatch): Self = StObject.set(x, "fieldToMatch", value.asInstanceOf[js.Any])
    
    inline def setFieldToMatchUndefined: Self = StObject.set(x, "fieldToMatch", js.undefined)
    
    inline def setTextTransformations(value: js.Array[WebAclRuleStatementOrStatementStatementSqliMatchStatementTextTransformation]): Self = StObject.set(x, "textTransformations", value.asInstanceOf[js.Any])
    
    inline def setTextTransformationsVarargs(value: WebAclRuleStatementOrStatementStatementSqliMatchStatementTextTransformation*): Self = StObject.set(x, "textTransformations", js.Array(value :_*))
  }
}
