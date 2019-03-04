package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HostPathPort extends js.Object {
  var host: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var path: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var port: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var protocol: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var query: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var statusCode: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_HostPathPort {
  @scala.inline
  def apply(
    statusCode: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    host: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    path: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    port: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    protocol: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    query: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_HostPathPort = {
    val __obj = js.Dynamic.literal(statusCode = statusCode.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_HostPathPort]
  }
}

