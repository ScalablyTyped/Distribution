package typings
package atPulumiAwsLib.cloud9EnvironmentEC2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnvironmentEC2Args extends js.Object {
  /**
    * The number of minutes until the running instance is shut down after the environment has last been used.
    */
  val automaticStopTimeMinutes: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  /**
    * The description of the environment.
    */
  val description: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The type of instance to connect to the environment, e.g. `t2.micro`.
    */
  val instanceType: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The name of the environment.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The ARN of the environment owner. This can be ARN of any AWS IAM principal. Defaults to the environment's creator.
    */
  val ownerArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The ID of the subnet in Amazon VPC that AWS Cloud9 will use to communicate with the Amazon EC2 instance.
    */
  val subnetId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object EnvironmentEC2Args {
  @scala.inline
  def apply(
    instanceType: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    automaticStopTimeMinutes: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    description: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    ownerArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    subnetId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): EnvironmentEC2Args = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("instanceType")(instanceType.asInstanceOf[js.Any])
    if (automaticStopTimeMinutes != null) __obj.updateDynamic("automaticStopTimeMinutes")(automaticStopTimeMinutes.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (ownerArn != null) __obj.updateDynamic("ownerArn")(ownerArn.asInstanceOf[js.Any])
    if (subnetId != null) __obj.updateDynamic("subnetId")(subnetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentEC2Args]
  }
}

