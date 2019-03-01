package typings
package ssh2DashStreamsLib.ssh2DashStreamsMod

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("privateKey")(privateKey)
    __obj.updateDynamic("publicKey")(publicKey)
    __obj.asInstanceOf[HostKey]
  }
}

