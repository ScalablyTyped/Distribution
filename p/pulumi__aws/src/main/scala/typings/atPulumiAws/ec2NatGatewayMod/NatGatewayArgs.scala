package typings.atPulumiAws.ec2NatGatewayMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NatGatewayArgs extends js.Object {
  /**
    * The Allocation ID of the Elastic IP address for the gateway.
    */
  val allocationId: Input[String] = js.native
  /**
    * The Subnet ID of the subnet in which to place the gateway.
    */
  val subnetId: Input[String] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object NatGatewayArgs {
  @scala.inline
  def apply(allocationId: Input[String], subnetId: Input[String], tags: Input[StringDictionary[_]] = null): NatGatewayArgs = {
    val __obj = js.Dynamic.literal(allocationId = allocationId.asInstanceOf[js.Any], subnetId = subnetId.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[NatGatewayArgs]
  }
}

