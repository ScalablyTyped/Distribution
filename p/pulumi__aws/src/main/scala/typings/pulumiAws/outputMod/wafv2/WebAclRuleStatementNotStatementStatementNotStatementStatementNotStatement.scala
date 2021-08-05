package typings.pulumiAws.outputMod.wafv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebAclRuleStatementNotStatementStatementNotStatementStatementNotStatement extends StObject {
  
  /**
    * The statement to negate. You can use any statement that can be nested. See Statement above for details.
    */
  var statements: js.Array[
    WebAclRuleStatementNotStatementStatementNotStatementStatementNotStatementStatement
  ]
}
object WebAclRuleStatementNotStatementStatementNotStatementStatementNotStatement {
  
  inline def apply(
    statements: js.Array[
      WebAclRuleStatementNotStatementStatementNotStatementStatementNotStatementStatement
    ]
  ): WebAclRuleStatementNotStatementStatementNotStatementStatementNotStatement = {
    val __obj = js.Dynamic.literal(statements = statements.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclRuleStatementNotStatementStatementNotStatementStatementNotStatement]
  }
  
  extension [Self <: WebAclRuleStatementNotStatementStatementNotStatementStatementNotStatement](x: Self) {
    
    inline def setStatements(
      value: js.Array[
          WebAclRuleStatementNotStatementStatementNotStatementStatementNotStatementStatement
        ]
    ): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
    
    inline def setStatementsVarargs(value: WebAclRuleStatementNotStatementStatementNotStatementStatementNotStatementStatement*): Self = StObject.set(x, "statements", js.Array(value :_*))
  }
}
