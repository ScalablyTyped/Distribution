package typings.pulumiAws.outputMod.wafv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementOrStatement extends StObject {
  
  /**
    * The statements to combine with `OR` logic. You can use any statements that can be nested. See Statement above for details.
    */
  var statements: js.Array[
    WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementOrStatementStatement
  ]
}
object WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementOrStatement {
  
  @scala.inline
  def apply(
    statements: js.Array[
      WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementOrStatementStatement
    ]
  ): WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementOrStatement = {
    val __obj = js.Dynamic.literal(statements = statements.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementOrStatement]
  }
  
  @scala.inline
  implicit class WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementOrStatementMutableBuilder[Self <: WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementOrStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatements(
      value: js.Array[
          WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementOrStatementStatement
        ]
    ): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatementsVarargs(
      value: WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementOrStatementStatement*
    ): Self = StObject.set(x, "statements", js.Array(value :_*))
  }
}
