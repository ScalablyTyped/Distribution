package typings.pulumiAws.inputMod.ecs

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceNetworkConfiguration extends js.Object {
  var assignPublicIp: js.UndefOr[Input[Boolean]] = js.native
  var securityGroups: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  var subnets: Input[js.Array[Input[String]]] = js.native
}

object ServiceNetworkConfiguration {
  @scala.inline
  def apply(
    subnets: Input[js.Array[Input[String]]],
    assignPublicIp: Input[Boolean] = null,
    securityGroups: Input[js.Array[Input[String]]] = null
  ): ServiceNetworkConfiguration = {
    val __obj = js.Dynamic.literal(subnets = subnets.asInstanceOf[js.Any])
    if (assignPublicIp != null) __obj.updateDynamic("assignPublicIp")(assignPublicIp.asInstanceOf[js.Any])
    if (securityGroups != null) __obj.updateDynamic("securityGroups")(securityGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceNetworkConfiguration]
  }
}

