package typings.pulumiAws.outputMod.wafv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleGroupRuleStatementNotStatementStatementAndStatement extends StObject {
  
  /**
    * The statements to combine with `AND` logic. You can use any statements that can be nested. See Statement above for details.
    */
  var statements: js.Array[RuleGroupRuleStatementNotStatementStatementAndStatementStatement]
}
object RuleGroupRuleStatementNotStatementStatementAndStatement {
  
  inline def apply(statements: js.Array[RuleGroupRuleStatementNotStatementStatementAndStatementStatement]): RuleGroupRuleStatementNotStatementStatementAndStatement = {
    val __obj = js.Dynamic.literal(statements = statements.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroupRuleStatementNotStatementStatementAndStatement]
  }
  
  extension [Self <: RuleGroupRuleStatementNotStatementStatementAndStatement](x: Self) {
    
    inline def setStatements(value: js.Array[RuleGroupRuleStatementNotStatementStatementAndStatementStatement]): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
    
    inline def setStatementsVarargs(value: RuleGroupRuleStatementNotStatementStatementAndStatementStatement*): Self = StObject.set(x, "statements", js.Array(value :_*))
  }
}
