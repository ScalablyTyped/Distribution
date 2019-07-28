package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContainerName extends js.Object {
  var containerName: String
  var containerPort: Double
  var elbName: js.UndefOr[String] = js.undefined
  var targetGroupArn: js.UndefOr[String] = js.undefined
}

object Anon_ContainerName {
  @scala.inline
  def apply(
    containerName: String,
    containerPort: Double,
    elbName: String = null,
    targetGroupArn: String = null
  ): Anon_ContainerName = {
    val __obj = js.Dynamic.literal(containerName = containerName, containerPort = containerPort)
    if (elbName != null) __obj.updateDynamic("elbName")(elbName)
    if (targetGroupArn != null) __obj.updateDynamic("targetGroupArn")(targetGroupArn)
    __obj.asInstanceOf[Anon_ContainerName]
  }
}

