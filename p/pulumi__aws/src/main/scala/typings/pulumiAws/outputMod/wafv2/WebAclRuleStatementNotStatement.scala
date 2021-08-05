package typings.pulumiAws.outputMod.wafv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebAclRuleStatementNotStatement extends StObject {
  
  /**
    * The statement to negate. You can use any statement that can be nested. See Statement above for details.
    */
  var statements: js.Array[WebAclRuleStatementNotStatementStatement]
}
object WebAclRuleStatementNotStatement {
  
  inline def apply(statements: js.Array[WebAclRuleStatementNotStatementStatement]): WebAclRuleStatementNotStatement = {
    val __obj = js.Dynamic.literal(statements = statements.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclRuleStatementNotStatement]
  }
  
  extension [Self <: WebAclRuleStatementNotStatement](x: Self) {
    
    inline def setStatements(value: js.Array[WebAclRuleStatementNotStatementStatement]): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
    
    inline def setStatementsVarargs(value: WebAclRuleStatementNotStatementStatement*): Self = StObject.set(x, "statements", js.Array(value :_*))
  }
}
