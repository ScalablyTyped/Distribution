package typings.ssh2Streams.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HostbasedAuthMethodData extends _AuthMethodData {
  var blob: js.UndefOr[Buffer] = js.native
  var key: Buffer = js.native
  var keyAlgo: String = js.native
  var localHostname: String = js.native
  var localUsername: String = js.native
  var signature: js.UndefOr[Buffer] = js.native
}

object HostbasedAuthMethodData {
  @scala.inline
  def apply(key: Buffer, keyAlgo: String, localHostname: String, localUsername: String): HostbasedAuthMethodData = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], keyAlgo = keyAlgo.asInstanceOf[js.Any], localHostname = localHostname.asInstanceOf[js.Any], localUsername = localUsername.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostbasedAuthMethodData]
  }
  @scala.inline
  implicit class HostbasedAuthMethodDataOps[Self <: HostbasedAuthMethodData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKey(value: Buffer): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyAlgo(value: String): Self = this.set("keyAlgo", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocalHostname(value: String): Self = this.set("localHostname", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocalUsername(value: String): Self = this.set("localUsername", value.asInstanceOf[js.Any])
    @scala.inline
    def setBlob(value: Buffer): Self = this.set("blob", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlob: Self = this.set("blob", js.undefined)
    @scala.inline
    def setSignature(value: Buffer): Self = this.set("signature", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSignature: Self = this.set("signature", js.undefined)
  }
  
}

