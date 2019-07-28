package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DnsRecordsNamespaceId extends js.Object {
  var dnsRecords: Input[js.Array[Input[Anon_TtlType]]]
  var namespaceId: Input[String]
  var routingPolicy: js.UndefOr[Input[String]] = js.undefined
}

object Anon_DnsRecordsNamespaceId {
  @scala.inline
  def apply(
    dnsRecords: Input[js.Array[Input[Anon_TtlType]]],
    namespaceId: Input[String],
    routingPolicy: Input[String] = null
  ): Anon_DnsRecordsNamespaceId = {
    val __obj = js.Dynamic.literal(dnsRecords = dnsRecords.asInstanceOf[js.Any], namespaceId = namespaceId.asInstanceOf[js.Any])
    if (routingPolicy != null) __obj.updateDynamic("routingPolicy")(routingPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DnsRecordsNamespaceId]
  }
}

