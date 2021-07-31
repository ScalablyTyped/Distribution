package typings.pulumiAws.outputMod.wafv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatement extends StObject {
  
  /**
    * The statements to combine with `AND` logic. You can use any statements that can be nested. See Statement above for details.
    */
  var statements: js.Array[WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatement]
}
object WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatement {
  
  @scala.inline
  def apply(statements: js.Array[WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatement]): WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatement = {
    val __obj = js.Dynamic.literal(statements = statements.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatement]
  }
  
  @scala.inline
  implicit class WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementMutableBuilder[Self <: WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatements(value: js.Array[WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatement]): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatementsVarargs(value: WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatement*): Self = StObject.set(x, "statements", js.Array(value :_*))
  }
}
