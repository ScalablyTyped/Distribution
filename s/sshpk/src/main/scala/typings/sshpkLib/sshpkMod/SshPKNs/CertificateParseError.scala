package typings
package sshpkLib.sshpkMod.SshPKNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertificateParseError
  extends nodeLib.Error {
  var message: java.lang.String
  var name: java.lang.String
}

object CertificateParseError {
  @scala.inline
  def apply(message: java.lang.String, name: java.lang.String, stack: java.lang.String = null): CertificateParseError = {
    val __obj = js.Dynamic.literal(message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[CertificateParseError]
  }
}

