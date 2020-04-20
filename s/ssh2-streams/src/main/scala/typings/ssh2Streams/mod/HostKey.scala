package typings.ssh2Streams.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HostKey extends js.Object {
  var privateKey: ParsedKey
  var publicKey: ParsedKey
}

object HostKey {
  @scala.inline
  def apply(privateKey: ParsedKey, publicKey: ParsedKey): HostKey = {
    val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostKey]
  }
}

