package typings.pulumiAws.outputMod.wafv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatement extends StObject {
  
  /**
    * The statements to combine with `OR` logic. You can use any statements that can be nested. See Statement above for details.
    */
  var statements: js.Array[
    WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementStatement
  ]
}
object WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatement {
  
  inline def apply(
    statements: js.Array[
      WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementStatement
    ]
  ): WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatement = {
    val __obj = js.Dynamic.literal(statements = statements.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatement]
  }
  
  extension [Self <: WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatement](x: Self) {
    
    inline def setStatements(
      value: js.Array[
          WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementStatement
        ]
    ): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
    
    inline def setStatementsVarargs(value: WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementStatement*): Self = StObject.set(x, "statements", js.Array(value :_*))
  }
}
