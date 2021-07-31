package typings.pulumiAws.outputMod.wafv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleGroupRuleStatementAndStatementStatementNotStatement extends StObject {
  
  /**
    * The statement to negate. You can use any statement that can be nested. See Statement above for details.
    */
  var statements: js.Array[RuleGroupRuleStatementAndStatementStatementNotStatementStatement]
}
object RuleGroupRuleStatementAndStatementStatementNotStatement {
  
  @scala.inline
  def apply(statements: js.Array[RuleGroupRuleStatementAndStatementStatementNotStatementStatement]): RuleGroupRuleStatementAndStatementStatementNotStatement = {
    val __obj = js.Dynamic.literal(statements = statements.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroupRuleStatementAndStatementStatementNotStatement]
  }
  
  @scala.inline
  implicit class RuleGroupRuleStatementAndStatementStatementNotStatementMutableBuilder[Self <: RuleGroupRuleStatementAndStatementStatementNotStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatements(value: js.Array[RuleGroupRuleStatementAndStatementStatementNotStatementStatement]): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatementsVarargs(value: RuleGroupRuleStatementAndStatementStatementNotStatementStatement*): Self = StObject.set(x, "statements", js.Array(value :_*))
  }
}
