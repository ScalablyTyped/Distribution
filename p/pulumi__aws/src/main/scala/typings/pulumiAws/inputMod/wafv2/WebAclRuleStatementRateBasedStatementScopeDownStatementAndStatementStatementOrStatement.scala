package typings.pulumiAws.inputMod.wafv2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementOrStatement extends StObject {
  
  /**
    * The statements to combine with `OR` logic. You can use any statements that can be nested. See Statement above for details.
    */
  var statements: Input[
    js.Array[
      Input[
        WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementOrStatementStatement
      ]
    ]
  ]
}
object WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementOrStatement {
  
  @scala.inline
  def apply(
    statements: Input[
      js.Array[
        Input[
          WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementOrStatementStatement
        ]
      ]
    ]
  ): WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementOrStatement = {
    val __obj = js.Dynamic.literal(statements = statements.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementOrStatement]
  }
  
  @scala.inline
  implicit class WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementOrStatementMutableBuilder[Self <: WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementOrStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatements(
      value: Input[
          js.Array[
            Input[
              WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementOrStatementStatement
            ]
          ]
        ]
    ): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatementsVarargs(
      value: (Input[
          WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementOrStatementStatement
        ])*
    ): Self = StObject.set(x, "statements", js.Array(value :_*))
  }
}
