package typings.pulumiAws.outputMod.wafv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatement extends StObject {
  
  /**
    * The statement to negate. You can use any statement that can be nested. See Statement above for details.
    */
  var statements: js.Array[
    WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatement
  ]
}
object WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatement {
  
  inline def apply(
    statements: js.Array[
      WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatement
    ]
  ): WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatement = {
    val __obj = js.Dynamic.literal(statements = statements.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatement]
  }
  
  extension [Self <: WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatement](x: Self) {
    
    inline def setStatements(
      value: js.Array[
          WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatement
        ]
    ): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
    
    inline def setStatementsVarargs(value: WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatement*): Self = StObject.set(x, "statements", js.Array(value :_*))
  }
}
