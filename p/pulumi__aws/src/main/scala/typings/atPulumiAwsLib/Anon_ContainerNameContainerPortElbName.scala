package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContainerNameContainerPortElbName extends js.Object {
  var containerName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var containerPort: atPulumiPulumiLib.outputMod.Input[scala.Double]
  var elbName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var targetGroupArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object Anon_ContainerNameContainerPortElbName {
  @scala.inline
  def apply(
    containerName: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    containerPort: atPulumiPulumiLib.outputMod.Input[scala.Double],
    elbName: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    targetGroupArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_ContainerNameContainerPortElbName = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("containerName")(containerName.asInstanceOf[js.Any])
    __obj.updateDynamic("containerPort")(containerPort.asInstanceOf[js.Any])
    if (elbName != null) __obj.updateDynamic("elbName")(elbName.asInstanceOf[js.Any])
    if (targetGroupArn != null) __obj.updateDynamic("targetGroupArn")(targetGroupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ContainerNameContainerPortElbName]
  }
}

