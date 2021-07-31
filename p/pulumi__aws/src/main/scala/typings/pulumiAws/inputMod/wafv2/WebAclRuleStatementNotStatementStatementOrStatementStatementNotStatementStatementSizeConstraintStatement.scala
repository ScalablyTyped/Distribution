package typings.pulumiAws.inputMod.wafv2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementSizeConstraintStatement extends StObject {
  
  /**
    * The operator to use to compare the request part to the size setting. Valid values include: `EQ`, `NE`, `LE`, `LT`, `GE`, or `GT`.
    */
  var comparisonOperator: Input[String]
  
  /**
    * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
    */
  var fieldToMatch: js.UndefOr[
    Input[
      WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatch
    ]
  ] = js.undefined
  
  /**
    * The size, in bytes, to compare to the request part, after any transformations. Valid values are integers between 0 and 21474836480, inclusive.
    */
  var size: Input[Double]
  
  /**
    * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
    */
  var textTransformations: Input[
    js.Array[
      Input[
        WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementSizeConstraintStatementTextTransformation
      ]
    ]
  ]
}
object WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementSizeConstraintStatement {
  
  @scala.inline
  def apply(
    comparisonOperator: Input[String],
    size: Input[Double],
    textTransformations: Input[
      js.Array[
        Input[
          WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementSizeConstraintStatementTextTransformation
        ]
      ]
    ]
  ): WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementSizeConstraintStatement = {
    val __obj = js.Dynamic.literal(comparisonOperator = comparisonOperator.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], textTransformations = textTransformations.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementSizeConstraintStatement]
  }
  
  @scala.inline
  implicit class WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementSizeConstraintStatementMutableBuilder[Self <: WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementSizeConstraintStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComparisonOperator(value: Input[String]): Self = StObject.set(x, "comparisonOperator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldToMatch(
      value: Input[
          WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatch
        ]
    ): Self = StObject.set(x, "fieldToMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldToMatchUndefined: Self = StObject.set(x, "fieldToMatch", js.undefined)
    
    @scala.inline
    def setSize(value: Input[Double]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextTransformations(
      value: Input[
          js.Array[
            Input[
              WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementSizeConstraintStatementTextTransformation
            ]
          ]
        ]
    ): Self = StObject.set(x, "textTransformations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextTransformationsVarargs(
      value: (Input[
          WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatementSizeConstraintStatementTextTransformation
        ])*
    ): Self = StObject.set(x, "textTransformations", js.Array(value :_*))
  }
}
