package typings.sawtoothSdk.protobufMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBatch extends js.Object {
  /** Batch header */
  var header: js.UndefOr[Uint8Array | Null] = js.native
  /** Batch headerSignature */
  var headerSignature: js.UndefOr[String | Null] = js.native
  /** Batch trace */
  var trace: js.UndefOr[Boolean | Null] = js.native
  /** Batch transactions */
  var transactions: js.UndefOr[js.Array[ITransaction] | Null] = js.native
}

object IBatch {
  @scala.inline
  def apply(): IBatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBatch]
  }
  @scala.inline
  implicit class IBatchOps[Self <: IBatch] (val x: Self) extends AnyVal {
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
    def setHeader(value: Uint8Array): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    @scala.inline
    def setHeaderNull: Self = this.set("header", null)
    @scala.inline
    def setHeaderSignature(value: String): Self = this.set("headerSignature", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderSignature: Self = this.set("headerSignature", js.undefined)
    @scala.inline
    def setHeaderSignatureNull: Self = this.set("headerSignature", null)
    @scala.inline
    def setTrace(value: Boolean): Self = this.set("trace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrace: Self = this.set("trace", js.undefined)
    @scala.inline
    def setTraceNull: Self = this.set("trace", null)
    @scala.inline
    def setTransactionsVarargs(value: ITransaction*): Self = this.set("transactions", js.Array(value :_*))
    @scala.inline
    def setTransactions(value: js.Array[ITransaction]): Self = this.set("transactions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransactions: Self = this.set("transactions", js.undefined)
    @scala.inline
    def setTransactionsNull: Self = this.set("transactions", null)
  }
  
}

