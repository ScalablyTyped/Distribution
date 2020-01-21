package typings.ssh2Streams.mod

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
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], keyAlgo = keyAlgo.asInstanceOf[js.Any], localHostname = localHostname.asInstanceOf[js.Any], localUsername = localUsername.asInstanceOf[js.Any])
    if (blob != null) __obj.updateDynamic("blob")(blob.asInstanceOf[js.Any])
    if (signature != null) __obj.updateDynamic("signature")(signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostbasedAuthMethodData]
  }
}

