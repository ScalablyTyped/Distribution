package typings.pulumiAws.outputMod.wafv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatement extends StObject {
  
  /**
    * The statement to negate. You can use any statement that can be nested. See Statement above for details.
    */
  var statements: js.Array[
    WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatement
  ]
}
object WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatement {
  
  inline def apply(
    statements: js.Array[
      WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatement
    ]
  ): WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatement = {
    val __obj = js.Dynamic.literal(statements = statements.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatement]
  }
  
  extension [Self <: WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatement](x: Self) {
    
    inline def setStatements(
      value: js.Array[
          WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatement
        ]
    ): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
    
    inline def setStatementsVarargs(value: WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatement*): Self = StObject.set(x, "statements", js.Array(value :_*))
  }
}
