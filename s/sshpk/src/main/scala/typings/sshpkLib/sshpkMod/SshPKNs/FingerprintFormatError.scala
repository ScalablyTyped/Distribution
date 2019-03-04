package typings
package sshpkLib.sshpkMod.SshPKNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FingerprintFormatError
  extends nodeLib.Error {
  var message: java.lang.String
  var name: java.lang.String
}

object FingerprintFormatError {
  @scala.inline
  def apply(message: java.lang.String, name: java.lang.String, stack: java.lang.String = null): FingerprintFormatError = {
    val __obj = js.Dynamic.literal(message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[FingerprintFormatError]
  }
}

