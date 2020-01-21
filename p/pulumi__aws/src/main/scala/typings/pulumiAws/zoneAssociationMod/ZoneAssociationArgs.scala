package typings.pulumiAws.zoneAssociationMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZoneAssociationArgs extends js.Object {
  /**
    * The VPC to associate with the private hosted zone.
    */
  val vpcId: Input[String] = js.native
  /**
    * The VPC's region. Defaults to the region of the AWS provider.
    */
  val vpcRegion: js.UndefOr[Input[String]] = js.native
  /**
    * The private hosted zone to associate.
    */
  val zoneId: Input[String] = js.native
}

object ZoneAssociationArgs {
  @scala.inline
  def apply(vpcId: Input[String], zoneId: Input[String], vpcRegion: Input[String] = null): ZoneAssociationArgs = {
    val __obj = js.Dynamic.literal(vpcId = vpcId.asInstanceOf[js.Any], zoneId = zoneId.asInstanceOf[js.Any])
    if (vpcRegion != null) __obj.updateDynamic("vpcRegion")(vpcRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoneAssociationArgs]
  }
}

