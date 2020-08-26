package typings.secp256k1.anon

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Recid extends js.Object {
  var recid: Double = js.native
  var signature: Uint8Array = js.native
}

object Recid {
  @scala.inline
  def apply(recid: Double, signature: Uint8Array): Recid = {
    val __obj = js.Dynamic.literal(recid = recid.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[Recid]
  }
  @scala.inline
  implicit class RecidOps[Self <: Recid] (val x: Self) extends AnyVal {
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
    def setRecid(value: Double): Self = this.set("recid", value.asInstanceOf[js.Any])
    @scala.inline
    def setSignature(value: Uint8Array): Self = this.set("signature", value.asInstanceOf[js.Any])
  }
  
}

