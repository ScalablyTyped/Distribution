package typings.pulumiAws.inputMod.ecs

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceServiceRegistries extends js.Object {
  var containerName: js.UndefOr[Input[String]] = js.native
  var containerPort: js.UndefOr[Input[Double]] = js.native
  var port: js.UndefOr[Input[Double]] = js.native
  var registryArn: Input[String] = js.native
}

object ServiceServiceRegistries {
  @scala.inline
  def apply(
    registryArn: Input[String],
    containerName: Input[String] = null,
    containerPort: Input[Double] = null,
    port: Input[Double] = null
  ): ServiceServiceRegistries = {
    val __obj = js.Dynamic.literal(registryArn = registryArn.asInstanceOf[js.Any])
    if (containerName != null) __obj.updateDynamic("containerName")(containerName.asInstanceOf[js.Any])
    if (containerPort != null) __obj.updateDynamic("containerPort")(containerPort.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceServiceRegistries]
  }
}

