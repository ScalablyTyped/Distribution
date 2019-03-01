package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ConsoleUrlEndpoints extends js.Object {
  var consoleUrl: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var endpoints: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  var ipAddress: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object Anon_ConsoleUrlEndpoints {
  @scala.inline
  def apply(
    consoleUrl: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    endpoints: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    ipAddress: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_ConsoleUrlEndpoints = {
    val __obj = js.Dynamic.literal()
    if (consoleUrl != null) __obj.updateDynamic("consoleUrl")(consoleUrl.asInstanceOf[js.Any])
    if (endpoints != null) __obj.updateDynamic("endpoints")(endpoints.asInstanceOf[js.Any])
    if (ipAddress != null) __obj.updateDynamic("ipAddress")(ipAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ConsoleUrlEndpoints]
  }
}

