package typings.pulumiAws.inputMod.wafv2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleGroupRuleStatementAndStatementStatementRegexPatternSetReferenceStatement extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Regex Pattern Set that this statement references.
    */
  var arn: Input[String]
  
  /**
    * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
    */
  var fieldToMatch: js.UndefOr[
    Input[
      RuleGroupRuleStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatch
    ]
  ] = js.undefined
  
  /**
    * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
    */
  var textTransformations: Input[
    js.Array[
      Input[
        RuleGroupRuleStatementAndStatementStatementRegexPatternSetReferenceStatementTextTransformation
      ]
    ]
  ]
}
object RuleGroupRuleStatementAndStatementStatementRegexPatternSetReferenceStatement {
  
  inline def apply(
    arn: Input[String],
    textTransformations: Input[
      js.Array[
        Input[
          RuleGroupRuleStatementAndStatementStatementRegexPatternSetReferenceStatementTextTransformation
        ]
      ]
    ]
  ): RuleGroupRuleStatementAndStatementStatementRegexPatternSetReferenceStatement = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], textTransformations = textTransformations.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroupRuleStatementAndStatementStatementRegexPatternSetReferenceStatement]
  }
  
  extension [Self <: RuleGroupRuleStatementAndStatementStatementRegexPatternSetReferenceStatement](x: Self) {
    
    inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setFieldToMatch(
      value: Input[
          RuleGroupRuleStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatch
        ]
    ): Self = StObject.set(x, "fieldToMatch", value.asInstanceOf[js.Any])
    
    inline def setFieldToMatchUndefined: Self = StObject.set(x, "fieldToMatch", js.undefined)
    
    inline def setTextTransformations(
      value: Input[
          js.Array[
            Input[
              RuleGroupRuleStatementAndStatementStatementRegexPatternSetReferenceStatementTextTransformation
            ]
          ]
        ]
    ): Self = StObject.set(x, "textTransformations", value.asInstanceOf[js.Any])
    
    inline def setTextTransformationsVarargs(
      value: (Input[
          RuleGroupRuleStatementAndStatementStatementRegexPatternSetReferenceStatementTextTransformation
        ])*
    ): Self = StObject.set(x, "textTransformations", js.Array(value :_*))
  }
}
