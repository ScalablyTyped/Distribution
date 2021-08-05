package typings.pulumiAws.inputMod.wafv2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatement extends StObject {
  
  /**
    * A rule statement that defines a string match search for AWS WAF to apply to web requests. See Byte Match Statement below for details.
    */
  var byteMatchStatement: js.UndefOr[
    Input[
      WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatementByteMatchStatement
    ]
  ] = js.undefined
  
  /**
    * A rule statement used to identify web requests based on country of origin. See GEO Match Statement below for details.
    */
  var geoMatchStatement: js.UndefOr[
    Input[
      WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatementGeoMatchStatement
    ]
  ] = js.undefined
  
  /**
    * A rule statement used to detect web requests coming from particular IP addresses or address ranges. See IP Set Reference Statement below for details.
    */
  var ipSetReferenceStatement: js.UndefOr[
    Input[
      WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatementIpSetReferenceStatement
    ]
  ] = js.undefined
  
  /**
    * A rule statement used to search web request components for matches with regular expressions. See Regex Pattern Set Reference Statement below for details.
    */
  var regexPatternSetReferenceStatement: js.UndefOr[
    Input[
      WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatementRegexPatternSetReferenceStatement
    ]
  ] = js.undefined
  
  /**
    * A rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (>) or less than (<). See Size Constraint Statement below for more details.
    */
  var sizeConstraintStatement: js.UndefOr[
    Input[
      WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatementSizeConstraintStatement
    ]
  ] = js.undefined
  
  /**
    * An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. See SQL Injection Match Statement below for details.
    */
  var sqliMatchStatement: js.UndefOr[
    Input[
      WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatementSqliMatchStatement
    ]
  ] = js.undefined
  
  /**
    * A rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. See XSS Match Statement below for details.
    */
  var xssMatchStatement: js.UndefOr[
    Input[
      WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatementXssMatchStatement
    ]
  ] = js.undefined
}
object WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatement {
  
  inline def apply(): WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatement]
  }
  
  extension [Self <: WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatement](x: Self) {
    
    inline def setByteMatchStatement(
      value: Input[
          WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatementByteMatchStatement
        ]
    ): Self = StObject.set(x, "byteMatchStatement", value.asInstanceOf[js.Any])
    
    inline def setByteMatchStatementUndefined: Self = StObject.set(x, "byteMatchStatement", js.undefined)
    
    inline def setGeoMatchStatement(
      value: Input[
          WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatementGeoMatchStatement
        ]
    ): Self = StObject.set(x, "geoMatchStatement", value.asInstanceOf[js.Any])
    
    inline def setGeoMatchStatementUndefined: Self = StObject.set(x, "geoMatchStatement", js.undefined)
    
    inline def setIpSetReferenceStatement(
      value: Input[
          WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatementIpSetReferenceStatement
        ]
    ): Self = StObject.set(x, "ipSetReferenceStatement", value.asInstanceOf[js.Any])
    
    inline def setIpSetReferenceStatementUndefined: Self = StObject.set(x, "ipSetReferenceStatement", js.undefined)
    
    inline def setRegexPatternSetReferenceStatement(
      value: Input[
          WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatementRegexPatternSetReferenceStatement
        ]
    ): Self = StObject.set(x, "regexPatternSetReferenceStatement", value.asInstanceOf[js.Any])
    
    inline def setRegexPatternSetReferenceStatementUndefined: Self = StObject.set(x, "regexPatternSetReferenceStatement", js.undefined)
    
    inline def setSizeConstraintStatement(
      value: Input[
          WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatementSizeConstraintStatement
        ]
    ): Self = StObject.set(x, "sizeConstraintStatement", value.asInstanceOf[js.Any])
    
    inline def setSizeConstraintStatementUndefined: Self = StObject.set(x, "sizeConstraintStatement", js.undefined)
    
    inline def setSqliMatchStatement(
      value: Input[
          WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatementSqliMatchStatement
        ]
    ): Self = StObject.set(x, "sqliMatchStatement", value.asInstanceOf[js.Any])
    
    inline def setSqliMatchStatementUndefined: Self = StObject.set(x, "sqliMatchStatement", js.undefined)
    
    inline def setXssMatchStatement(
      value: Input[
          WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatementXssMatchStatement
        ]
    ): Self = StObject.set(x, "xssMatchStatement", value.asInstanceOf[js.Any])
    
    inline def setXssMatchStatementUndefined: Self = StObject.set(x, "xssMatchStatement", js.undefined)
  }
}
