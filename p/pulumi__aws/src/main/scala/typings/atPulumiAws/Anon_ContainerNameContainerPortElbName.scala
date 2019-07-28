package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContainerNameContainerPortElbName extends js.Object {
  var containerName: Input[String]
  var containerPort: Input[Double]
  var elbName: js.UndefOr[Input[String]] = js.undefined
  var targetGroupArn: js.UndefOr[Input[String]] = js.undefined
}

object Anon_ContainerNameContainerPortElbName {
  @scala.inline
  def apply(
    containerName: Input[String],
    containerPort: Input[Double],
    elbName: Input[String] = null,
    targetGroupArn: Input[String] = null
  ): Anon_ContainerNameContainerPortElbName = {
    val __obj = js.Dynamic.literal(containerName = containerName.asInstanceOf[js.Any], containerPort = containerPort.asInstanceOf[js.Any])
    if (elbName != null) __obj.updateDynamic("elbName")(elbName.asInstanceOf[js.Any])
    if (targetGroupArn != null) __obj.updateDynamic("targetGroupArn")(targetGroupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ContainerNameContainerPortElbName]
  }
}

