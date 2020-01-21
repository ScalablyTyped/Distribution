package typings.pulumiAws.outputMod.ecs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceNetworkConfiguration extends js.Object {
  var assignPublicIp: js.UndefOr[Boolean] = js.native
  var securityGroups: js.UndefOr[js.Array[String]] = js.native
  var subnets: js.Array[String] = js.native
}

object ServiceNetworkConfiguration {
  @scala.inline
  def apply(
    subnets: js.Array[String],
    assignPublicIp: js.UndefOr[Boolean] = js.undefined,
    securityGroups: js.Array[String] = null
  ): ServiceNetworkConfiguration = {
    val __obj = js.Dynamic.literal(subnets = subnets.asInstanceOf[js.Any])
    if (!js.isUndefined(assignPublicIp)) __obj.updateDynamic("assignPublicIp")(assignPublicIp.asInstanceOf[js.Any])
    if (securityGroups != null) __obj.updateDynamic("securityGroups")(securityGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceNetworkConfiguration]
  }
}

