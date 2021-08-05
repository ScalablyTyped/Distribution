package typings.pulumiAws.inputMod.wafv2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleGroupRuleStatementAndStatementStatementAndStatement extends StObject {
  
  /**
    * The statements to combine with `AND` logic. You can use any statements that can be nested. See Statement above for details.
    */
  var statements: Input[
    js.Array[Input[RuleGroupRuleStatementAndStatementStatementAndStatementStatement]]
  ]
}
object RuleGroupRuleStatementAndStatementStatementAndStatement {
  
  inline def apply(
    statements: Input[
      js.Array[Input[RuleGroupRuleStatementAndStatementStatementAndStatementStatement]]
    ]
  ): RuleGroupRuleStatementAndStatementStatementAndStatement = {
    val __obj = js.Dynamic.literal(statements = statements.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroupRuleStatementAndStatementStatementAndStatement]
  }
  
  extension [Self <: RuleGroupRuleStatementAndStatementStatementAndStatement](x: Self) {
    
    inline def setStatements(
      value: Input[
          js.Array[Input[RuleGroupRuleStatementAndStatementStatementAndStatementStatement]]
        ]
    ): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
    
    inline def setStatementsVarargs(value: Input[RuleGroupRuleStatementAndStatementStatementAndStatementStatement]*): Self = StObject.set(x, "statements", js.Array(value :_*))
  }
}
