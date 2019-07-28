package typings.ssh2DashStreams.ssh2DashStreamsMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublicKeyAuthMethodData extends _AuthMethodData {
  var blob: js.UndefOr[Buffer] = js.undefined
  var key: Buffer
  var keyAlgo: String
  var signature: js.UndefOr[Buffer] = js.undefined
}

object PublicKeyAuthMethodData {
  @scala.inline
  def apply(key: Buffer, keyAlgo: String, blob: Buffer = null, signature: Buffer = null): PublicKeyAuthMethodData = {
    val __obj = js.Dynamic.literal(key = key, keyAlgo = keyAlgo)
    if (blob != null) __obj.updateDynamic("blob")(blob)
    if (signature != null) __obj.updateDynamic("signature")(signature)
    __obj.asInstanceOf[PublicKeyAuthMethodData]
  }
}

