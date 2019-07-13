package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AwsCloudMapDns extends js.Object {
  var awsCloudMap: js.UndefOr[atPulumiPulumiLib.outputMod.Input[Anon_AttributesKey]] = js.undefined
  var dns: js.UndefOr[atPulumiPulumiLib.outputMod.Input[Anon_HostnameInput]] = js.undefined
}

object Anon_AwsCloudMapDns {
  @scala.inline
  def apply(
    awsCloudMap: atPulumiPulumiLib.outputMod.Input[Anon_AttributesKey] = null,
    dns: atPulumiPulumiLib.outputMod.Input[Anon_HostnameInput] = null
  ): Anon_AwsCloudMapDns = {
    val __obj = js.Dynamic.literal()
    if (awsCloudMap != null) __obj.updateDynamic("awsCloudMap")(awsCloudMap.asInstanceOf[js.Any])
    if (dns != null) __obj.updateDynamic("dns")(dns.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AwsCloudMapDns]
  }
}

