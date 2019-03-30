package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IpPortInput extends js.Object {
  var ip: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var port: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
}

object Anon_IpPortInput {
  @scala.inline
  def apply(
    ip: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    port: atPulumiPulumiLib.outputMod.Input[scala.Double] = null
  ): Anon_IpPortInput = {
    val __obj = js.Dynamic.literal(ip = ip.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IpPortInput]
  }
}

