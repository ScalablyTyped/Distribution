package typings.pulumiAws.outputMod.wafv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatement extends StObject {
  
  /**
    * The statements to combine with `OR` logic. You can use any statements that can be nested. See Statement above for details.
    */
  var statements: js.Array[WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatement]
}
object WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatement {
  
  inline def apply(
    statements: js.Array[WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatement]
  ): WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatement = {
    val __obj = js.Dynamic.literal(statements = statements.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatement]
  }
  
  extension [Self <: WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatement](x: Self) {
    
    inline def setStatements(value: js.Array[WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatement]): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
    
    inline def setStatementsVarargs(value: WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatement*): Self = StObject.set(x, "statements", js.Array(value :_*))
  }
}
