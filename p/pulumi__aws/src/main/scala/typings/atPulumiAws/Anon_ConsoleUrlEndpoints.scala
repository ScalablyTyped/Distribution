package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ConsoleUrlEndpoints extends js.Object {
  var consoleUrl: js.UndefOr[Input[String]] = js.undefined
  var endpoints: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  var ipAddress: js.UndefOr[Input[String]] = js.undefined
}

object Anon_ConsoleUrlEndpoints {
  @scala.inline
  def apply(
    consoleUrl: Input[String] = null,
    endpoints: Input[js.Array[Input[String]]] = null,
    ipAddress: Input[String] = null
  ): Anon_ConsoleUrlEndpoints = {
    val __obj = js.Dynamic.literal()
    if (consoleUrl != null) __obj.updateDynamic("consoleUrl")(consoleUrl.asInstanceOf[js.Any])
    if (endpoints != null) __obj.updateDynamic("endpoints")(endpoints.asInstanceOf[js.Any])
    if (ipAddress != null) __obj.updateDynamic("ipAddress")(ipAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ConsoleUrlEndpoints]
  }
}

