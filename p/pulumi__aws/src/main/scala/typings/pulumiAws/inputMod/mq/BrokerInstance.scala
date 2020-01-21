package typings.pulumiAws.inputMod.mq

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrokerInstance extends js.Object {
  var consoleUrl: js.UndefOr[Input[String]] = js.native
  var endpoints: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  var ipAddress: js.UndefOr[Input[String]] = js.native
}

object BrokerInstance {
  @scala.inline
  def apply(
    consoleUrl: Input[String] = null,
    endpoints: Input[js.Array[Input[String]]] = null,
    ipAddress: Input[String] = null
  ): BrokerInstance = {
    val __obj = js.Dynamic.literal()
    if (consoleUrl != null) __obj.updateDynamic("consoleUrl")(consoleUrl.asInstanceOf[js.Any])
    if (endpoints != null) __obj.updateDynamic("endpoints")(endpoints.asInstanceOf[js.Any])
    if (ipAddress != null) __obj.updateDynamic("ipAddress")(ipAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrokerInstance]
  }
}

