package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DnsName extends js.Object {
  var dnsName: String
  var hostedZoneId: String
}

object Anon_DnsName {
  @scala.inline
  def apply(dnsName: String, hostedZoneId: String): Anon_DnsName = {
    val __obj = js.Dynamic.literal(dnsName = dnsName, hostedZoneId = hostedZoneId)
  
    __obj.asInstanceOf[Anon_DnsName]
  }
}

