package typings.pulumiAws.inputMod.cloudfront

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DistributionRestrictions extends StObject {
  
  var geoRestriction: Input[DistributionRestrictionsGeoRestriction]
}
object DistributionRestrictions {
  
  inline def apply(geoRestriction: Input[DistributionRestrictionsGeoRestriction]): DistributionRestrictions = {
    val __obj = js.Dynamic.literal(geoRestriction = geoRestriction.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionRestrictions]
  }
  
  extension [Self <: DistributionRestrictions](x: Self) {
    
    inline def setGeoRestriction(value: Input[DistributionRestrictionsGeoRestriction]): Self = StObject.set(x, "geoRestriction", value.asInstanceOf[js.Any])
  }
}
