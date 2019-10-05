package typings.atPulumiAws.typesOutputMod.cloudfront

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DistributionRestrictionsGeoRestriction extends js.Object {
  /**
    * The [ISO 3166-1-alpha-2 codes][4] for which you
    * want CloudFront either to distribute your content (`whitelist`) or not
    * distribute your content (`blacklist`).
    */
  var locations: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The method that you want to use to restrict
    * distribution of your content by country: `none`, `whitelist`, or
    * `blacklist`.
    */
  var restrictionType: String
}

object DistributionRestrictionsGeoRestriction {
  @scala.inline
  def apply(restrictionType: String, locations: js.Array[String] = null): DistributionRestrictionsGeoRestriction = {
    val __obj = js.Dynamic.literal(restrictionType = restrictionType)
    if (locations != null) __obj.updateDynamic("locations")(locations)
    __obj.asInstanceOf[DistributionRestrictionsGeoRestriction]
  }
}

