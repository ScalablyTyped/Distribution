package typings.pulumiAws.inputMod.wafv2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebAclRuleStatementRegexPatternSetReferenceStatement extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Regex Pattern Set that this statement references.
    */
  var arn: Input[String]
  
  /**
    * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
    */
  var fieldToMatch: js.UndefOr[Input[WebAclRuleStatementRegexPatternSetReferenceStatementFieldToMatch]] = js.undefined
  
  /**
    * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
    */
  var textTransformations: Input[
    js.Array[Input[WebAclRuleStatementRegexPatternSetReferenceStatementTextTransformation]]
  ]
}
object WebAclRuleStatementRegexPatternSetReferenceStatement {
  
  @scala.inline
  def apply(
    arn: Input[String],
    textTransformations: Input[
      js.Array[Input[WebAclRuleStatementRegexPatternSetReferenceStatementTextTransformation]]
    ]
  ): WebAclRuleStatementRegexPatternSetReferenceStatement = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], textTransformations = textTransformations.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclRuleStatementRegexPatternSetReferenceStatement]
  }
  
  @scala.inline
  implicit class WebAclRuleStatementRegexPatternSetReferenceStatementMutableBuilder[Self <: WebAclRuleStatementRegexPatternSetReferenceStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldToMatch(value: Input[WebAclRuleStatementRegexPatternSetReferenceStatementFieldToMatch]): Self = StObject.set(x, "fieldToMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldToMatchUndefined: Self = StObject.set(x, "fieldToMatch", js.undefined)
    
    @scala.inline
    def setTextTransformations(
      value: Input[
          js.Array[Input[WebAclRuleStatementRegexPatternSetReferenceStatementTextTransformation]]
        ]
    ): Self = StObject.set(x, "textTransformations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextTransformationsVarargs(value: Input[WebAclRuleStatementRegexPatternSetReferenceStatementTextTransformation]*): Self = StObject.set(x, "textTransformations", js.Array(value :_*))
  }
}
