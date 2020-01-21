package typings.pulumiAws.outputMod.servicediscovery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceDnsConfig extends js.Object {
  /**
    * An array that contains one DnsRecord object for each resource record set.
    */
  var dnsRecords: js.Array[ServiceDnsConfigDnsRecord] = js.native
  /**
    * The ID of the namespace to use for DNS configuration.
    */
  var namespaceId: String = js.native
  /**
    * The routing policy that you want to apply to all records that Route 53 creates when you register an instance and specify the service. Valid Values: MULTIVALUE, WEIGHTED
    */
  var routingPolicy: js.UndefOr[String] = js.native
}

object ServiceDnsConfig {
  @scala.inline
  def apply(dnsRecords: js.Array[ServiceDnsConfigDnsRecord], namespaceId: String, routingPolicy: String = null): ServiceDnsConfig = {
    val __obj = js.Dynamic.literal(dnsRecords = dnsRecords.asInstanceOf[js.Any], namespaceId = namespaceId.asInstanceOf[js.Any])
    if (routingPolicy != null) __obj.updateDynamic("routingPolicy")(routingPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceDnsConfig]
  }
}

