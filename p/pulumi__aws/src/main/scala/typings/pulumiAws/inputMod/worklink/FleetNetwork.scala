package typings.pulumiAws.inputMod.worklink

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FleetNetwork extends js.Object {
  /**
    * A list of security group IDs associated with access to the provided subnets.
    */
  var securityGroupIds: Input[js.Array[Input[String]]] = js.native
  /**
    * A list of subnet IDs used for X-ENI connections from Amazon WorkLink rendering containers.
    */
  var subnetIds: Input[js.Array[Input[String]]] = js.native
  /**
    * The VPC ID with connectivity to associated websites.
    */
  var vpcId: Input[String] = js.native
}

object FleetNetwork {
  @scala.inline
  def apply(
    securityGroupIds: Input[js.Array[Input[String]]],
    subnetIds: Input[js.Array[Input[String]]],
    vpcId: Input[String]
  ): FleetNetwork = {
    val __obj = js.Dynamic.literal(securityGroupIds = securityGroupIds.asInstanceOf[js.Any], subnetIds = subnetIds.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FleetNetwork]
  }
}

