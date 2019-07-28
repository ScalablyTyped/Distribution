package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IpIpId extends js.Object {
  var ip: js.UndefOr[Input[String]] = js.undefined
  var ipId: js.UndefOr[Input[String]] = js.undefined
  var subnetId: Input[String]
}

object Anon_IpIpId {
  @scala.inline
  def apply(subnetId: Input[String], ip: Input[String] = null, ipId: Input[String] = null): Anon_IpIpId = {
    val __obj = js.Dynamic.literal(subnetId = subnetId.asInstanceOf[js.Any])
    if (ip != null) __obj.updateDynamic("ip")(ip.asInstanceOf[js.Any])
    if (ipId != null) __obj.updateDynamic("ipId")(ipId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IpIpId]
  }
}

