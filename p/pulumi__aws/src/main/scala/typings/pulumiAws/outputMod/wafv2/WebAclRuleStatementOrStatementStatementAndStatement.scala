package typings.pulumiAws.outputMod.wafv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebAclRuleStatementOrStatementStatementAndStatement extends StObject {
  
  /**
    * The statements to combine with `AND` logic. You can use any statements that can be nested. See Statement above for details.
    */
  var statements: js.Array[WebAclRuleStatementOrStatementStatementAndStatementStatement]
}
object WebAclRuleStatementOrStatementStatementAndStatement {
  
  @scala.inline
  def apply(statements: js.Array[WebAclRuleStatementOrStatementStatementAndStatementStatement]): WebAclRuleStatementOrStatementStatementAndStatement = {
    val __obj = js.Dynamic.literal(statements = statements.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclRuleStatementOrStatementStatementAndStatement]
  }
  
  @scala.inline
  implicit class WebAclRuleStatementOrStatementStatementAndStatementMutableBuilder[Self <: WebAclRuleStatementOrStatementStatementAndStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatements(value: js.Array[WebAclRuleStatementOrStatementStatementAndStatementStatement]): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatementsVarargs(value: WebAclRuleStatementOrStatementStatementAndStatementStatement*): Self = StObject.set(x, "statements", js.Array(value :_*))
  }
}
