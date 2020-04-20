package typings.pulumiAws.outputMod.cloudfront

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DistributionRestrictions extends js.Object {
  var geoRestriction: DistributionRestrictionsGeoRestriction = js.native
}

object DistributionRestrictions {
  @scala.inline
  def apply(geoRestriction: DistributionRestrictionsGeoRestriction): DistributionRestrictions = {
    val __obj = js.Dynamic.literal(geoRestriction = geoRestriction.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionRestrictions]
  }
}

