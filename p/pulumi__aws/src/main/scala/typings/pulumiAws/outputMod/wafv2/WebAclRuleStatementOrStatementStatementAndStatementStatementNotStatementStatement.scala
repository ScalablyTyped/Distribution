package typings.pulumiAws.outputMod.wafv2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatement extends js.Object {
  
  /**
    * A rule statement that defines a string match search for AWS WAF to apply to web requests. See Byte Match Statement below for details.
    */
  var byteMatchStatement: js.UndefOr[
    WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementByteMatchStatement
  ] = js.native
  
  /**
    * A rule statement used to identify web requests based on country of origin. See GEO Match Statement below for details.
    */
  var geoMatchStatement: js.UndefOr[
    WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementGeoMatchStatement
  ] = js.native
  
  /**
    * A rule statement used to detect web requests coming from particular IP addresses or address ranges. See IP Set Reference Statement below for details.
    */
  var ipSetReferenceStatement: js.UndefOr[
    WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementIpSetReferenceStatement
  ] = js.native
  
  /**
    * A rule statement used to search web request components for matches with regular expressions. See Regex Pattern Set Reference Statement below for details.
    */
  var regexPatternSetReferenceStatement: js.UndefOr[
    WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementRegexPatternSetReferenceStatement
  ] = js.native
  
  /**
    * A rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (>) or less than (<). See Size Constraint Statement below for more details.
    */
  var sizeConstraintStatement: js.UndefOr[
    WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementSizeConstraintStatement
  ] = js.native
  
  /**
    * An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. See SQL Injection Match Statement below for details.
    */
  var sqliMatchStatement: js.UndefOr[
    WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementSqliMatchStatement
  ] = js.native
  
  /**
    * A rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. See XSS Match Statement below for details.
    */
  var xssMatchStatement: js.UndefOr[
    WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementXssMatchStatement
  ] = js.native
}
object WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatement {
  
  @scala.inline
  def apply(): WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatement]
  }
  
  @scala.inline
  implicit class WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementOps[Self <: WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatement] (val x: Self) extends AnyVal {
    
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
    def setByteMatchStatement(
      value: WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementByteMatchStatement
    ): Self = this.set("byteMatchStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteByteMatchStatement: Self = this.set("byteMatchStatement", js.undefined)
    
    @scala.inline
    def setGeoMatchStatement(
      value: WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementGeoMatchStatement
    ): Self = this.set("geoMatchStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeoMatchStatement: Self = this.set("geoMatchStatement", js.undefined)
    
    @scala.inline
    def setIpSetReferenceStatement(
      value: WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementIpSetReferenceStatement
    ): Self = this.set("ipSetReferenceStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpSetReferenceStatement: Self = this.set("ipSetReferenceStatement", js.undefined)
    
    @scala.inline
    def setRegexPatternSetReferenceStatement(
      value: WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementRegexPatternSetReferenceStatement
    ): Self = this.set("regexPatternSetReferenceStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegexPatternSetReferenceStatement: Self = this.set("regexPatternSetReferenceStatement", js.undefined)
    
    @scala.inline
    def setSizeConstraintStatement(
      value: WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementSizeConstraintStatement
    ): Self = this.set("sizeConstraintStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizeConstraintStatement: Self = this.set("sizeConstraintStatement", js.undefined)
    
    @scala.inline
    def setSqliMatchStatement(
      value: WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementSqliMatchStatement
    ): Self = this.set("sqliMatchStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSqliMatchStatement: Self = this.set("sqliMatchStatement", js.undefined)
    
    @scala.inline
    def setXssMatchStatement(
      value: WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementXssMatchStatement
    ): Self = this.set("xssMatchStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXssMatchStatement: Self = this.set("xssMatchStatement", js.undefined)
  }
}
