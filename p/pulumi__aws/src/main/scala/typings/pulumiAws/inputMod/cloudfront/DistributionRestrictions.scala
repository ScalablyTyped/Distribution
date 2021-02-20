package typings.pulumiAws.inputMod.cloudfront

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DistributionRestrictions extends StObject {
  
  var geoRestriction: Input[DistributionRestrictionsGeoRestriction] = js.native
}
object DistributionRestrictions {
  
  @scala.inline
  def apply(geoRestriction: Input[DistributionRestrictionsGeoRestriction]): DistributionRestrictions = {
    val __obj = js.Dynamic.literal(geoRestriction = geoRestriction.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionRestrictions]
  }
  
  @scala.inline
  implicit class DistributionRestrictionsMutableBuilder[Self <: DistributionRestrictions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGeoRestriction(value: Input[DistributionRestrictionsGeoRestriction]): Self = StObject.set(x, "geoRestriction", value.asInstanceOf[js.Any])
  }
}
