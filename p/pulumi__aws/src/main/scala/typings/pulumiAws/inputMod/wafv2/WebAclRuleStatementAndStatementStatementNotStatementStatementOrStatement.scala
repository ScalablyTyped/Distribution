package typings.pulumiAws.inputMod.wafv2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatement extends StObject {
  
  /**
    * The statements to combine with `OR` logic. You can use any statements that can be nested. See Statement above for details.
    */
  var statements: Input[
    js.Array[
      Input[
        WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementStatement
      ]
    ]
  ]
}
object WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatement {
  
  inline def apply(
    statements: Input[
      js.Array[
        Input[
          WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementStatement
        ]
      ]
    ]
  ): WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatement = {
    val __obj = js.Dynamic.literal(statements = statements.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatement]
  }
  
  extension [Self <: WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatement](x: Self) {
    
    inline def setStatements(
      value: Input[
          js.Array[
            Input[
              WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementStatement
            ]
          ]
        ]
    ): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
    
    inline def setStatementsVarargs(
      value: (Input[
          WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementStatement
        ])*
    ): Self = StObject.set(x, "statements", js.Array(value :_*))
  }
}
