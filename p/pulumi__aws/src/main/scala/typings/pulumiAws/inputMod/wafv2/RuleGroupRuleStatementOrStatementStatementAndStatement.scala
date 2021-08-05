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
  
  inline def apply(
    statements: Input[js.Array[Input[RuleGroupRuleStatementOrStatementStatementAndStatementStatement]]]
  ): RuleGroupRuleStatementOrStatementStatementAndStatement = {
    val __obj = js.Dynamic.literal(statements = statements.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroupRuleStatementOrStatementStatementAndStatement]
  }
  
  extension [Self <: RuleGroupRuleStatementOrStatementStatementAndStatement](x: Self) {
    
    inline def setStatements(value: Input[js.Array[Input[RuleGroupRuleStatementOrStatementStatementAndStatementStatement]]]): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
    
    inline def setStatementsVarargs(value: Input[RuleGroupRuleStatementOrStatementStatementAndStatementStatement]*): Self = StObject.set(x, "statements", js.Array(value :_*))
  }
}
