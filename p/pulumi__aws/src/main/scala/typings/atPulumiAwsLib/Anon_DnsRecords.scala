package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DnsRecords extends js.Object {
  var dnsRecords: js.Array[Anon_Ttl]
  var namespaceId: java.lang.String
  var routingPolicy: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_DnsRecords {
  @scala.inline
  def apply(
    dnsRecords: js.Array[Anon_Ttl],
    namespaceId: java.lang.String,
    routingPolicy: java.lang.String = null
  ): Anon_DnsRecords = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dnsRecords")(dnsRecords)
    __obj.updateDynamic("namespaceId")(namespaceId)
    if (routingPolicy != null) __obj.updateDynamic("routingPolicy")(routingPolicy)
    __obj.asInstanceOf[Anon_DnsRecords]
  }
}

