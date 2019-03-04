package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContainerNameContainerPort extends js.Object {
  var containerName: js.UndefOr[java.lang.String] = js.undefined
  var containerPort: js.UndefOr[scala.Double] = js.undefined
  var port: js.UndefOr[scala.Double] = js.undefined
  var registryArn: java.lang.String
}

object Anon_ContainerNameContainerPort {
  @scala.inline
  def apply(
    registryArn: java.lang.String,
    containerName: java.lang.String = null,
    containerPort: scala.Int | scala.Double = null,
    port: scala.Int | scala.Double = null
  ): Anon_ContainerNameContainerPort = {
    val __obj = js.Dynamic.literal(registryArn = registryArn)
    if (containerName != null) __obj.updateDynamic("containerName")(containerName)
    if (containerPort != null) __obj.updateDynamic("containerPort")(containerPort.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ContainerNameContainerPort]
  }
}

