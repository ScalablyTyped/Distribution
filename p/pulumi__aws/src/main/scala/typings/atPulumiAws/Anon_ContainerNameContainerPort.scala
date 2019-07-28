package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContainerNameContainerPort extends js.Object {
  var containerName: js.UndefOr[String] = js.undefined
  var containerPort: js.UndefOr[Double] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var registryArn: String
}

object Anon_ContainerNameContainerPort {
  @scala.inline
  def apply(
    registryArn: String,
    containerName: String = null,
    containerPort: Int | Double = null,
    port: Int | Double = null
  ): Anon_ContainerNameContainerPort = {
    val __obj = js.Dynamic.literal(registryArn = registryArn)
    if (containerName != null) __obj.updateDynamic("containerName")(containerName)
    if (containerPort != null) __obj.updateDynamic("containerPort")(containerPort.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ContainerNameContainerPort]
  }
}

