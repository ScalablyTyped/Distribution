package typings
package ssh2DashStreamsLib.ssh2DashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublicKeyAuthMethodData extends _AuthMethodData {
  var blob: js.UndefOr[nodeLib.Buffer] = js.undefined
  var key: nodeLib.Buffer
  var keyAlgo: java.lang.String
  var signature: js.UndefOr[nodeLib.Buffer] = js.undefined
}

object PublicKeyAuthMethodData {
  @scala.inline
  def apply(
    key: nodeLib.Buffer,
    keyAlgo: java.lang.String,
    blob: nodeLib.Buffer = null,
    signature: nodeLib.Buffer = null
  ): PublicKeyAuthMethodData = {
    val __obj = js.Dynamic.literal(key = key, keyAlgo = keyAlgo)
    if (blob != null) __obj.updateDynamic("blob")(blob)
    if (signature != null) __obj.updateDynamic("signature")(signature)
    __obj.asInstanceOf[PublicKeyAuthMethodData]
  }
}

