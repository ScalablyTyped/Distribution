package typings.atPulumiAws.typesInputMod.route53

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoneVpc extends js.Object {
  /**
    * ID of the VPC to associate.
    */
  var vpcId: Input[String]
  /**
    * Region of the VPC to associate. Defaults to AWS provider region.
    */
  var vpcRegion: js.UndefOr[Input[String]] = js.undefined
}

object ZoneVpc {
  @scala.inline
  def apply(vpcId: Input[String], vpcRegion: Input[String] = null): ZoneVpc = {
    val __obj = js.Dynamic.literal(vpcId = vpcId.asInstanceOf[js.Any])
    if (vpcRegion != null) __obj.updateDynamic("vpcRegion")(vpcRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoneVpc]
  }
}

