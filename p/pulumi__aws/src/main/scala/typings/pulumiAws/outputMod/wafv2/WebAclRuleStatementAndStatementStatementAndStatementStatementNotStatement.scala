package typings.pulumiAws.outputMod.wafv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatement extends StObject {
  
  /**
    * The statement to negate. You can use any statement that can be nested. See Statement above for details.
    */
  var statements: js.Array[
    WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatement
  ]
}
object WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatement {
  
  @scala.inline
  def apply(
    statements: js.Array[
      WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatement
    ]
  ): WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatement = {
    val __obj = js.Dynamic.literal(statements = statements.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatement]
  }
  
  @scala.inline
  implicit class WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementMutableBuilder[Self <: WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatements(
      value: js.Array[
          WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatement
        ]
    ): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatementsVarargs(value: WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatement*): Self = StObject.set(x, "statements", js.Array(value :_*))
  }
}
