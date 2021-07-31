package typings.pulumiAws.outputMod.wafv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatement extends StObject {
  
  /**
    * The statement to negate. You can use any statement that can be nested. See Statement above for details.
    */
  var statements: js.Array[
    WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatement
  ]
}
object WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatement {
  
  @scala.inline
  def apply(
    statements: js.Array[
      WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatement
    ]
  ): WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatement = {
    val __obj = js.Dynamic.literal(statements = statements.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatement]
  }
  
  @scala.inline
  implicit class WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementMutableBuilder[Self <: WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatements(
      value: js.Array[
          WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatement
        ]
    ): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatementsVarargs(value: WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatement*): Self = StObject.set(x, "statements", js.Array(value :_*))
  }
}
