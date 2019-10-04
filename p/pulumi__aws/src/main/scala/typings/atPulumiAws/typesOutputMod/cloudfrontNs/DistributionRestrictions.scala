package typings.atPulumiAws.typesOutputMod.cloudfrontNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DistributionRestrictions extends js.Object {
  var geoRestriction: DistributionRestrictionsGeoRestriction
}

object DistributionRestrictions {
  @scala.inline
  def apply(geoRestriction: DistributionRestrictionsGeoRestriction): DistributionRestrictions = {
    val __obj = js.Dynamic.literal(geoRestriction = geoRestriction)
  
    __obj.asInstanceOf[DistributionRestrictions]
  }
}

