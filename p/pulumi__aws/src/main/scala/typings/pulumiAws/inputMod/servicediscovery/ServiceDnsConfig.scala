package typings.pulumiAws.inputMod.servicediscovery

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceDnsConfig extends js.Object {
  /**
    * An array that contains one DnsRecord object for each resource record set.
    */
  var dnsRecords: Input[js.Array[Input[ServiceDnsConfigDnsRecord]]] = js.native
  /**
    * The ID of the namespace to use for DNS configuration.
    */
  var namespaceId: Input[String] = js.native
  /**
    * The routing policy that you want to apply to all records that Route 53 creates when you register an instance and specify the service. Valid Values: MULTIVALUE, WEIGHTED
    */
  var routingPolicy: js.UndefOr[Input[String]] = js.native
}

object ServiceDnsConfig {
  @scala.inline
  def apply(
    dnsRecords: Input[js.Array[Input[ServiceDnsConfigDnsRecord]]],
    namespaceId: Input[String],
    routingPolicy: Input[String] = null
  ): ServiceDnsConfig = {
    val __obj = js.Dynamic.literal(dnsRecords = dnsRecords.asInstanceOf[js.Any], namespaceId = namespaceId.asInstanceOf[js.Any])
    if (routingPolicy != null) __obj.updateDynamic("routingPolicy")(routingPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceDnsConfig]
  }
}

