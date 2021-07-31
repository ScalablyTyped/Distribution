package typings.pulumiAws.inputMod.wafv2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleGroupRuleStatementOrStatement extends StObject {
  
  /**
    * The statements to combine with `OR` logic. You can use any statements that can be nested. See Statement above for details.
    */
  var statements: Input[js.Array[Input[RuleGroupRuleStatementOrStatementStatement]]]
}
object RuleGroupRuleStatementOrStatement {
  
  @scala.inline
  def apply(statements: Input[js.Array[Input[RuleGroupRuleStatementOrStatementStatement]]]): RuleGroupRuleStatementOrStatement = {
    val __obj = js.Dynamic.literal(statements = statements.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroupRuleStatementOrStatement]
  }
  
  @scala.inline
  implicit class RuleGroupRuleStatementOrStatementMutableBuilder[Self <: RuleGroupRuleStatementOrStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatements(value: Input[js.Array[Input[RuleGroupRuleStatementOrStatementStatement]]]): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatementsVarargs(value: Input[RuleGroupRuleStatementOrStatementStatement]*): Self = StObject.set(x, "statements", js.Array(value :_*))
  }
}
