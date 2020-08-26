package typings.stellarBase.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ed25519PublicKey extends js.Object {
  var ed25519PublicKey: js.Any = js.native
}

object Ed25519PublicKey {
  @scala.inline
  def apply(ed25519PublicKey: js.Any): Ed25519PublicKey = {
    val __obj = js.Dynamic.literal(ed25519PublicKey = ed25519PublicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ed25519PublicKey]
  }
  @scala.inline
  implicit class Ed25519PublicKeyOps[Self <: Ed25519PublicKey] (val x: Self) extends AnyVal {
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
    def setEd25519PublicKey(value: js.Any): Self = this.set("ed25519PublicKey", value.asInstanceOf[js.Any])
  }
  
}

