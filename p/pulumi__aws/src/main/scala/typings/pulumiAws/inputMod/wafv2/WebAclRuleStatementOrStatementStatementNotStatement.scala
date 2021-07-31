package typings.pulumiAws.inputMod.wafv2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebAclRuleStatementOrStatementStatementNotStatement extends StObject {
  
  /**
    * The statement to negate. You can use any statement that can be nested. See Statement above for details.
    */
  var statements: Input[js.Array[Input[WebAclRuleStatementOrStatementStatementNotStatementStatement]]]
}
object WebAclRuleStatementOrStatementStatementNotStatement {
  
  @scala.inline
  def apply(statements: Input[js.Array[Input[WebAclRuleStatementOrStatementStatementNotStatementStatement]]]): WebAclRuleStatementOrStatementStatementNotStatement = {
    val __obj = js.Dynamic.literal(statements = statements.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclRuleStatementOrStatementStatementNotStatement]
  }
  
  @scala.inline
  implicit class WebAclRuleStatementOrStatementStatementNotStatementMutableBuilder[Self <: WebAclRuleStatementOrStatementStatementNotStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatements(value: Input[js.Array[Input[WebAclRuleStatementOrStatementStatementNotStatementStatement]]]): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatementsVarargs(value: Input[WebAclRuleStatementOrStatementStatementNotStatementStatement]*): Self = StObject.set(x, "statements", js.Array(value :_*))
  }
}
