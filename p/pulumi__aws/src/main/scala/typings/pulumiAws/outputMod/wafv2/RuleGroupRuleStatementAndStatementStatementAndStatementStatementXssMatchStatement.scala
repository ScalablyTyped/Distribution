package typings.pulumiAws.outputMod.wafv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleGroupRuleStatementAndStatementStatementAndStatementStatementXssMatchStatement extends StObject {
  
  /**
    * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
    */
  var fieldToMatch: js.UndefOr[
    RuleGroupRuleStatementAndStatementStatementAndStatementStatementXssMatchStatementFieldToMatch
  ] = js.undefined
  
  /**
    * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
    */
  var textTransformations: js.Array[
    RuleGroupRuleStatementAndStatementStatementAndStatementStatementXssMatchStatementTextTransformation
  ]
}
object RuleGroupRuleStatementAndStatementStatementAndStatementStatementXssMatchStatement {
  
  inline def apply(
    textTransformations: js.Array[
      RuleGroupRuleStatementAndStatementStatementAndStatementStatementXssMatchStatementTextTransformation
    ]
  ): RuleGroupRuleStatementAndStatementStatementAndStatementStatementXssMatchStatement = {
    val __obj = js.Dynamic.literal(textTransformations = textTransformations.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroupRuleStatementAndStatementStatementAndStatementStatementXssMatchStatement]
  }
  
  extension [Self <: RuleGroupRuleStatementAndStatementStatementAndStatementStatementXssMatchStatement](x: Self) {
    
    inline def setFieldToMatch(
      value: RuleGroupRuleStatementAndStatementStatementAndStatementStatementXssMatchStatementFieldToMatch
    ): Self = StObject.set(x, "fieldToMatch", value.asInstanceOf[js.Any])
    
    inline def setFieldToMatchUndefined: Self = StObject.set(x, "fieldToMatch", js.undefined)
    
    inline def setTextTransformations(
      value: js.Array[
          RuleGroupRuleStatementAndStatementStatementAndStatementStatementXssMatchStatementTextTransformation
        ]
    ): Self = StObject.set(x, "textTransformations", value.asInstanceOf[js.Any])
    
    inline def setTextTransformationsVarargs(
      value: RuleGroupRuleStatementAndStatementStatementAndStatementStatementXssMatchStatementTextTransformation*
    ): Self = StObject.set(x, "textTransformations", js.Array(value :_*))
  }
}
