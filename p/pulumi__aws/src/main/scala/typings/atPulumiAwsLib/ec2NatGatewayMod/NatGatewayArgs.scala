package typings
package atPulumiAwsLib.ec2NatGatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NatGatewayArgs extends js.Object {
  /**
    * The Allocation ID of the Elastic IP address for the gateway.
    */
  val allocationId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The Subnet ID of the subnet in which to place the gateway.
    */
  val subnetId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
}

object NatGatewayArgs {
  @scala.inline
  def apply(
    allocationId: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    subnetId: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    tags: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null
  ): NatGatewayArgs = {
    val __obj = js.Dynamic.literal(allocationId = allocationId.asInstanceOf[js.Any], subnetId = subnetId.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[NatGatewayArgs]
  }
}

