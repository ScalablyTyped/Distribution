package typings.pulumiAws.inputMod.servicediscovery

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceDnsConfigDnsRecord extends js.Object {
  /**
    * The amount of time, in seconds, that you want DNS resolvers to cache the settings for this resource record set.
    */
  var ttl: Input[Double] = js.native
  /**
    * The type of health check that you want to create, which indicates how Route 53 determines whether an endpoint is healthy. Valid Values: HTTP, HTTPS, TCP
    */
  var `type`: Input[String] = js.native
}

object ServiceDnsConfigDnsRecord {
  @scala.inline
  def apply(ttl: Input[Double], `type`: Input[String]): ServiceDnsConfigDnsRecord = {
    val __obj = js.Dynamic.literal(ttl = ttl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceDnsConfigDnsRecord]
  }
  @scala.inline
  implicit class ServiceDnsConfigDnsRecordOps[Self <: ServiceDnsConfigDnsRecord] (val x: Self) extends AnyVal {
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
    def setTtl(value: Input[Double]): Self = this.set("ttl", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: Input[String]): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

