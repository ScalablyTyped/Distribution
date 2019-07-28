package typings.stellarDashBase.stellarDashBaseMod.TransactionBuilderNs

import typings.stellarDashBase.Anon_MaxTime
import typings.stellarDashBase.stellarDashBaseMod.Memo
import typings.stellarDashBase.stellarDashBaseMod.MemoType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransactionBuilderOptions extends js.Object {
  var fee: js.UndefOr[Double] = js.undefined
  var memo: js.UndefOr[Memo[MemoType]] = js.undefined
  var timebounds: js.UndefOr[Anon_MaxTime] = js.undefined
}

object TransactionBuilderOptions {
  @scala.inline
  def apply(fee: Int | Double = null, memo: Memo[MemoType] = null, timebounds: Anon_MaxTime = null): TransactionBuilderOptions = {
    val __obj = js.Dynamic.literal()
    if (fee != null) __obj.updateDynamic("fee")(fee.asInstanceOf[js.Any])
    if (memo != null) __obj.updateDynamic("memo")(memo)
    if (timebounds != null) __obj.updateDynamic("timebounds")(timebounds)
    __obj.asInstanceOf[TransactionBuilderOptions]
  }
}

