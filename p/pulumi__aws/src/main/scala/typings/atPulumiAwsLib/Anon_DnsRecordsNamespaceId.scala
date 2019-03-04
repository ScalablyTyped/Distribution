package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DnsRecordsNamespaceId extends js.Object {
  var dnsRecords: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[Anon_TtlType]]]
  var namespaceId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var routingPolicy: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object Anon_DnsRecordsNamespaceId {
  @scala.inline
  def apply(
    dnsRecords: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[Anon_TtlType]]],
    namespaceId: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    routingPolicy: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_DnsRecordsNamespaceId = {
    val __obj = js.Dynamic.literal(dnsRecords = dnsRecords.asInstanceOf[js.Any], namespaceId = namespaceId.asInstanceOf[js.Any])
    if (routingPolicy != null) __obj.updateDynamic("routingPolicy")(routingPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DnsRecordsNamespaceId]
  }
}

