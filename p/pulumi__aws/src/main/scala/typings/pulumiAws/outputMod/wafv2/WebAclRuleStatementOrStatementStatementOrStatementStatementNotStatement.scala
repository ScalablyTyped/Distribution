package typings.pulumiAws.outputMod.wafv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatement extends StObject {
  
  /**
    * The statement to negate. You can use any statement that can be nested. See Statement above for details.
    */
  var statements: js.Array[WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatement]
}
object WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatement {
  
  @scala.inline
  def apply(
    statements: js.Array[WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatement]
  ): WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatement = {
    val __obj = js.Dynamic.literal(statements = statements.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatement]
  }
  
  @scala.inline
  implicit class WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementMutableBuilder[Self <: WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatements(value: js.Array[WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatement]): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatementsVarargs(value: WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatement*): Self = StObject.set(x, "statements", js.Array(value :_*))
  }
}
