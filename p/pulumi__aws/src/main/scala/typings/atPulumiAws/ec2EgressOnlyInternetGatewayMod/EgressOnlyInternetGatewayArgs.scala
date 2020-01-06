package typings.atPulumiAws.ec2EgressOnlyInternetGatewayMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EgressOnlyInternetGatewayArgs extends js.Object {
  /**
    * The VPC ID to create in.
    */
  val vpcId: Input[String] = js.native
}

object EgressOnlyInternetGatewayArgs {
  @scala.inline
  def apply(vpcId: Input[String]): EgressOnlyInternetGatewayArgs = {
    val __obj = js.Dynamic.literal(vpcId = vpcId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EgressOnlyInternetGatewayArgs]
  }
}

