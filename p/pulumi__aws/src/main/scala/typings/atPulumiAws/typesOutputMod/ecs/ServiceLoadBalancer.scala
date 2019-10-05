package typings.atPulumiAws.typesOutputMod.ecs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceLoadBalancer extends js.Object {
  var containerName: String
  var containerPort: Double
  var elbName: js.UndefOr[String] = js.undefined
  var targetGroupArn: js.UndefOr[String] = js.undefined
}

object ServiceLoadBalancer {
  @scala.inline
  def apply(
    containerName: String,
    containerPort: Double,
    elbName: String = null,
    targetGroupArn: String = null
  ): ServiceLoadBalancer = {
    val __obj = js.Dynamic.literal(containerName = containerName, containerPort = containerPort)
    if (elbName != null) __obj.updateDynamic("elbName")(elbName)
    if (targetGroupArn != null) __obj.updateDynamic("targetGroupArn")(targetGroupArn)
    __obj.asInstanceOf[ServiceLoadBalancer]
  }
}

