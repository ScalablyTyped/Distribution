package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InstancePortInstanceProtocol extends js.Object {
  var instancePort: scala.Double
  var instanceProtocol: java.lang.String
  var lbPort: scala.Double
  var lbProtocol: java.lang.String
  var sslCertificateId: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_InstancePortInstanceProtocol {
  @scala.inline
  def apply(
    instancePort: scala.Double,
    instanceProtocol: java.lang.String,
    lbPort: scala.Double,
    lbProtocol: java.lang.String,
    sslCertificateId: java.lang.String = null
  ): Anon_InstancePortInstanceProtocol = {
    val __obj = js.Dynamic.literal(instancePort = instancePort, instanceProtocol = instanceProtocol, lbPort = lbPort, lbProtocol = lbProtocol)
    if (sslCertificateId != null) __obj.updateDynamic("sslCertificateId")(sslCertificateId)
    __obj.asInstanceOf[Anon_InstancePortInstanceProtocol]
  }
}

