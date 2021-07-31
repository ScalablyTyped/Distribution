package typings.pulumiAws.inputMod.wafv2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleGroupRuleStatementAndStatementStatementByteMatchStatement extends StObject {
  
  /**
    * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
    */
  var fieldToMatch: js.UndefOr[Input[RuleGroupRuleStatementAndStatementStatementByteMatchStatementFieldToMatch]] = js.undefined
  
  /**
    * The area within the portion of a web request that you want AWS WAF to search for `searchString`. Valid values include the following: `EXACTLY`, `STARTS_WITH`, `ENDS_WITH`, `CONTAINS`, `CONTAINS_WORD`. See the AWS [documentation](https://docs.aws.amazon.com/waf/latest/APIReference/API_ByteMatchStatement.html) for more information.
    */
  var positionalConstraint: Input[String]
  
  /**
    * A string value that you want AWS WAF to search for. AWS WAF searches only in the part of web requests that you designate for inspection in `fieldToMatch`. The maximum length of the value is 50 bytes.
    */
  var searchString: Input[String]
  
  /**
    * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
    */
  var textTransformations: Input[
    js.Array[
      Input[RuleGroupRuleStatementAndStatementStatementByteMatchStatementTextTransformation]
    ]
  ]
}
object RuleGroupRuleStatementAndStatementStatementByteMatchStatement {
  
  @scala.inline
  def apply(
    positionalConstraint: Input[String],
    searchString: Input[String],
    textTransformations: Input[
      js.Array[
        Input[RuleGroupRuleStatementAndStatementStatementByteMatchStatementTextTransformation]
      ]
    ]
  ): RuleGroupRuleStatementAndStatementStatementByteMatchStatement = {
    val __obj = js.Dynamic.literal(positionalConstraint = positionalConstraint.asInstanceOf[js.Any], searchString = searchString.asInstanceOf[js.Any], textTransformations = textTransformations.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroupRuleStatementAndStatementStatementByteMatchStatement]
  }
  
  @scala.inline
  implicit class RuleGroupRuleStatementAndStatementStatementByteMatchStatementMutableBuilder[Self <: RuleGroupRuleStatementAndStatementStatementByteMatchStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFieldToMatch(value: Input[RuleGroupRuleStatementAndStatementStatementByteMatchStatementFieldToMatch]): Self = StObject.set(x, "fieldToMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldToMatchUndefined: Self = StObject.set(x, "fieldToMatch", js.undefined)
    
    @scala.inline
    def setPositionalConstraint(value: Input[String]): Self = StObject.set(x, "positionalConstraint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchString(value: Input[String]): Self = StObject.set(x, "searchString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextTransformations(
      value: Input[
          js.Array[
            Input[RuleGroupRuleStatementAndStatementStatementByteMatchStatementTextTransformation]
          ]
        ]
    ): Self = StObject.set(x, "textTransformations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextTransformationsVarargs(value: Input[RuleGroupRuleStatementAndStatementStatementByteMatchStatementTextTransformation]*): Self = StObject.set(x, "textTransformations", js.Array(value :_*))
  }
}
