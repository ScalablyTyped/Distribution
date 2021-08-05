package typings.pulumiAws.outputMod.waf

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RulePredicate extends StObject {
  
  /**
    * A unique identifier for a predicate in the rule, such as Byte Match Set ID or IPSet ID.
    */
  var dataId: String
  
  /**
    * Set this to `false` if you want to allow, block, or count requests
    * based on the settings in the specified `wafByteMatchSet`, `wafIpset`, `aws.waf.SizeConstraintSet`, `aws.waf.SqlInjectionMatchSet` or `aws.waf.XssMatchSet`.
    * For example, if an IPSet includes the IP address `192.0.2.44`, AWS WAF will allow or block requests based on that IP address.
    * If set to `true`, AWS WAF will allow, block, or count requests based on all IP addresses except `192.0.2.44`.
    */
  var negated: Boolean
  
  /**
    * The type of predicate in a rule. Valid values: `ByteMatch`, `GeoMatch`, `IPMatch`, `RegexMatch`, `SizeConstraint`, `SqlInjectionMatch`, or `XssMatch`.
    */
  var `type`: String
}
object RulePredicate {
  
  inline def apply(dataId: String, negated: Boolean, `type`: String): RulePredicate = {
    val __obj = js.Dynamic.literal(dataId = dataId.asInstanceOf[js.Any], negated = negated.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RulePredicate]
  }
  
  extension [Self <: RulePredicate](x: Self) {
    
    inline def setDataId(value: String): Self = StObject.set(x, "dataId", value.asInstanceOf[js.Any])
    
    inline def setNegated(value: Boolean): Self = StObject.set(x, "negated", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
