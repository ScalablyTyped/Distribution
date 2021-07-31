package typings.pulumiAws.outputMod.wafv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebAclRuleStatement extends StObject {
  
  /**
    * A logical rule statement used to combine other rule statements with AND logic. See AND Statement below for details.
    */
  var andStatement: js.UndefOr[WebAclRuleStatementAndStatement] = js.undefined
  
  /**
    * A rule statement that defines a string match search for AWS WAF to apply to web requests. See Byte Match Statement below for details.
    */
  var byteMatchStatement: js.UndefOr[WebAclRuleStatementByteMatchStatement] = js.undefined
  
  /**
    * A rule statement used to identify web requests based on country of origin. See GEO Match Statement below for details.
    */
  var geoMatchStatement: js.UndefOr[WebAclRuleStatementGeoMatchStatement] = js.undefined
  
  /**
    * A rule statement used to detect web requests coming from particular IP addresses or address ranges. See IP Set Reference Statement below for details.
    */
  var ipSetReferenceStatement: js.UndefOr[WebAclRuleStatementIpSetReferenceStatement] = js.undefined
  
  /**
    * A rule statement used to run the rules that are defined in a managed rule group.  This statement can not be nested. See Managed Rule Group Statement below for details.
    */
  var managedRuleGroupStatement: js.UndefOr[WebAclRuleStatementManagedRuleGroupStatement] = js.undefined
  
  /**
    * A logical rule statement used to negate the results of another rule statement. See NOT Statement below for details.
    */
  var notStatement: js.UndefOr[WebAclRuleStatementNotStatement] = js.undefined
  
  /**
    * A logical rule statement used to combine other rule statements with OR logic. See OR Statement below for details.
    */
  var orStatement: js.UndefOr[WebAclRuleStatementOrStatement] = js.undefined
  
  /**
    * A rate-based rule tracks the rate of requests for each originating `IP address`, and triggers the rule action when the rate exceeds a limit that you specify on the number of requests in any `5-minute` time span. This statement can not be nested. See Rate Based Statement below for details.
    */
  var rateBasedStatement: js.UndefOr[WebAclRuleStatementRateBasedStatement] = js.undefined
  
  /**
    * A rule statement used to search web request components for matches with regular expressions. See Regex Pattern Set Reference Statement below for details.
    */
  var regexPatternSetReferenceStatement: js.UndefOr[WebAclRuleStatementRegexPatternSetReferenceStatement] = js.undefined
  
  /**
    * A rule statement used to run the rules that are defined in an WAFv2 Rule Group. See Rule Group Reference Statement below for details.
    */
  var ruleGroupReferenceStatement: js.UndefOr[WebAclRuleStatementRuleGroupReferenceStatement] = js.undefined
  
  /**
    * A rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (>) or less than (<). See Size Constraint Statement below for more details.
    */
  var sizeConstraintStatement: js.UndefOr[WebAclRuleStatementSizeConstraintStatement] = js.undefined
  
  /**
    * An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. See SQL Injection Match Statement below for details.
    */
  var sqliMatchStatement: js.UndefOr[WebAclRuleStatementSqliMatchStatement] = js.undefined
  
  /**
    * A rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. See XSS Match Statement below for details.
    */
  var xssMatchStatement: js.UndefOr[WebAclRuleStatementXssMatchStatement] = js.undefined
}
object WebAclRuleStatement {
  
  @scala.inline
  def apply(): WebAclRuleStatement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebAclRuleStatement]
  }
  
  @scala.inline
  implicit class WebAclRuleStatementMutableBuilder[Self <: WebAclRuleStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAndStatement(value: WebAclRuleStatementAndStatement): Self = StObject.set(x, "andStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndStatementUndefined: Self = StObject.set(x, "andStatement", js.undefined)
    
    @scala.inline
    def setByteMatchStatement(value: WebAclRuleStatementByteMatchStatement): Self = StObject.set(x, "byteMatchStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setByteMatchStatementUndefined: Self = StObject.set(x, "byteMatchStatement", js.undefined)
    
    @scala.inline
    def setGeoMatchStatement(value: WebAclRuleStatementGeoMatchStatement): Self = StObject.set(x, "geoMatchStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeoMatchStatementUndefined: Self = StObject.set(x, "geoMatchStatement", js.undefined)
    
    @scala.inline
    def setIpSetReferenceStatement(value: WebAclRuleStatementIpSetReferenceStatement): Self = StObject.set(x, "ipSetReferenceStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpSetReferenceStatementUndefined: Self = StObject.set(x, "ipSetReferenceStatement", js.undefined)
    
    @scala.inline
    def setManagedRuleGroupStatement(value: WebAclRuleStatementManagedRuleGroupStatement): Self = StObject.set(x, "managedRuleGroupStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagedRuleGroupStatementUndefined: Self = StObject.set(x, "managedRuleGroupStatement", js.undefined)
    
    @scala.inline
    def setNotStatement(value: WebAclRuleStatementNotStatement): Self = StObject.set(x, "notStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotStatementUndefined: Self = StObject.set(x, "notStatement", js.undefined)
    
    @scala.inline
    def setOrStatement(value: WebAclRuleStatementOrStatement): Self = StObject.set(x, "orStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrStatementUndefined: Self = StObject.set(x, "orStatement", js.undefined)
    
    @scala.inline
    def setRateBasedStatement(value: WebAclRuleStatementRateBasedStatement): Self = StObject.set(x, "rateBasedStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRateBasedStatementUndefined: Self = StObject.set(x, "rateBasedStatement", js.undefined)
    
    @scala.inline
    def setRegexPatternSetReferenceStatement(value: WebAclRuleStatementRegexPatternSetReferenceStatement): Self = StObject.set(x, "regexPatternSetReferenceStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegexPatternSetReferenceStatementUndefined: Self = StObject.set(x, "regexPatternSetReferenceStatement", js.undefined)
    
    @scala.inline
    def setRuleGroupReferenceStatement(value: WebAclRuleStatementRuleGroupReferenceStatement): Self = StObject.set(x, "ruleGroupReferenceStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleGroupReferenceStatementUndefined: Self = StObject.set(x, "ruleGroupReferenceStatement", js.undefined)
    
    @scala.inline
    def setSizeConstraintStatement(value: WebAclRuleStatementSizeConstraintStatement): Self = StObject.set(x, "sizeConstraintStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeConstraintStatementUndefined: Self = StObject.set(x, "sizeConstraintStatement", js.undefined)
    
    @scala.inline
    def setSqliMatchStatement(value: WebAclRuleStatementSqliMatchStatement): Self = StObject.set(x, "sqliMatchStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSqliMatchStatementUndefined: Self = StObject.set(x, "sqliMatchStatement", js.undefined)
    
    @scala.inline
    def setXssMatchStatement(value: WebAclRuleStatementXssMatchStatement): Self = StObject.set(x, "xssMatchStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXssMatchStatementUndefined: Self = StObject.set(x, "xssMatchStatement", js.undefined)
  }
}
