package typings
package atPulumiAwsLib.ec2clientvpnNetworkAssociationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkAssociationArgs extends js.Object {
  /**
    * The ID of the Client VPN endpoint.
    */
  val clientVpnEndpointId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The ID of the subnet to associate with the Client VPN endpoint.
    */
  val subnetId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object NetworkAssociationArgs {
  @scala.inline
  def apply(
    clientVpnEndpointId: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    subnetId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  ): NetworkAssociationArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clientVpnEndpointId")(clientVpnEndpointId.asInstanceOf[js.Any])
    __obj.updateDynamic("subnetId")(subnetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkAssociationArgs]
  }
}

