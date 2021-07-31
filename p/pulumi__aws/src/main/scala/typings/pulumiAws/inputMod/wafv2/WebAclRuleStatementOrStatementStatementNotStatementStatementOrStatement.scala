package typings.pulumiAws.inputMod.wafv2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatement extends StObject {
  
  /**
    * The statements to combine with `OR` logic. You can use any statements that can be nested. See Statement above for details.
    */
  var statements: Input[
    js.Array[
      Input[WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatement]
    ]
  ]
}
object WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatement {
  
  @scala.inline
  def apply(
    statements: Input[
      js.Array[
        Input[WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatement]
      ]
    ]
  ): WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatement = {
    val __obj = js.Dynamic.literal(statements = statements.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatement]
  }
  
  @scala.inline
  implicit class WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementMutableBuilder[Self <: WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatements(
      value: Input[
          js.Array[
            Input[WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatement]
          ]
        ]
    ): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatementsVarargs(value: Input[WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatement]*): Self = StObject.set(x, "statements", js.Array(value :_*))
  }
}
