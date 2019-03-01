package typings
package atPulumiAwsLib.route53ZoneAssociationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoneAssociationState extends js.Object {
  /**
    * The VPC to associate with the private hosted zone.
    */
  val vpcId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The VPC's region. Defaults to the region of the AWS provider.
    */
  val vpcRegion: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The private hosted zone to associate.
    */
  val zoneId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object ZoneAssociationState {
  @scala.inline
  def apply(
    vpcId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    vpcRegion: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    zoneId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): ZoneAssociationState = {
    val __obj = js.Dynamic.literal()
    if (vpcId != null) __obj.updateDynamic("vpcId")(vpcId.asInstanceOf[js.Any])
    if (vpcRegion != null) __obj.updateDynamic("vpcRegion")(vpcRegion.asInstanceOf[js.Any])
    if (zoneId != null) __obj.updateDynamic("zoneId")(zoneId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoneAssociationState]
  }
}

