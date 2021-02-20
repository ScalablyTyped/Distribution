package typings.pulumiAws.outputMod.wafv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatement extends StObject {
  
  /**
    * The statement to negate. You can use any statement that can be nested. See Statement above for details.
    */
  var statements: js.Array[
    WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatement
  ] = js.native
}
object WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatement {
  
  @scala.inline
  def apply(
    statements: js.Array[
      WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatement
    ]
  ): WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatement = {
    val __obj = js.Dynamic.literal(statements = statements.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatement]
  }
  
  @scala.inline
  implicit class WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementMutableBuilder[Self <: WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatements(
      value: js.Array[
          WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatement
        ]
    ): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatementsVarargs(
      value: WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatement*
    ): Self = StObject.set(x, "statements", js.Array(value :_*))
  }
}
