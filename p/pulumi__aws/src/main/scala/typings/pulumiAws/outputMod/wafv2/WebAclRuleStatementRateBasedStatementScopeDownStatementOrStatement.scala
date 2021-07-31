package typings.pulumiAws.outputMod.wafv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatement extends StObject {
  
  /**
    * The statements to combine with `OR` logic. You can use any statements that can be nested. See Statement above for details.
    */
  var statements: js.Array[WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatement]
}
object WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatement {
  
  @scala.inline
  def apply(statements: js.Array[WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatement]): WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatement = {
    val __obj = js.Dynamic.literal(statements = statements.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatement]
  }
  
  @scala.inline
  implicit class WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementMutableBuilder[Self <: WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatements(value: js.Array[WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatement]): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatementsVarargs(value: WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatement*): Self = StObject.set(x, "statements", js.Array(value :_*))
  }
}
