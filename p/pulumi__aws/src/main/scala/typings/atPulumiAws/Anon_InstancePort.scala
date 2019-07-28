package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InstancePort extends js.Object {
  var instancePort: Double
  var instanceProtocol: String
  var lbPort: Double
  var lbProtocol: String
  var sslCertificateId: String
}

object Anon_InstancePort {
  @scala.inline
  def apply(
    instancePort: Double,
    instanceProtocol: String,
    lbPort: Double,
    lbProtocol: String,
    sslCertificateId: String
  ): Anon_InstancePort = {
    val __obj = js.Dynamic.literal(instancePort = instancePort, instanceProtocol = instanceProtocol, lbPort = lbPort, lbProtocol = lbProtocol, sslCertificateId = sslCertificateId)
  
    __obj.asInstanceOf[Anon_InstancePort]
  }
}

