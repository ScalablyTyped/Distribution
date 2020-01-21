package typings.pulumiAws.inputMod.cloudfront

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DistributionRestrictions extends js.Object {
  var geoRestriction: Input[DistributionRestrictionsGeoRestriction] = js.native
}

object DistributionRestrictions {
  @scala.inline
  def apply(geoRestriction: Input[DistributionRestrictionsGeoRestriction]): DistributionRestrictions = {
    val __obj = js.Dynamic.literal(geoRestriction = geoRestriction.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DistributionRestrictions]
  }
}

