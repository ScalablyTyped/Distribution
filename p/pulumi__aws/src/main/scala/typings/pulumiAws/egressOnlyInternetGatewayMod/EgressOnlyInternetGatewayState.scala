package typings.pulumiAws.egressOnlyInternetGatewayMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EgressOnlyInternetGatewayState extends js.Object {
  /**
    * The VPC ID to create in.
    */
  val vpcId: js.UndefOr[Input[String]] = js.native
}

object EgressOnlyInternetGatewayState {
  @scala.inline
  def apply(vpcId: Input[String] = null): EgressOnlyInternetGatewayState = {
    val __obj = js.Dynamic.literal()
    if (vpcId != null) __obj.updateDynamic("vpcId")(vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EgressOnlyInternetGatewayState]
  }
}

