package typings.pulumiAws.inputMod.wafv2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatement extends StObject {
  
  /**
    * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
    */
  var fieldToMatch: js.UndefOr[
    Input[
      RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementFieldToMatch
    ]
  ] = js.undefined
  
  /**
    * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
    */
  var textTransformations: Input[
    js.Array[
      Input[
        RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementTextTransformation
      ]
    ]
  ]
}
object RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatement {
  
  @scala.inline
  def apply(
    textTransformations: Input[
      js.Array[
        Input[
          RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementTextTransformation
        ]
      ]
    ]
  ): RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatement = {
    val __obj = js.Dynamic.literal(textTransformations = textTransformations.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatement]
  }
  
  @scala.inline
  implicit class RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementMutableBuilder[Self <: RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFieldToMatch(
      value: Input[
          RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementFieldToMatch
        ]
    ): Self = StObject.set(x, "fieldToMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldToMatchUndefined: Self = StObject.set(x, "fieldToMatch", js.undefined)
    
    @scala.inline
    def setTextTransformations(
      value: Input[
          js.Array[
            Input[
              RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementTextTransformation
            ]
          ]
        ]
    ): Self = StObject.set(x, "textTransformations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextTransformationsVarargs(
      value: (Input[
          RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementTextTransformation
        ])*
    ): Self = StObject.set(x, "textTransformations", js.Array(value :_*))
  }
}
