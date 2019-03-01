package typings
package atPulumiAwsLib.ec2EgressOnlyInternetGatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EgressOnlyInternetGatewayState extends js.Object {
  /**
    * The VPC ID to create in.
    */
  val vpcId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object EgressOnlyInternetGatewayState {
  @scala.inline
  def apply(vpcId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null): EgressOnlyInternetGatewayState = {
    val __obj = js.Dynamic.literal()
    if (vpcId != null) __obj.updateDynamic("vpcId")(vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EgressOnlyInternetGatewayState]
  }
}

