package typings.stellarSdk.serverMod.Server

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubmitTransactionOptions extends js.Object {
  var skipMemoRequiredCheck: js.UndefOr[Boolean] = js.undefined
}

object SubmitTransactionOptions {
  @scala.inline
  def apply(skipMemoRequiredCheck: js.UndefOr[Boolean] = js.undefined): SubmitTransactionOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(skipMemoRequiredCheck)) __obj.updateDynamic("skipMemoRequiredCheck")(skipMemoRequiredCheck.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubmitTransactionOptions]
  }
}

