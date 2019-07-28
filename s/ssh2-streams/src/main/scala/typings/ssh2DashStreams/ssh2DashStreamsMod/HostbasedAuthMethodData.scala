package typings.ssh2DashStreams.ssh2DashStreamsMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HostbasedAuthMethodData extends _AuthMethodData {
  var blob: js.UndefOr[Buffer] = js.undefined
  var key: Buffer
  var keyAlgo: String
  var localHostname: String
  var localUsername: String
  var signature: js.UndefOr[Buffer] = js.undefined
}

object HostbasedAuthMethodData {
  @scala.inline
  def apply(
    key: Buffer,
    keyAlgo: String,
    localHostname: String,
    localUsername: String,
    blob: Buffer = null,
    signature: Buffer = null
  ): HostbasedAuthMethodData = {
    val __obj = js.Dynamic.literal(key = key, keyAlgo = keyAlgo, localHostname = localHostname, localUsername = localUsername)
    if (blob != null) __obj.updateDynamic("blob")(blob)
    if (signature != null) __obj.updateDynamic("signature")(signature)
    __obj.asInstanceOf[HostbasedAuthMethodData]
  }
}

