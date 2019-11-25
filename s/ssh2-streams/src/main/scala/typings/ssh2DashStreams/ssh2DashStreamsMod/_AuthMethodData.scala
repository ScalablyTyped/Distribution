package typings.ssh2DashStreams.ssh2DashStreamsMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _AuthMethodData extends js.Object

object _AuthMethodData {
  @scala.inline
  def PublicKeyAuthMethodData(key: Buffer, keyAlgo: String, blob: Buffer = null, signature: Buffer = null): _AuthMethodData = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], keyAlgo = keyAlgo.asInstanceOf[js.Any])
    if (blob != null) __obj.updateDynamic("blob")(blob.asInstanceOf[js.Any])
    if (signature != null) __obj.updateDynamic("signature")(signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[_AuthMethodData]
  }
  @scala.inline
  def HostbasedAuthMethodData(
    key: Buffer,
    keyAlgo: String,
    localHostname: String,
    localUsername: String,
    blob: Buffer = null,
    signature: Buffer = null
  ): _AuthMethodData = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], keyAlgo = keyAlgo.asInstanceOf[js.Any], localHostname = localHostname.asInstanceOf[js.Any], localUsername = localUsername.asInstanceOf[js.Any])
    if (blob != null) __obj.updateDynamic("blob")(blob.asInstanceOf[js.Any])
    if (signature != null) __obj.updateDynamic("signature")(signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[_AuthMethodData]
  }
}

