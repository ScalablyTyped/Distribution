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
  def apply(dnsRecords: js.Array[ServiceDnsConfigDnsRecord], namespaceId: String): ServiceDnsConfig = {
    val __obj = js.Dynamic.literal(dnsRecords = dnsRecords.asInstanceOf[js.Any], namespaceId = namespaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceDnsConfig]
  }
  @scala.inline
  implicit class ServiceDnsConfigOps[Self <: ServiceDnsConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDnsRecordsVarargs(value: ServiceDnsConfigDnsRecord*): Self = this.set("dnsRecords", js.Array(value :_*))
    @scala.inline
    def setDnsRecords(value: js.Array[ServiceDnsConfigDnsRecord]): Self = this.set("dnsRecords", value.asInstanceOf[js.Any])
    @scala.inline
    def setNamespaceId(value: String): Self = this.set("namespaceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoutingPolicy(value: String): Self = this.set("routingPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoutingPolicy: Self = this.set("routingPolicy", js.undefined)
  }
  
}

