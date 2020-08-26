package typings.sawtoothSdk.protobufMod.ClientBatchStatus

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an InvalidTransaction. */
@js.native
trait IInvalidTransaction extends js.Object {
  /** InvalidTransaction extendedData */
  var extendedData: js.UndefOr[Uint8Array | Null] = js.native
  /** InvalidTransaction message */
  var message: js.UndefOr[String | Null] = js.native
  /** InvalidTransaction transactionId */
  var transactionId: js.UndefOr[String | Null] = js.native
}

object IInvalidTransaction {
  @scala.inline
  def apply(): IInvalidTransaction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IInvalidTransaction]
  }
  @scala.inline
  implicit class IInvalidTransactionOps[Self <: IInvalidTransaction] (val x: Self) extends AnyVal {
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
    def setExtendedData(value: Uint8Array): Self = this.set("extendedData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtendedData: Self = this.set("extendedData", js.undefined)
    @scala.inline
    def setExtendedDataNull: Self = this.set("extendedData", null)
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setMessageNull: Self = this.set("message", null)
    @scala.inline
    def setTransactionId(value: String): Self = this.set("transactionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransactionId: Self = this.set("transactionId", js.undefined)
    @scala.inline
    def setTransactionIdNull: Self = this.set("transactionId", null)
  }
  
}

