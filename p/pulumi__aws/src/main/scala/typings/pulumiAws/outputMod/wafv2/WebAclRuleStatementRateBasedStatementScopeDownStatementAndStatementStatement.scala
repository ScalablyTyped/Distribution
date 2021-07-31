package typings.pulumiAws.outputMod.wafv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatement extends StObject {
  
  /**
    * A logical rule statement used to combine other rule statements with AND logic. See AND Statement below for details.
    */
  var andStatement: js.UndefOr[
    WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementAndStatement
  ] = js.undefined
  
  /**
    * A rule statement that defines a string match search for AWS WAF to apply to web requests. See Byte Match Statement below for details.
    */
  var byteMatchStatement: js.UndefOr[
    WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementByteMatchStatement
  ] = js.undefined
  
  /**
    * A rule statement used to identify web requests based on country of origin. See GEO Match Statement below for details.
    */
  var geoMatchStatement: js.UndefOr[
    WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementGeoMatchStatement
  ] = js.undefined
  
  /**
    * A rule statement used to detect web requests coming from particular IP addresses or address ranges. See IP Set Reference Statement below for details.
    */
  var ipSetReferenceStatement: js.UndefOr[
    WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementIpSetReferenceStatement
  ] = js.undefined
  
  /**
    * A logical rule statement used to negate the results of another rule statement. See NOT Statement below for details.
    */
  var notStatement: js.UndefOr[
    WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatement
  ] = js.undefined
  
  /**
    * A logical rule statement used to combine other rule statements with OR logic. See OR Statement below for details.
    */
  var orStatement: js.UndefOr[
    WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementOrStatement
  ] = js.undefined
  
  /**
    * A rule statement used to search web request components for matches with regular expressions. See Regex Pattern Set Reference Statement below for details.
    */
  var regexPatternSetReferenceStatement: js.UndefOr[
    WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementRegexPatternSetReferenceStatement
  ] = js.undefined
  
  /**
    * A rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (>) or less than (<). See Size Constraint Statement below for more details.
    */
  var sizeConstraintStatement: js.UndefOr[
    WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementSizeConstraintStatement
  ] = js.undefined
  
  /**
    * An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. See SQL Injection Match Statement below for details.
    */
  var sqliMatchStatement: js.UndefOr[
    WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementSqliMatchStatement
  ] = js.undefined
  
  /**
    * A rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. See XSS Match Statement below for details.
    */
  var xssMatchStatement: js.UndefOr[
    WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementXssMatchStatement
  ] = js.undefined
}
object WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatement {
  
  @scala.inline
  def apply(): WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatement]
  }
  
  @scala.inline
  implicit class WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementMutableBuilder[Self <: WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAndStatement(value: WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementAndStatement): Self = StObject.set(x, "andStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndStatementUndefined: Self = StObject.set(x, "andStatement", js.undefined)
    
    @scala.inline
    def setByteMatchStatement(
      value: WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementByteMatchStatement
    ): Self = StObject.set(x, "byteMatchStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setByteMatchStatementUndefined: Self = StObject.set(x, "byteMatchStatement", js.undefined)
    
    @scala.inline
    def setGeoMatchStatement(
      value: WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementGeoMatchStatement
    ): Self = StObject.set(x, "geoMatchStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeoMatchStatementUndefined: Self = StObject.set(x, "geoMatchStatement", js.undefined)
    
    @scala.inline
    def setIpSetReferenceStatement(
      value: WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementIpSetReferenceStatement
    ): Self = StObject.set(x, "ipSetReferenceStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpSetReferenceStatementUndefined: Self = StObject.set(x, "ipSetReferenceStatement", js.undefined)
    
    @scala.inline
    def setNotStatement(value: WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatement): Self = StObject.set(x, "notStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotStatementUndefined: Self = StObject.set(x, "notStatement", js.undefined)
    
    @scala.inline
    def setOrStatement(value: WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementOrStatement): Self = StObject.set(x, "orStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrStatementUndefined: Self = StObject.set(x, "orStatement", js.undefined)
    
    @scala.inline
    def setRegexPatternSetReferenceStatement(
      value: WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementRegexPatternSetReferenceStatement
    ): Self = StObject.set(x, "regexPatternSetReferenceStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegexPatternSetReferenceStatementUndefined: Self = StObject.set(x, "regexPatternSetReferenceStatement", js.undefined)
    
    @scala.inline
    def setSizeConstraintStatement(
      value: WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementSizeConstraintStatement
    ): Self = StObject.set(x, "sizeConstraintStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeConstraintStatementUndefined: Self = StObject.set(x, "sizeConstraintStatement", js.undefined)
    
    @scala.inline
    def setSqliMatchStatement(
      value: WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementSqliMatchStatement
    ): Self = StObject.set(x, "sqliMatchStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSqliMatchStatementUndefined: Self = StObject.set(x, "sqliMatchStatement", js.undefined)
    
    @scala.inline
    def setXssMatchStatement(
      value: WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementXssMatchStatement
    ): Self = StObject.set(x, "xssMatchStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXssMatchStatementUndefined: Self = StObject.set(x, "xssMatchStatement", js.undefined)
  }
}
