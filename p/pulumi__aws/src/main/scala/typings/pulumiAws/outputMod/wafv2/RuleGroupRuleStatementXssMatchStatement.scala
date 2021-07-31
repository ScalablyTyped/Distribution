package typings.pulumiAws.outputMod.wafv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleGroupRuleStatementXssMatchStatement extends StObject {
  
  /**
    * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
    */
  var fieldToMatch: js.UndefOr[RuleGroupRuleStatementXssMatchStatementFieldToMatch] = js.undefined
  
  /**
    * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
    */
  var textTransformations: js.Array[RuleGroupRuleStatementXssMatchStatementTextTransformation]
}
object RuleGroupRuleStatementXssMatchStatement {
  
  @scala.inline
  def apply(textTransformations: js.Array[RuleGroupRuleStatementXssMatchStatementTextTransformation]): RuleGroupRuleStatementXssMatchStatement = {
    val __obj = js.Dynamic.literal(textTransformations = textTransformations.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroupRuleStatementXssMatchStatement]
  }
  
  @scala.inline
  implicit class RuleGroupRuleStatementXssMatchStatementMutableBuilder[Self <: RuleGroupRuleStatementXssMatchStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFieldToMatch(value: RuleGroupRuleStatementXssMatchStatementFieldToMatch): Self = StObject.set(x, "fieldToMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldToMatchUndefined: Self = StObject.set(x, "fieldToMatch", js.undefined)
    
    @scala.inline
    def setTextTransformations(value: js.Array[RuleGroupRuleStatementXssMatchStatementTextTransformation]): Self = StObject.set(x, "textTransformations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextTransformationsVarargs(value: RuleGroupRuleStatementXssMatchStatementTextTransformation*): Self = StObject.set(x, "textTransformations", js.Array(value :_*))
  }
}
