package typings.pulsarClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertificatePath extends js.Object {
  var certificatePath: String
  var privateKeyPath: String
}

object CertificatePath {
  @scala.inline
  def apply(certificatePath: String, privateKeyPath: String): CertificatePath = {
    val __obj = js.Dynamic.literal(certificatePath = certificatePath.asInstanceOf[js.Any], privateKeyPath = privateKeyPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificatePath]
  }
}

