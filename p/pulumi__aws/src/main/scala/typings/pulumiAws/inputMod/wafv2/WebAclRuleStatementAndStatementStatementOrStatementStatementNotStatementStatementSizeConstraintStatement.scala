package typings.pulumiAws.inputMod.wafv2

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementSizeConstraintStatement extends js.Object {
  
  /**
    * The operator to use to compare the request part to the size setting. Valid values include: `EQ`, `NE`, `LE`, `LT`, `GE`, or `GT`.
    */
  var comparisonOperator: Input[String] = js.native
  
  /**
    * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
    */
  var fieldToMatch: js.UndefOr[
    Input[
      WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatch
    ]
  ] = js.native
  
  /**
    * The size, in bytes, to compare to the request part, after any transformations. Valid values are integers between 0 and 21474836480, inclusive.
    */
  var size: Input[Double] = js.native
  
  /**
    * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
    */
  var textTransformations: Input[
    js.Array[
      Input[
        WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementSizeConstraintStatementTextTransformation
      ]
    ]
  ] = js.native
}
object WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementSizeConstraintStatement {
  
  @scala.inline
  def apply(
    comparisonOperator: Input[String],
    size: Input[Double],
    textTransformations: Input[
      js.Array[
        Input[
          WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementSizeConstraintStatementTextTransformation
        ]
      ]
    ]
  ): WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementSizeConstraintStatement = {
    val __obj = js.Dynamic.literal(comparisonOperator = comparisonOperator.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], textTransformations = textTransformations.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementSizeConstraintStatement]
  }
  
  @scala.inline
  implicit class WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementSizeConstraintStatementOps[Self <: WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementSizeConstraintStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setComparisonOperator(value: Input[String]): Self = this.set("comparisonOperator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Input[Double]): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextTransformationsVarargs(
      value: (Input[
          WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementSizeConstraintStatementTextTransformation
        ])*
    ): Self = this.set("textTransformations", js.Array(value :_*))
    
    @scala.inline
    def setTextTransformations(
      value: Input[
          js.Array[
            Input[
              WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementSizeConstraintStatementTextTransformation
            ]
          ]
        ]
    ): Self = this.set("textTransformations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldToMatch(
      value: Input[
          WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatch
        ]
    ): Self = this.set("fieldToMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFieldToMatch: Self = this.set("fieldToMatch", js.undefined)
  }
}
