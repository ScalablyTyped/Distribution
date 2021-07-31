package typings.pulumiAws.outputMod.wafv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleGroupRuleStatementAndStatementStatementAndStatement extends StObject {
  
  /**
    * The statements to combine with `AND` logic. You can use any statements that can be nested. See Statement above for details.
    */
  var statements: js.Array[RuleGroupRuleStatementAndStatementStatementAndStatementStatement]
}
object RuleGroupRuleStatementAndStatementStatementAndStatement {
  
  @scala.inline
  def apply(statements: js.Array[RuleGroupRuleStatementAndStatementStatementAndStatementStatement]): RuleGroupRuleStatementAndStatementStatementAndStatement = {
    val __obj = js.Dynamic.literal(statements = statements.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroupRuleStatementAndStatementStatementAndStatement]
  }
  
  @scala.inline
  implicit class RuleGroupRuleStatementAndStatementStatementAndStatementMutableBuilder[Self <: RuleGroupRuleStatementAndStatementStatementAndStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatements(value: js.Array[RuleGroupRuleStatementAndStatementStatementAndStatementStatement]): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatementsVarargs(value: RuleGroupRuleStatementAndStatementStatementAndStatementStatement*): Self = StObject.set(x, "statements", js.Array(value :_*))
  }
}
