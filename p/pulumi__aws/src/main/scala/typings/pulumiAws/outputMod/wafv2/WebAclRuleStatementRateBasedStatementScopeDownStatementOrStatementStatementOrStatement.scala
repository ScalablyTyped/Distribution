package typings.pulumiAws.outputMod.wafv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatement extends StObject {
  
  /**
    * The statements to combine with `OR` logic. You can use any statements that can be nested. See Statement above for details.
    */
  var statements: js.Array[
    WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatement
  ]
}
object WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatement {
  
  @scala.inline
  def apply(
    statements: js.Array[
      WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatement
    ]
  ): WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatement = {
    val __obj = js.Dynamic.literal(statements = statements.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatement]
  }
  
  @scala.inline
  implicit class WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementMutableBuilder[Self <: WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatements(
      value: js.Array[
          WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatement
        ]
    ): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatementsVarargs(
      value: WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatement*
    ): Self = StObject.set(x, "statements", js.Array(value :_*))
  }
}
