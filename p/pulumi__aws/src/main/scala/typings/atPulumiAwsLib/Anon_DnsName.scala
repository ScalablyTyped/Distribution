package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DnsName extends js.Object {
  var dnsName: java.lang.String
  var hostedZoneId: java.lang.String
}

object Anon_DnsName {
  @scala.inline
  def apply(dnsName: java.lang.String, hostedZoneId: java.lang.String): Anon_DnsName = {
    val __obj = js.Dynamic.literal(dnsName = dnsName, hostedZoneId = hostedZoneId)
  
    __obj.asInstanceOf[Anon_DnsName]
  }
}

