package typings.pulumiAws.inputMod.lambda

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionVpcConfig extends js.Object {
  /**
    * A list of security group IDs associated with the Lambda function.
    */
  var securityGroupIds: Input[js.Array[Input[String]]] = js.native
  /**
    * A list of subnet IDs associated with the Lambda function.
    */
  var subnetIds: Input[js.Array[Input[String]]] = js.native
  var vpcId: js.UndefOr[Input[String]] = js.native
}

object FunctionVpcConfig {
  @scala.inline
  def apply(
    securityGroupIds: Input[js.Array[Input[String]]],
    subnetIds: Input[js.Array[Input[String]]],
    vpcId: Input[String] = null
  ): FunctionVpcConfig = {
    val __obj = js.Dynamic.literal(securityGroupIds = securityGroupIds.asInstanceOf[js.Any], subnetIds = subnetIds.asInstanceOf[js.Any])
    if (vpcId != null) __obj.updateDynamic("vpcId")(vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionVpcConfig]
  }
}

