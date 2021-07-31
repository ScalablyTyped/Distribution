package typings.pulumiAws.outputMod.cloudfront

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DistributionRestrictions extends StObject {
  
  var geoRestriction: DistributionRestrictionsGeoRestriction
}
object DistributionRestrictions {
  
  @scala.inline
  def apply(geoRestriction: DistributionRestrictionsGeoRestriction): DistributionRestrictions = {
    val __obj = js.Dynamic.literal(geoRestriction = geoRestriction.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionRestrictions]
  }
  
  @scala.inline
  implicit class DistributionRestrictionsMutableBuilder[Self <: DistributionRestrictions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGeoRestriction(value: DistributionRestrictionsGeoRestriction): Self = StObject.set(x, "geoRestriction", value.asInstanceOf[js.Any])
  }
}
