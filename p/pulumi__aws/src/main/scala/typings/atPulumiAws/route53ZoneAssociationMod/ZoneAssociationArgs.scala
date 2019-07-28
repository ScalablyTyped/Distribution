package typings.atPulumiAws.route53ZoneAssociationMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoneAssociationArgs extends js.Object {
  /**
    * The VPC to associate with the private hosted zone.
    */
  val vpcId: Input[String]
  /**
    * The VPC's region. Defaults to the region of the AWS provider.
    */
  val vpcRegion: js.UndefOr[Input[String]] = js.undefined
  /**
    * The private hosted zone to associate.
    */
  val zoneId: Input[String]
}

object ZoneAssociationArgs {
  @scala.inline
  def apply(vpcId: Input[String], zoneId: Input[String], vpcRegion: Input[String] = null): ZoneAssociationArgs = {
    val __obj = js.Dynamic.literal(vpcId = vpcId.asInstanceOf[js.Any], zoneId = zoneId.asInstanceOf[js.Any])
    if (vpcRegion != null) __obj.updateDynamic("vpcRegion")(vpcRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoneAssociationArgs]
  }
}

