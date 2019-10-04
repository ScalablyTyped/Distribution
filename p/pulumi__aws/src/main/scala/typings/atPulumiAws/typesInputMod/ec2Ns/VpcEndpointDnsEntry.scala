package typings.atPulumiAws.typesInputMod.ec2Ns

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpcEndpointDnsEntry extends js.Object {
  /**
    * The DNS name.
    */
  var dnsName: js.UndefOr[Input[String]] = js.undefined
  /**
    * The ID of the private hosted zone.
    */
  var hostedZoneId: js.UndefOr[Input[String]] = js.undefined
}

object VpcEndpointDnsEntry {
  @scala.inline
  def apply(dnsName: Input[String] = null, hostedZoneId: Input[String] = null): VpcEndpointDnsEntry = {
    val __obj = js.Dynamic.literal()
    if (dnsName != null) __obj.updateDynamic("dnsName")(dnsName.asInstanceOf[js.Any])
    if (hostedZoneId != null) __obj.updateDynamic("hostedZoneId")(hostedZoneId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcEndpointDnsEntry]
  }
}

