package typings.pulumiAws.outputMod.wafv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatement extends StObject {
  
  /**
    * The statements to combine with `AND` logic. You can use any statements that can be nested. See Statement above for details.
    */
  var statements: js.Array[WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatement]
}
object WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatement {
  
  inline def apply(
    statements: js.Array[WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatement]
  ): WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatement = {
    val __obj = js.Dynamic.literal(statements = statements.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatement]
  }
  
  extension [Self <: WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatement](x: Self) {
    
    inline def setStatements(value: js.Array[WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatement]): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
    
    inline def setStatementsVarargs(value: WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatement*): Self = StObject.set(x, "statements", js.Array(value :_*))
  }
}
