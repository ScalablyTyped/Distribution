package typings.pulumiAws.inputMod.wafv2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatement extends StObject {
  
  /**
    * The statements to combine with `OR` logic. You can use any statements that can be nested. See Statement above for details.
    */
  var statements: Input[
    js.Array[
      Input[
        WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatement
      ]
    ]
  ]
}
object WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatement {
  
  inline def apply(
    statements: Input[
      js.Array[
        Input[
          WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatement
        ]
      ]
    ]
  ): WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatement = {
    val __obj = js.Dynamic.literal(statements = statements.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatement]
  }
  
  extension [Self <: WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatement](x: Self) {
    
    inline def setStatements(
      value: Input[
          js.Array[
            Input[
              WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatement
            ]
          ]
        ]
    ): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
    
    inline def setStatementsVarargs(
      value: (Input[
          WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatement
        ])*
    ): Self = StObject.set(x, "statements", js.Array(value :_*))
  }
}
