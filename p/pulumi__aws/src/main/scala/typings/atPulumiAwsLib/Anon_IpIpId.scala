package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IpIpId extends js.Object {
  var ip: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var ipId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var subnetId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_IpIpId {
  @scala.inline
  def apply(
    subnetId: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    ip: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    ipId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_IpIpId = {
    val __obj = js.Dynamic.literal(subnetId = subnetId.asInstanceOf[js.Any])
    if (ip != null) __obj.updateDynamic("ip")(ip.asInstanceOf[js.Any])
    if (ipId != null) __obj.updateDynamic("ipId")(ipId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IpIpId]
  }
}

