package typings.pulumiAws.zoneAssociationMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZoneAssociationState extends js.Object {
  /**
    * The VPC to associate with the private hosted zone.
    */
  val vpcId: js.UndefOr[Input[String]] = js.native
  /**
    * The VPC's region. Defaults to the region of the AWS provider.
    */
  val vpcRegion: js.UndefOr[Input[String]] = js.native
  /**
    * The private hosted zone to associate.
    */
  val zoneId: js.UndefOr[Input[String]] = js.native
}

object ZoneAssociationState {
  @scala.inline
  def apply(vpcId: Input[String] = null, vpcRegion: Input[String] = null, zoneId: Input[String] = null): ZoneAssociationState = {
    val __obj = js.Dynamic.literal()
    if (vpcId != null) __obj.updateDynamic("vpcId")(vpcId.asInstanceOf[js.Any])
    if (vpcRegion != null) __obj.updateDynamic("vpcRegion")(vpcRegion.asInstanceOf[js.Any])
    if (zoneId != null) __obj.updateDynamic("zoneId")(zoneId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoneAssociationState]
  }
}

