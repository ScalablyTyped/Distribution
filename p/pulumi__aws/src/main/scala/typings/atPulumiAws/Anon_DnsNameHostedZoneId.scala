package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DnsNameHostedZoneId extends js.Object {
  var dnsName: js.UndefOr[Input[String]] = js.undefined
  var hostedZoneId: js.UndefOr[Input[String]] = js.undefined
}

object Anon_DnsNameHostedZoneId {
  @scala.inline
  def apply(dnsName: Input[String] = null, hostedZoneId: Input[String] = null): Anon_DnsNameHostedZoneId = {
    val __obj = js.Dynamic.literal()
    if (dnsName != null) __obj.updateDynamic("dnsName")(dnsName.asInstanceOf[js.Any])
    if (hostedZoneId != null) __obj.updateDynamic("hostedZoneId")(hostedZoneId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DnsNameHostedZoneId]
  }
}

