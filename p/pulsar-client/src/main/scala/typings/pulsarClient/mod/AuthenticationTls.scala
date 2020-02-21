package typings.pulsarClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthenticationTls extends js.Object {
  var certificatePath: String
  var privateKeyPath: String
}

object AuthenticationTls {
  @scala.inline
  def apply(certificatePath: String, privateKeyPath: String): AuthenticationTls = {
    val __obj = js.Dynamic.literal(certificatePath = certificatePath.asInstanceOf[js.Any], privateKeyPath = privateKeyPath.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AuthenticationTls]
  }
}

