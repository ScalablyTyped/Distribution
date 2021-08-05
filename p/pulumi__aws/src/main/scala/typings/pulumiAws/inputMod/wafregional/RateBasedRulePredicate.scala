package typings.pulumiAws.inputMod.wafregional

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RateBasedRulePredicate extends StObject {
  
  /**
    * A unique identifier for a predicate in the rule, such as Byte Match Set ID or IPSet ID.
    */
  var dataId: Input[String]
  
  /**
    * Set this to `false` if you want to allow, block, or count requests
    * based on the settings in the specified `ByteMatchSet`, `IPSet`, `SqlInjectionMatchSet`, `XssMatchSet`, or `SizeConstraintSet`.
    * For example, if an IPSet includes the IP address `192.0.2.44`, AWS WAF will allow or block requests based on that IP address.
    * If set to `true`, AWS WAF will allow, block, or count requests based on all IP addresses _except_ `192.0.2.44`.
    */
  var negated: Input[Boolean]
  
  /**
    * The type of predicate in a rule. Valid values: `ByteMatch`, `GeoMatch`, `IPMatch`, `RegexMatch`, `SizeConstraint`, `SqlInjectionMatch`, or `XssMatch`.
    */
  var `type`: Input[String]
}
object RateBasedRulePredicate {
  
  inline def apply(dataId: Input[String], negated: Input[Boolean], `type`: Input[String]): RateBasedRulePredicate = {
    val __obj = js.Dynamic.literal(dataId = dataId.asInstanceOf[js.Any], negated = negated.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RateBasedRulePredicate]
  }
  
  extension [Self <: RateBasedRulePredicate](x: Self) {
    
    inline def setDataId(value: Input[String]): Self = StObject.set(x, "dataId", value.asInstanceOf[js.Any])
    
    inline def setNegated(value: Input[Boolean]): Self = StObject.set(x, "negated", value.asInstanceOf[js.Any])
    
    inline def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
