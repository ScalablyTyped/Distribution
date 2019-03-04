package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InstancePort extends js.Object {
  var instancePort: scala.Double
  var instanceProtocol: java.lang.String
  var lbPort: scala.Double
  var lbProtocol: java.lang.String
  var sslCertificateId: java.lang.String
}

object Anon_InstancePort {
  @scala.inline
  def apply(
    instancePort: scala.Double,
    instanceProtocol: java.lang.String,
    lbPort: scala.Double,
    lbProtocol: java.lang.String,
    sslCertificateId: java.lang.String
  ): Anon_InstancePort = {
    val __obj = js.Dynamic.literal(instancePort = instancePort, instanceProtocol = instanceProtocol, lbPort = lbPort, lbProtocol = lbProtocol, sslCertificateId = sslCertificateId)
  
    __obj.asInstanceOf[Anon_InstancePort]
  }
}

