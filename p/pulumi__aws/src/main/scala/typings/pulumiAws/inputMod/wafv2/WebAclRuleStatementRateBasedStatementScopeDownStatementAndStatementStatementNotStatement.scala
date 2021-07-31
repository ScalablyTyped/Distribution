package typings.pulumiAws.inputMod.wafv2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatement extends StObject {
  
  /**
    * The statement to negate. You can use any statement that can be nested. See Statement above for details.
    */
  var statements: Input[
    js.Array[
      Input[
        WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementStatement
      ]
    ]
  ]
}
object WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatement {
  
  @scala.inline
  def apply(
    statements: Input[
      js.Array[
        Input[
          WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementStatement
        ]
      ]
    ]
  ): WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatement = {
    val __obj = js.Dynamic.literal(statements = statements.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatement]
  }
  
  @scala.inline
  implicit class WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementMutableBuilder[Self <: WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatements(
      value: Input[
          js.Array[
            Input[
              WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementStatement
            ]
          ]
        ]
    ): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatementsVarargs(
      value: (Input[
          WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementStatement
        ])*
    ): Self = StObject.set(x, "statements", js.Array(value :_*))
  }
}
