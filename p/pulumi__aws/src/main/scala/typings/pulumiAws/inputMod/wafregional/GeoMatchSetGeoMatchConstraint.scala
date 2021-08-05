package typings.pulumiAws.inputMod.wafregional

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoMatchSetGeoMatchConstraint extends StObject {
  
  /**
    * The type of geographical area you want AWS WAF to search for. Currently Country is the only valid value.
    */
  var `type`: Input[String]
  
  /**
    * The country that you want AWS WAF to search for.
    * This is the two-letter country code, e.g. `US`, `CA`, `RU`, `CN`, etc.
    * See [docs](https://docs.aws.amazon.com/waf/latest/APIReference/API_GeoMatchConstraint.html) for all supported values.
    */
  var value: Input[String]
}
object GeoMatchSetGeoMatchConstraint {
  
  inline def apply(`type`: Input[String], value: Input[String]): GeoMatchSetGeoMatchConstraint = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoMatchSetGeoMatchConstraint]
  }
  
  extension [Self <: GeoMatchSetGeoMatchConstraint](x: Self) {
    
    inline def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Input[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
