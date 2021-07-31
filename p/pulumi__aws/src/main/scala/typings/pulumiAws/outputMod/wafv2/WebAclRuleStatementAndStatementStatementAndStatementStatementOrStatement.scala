package typings.pulumiAws.outputMod.wafv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatement extends StObject {
  
  /**
    * The statements to combine with `OR` logic. You can use any statements that can be nested. See Statement above for details.
    */
  var statements: js.Array[
    WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatement
  ]
}
object WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatement {
  
  @scala.inline
  def apply(
    statements: js.Array[
      WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatement
    ]
  ): WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatement = {
    val __obj = js.Dynamic.literal(statements = statements.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatement]
  }
  
  @scala.inline
  implicit class WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementMutableBuilder[Self <: WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatements(
      value: js.Array[
          WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatement
        ]
    ): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatementsVarargs(value: WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatement*): Self = StObject.set(x, "statements", js.Array(value :_*))
  }
}
