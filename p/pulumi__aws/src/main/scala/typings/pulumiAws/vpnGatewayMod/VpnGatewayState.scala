package typings.pulumiAws.vpnGatewayMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpnGatewayState extends js.Object {
  /**
    * The Autonomous System Number (ASN) for the Amazon side of the gateway. If you don't specify an ASN, the virtual private gateway is created with the default ASN.
    */
  val amazonSideAsn: js.UndefOr[Input[String]] = js.native
  /**
    * The Availability Zone for the virtual private gateway.
    */
  val availabilityZone: js.UndefOr[Input[String]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * The VPC ID to create in.
    */
  val vpcId: js.UndefOr[Input[String]] = js.native
}

object VpnGatewayState {
  @scala.inline
  def apply(
    amazonSideAsn: Input[String] = null,
    availabilityZone: Input[String] = null,
    tags: Input[StringDictionary[_]] = null,
    vpcId: Input[String] = null
  ): VpnGatewayState = {
    val __obj = js.Dynamic.literal()
    if (amazonSideAsn != null) __obj.updateDynamic("amazonSideAsn")(amazonSideAsn.asInstanceOf[js.Any])
    if (availabilityZone != null) __obj.updateDynamic("availabilityZone")(availabilityZone.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (vpcId != null) __obj.updateDynamic("vpcId")(vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpnGatewayState]
  }
}

