package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DnsRecords extends js.Object {
  var dnsRecords: js.Array[Anon_Ttl]
  var namespaceId: String
  var routingPolicy: js.UndefOr[String] = js.undefined
}

object Anon_DnsRecords {
  @scala.inline
  def apply(dnsRecords: js.Array[Anon_Ttl], namespaceId: String, routingPolicy: String = null): Anon_DnsRecords = {
    val __obj = js.Dynamic.literal(dnsRecords = dnsRecords, namespaceId = namespaceId)
    if (routingPolicy != null) __obj.updateDynamic("routingPolicy")(routingPolicy)
    __obj.asInstanceOf[Anon_DnsRecords]
  }
}

