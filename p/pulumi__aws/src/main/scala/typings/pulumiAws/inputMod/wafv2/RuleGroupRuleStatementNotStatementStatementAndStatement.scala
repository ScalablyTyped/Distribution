package typings.pulumiAws.inputMod.wafv2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleGroupRuleStatementNotStatementStatementAndStatement extends StObject {
  
  /**
    * The statements to combine with `AND` logic. You can use any statements that can be nested. See Statement above for details.
    */
  var statements: Input[
    js.Array[Input[RuleGroupRuleStatementNotStatementStatementAndStatementStatement]]
  ]
}
object RuleGroupRuleStatementNotStatementStatementAndStatement {
  
  inline def apply(
    statements: Input[
      js.Array[Input[RuleGroupRuleStatementNotStatementStatementAndStatementStatement]]
    ]
  ): RuleGroupRuleStatementNotStatementStatementAndStatement = {
    val __obj = js.Dynamic.literal(statements = statements.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroupRuleStatementNotStatementStatementAndStatement]
  }
  
  extension [Self <: RuleGroupRuleStatementNotStatementStatementAndStatement](x: Self) {
    
    inline def setStatements(
      value: Input[
          js.Array[Input[RuleGroupRuleStatementNotStatementStatementAndStatementStatement]]
        ]
    ): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
    
    inline def setStatementsVarargs(value: Input[RuleGroupRuleStatementNotStatementStatementAndStatementStatement]*): Self = StObject.set(x, "statements", js.Array(value :_*))
  }
}
