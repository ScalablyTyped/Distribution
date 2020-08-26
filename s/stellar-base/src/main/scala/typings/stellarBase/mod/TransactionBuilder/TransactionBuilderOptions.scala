package typings.stellarBase.mod.TransactionBuilder

import typings.stellarBase.anon.MaxTimeMinTime
import typings.stellarBase.mod.Memo
import typings.stellarBase.mod.MemoType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransactionBuilderOptions extends js.Object {
  var fee: String = js.native
  var memo: js.UndefOr[Memo[MemoType]] = js.native
  var networkPassphrase: js.UndefOr[String] = js.native
  var timebounds: js.UndefOr[MaxTimeMinTime] = js.native
  var v1: js.UndefOr[Boolean] = js.native
}

object TransactionBuilderOptions {
  @scala.inline
  def apply(fee: String): TransactionBuilderOptions = {
    val __obj = js.Dynamic.literal(fee = fee.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionBuilderOptions]
  }
  @scala.inline
  implicit class TransactionBuilderOptionsOps[Self <: TransactionBuilderOptions] (val x: Self) extends AnyVal {
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
    def setFee(value: String): Self = this.set("fee", value.asInstanceOf[js.Any])
    @scala.inline
    def setMemo(value: Memo[MemoType]): Self = this.set("memo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMemo: Self = this.set("memo", js.undefined)
    @scala.inline
    def setNetworkPassphrase(value: String): Self = this.set("networkPassphrase", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkPassphrase: Self = this.set("networkPassphrase", js.undefined)
    @scala.inline
    def setTimebounds(value: MaxTimeMinTime): Self = this.set("timebounds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimebounds: Self = this.set("timebounds", js.undefined)
    @scala.inline
    def setV1(value: Boolean): Self = this.set("v1", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteV1: Self = this.set("v1", js.undefined)
  }
  
}

