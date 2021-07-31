package typings.pulumiAws.inputMod.cloudfront

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DistributionRestrictionsGeoRestriction extends StObject {
  
  /**
    * The [ISO 3166-1-alpha-2 codes][4] for which you
    * want CloudFront either to distribute your content (`whitelist`) or not
    * distribute your content (`blacklist`).
    */
  var locations: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  
  /**
    * The method that you want to use to restrict
    * distribution of your content by country: `none`, `whitelist`, or
    * `blacklist`.
    */
  var restrictionType: Input[String]
}
object DistributionRestrictionsGeoRestriction {
  
  @scala.inline
  def apply(restrictionType: Input[String]): DistributionRestrictionsGeoRestriction = {
    val __obj = js.Dynamic.literal(restrictionType = restrictionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionRestrictionsGeoRestriction]
  }
  
  @scala.inline
  implicit class DistributionRestrictionsGeoRestrictionMutableBuilder[Self <: DistributionRestrictionsGeoRestriction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocations(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationsUndefined: Self = StObject.set(x, "locations", js.undefined)
    
    @scala.inline
    def setLocationsVarargs(value: Input[String]*): Self = StObject.set(x, "locations", js.Array(value :_*))
    
    @scala.inline
    def setRestrictionType(value: Input[String]): Self = StObject.set(x, "restrictionType", value.asInstanceOf[js.Any])
  }
}
