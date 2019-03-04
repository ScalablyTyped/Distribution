package typings
package atPulumiAwsLib.route53ZoneAssociationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoneAssociationArgs extends js.Object {
  /**
    * The VPC to associate with the private hosted zone.
    */
  val vpcId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The VPC's region. Defaults to the region of the AWS provider.
    */
  val vpcRegion: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The private hosted zone to associate.
    */
  val zoneId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object ZoneAssociationArgs {
  @scala.inline
  def apply(
    vpcId: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    zoneId: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    vpcRegion: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): ZoneAssociationArgs = {
    val __obj = js.Dynamic.literal(vpcId = vpcId.asInstanceOf[js.Any], zoneId = zoneId.asInstanceOf[js.Any])
    if (vpcRegion != null) __obj.updateDynamic("vpcRegion")(vpcRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoneAssociationArgs]
  }
}

