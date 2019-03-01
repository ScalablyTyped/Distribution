package typings
package stellarDashBaseLib.stellarDashBaseMod.TransactionBuilderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransactionBuilderOptions extends js.Object {
  var fee: js.UndefOr[scala.Double] = js.undefined
  var memo: js.UndefOr[
    stellarDashBaseLib.stellarDashBaseMod.Memo[stellarDashBaseLib.stellarDashBaseMod.MemoType]
  ] = js.undefined
  var timebounds: js.UndefOr[stellarDashBaseLib.Anon_MaxTime] = js.undefined
}

object TransactionBuilderOptions {
  @scala.inline
  def apply(
    fee: scala.Int | scala.Double = null,
    memo: stellarDashBaseLib.stellarDashBaseMod.Memo[stellarDashBaseLib.stellarDashBaseMod.MemoType] = null,
    timebounds: stellarDashBaseLib.Anon_MaxTime = null
  ): TransactionBuilderOptions = {
    val __obj = js.Dynamic.literal()
    if (fee != null) __obj.updateDynamic("fee")(fee.asInstanceOf[js.Any])
    if (memo != null) __obj.updateDynamic("memo")(memo)
    if (timebounds != null) __obj.updateDynamic("timebounds")(timebounds)
    __obj.asInstanceOf[TransactionBuilderOptions]
  }
}

