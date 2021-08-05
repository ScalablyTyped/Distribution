package typings.pulumiAws.outputMod.wafv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatement extends StObject {
  
  /**
    * The statements to combine with `AND` logic. You can use any statements that can be nested. See Statement above for details.
    */
  var statements: js.Array[
    WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatement
  ]
}
object WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatement {
  
  inline def apply(
    statements: js.Array[
      WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatement
    ]
  ): WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatement = {
    val __obj = js.Dynamic.literal(statements = statements.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatement]
  }
  
  extension [Self <: WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatement](x: Self) {
    
    inline def setStatements(
      value: js.Array[
          WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatement
        ]
    ): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
    
    inline def setStatementsVarargs(
      value: WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatement*
    ): Self = StObject.set(x, "statements", js.Array(value :_*))
  }
}
