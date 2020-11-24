package typings.pulumiAws.outputMod.wafv2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatement extends js.Object {
  
  /**
    * A logical rule statement used to combine other rule statements with AND logic. See AND Statement below for details.
    */
  var andStatement: js.UndefOr[
    WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementAndStatement
  ] = js.native
  
  /**
    * A rule statement that defines a string match search for AWS WAF to apply to web requests. See Byte Match Statement below for details.
    */
  var byteMatchStatement: js.UndefOr[
    WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementByteMatchStatement
  ] = js.native
  
  /**
    * A rule statement used to identify web requests based on country of origin. See GEO Match Statement below for details.
    */
  var geoMatchStatement: js.UndefOr[
    WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementGeoMatchStatement
  ] = js.native
  
  /**
    * A rule statement used to detect web requests coming from particular IP addresses or address ranges. See IP Set Reference Statement below for details.
    */
  var ipSetReferenceStatement: js.UndefOr[
    WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementIpSetReferenceStatement
  ] = js.native
  
  /**
    * A logical rule statement used to negate the results of another rule statement. See NOT Statement below for details.
    */
  var notStatement: js.UndefOr[
    WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatement
  ] = js.native
  
  /**
    * A logical rule statement used to combine other rule statements with OR logic. See OR Statement below for details.
    */
  var orStatement: js.UndefOr[
    WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementOrStatement
  ] = js.native
  
  /**
    * A rule statement used to search web request components for matches with regular expressions. See Regex Pattern Set Reference Statement below for details.
    */
  var regexPatternSetReferenceStatement: js.UndefOr[
    WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementRegexPatternSetReferenceStatement
  ] = js.native
  
  /**
    * A rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (>) or less than (<). See Size Constraint Statement below for more details.
    */
  var sizeConstraintStatement: js.UndefOr[
    WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementSizeConstraintStatement
  ] = js.native
  
  /**
    * An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. See SQL Injection Match Statement below for details.
    */
  var sqliMatchStatement: js.UndefOr[
    WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementSqliMatchStatement
  ] = js.native
  
  /**
    * A rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. See XSS Match Statement below for details.
    */
  var xssMatchStatement: js.UndefOr[
    WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementXssMatchStatement
  ] = js.native
}
object WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatement {
  
  @scala.inline
  def apply(): WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatement]
  }
  
  @scala.inline
  implicit class WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementOps[Self <: WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatement] (val x: Self) extends AnyVal {
    
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
    def setAndStatement(value: WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementAndStatement): Self = this.set("andStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAndStatement: Self = this.set("andStatement", js.undefined)
    
    @scala.inline
    def setByteMatchStatement(
      value: WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementByteMatchStatement
    ): Self = this.set("byteMatchStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteByteMatchStatement: Self = this.set("byteMatchStatement", js.undefined)
    
    @scala.inline
    def setGeoMatchStatement(
      value: WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementGeoMatchStatement
    ): Self = this.set("geoMatchStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeoMatchStatement: Self = this.set("geoMatchStatement", js.undefined)
    
    @scala.inline
    def setIpSetReferenceStatement(
      value: WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementIpSetReferenceStatement
    ): Self = this.set("ipSetReferenceStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpSetReferenceStatement: Self = this.set("ipSetReferenceStatement", js.undefined)
    
    @scala.inline
    def setNotStatement(value: WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatement): Self = this.set("notStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotStatement: Self = this.set("notStatement", js.undefined)
    
    @scala.inline
    def setOrStatement(value: WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementOrStatement): Self = this.set("orStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrStatement: Self = this.set("orStatement", js.undefined)
    
    @scala.inline
    def setRegexPatternSetReferenceStatement(
      value: WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementRegexPatternSetReferenceStatement
    ): Self = this.set("regexPatternSetReferenceStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegexPatternSetReferenceStatement: Self = this.set("regexPatternSetReferenceStatement", js.undefined)
    
    @scala.inline
    def setSizeConstraintStatement(
      value: WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementSizeConstraintStatement
    ): Self = this.set("sizeConstraintStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizeConstraintStatement: Self = this.set("sizeConstraintStatement", js.undefined)
    
    @scala.inline
    def setSqliMatchStatement(
      value: WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementSqliMatchStatement
    ): Self = this.set("sqliMatchStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSqliMatchStatement: Self = this.set("sqliMatchStatement", js.undefined)
    
    @scala.inline
    def setXssMatchStatement(
      value: WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementXssMatchStatement
    ): Self = this.set("xssMatchStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXssMatchStatement: Self = this.set("xssMatchStatement", js.undefined)
  }
}
