package typings.pulumiAws.outputMod.ecs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceServiceRegistries extends js.Object {
  var containerName: js.UndefOr[String] = js.native
  var containerPort: js.UndefOr[Double] = js.native
  var port: js.UndefOr[Double] = js.native
  var registryArn: String = js.native
}

object ServiceServiceRegistries {
  @scala.inline
  def apply(
    registryArn: String,
    containerName: String = null,
    containerPort: js.UndefOr[Double] = js.undefined,
    port: js.UndefOr[Double] = js.undefined
  ): ServiceServiceRegistries = {
    val __obj = js.Dynamic.literal(registryArn = registryArn.asInstanceOf[js.Any])
    if (containerName != null) __obj.updateDynamic("containerName")(containerName.asInstanceOf[js.Any])
    if (!js.isUndefined(containerPort)) __obj.updateDynamic("containerPort")(containerPort.get.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceServiceRegistries]
  }
}

