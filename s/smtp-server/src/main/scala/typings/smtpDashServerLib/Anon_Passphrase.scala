package typings
package smtpDashServerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Passphrase extends js.Object {
  var passphrase: java.lang.String
  var pem: java.lang.String | nodeLib.Buffer
}

object Anon_Passphrase {
  @scala.inline
  def apply(passphrase: java.lang.String, pem: java.lang.String | nodeLib.Buffer): Anon_Passphrase = {
    val __obj = js.Dynamic.literal(passphrase = passphrase, pem = pem.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Passphrase]
  }
}

