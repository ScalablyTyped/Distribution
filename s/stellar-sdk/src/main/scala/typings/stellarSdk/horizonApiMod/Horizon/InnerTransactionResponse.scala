package typings.stellarSdk.horizonApiMod.Horizon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InnerTransactionResponse extends js.Object {
  var hash: String = js.native
  var max_fee: String = js.native
  var signatures: js.Array[String] = js.native
}

object InnerTransactionResponse {
  @scala.inline
  def apply(hash: String, max_fee: String, signatures: js.Array[String]): InnerTransactionResponse = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], max_fee = max_fee.asInstanceOf[js.Any], signatures = signatures.asInstanceOf[js.Any])
    __obj.asInstanceOf[InnerTransactionResponse]
  }
  @scala.inline
  implicit class InnerTransactionResponseOps[Self <: InnerTransactionResponse] (val x: Self) extends AnyVal {
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
    def setHash(value: String): Self = this.set("hash", value.asInstanceOf[js.Any])
    @scala.inline
    def setMax_fee(value: String): Self = this.set("max_fee", value.asInstanceOf[js.Any])
    @scala.inline
    def setSignaturesVarargs(value: String*): Self = this.set("signatures", js.Array(value :_*))
    @scala.inline
    def setSignatures(value: js.Array[String]): Self = this.set("signatures", value.asInstanceOf[js.Any])
  }
  
}

