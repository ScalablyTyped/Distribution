package typings.pulumiAws.outputMod.wafv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementByteMatchStatement extends StObject {
  
  /**
    * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
    */
  var fieldToMatch: js.UndefOr[
    WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementByteMatchStatementFieldToMatch
  ] = js.undefined
  
  /**
    * The area within the portion of a web request that you want AWS WAF to search for `searchString`. Valid values include the following: `EXACTLY`, `STARTS_WITH`, `ENDS_WITH`, `CONTAINS`, `CONTAINS_WORD`. See the AWS [documentation](https://docs.aws.amazon.com/waf/latest/APIReference/API_ByteMatchStatement.html) for more information.
    */
  var positionalConstraint: String
  
  /**
    * A string value that you want AWS WAF to search for. AWS WAF searches only in the part of web requests that you designate for inspection in `fieldToMatch`. The maximum length of the value is 50 bytes.
    */
  var searchString: String
  
  /**
    * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
    */
  var textTransformations: js.Array[
    WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementByteMatchStatementTextTransformation
  ]
}
object WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementByteMatchStatement {
  
  @scala.inline
  def apply(
    positionalConstraint: String,
    searchString: String,
    textTransformations: js.Array[
      WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementByteMatchStatementTextTransformation
    ]
  ): WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementByteMatchStatement = {
    val __obj = js.Dynamic.literal(positionalConstraint = positionalConstraint.asInstanceOf[js.Any], searchString = searchString.asInstanceOf[js.Any], textTransformations = textTransformations.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementByteMatchStatement]
  }
  
  @scala.inline
  implicit class WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementByteMatchStatementMutableBuilder[Self <: WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementByteMatchStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFieldToMatch(
      value: WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementByteMatchStatementFieldToMatch
    ): Self = StObject.set(x, "fieldToMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldToMatchUndefined: Self = StObject.set(x, "fieldToMatch", js.undefined)
    
    @scala.inline
    def setPositionalConstraint(value: String): Self = StObject.set(x, "positionalConstraint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchString(value: String): Self = StObject.set(x, "searchString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextTransformations(
      value: js.Array[
          WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementByteMatchStatementTextTransformation
        ]
    ): Self = StObject.set(x, "textTransformations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextTransformationsVarargs(
      value: WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementByteMatchStatementTextTransformation*
    ): Self = StObject.set(x, "textTransformations", js.Array(value :_*))
  }
}
