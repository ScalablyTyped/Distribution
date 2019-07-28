package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InstancePortInstanceProtocol extends js.Object {
  var instancePort: Double
  var instanceProtocol: String
  var lbPort: Double
  var lbProtocol: String
  var sslCertificateId: js.UndefOr[String] = js.undefined
}

object Anon_InstancePortInstanceProtocol {
  @scala.inline
  def apply(
    instancePort: Double,
    instanceProtocol: String,
    lbPort: Double,
    lbProtocol: String,
    sslCertificateId: String = null
  ): Anon_InstancePortInstanceProtocol = {
    val __obj = js.Dynamic.literal(instancePort = instancePort, instanceProtocol = instanceProtocol, lbPort = lbPort, lbProtocol = lbProtocol)
    if (sslCertificateId != null) __obj.updateDynamic("sslCertificateId")(sslCertificateId)
    __obj.asInstanceOf[Anon_InstancePortInstanceProtocol]
  }
}

