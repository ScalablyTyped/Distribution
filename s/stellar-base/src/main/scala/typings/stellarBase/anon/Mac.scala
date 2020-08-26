package typings.stellarBase.anon

import typings.stellarBase.xdrMod.xdr.HmacSha256Mac
import typings.stellarBase.xdrMod.xdr.StellarMessage
import typings.stellarBase.xdrMod.xdr.Uint64
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mac extends js.Object {
  var mac: HmacSha256Mac = js.native
  var message: StellarMessage = js.native
  var sequence: Uint64 = js.native
}

object Mac {
  @scala.inline
  def apply(mac: HmacSha256Mac, message: StellarMessage, sequence: Uint64): Mac = {
    val __obj = js.Dynamic.literal(mac = mac.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mac]
  }
  @scala.inline
  implicit class MacOps[Self <: Mac] (val x: Self) extends AnyVal {
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
    def setMac(value: HmacSha256Mac): Self = this.set("mac", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: StellarMessage): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setSequence(value: Uint64): Self = this.set("sequence", value.asInstanceOf[js.Any])
  }
  
}

