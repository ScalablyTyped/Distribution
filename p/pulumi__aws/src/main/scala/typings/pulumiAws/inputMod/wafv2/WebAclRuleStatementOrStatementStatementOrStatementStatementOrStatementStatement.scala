package typings.pulumiAws.inputMod.wafv2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatement extends StObject {
  
  /**
    * A rule statement that defines a string match search for AWS WAF to apply to web requests. See Byte Match Statement below for details.
    */
  var byteMatchStatement: js.UndefOr[
    Input[
      WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementByteMatchStatement
    ]
  ] = js.undefined
  
  /**
    * A rule statement used to identify web requests based on country of origin. See GEO Match Statement below for details.
    */
  var geoMatchStatement: js.UndefOr[
    Input[
      WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementGeoMatchStatement
    ]
  ] = js.undefined
  
  /**
    * A rule statement used to detect web requests coming from particular IP addresses or address ranges. See IP Set Reference Statement below for details.
    */
  var ipSetReferenceStatement: js.UndefOr[
    Input[
      WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementIpSetReferenceStatement
    ]
  ] = js.undefined
  
  /**
    * A rule statement used to search web request components for matches with regular expressions. See Regex Pattern Set Reference Statement below for details.
    */
  var regexPatternSetReferenceStatement: js.UndefOr[
    Input[
      WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatement
    ]
  ] = js.undefined
  
  /**
    * A rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (>) or less than (<). See Size Constraint Statement below for more details.
    */
  var sizeConstraintStatement: js.UndefOr[
    Input[
      WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementSizeConstraintStatement
    ]
  ] = js.undefined
  
  /**
    * An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. See SQL Injection Match Statement below for details.
    */
  var sqliMatchStatement: js.UndefOr[
    Input[
      WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementSqliMatchStatement
    ]
  ] = js.undefined
  
  /**
    * A rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. See XSS Match Statement below for details.
    */
  var xssMatchStatement: js.UndefOr[
    Input[
      WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementXssMatchStatement
    ]
  ] = js.undefined
}
object WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatement {
  
  @scala.inline
  def apply(): WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatement]
  }
  
  @scala.inline
  implicit class WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementMutableBuilder[Self <: WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setByteMatchStatement(
      value: Input[
          WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementByteMatchStatement
        ]
    ): Self = StObject.set(x, "byteMatchStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setByteMatchStatementUndefined: Self = StObject.set(x, "byteMatchStatement", js.undefined)
    
    @scala.inline
    def setGeoMatchStatement(
      value: Input[
          WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementGeoMatchStatement
        ]
    ): Self = StObject.set(x, "geoMatchStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeoMatchStatementUndefined: Self = StObject.set(x, "geoMatchStatement", js.undefined)
    
    @scala.inline
    def setIpSetReferenceStatement(
      value: Input[
          WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementIpSetReferenceStatement
        ]
    ): Self = StObject.set(x, "ipSetReferenceStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpSetReferenceStatementUndefined: Self = StObject.set(x, "ipSetReferenceStatement", js.undefined)
    
    @scala.inline
    def setRegexPatternSetReferenceStatement(
      value: Input[
          WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatement
        ]
    ): Self = StObject.set(x, "regexPatternSetReferenceStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegexPatternSetReferenceStatementUndefined: Self = StObject.set(x, "regexPatternSetReferenceStatement", js.undefined)
    
    @scala.inline
    def setSizeConstraintStatement(
      value: Input[
          WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementSizeConstraintStatement
        ]
    ): Self = StObject.set(x, "sizeConstraintStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeConstraintStatementUndefined: Self = StObject.set(x, "sizeConstraintStatement", js.undefined)
    
    @scala.inline
    def setSqliMatchStatement(
      value: Input[
          WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementSqliMatchStatement
        ]
    ): Self = StObject.set(x, "sqliMatchStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSqliMatchStatementUndefined: Self = StObject.set(x, "sqliMatchStatement", js.undefined)
    
    @scala.inline
    def setXssMatchStatement(
      value: Input[
          WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementXssMatchStatement
        ]
    ): Self = StObject.set(x, "xssMatchStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXssMatchStatementUndefined: Self = StObject.set(x, "xssMatchStatement", js.undefined)
  }
}
