package typings.pulumiAws.outputMod.wafv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebAclRuleStatementOrStatement extends StObject {
  
  /**
    * The statements to combine with `OR` logic. You can use any statements that can be nested. See Statement above for details.
    */
  var statements: js.Array[WebAclRuleStatementOrStatementStatement]
}
object WebAclRuleStatementOrStatement {
  
  inline def apply(statements: js.Array[WebAclRuleStatementOrStatementStatement]): WebAclRuleStatementOrStatement = {
    val __obj = js.Dynamic.literal(statements = statements.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclRuleStatementOrStatement]
  }
  
  extension [Self <: WebAclRuleStatementOrStatement](x: Self) {
    
    inline def setStatements(value: js.Array[WebAclRuleStatementOrStatementStatement]): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
    
    inline def setStatementsVarargs(value: WebAclRuleStatementOrStatementStatement*): Self = StObject.set(x, "statements", js.Array(value :_*))
  }
}
