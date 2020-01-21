package typings.pulumiAws.inputMod.ecs

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceLoadBalancer extends js.Object {
  var containerName: Input[String] = js.native
  var containerPort: Input[Double] = js.native
  var elbName: js.UndefOr[Input[String]] = js.native
  var targetGroupArn: js.UndefOr[Input[String]] = js.native
}

object ServiceLoadBalancer {
  @scala.inline
  def apply(
    containerName: Input[String],
    containerPort: Input[Double],
    elbName: Input[String] = null,
    targetGroupArn: Input[String] = null
  ): ServiceLoadBalancer = {
    val __obj = js.Dynamic.literal(containerName = containerName.asInstanceOf[js.Any], containerPort = containerPort.asInstanceOf[js.Any])
    if (elbName != null) __obj.updateDynamic("elbName")(elbName.asInstanceOf[js.Any])
    if (targetGroupArn != null) __obj.updateDynamic("targetGroupArn")(targetGroupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceLoadBalancer]
  }
}

