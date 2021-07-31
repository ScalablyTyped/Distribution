package typings.pulumiAws.inputMod.wafv2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleGroupRuleStatementOrStatementStatementAndStatement extends StObject {
  
  /**
    * The statements to combine with `AND` logic. You can use any statements that can be nested. See Statement above for details.
    */
  var statements: Input[js.Array[Input[RuleGroupRuleStatementOrStatementStatementAndStatementStatement]]]
}
object RuleGroupRuleStatementOrStatementStatementAndStatement {
  
  @scala.inline
  def apply(
    statements: Input[js.Array[Input[RuleGroupRuleStatementOrStatementStatementAndStatementStatement]]]
  ): RuleGroupRuleStatementOrStatementStatementAndStatement = {
    val __obj = js.Dynamic.literal(statements = statements.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroupRuleStatementOrStatementStatementAndStatement]
  }
  
  @scala.inline
  implicit class RuleGroupRuleStatementOrStatementStatementAndStatementMutableBuilder[Self <: RuleGroupRuleStatementOrStatementStatementAndStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatements(value: Input[js.Array[Input[RuleGroupRuleStatementOrStatementStatementAndStatementStatement]]]): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatementsVarargs(value: Input[RuleGroupRuleStatementOrStatementStatementAndStatementStatement]*): Self = StObject.set(x, "statements", js.Array(value :_*))
  }
}
