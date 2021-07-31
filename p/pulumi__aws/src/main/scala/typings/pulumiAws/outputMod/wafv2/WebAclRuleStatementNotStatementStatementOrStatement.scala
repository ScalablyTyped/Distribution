package typings.pulumiAws.outputMod.wafv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebAclRuleStatementNotStatementStatementOrStatement extends StObject {
  
  /**
    * The statements to combine with `OR` logic. You can use any statements that can be nested. See Statement above for details.
    */
  var statements: js.Array[WebAclRuleStatementNotStatementStatementOrStatementStatement]
}
object WebAclRuleStatementNotStatementStatementOrStatement {
  
  @scala.inline
  def apply(statements: js.Array[WebAclRuleStatementNotStatementStatementOrStatementStatement]): WebAclRuleStatementNotStatementStatementOrStatement = {
    val __obj = js.Dynamic.literal(statements = statements.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclRuleStatementNotStatementStatementOrStatement]
  }
  
  @scala.inline
  implicit class WebAclRuleStatementNotStatementStatementOrStatementMutableBuilder[Self <: WebAclRuleStatementNotStatementStatementOrStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatements(value: js.Array[WebAclRuleStatementNotStatementStatementOrStatementStatement]): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatementsVarargs(value: WebAclRuleStatementNotStatementStatementOrStatementStatement*): Self = StObject.set(x, "statements", js.Array(value :_*))
  }
}
