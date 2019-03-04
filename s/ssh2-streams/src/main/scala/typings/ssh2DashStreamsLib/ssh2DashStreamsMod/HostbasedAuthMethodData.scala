package typings
package ssh2DashStreamsLib.ssh2DashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HostbasedAuthMethodData extends _AuthMethodData {
  var blob: js.UndefOr[nodeLib.Buffer] = js.undefined
  var key: nodeLib.Buffer
  var keyAlgo: java.lang.String
  var localHostname: java.lang.String
  var localUsername: java.lang.String
  var signature: js.UndefOr[nodeLib.Buffer] = js.undefined
}

object HostbasedAuthMethodData {
  @scala.inline
  def apply(
    key: nodeLib.Buffer,
    keyAlgo: java.lang.String,
    localHostname: java.lang.String,
    localUsername: java.lang.String,
    blob: nodeLib.Buffer = null,
    signature: nodeLib.Buffer = null
  ): HostbasedAuthMethodData = {
    val __obj = js.Dynamic.literal(key = key, keyAlgo = keyAlgo, localHostname = localHostname, localUsername = localUsername)
    if (blob != null) __obj.updateDynamic("blob")(blob)
    if (signature != null) __obj.updateDynamic("signature")(signature)
    __obj.asInstanceOf[HostbasedAuthMethodData]
  }
}

