package typings.smCrypto.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hash extends js.Object {
  var der: js.UndefOr[Boolean] = js.native
  var hash: js.UndefOr[Boolean] = js.native
  var publicKey: js.UndefOr[String] = js.native
}

object Hash {
  @scala.inline
  def apply(): Hash = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Hash]
  }
  @scala.inline
  implicit class HashOps[Self <: Hash] (val x: Self) extends AnyVal {
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
    def setDer(value: Boolean): Self = this.set("der", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDer: Self = this.set("der", js.undefined)
    @scala.inline
    def setHash(value: Boolean): Self = this.set("hash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHash: Self = this.set("hash", js.undefined)
    @scala.inline
    def setPublicKey(value: String): Self = this.set("publicKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublicKey: Self = this.set("publicKey", js.undefined)
  }
  
}

