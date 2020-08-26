package typings.stellarBase.anon

import typings.node.Buffer
import typings.stellarBase.xdrMod.xdr.Curve25519Public
import typings.stellarBase.xdrMod.xdr.Uint64
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Expiration extends js.Object {
  var expiration: Uint64 = js.native
  var pubkey: Curve25519Public = js.native
  var sig: Buffer = js.native
}

object Expiration {
  @scala.inline
  def apply(expiration: Uint64, pubkey: Curve25519Public, sig: Buffer): Expiration = {
    val __obj = js.Dynamic.literal(expiration = expiration.asInstanceOf[js.Any], pubkey = pubkey.asInstanceOf[js.Any], sig = sig.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expiration]
  }
  @scala.inline
  implicit class ExpirationOps[Self <: Expiration] (val x: Self) extends AnyVal {
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
    def setExpiration(value: Uint64): Self = this.set("expiration", value.asInstanceOf[js.Any])
    @scala.inline
    def setPubkey(value: Curve25519Public): Self = this.set("pubkey", value.asInstanceOf[js.Any])
    @scala.inline
    def setSig(value: Buffer): Self = this.set("sig", value.asInstanceOf[js.Any])
  }
  
}

