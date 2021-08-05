package typings.pulumiAws.inputMod.wafv2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleGroupRuleStatementNotStatementStatementOrStatement extends StObject {
  
  /**
    * The statements to combine with `OR` logic. You can use any statements that can be nested. See Statement above for details.
    */
  var statements: Input[js.Array[Input[RuleGroupRuleStatementNotStatementStatementOrStatementStatement]]]
}
object RuleGroupRuleStatementNotStatementStatementOrStatement {
  
  inline def apply(
    statements: Input[js.Array[Input[RuleGroupRuleStatementNotStatementStatementOrStatementStatement]]]
  ): RuleGroupRuleStatementNotStatementStatementOrStatement = {
    val __obj = js.Dynamic.literal(statements = statements.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroupRuleStatementNotStatementStatementOrStatement]
  }
  
  extension [Self <: RuleGroupRuleStatementNotStatementStatementOrStatement](x: Self) {
    
    inline def setStatements(value: Input[js.Array[Input[RuleGroupRuleStatementNotStatementStatementOrStatementStatement]]]): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
    
    inline def setStatementsVarargs(value: Input[RuleGroupRuleStatementNotStatementStatementOrStatementStatement]*): Self = StObject.set(x, "statements", js.Array(value :_*))
  }
}
