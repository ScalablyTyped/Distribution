package typings.smtpDashServer

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Passphrase extends js.Object {
  var passphrase: String
  var pem: String | Buffer
}

object Anon_Passphrase {
  @scala.inline
  def apply(passphrase: String, pem: String | Buffer): Anon_Passphrase = {
    val __obj = js.Dynamic.literal(passphrase = passphrase, pem = pem.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Passphrase]
  }
}

