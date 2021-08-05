package typings.pulumiAws.inputMod.wafv2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatement extends StObject {
  
  /**
    * The statement to negate. You can use any statement that can be nested. See Statement above for details.
    */
  var statements: Input[
    js.Array[
      Input[
        WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatement
      ]
    ]
  ]
}
object WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatement {
  
  inline def apply(
    statements: Input[
      js.Array[
        Input[
          WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatement
        ]
      ]
    ]
  ): WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatement = {
    val __obj = js.Dynamic.literal(statements = statements.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatement]
  }
  
  extension [Self <: WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatement](x: Self) {
    
    inline def setStatements(
      value: Input[
          js.Array[
            Input[
              WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatement
            ]
          ]
        ]
    ): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
    
    inline def setStatementsVarargs(
      value: (Input[
          WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatement
        ])*
    ): Self = StObject.set(x, "statements", js.Array(value :_*))
  }
}
