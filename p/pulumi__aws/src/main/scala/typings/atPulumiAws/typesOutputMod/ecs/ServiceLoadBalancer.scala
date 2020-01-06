package typings.atPulumiAws.typesOutputMod.ecs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceLoadBalancer extends js.Object {
  var containerName: String = js.native
  var containerPort: Double = js.native
  var elbName: js.UndefOr[String] = js.native
  var targetGroupArn: js.UndefOr[String] = js.native
}

object ServiceLoadBalancer {
  @scala.inline
  def apply(
    containerName: String,
    containerPort: Double,
    elbName: String = null,
    targetGroupArn: String = null
  ): ServiceLoadBalancer = {
    val __obj = js.Dynamic.literal(containerName = containerName.asInstanceOf[js.Any], containerPort = containerPort.asInstanceOf[js.Any])
    if (elbName != null) __obj.updateDynamic("elbName")(elbName.asInstanceOf[js.Any])
    if (targetGroupArn != null) __obj.updateDynamic("targetGroupArn")(targetGroupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceLoadBalancer]
  }
}

