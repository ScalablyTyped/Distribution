package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DnsAnonServiceNameInput extends js.Object {
  var dns: atPulumiPulumiLib.outputMod.Input[Anon_ServiceNameInput]
}

object Anon_DnsAnonServiceNameInput {
  @scala.inline
  def apply(dns: atPulumiPulumiLib.outputMod.Input[Anon_ServiceNameInput]): Anon_DnsAnonServiceNameInput = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dns")(dns.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DnsAnonServiceNameInput]
  }
}

