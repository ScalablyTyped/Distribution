package typings.atPulumiAws.typesInputMod.cloudfrontNs

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DistributionRestrictions extends js.Object {
  var geoRestriction: Input[DistributionRestrictionsGeoRestriction]
}

object DistributionRestrictions {
  @scala.inline
  def apply(geoRestriction: Input[DistributionRestrictionsGeoRestriction]): DistributionRestrictions = {
    val __obj = js.Dynamic.literal(geoRestriction = geoRestriction.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DistributionRestrictions]
  }
}

