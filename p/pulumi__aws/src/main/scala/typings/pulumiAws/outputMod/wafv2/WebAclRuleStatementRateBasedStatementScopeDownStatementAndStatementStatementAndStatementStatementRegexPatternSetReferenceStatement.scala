package typings.pulumiAws.outputMod.wafv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatement extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Regex Pattern Set that this statement references.
    */
  var arn: String
  
  /**
    * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
    */
  var fieldToMatch: js.UndefOr[
    WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatch
  ] = js.undefined
  
  /**
    * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
    */
  var textTransformations: js.Array[
    WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementTextTransformation
  ]
}
object WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatement {
  
  inline def apply(
    arn: String,
    textTransformations: js.Array[
      WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementTextTransformation
    ]
  ): WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatement = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], textTransformations = textTransformations.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatement]
  }
  
  extension [Self <: WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatement](x: Self) {
    
    inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setFieldToMatch(
      value: WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatch
    ): Self = StObject.set(x, "fieldToMatch", value.asInstanceOf[js.Any])
    
    inline def setFieldToMatchUndefined: Self = StObject.set(x, "fieldToMatch", js.undefined)
    
    inline def setTextTransformations(
      value: js.Array[
          WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementTextTransformation
        ]
    ): Self = StObject.set(x, "textTransformations", value.asInstanceOf[js.Any])
    
    inline def setTextTransformationsVarargs(
      value: WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementTextTransformation*
    ): Self = StObject.set(x, "textTransformations", js.Array(value :_*))
  }
}
