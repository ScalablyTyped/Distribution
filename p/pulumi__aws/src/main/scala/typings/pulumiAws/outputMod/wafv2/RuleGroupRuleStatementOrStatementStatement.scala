package typings.pulumiAws.outputMod.wafv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleGroupRuleStatementOrStatementStatement extends StObject {
  
  /**
    * A logical rule statement used to combine other rule statements with AND logic. See AND Statement below for details.
    */
  var andStatement: js.UndefOr[RuleGroupRuleStatementOrStatementStatementAndStatement] = js.undefined
  
  /**
    * A rule statement that defines a string match search for AWS WAF to apply to web requests. See Byte Match Statement below for details.
    */
  var byteMatchStatement: js.UndefOr[RuleGroupRuleStatementOrStatementStatementByteMatchStatement] = js.undefined
  
  /**
    * A rule statement used to identify web requests based on country of origin. See GEO Match Statement below for details.
    */
  var geoMatchStatement: js.UndefOr[RuleGroupRuleStatementOrStatementStatementGeoMatchStatement] = js.undefined
  
  /**
    * A rule statement used to detect web requests coming from particular IP addresses or address ranges. See IP Set Reference Statement below for details.
    */
  var ipSetReferenceStatement: js.UndefOr[RuleGroupRuleStatementOrStatementStatementIpSetReferenceStatement] = js.undefined
  
  /**
    * A logical rule statement used to negate the results of another rule statement. See NOT Statement below for details.
    */
  var notStatement: js.UndefOr[RuleGroupRuleStatementOrStatementStatementNotStatement] = js.undefined
  
  /**
    * A logical rule statement used to combine other rule statements with OR logic. See OR Statement below for details.
    */
  var orStatement: js.UndefOr[RuleGroupRuleStatementOrStatementStatementOrStatement] = js.undefined
  
  /**
    * A rule statement used to search web request components for matches with regular expressions. See Regex Pattern Set Reference Statement below for details.
    */
  var regexPatternSetReferenceStatement: js.UndefOr[RuleGroupRuleStatementOrStatementStatementRegexPatternSetReferenceStatement] = js.undefined
  
  /**
    * A rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (>) or less than (<). See Size Constraint Statement below for more details.
    */
  var sizeConstraintStatement: js.UndefOr[RuleGroupRuleStatementOrStatementStatementSizeConstraintStatement] = js.undefined
  
  /**
    * An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. See SQL Injection Match Statement below for details.
    */
  var sqliMatchStatement: js.UndefOr[RuleGroupRuleStatementOrStatementStatementSqliMatchStatement] = js.undefined
  
  /**
    * A rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. See XSS Match Statement below for details.
    */
  var xssMatchStatement: js.UndefOr[RuleGroupRuleStatementOrStatementStatementXssMatchStatement] = js.undefined
}
object RuleGroupRuleStatementOrStatementStatement {
  
  inline def apply(): RuleGroupRuleStatementOrStatementStatement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleGroupRuleStatementOrStatementStatement]
  }
  
  extension [Self <: RuleGroupRuleStatementOrStatementStatement](x: Self) {
    
    inline def setAndStatement(value: RuleGroupRuleStatementOrStatementStatementAndStatement): Self = StObject.set(x, "andStatement", value.asInstanceOf[js.Any])
    
    inline def setAndStatementUndefined: Self = StObject.set(x, "andStatement", js.undefined)
    
    inline def setByteMatchStatement(value: RuleGroupRuleStatementOrStatementStatementByteMatchStatement): Self = StObject.set(x, "byteMatchStatement", value.asInstanceOf[js.Any])
    
    inline def setByteMatchStatementUndefined: Self = StObject.set(x, "byteMatchStatement", js.undefined)
    
    inline def setGeoMatchStatement(value: RuleGroupRuleStatementOrStatementStatementGeoMatchStatement): Self = StObject.set(x, "geoMatchStatement", value.asInstanceOf[js.Any])
    
    inline def setGeoMatchStatementUndefined: Self = StObject.set(x, "geoMatchStatement", js.undefined)
    
    inline def setIpSetReferenceStatement(value: RuleGroupRuleStatementOrStatementStatementIpSetReferenceStatement): Self = StObject.set(x, "ipSetReferenceStatement", value.asInstanceOf[js.Any])
    
    inline def setIpSetReferenceStatementUndefined: Self = StObject.set(x, "ipSetReferenceStatement", js.undefined)
    
    inline def setNotStatement(value: RuleGroupRuleStatementOrStatementStatementNotStatement): Self = StObject.set(x, "notStatement", value.asInstanceOf[js.Any])
    
    inline def setNotStatementUndefined: Self = StObject.set(x, "notStatement", js.undefined)
    
    inline def setOrStatement(value: RuleGroupRuleStatementOrStatementStatementOrStatement): Self = StObject.set(x, "orStatement", value.asInstanceOf[js.Any])
    
    inline def setOrStatementUndefined: Self = StObject.set(x, "orStatement", js.undefined)
    
    inline def setRegexPatternSetReferenceStatement(value: RuleGroupRuleStatementOrStatementStatementRegexPatternSetReferenceStatement): Self = StObject.set(x, "regexPatternSetReferenceStatement", value.asInstanceOf[js.Any])
    
    inline def setRegexPatternSetReferenceStatementUndefined: Self = StObject.set(x, "regexPatternSetReferenceStatement", js.undefined)
    
    inline def setSizeConstraintStatement(value: RuleGroupRuleStatementOrStatementStatementSizeConstraintStatement): Self = StObject.set(x, "sizeConstraintStatement", value.asInstanceOf[js.Any])
    
    inline def setSizeConstraintStatementUndefined: Self = StObject.set(x, "sizeConstraintStatement", js.undefined)
    
    inline def setSqliMatchStatement(value: RuleGroupRuleStatementOrStatementStatementSqliMatchStatement): Self = StObject.set(x, "sqliMatchStatement", value.asInstanceOf[js.Any])
    
    inline def setSqliMatchStatementUndefined: Self = StObject.set(x, "sqliMatchStatement", js.undefined)
    
    inline def setXssMatchStatement(value: RuleGroupRuleStatementOrStatementStatementXssMatchStatement): Self = StObject.set(x, "xssMatchStatement", value.asInstanceOf[js.Any])
    
    inline def setXssMatchStatementUndefined: Self = StObject.set(x, "xssMatchStatement", js.undefined)
  }
}
