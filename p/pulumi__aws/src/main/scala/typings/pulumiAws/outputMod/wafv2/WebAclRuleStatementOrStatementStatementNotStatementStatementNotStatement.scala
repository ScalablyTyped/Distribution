package typings.pulumiAws.outputMod.wafv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatement extends StObject {
  
  /**
    * The statement to negate. You can use any statement that can be nested. See Statement above for details.
    */
  var statements: js.Array[
    WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementStatement
  ]
}
object WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatement {
  
  inline def apply(
    statements: js.Array[
      WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementStatement
    ]
  ): WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatement = {
    val __obj = js.Dynamic.literal(statements = statements.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatement]
  }
  
  extension [Self <: WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatement](x: Self) {
    
    inline def setStatements(
      value: js.Array[
          WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementStatement
        ]
    ): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
    
    inline def setStatementsVarargs(value: WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementStatement*): Self = StObject.set(x, "statements", js.Array(value :_*))
  }
}
