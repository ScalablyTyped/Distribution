package typings.pulumiAws.outputMod.wafv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebAclRuleStatementAndStatement extends StObject {
  
  /**
    * The statements to combine with `AND` logic. You can use any statements that can be nested. See Statement above for details.
    */
  var statements: js.Array[WebAclRuleStatementAndStatementStatement]
}
object WebAclRuleStatementAndStatement {
  
  inline def apply(statements: js.Array[WebAclRuleStatementAndStatementStatement]): WebAclRuleStatementAndStatement = {
    val __obj = js.Dynamic.literal(statements = statements.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclRuleStatementAndStatement]
  }
  
  extension [Self <: WebAclRuleStatementAndStatement](x: Self) {
    
    inline def setStatements(value: js.Array[WebAclRuleStatementAndStatementStatement]): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
    
    inline def setStatementsVarargs(value: WebAclRuleStatementAndStatementStatement*): Self = StObject.set(x, "statements", js.Array(value :_*))
  }
}
