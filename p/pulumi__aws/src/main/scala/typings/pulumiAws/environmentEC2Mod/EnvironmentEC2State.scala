package typings.pulumiAws.environmentEC2Mod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnvironmentEC2State extends js.Object {
  /**
    * The ARN of the environment.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The number of minutes until the running instance is shut down after the environment has last been used.
    */
  val automaticStopTimeMinutes: js.UndefOr[Input[Double]] = js.native
  /**
    * The description of the environment.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * The type of instance to connect to the environment, e.g. `t2.micro`.
    */
  val instanceType: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the environment.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The ARN of the environment owner. This can be ARN of any AWS IAM principal. Defaults to the environment's creator.
    */
  val ownerArn: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the subnet in Amazon VPC that AWS Cloud9 will use to communicate with the Amazon EC2 instance.
    */
  val subnetId: js.UndefOr[Input[String]] = js.native
  /**
    * The type of the environment (e.g. `ssh` or `ec2`)
    */
  val `type`: js.UndefOr[Input[String]] = js.native
}

object EnvironmentEC2State {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    automaticStopTimeMinutes: Input[Double] = null,
    description: Input[String] = null,
    instanceType: Input[String] = null,
    name: Input[String] = null,
    ownerArn: Input[String] = null,
    subnetId: Input[String] = null,
    `type`: Input[String] = null
  ): EnvironmentEC2State = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (automaticStopTimeMinutes != null) __obj.updateDynamic("automaticStopTimeMinutes")(automaticStopTimeMinutes.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (instanceType != null) __obj.updateDynamic("instanceType")(instanceType.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (ownerArn != null) __obj.updateDynamic("ownerArn")(ownerArn.asInstanceOf[js.Any])
    if (subnetId != null) __obj.updateDynamic("subnetId")(subnetId.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentEC2State]
  }
}

