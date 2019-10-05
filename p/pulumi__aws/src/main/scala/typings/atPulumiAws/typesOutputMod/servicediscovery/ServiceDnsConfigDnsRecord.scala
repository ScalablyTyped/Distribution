package typings.atPulumiAws.typesOutputMod.servicediscovery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceDnsConfigDnsRecord extends js.Object {
  /**
    * The amount of time, in seconds, that you want DNS resolvers to cache the settings for this resource record set.
    */
  var ttl: Double
  /**
    * The type of health check that you want to create, which indicates how Route 53 determines whether an endpoint is healthy. Valid Values: HTTP, HTTPS, TCP
    */
  var `type`: String
}

object ServiceDnsConfigDnsRecord {
  @scala.inline
  def apply(ttl: Double, `type`: String): ServiceDnsConfigDnsRecord = {
    val __obj = js.Dynamic.literal(ttl = ttl)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ServiceDnsConfigDnsRecord]
  }
}

