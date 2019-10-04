package typings.atPulumiAws.typesOutputMod.servicediscoveryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceDnsConfig extends js.Object {
  /**
    * An array that contains one DnsRecord object for each resource record set.
    */
  var dnsRecords: js.Array[ServiceDnsConfigDnsRecord]
  /**
    * The ID of the namespace to use for DNS configuration.
    */
  var namespaceId: String
  /**
    * The routing policy that you want to apply to all records that Route 53 creates when you register an instance and specify the service. Valid Values: MULTIVALUE, WEIGHTED
    */
  var routingPolicy: js.UndefOr[String] = js.undefined
}

object ServiceDnsConfig {
  @scala.inline
  def apply(dnsRecords: js.Array[ServiceDnsConfigDnsRecord], namespaceId: String, routingPolicy: String = null): ServiceDnsConfig = {
    val __obj = js.Dynamic.literal(dnsRecords = dnsRecords, namespaceId = namespaceId)
    if (routingPolicy != null) __obj.updateDynamic("routingPolicy")(routingPolicy)
    __obj.asInstanceOf[ServiceDnsConfig]
  }
}

