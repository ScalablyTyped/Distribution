package typings.pulumiAws.outputMod.wafv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleGroupRuleStatementOrStatement extends StObject {
  
  /**
    * The statements to combine with `OR` logic. You can use any statements that can be nested. See Statement above for details.
    */
  var statements: js.Array[RuleGroupRuleStatementOrStatementStatement]
}
object RuleGroupRuleStatementOrStatement {
  
  inline def apply(statements: js.Array[RuleGroupRuleStatementOrStatementStatement]): RuleGroupRuleStatementOrStatement = {
    val __obj = js.Dynamic.literal(statements = statements.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroupRuleStatementOrStatement]
  }
  
  extension [Self <: RuleGroupRuleStatementOrStatement](x: Self) {
    
    inline def setStatements(value: js.Array[RuleGroupRuleStatementOrStatementStatement]): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
    
    inline def setStatementsVarargs(value: RuleGroupRuleStatementOrStatementStatement*): Self = StObject.set(x, "statements", js.Array(value :_*))
  }
}
