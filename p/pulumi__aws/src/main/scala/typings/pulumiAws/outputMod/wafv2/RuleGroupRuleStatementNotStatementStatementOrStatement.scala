package typings.pulumiAws.outputMod.wafv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleGroupRuleStatementNotStatementStatementOrStatement extends StObject {
  
  /**
    * The statements to combine with `OR` logic. You can use any statements that can be nested. See Statement above for details.
    */
  var statements: js.Array[RuleGroupRuleStatementNotStatementStatementOrStatementStatement]
}
object RuleGroupRuleStatementNotStatementStatementOrStatement {
  
  inline def apply(statements: js.Array[RuleGroupRuleStatementNotStatementStatementOrStatementStatement]): RuleGroupRuleStatementNotStatementStatementOrStatement = {
    val __obj = js.Dynamic.literal(statements = statements.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroupRuleStatementNotStatementStatementOrStatement]
  }
  
  extension [Self <: RuleGroupRuleStatementNotStatementStatementOrStatement](x: Self) {
    
    inline def setStatements(value: js.Array[RuleGroupRuleStatementNotStatementStatementOrStatementStatement]): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
    
    inline def setStatementsVarargs(value: RuleGroupRuleStatementNotStatementStatementOrStatementStatement*): Self = StObject.set(x, "statements", js.Array(value :_*))
  }
}
