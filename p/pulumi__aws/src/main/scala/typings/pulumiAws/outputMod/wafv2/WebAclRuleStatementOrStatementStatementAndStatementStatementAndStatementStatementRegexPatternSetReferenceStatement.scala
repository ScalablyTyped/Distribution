package typings.pulumiAws.outputMod.wafv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatement extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Regex Pattern Set that this statement references.
    */
  var arn: String = js.native
  
  /**
    * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
    */
  var fieldToMatch: js.UndefOr[
    WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatch
  ] = js.native
  
  /**
    * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
    */
  var textTransformations: js.Array[
    WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementTextTransformation
  ] = js.native
}
object WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatement {
  
  @scala.inline
  def apply(
    arn: String,
    textTransformations: js.Array[
      WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementTextTransformation
    ]
  ): WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatement = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], textTransformations = textTransformations.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatement]
  }
  
  @scala.inline
  implicit class WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementMutableBuilder[Self <: WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldToMatch(
      value: WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatch
    ): Self = StObject.set(x, "fieldToMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldToMatchUndefined: Self = StObject.set(x, "fieldToMatch", js.undefined)
    
    @scala.inline
    def setTextTransformations(
      value: js.Array[
          WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementTextTransformation
        ]
    ): Self = StObject.set(x, "textTransformations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextTransformationsVarargs(
      value: WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementTextTransformation*
    ): Self = StObject.set(x, "textTransformations", js.Array(value :_*))
  }
}
