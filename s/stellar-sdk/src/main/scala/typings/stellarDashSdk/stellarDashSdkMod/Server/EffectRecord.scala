package typings.stellarDashSdk.stellarDashSdkMod.Server

import typings.stellarDashSdk.stellarDashSdkMod.Horizon.BaseResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EffectRecord
  extends BaseResponse[scala.Nothing] {
  var account: String
  var amount: js.UndefOr[js.Any] = js.undefined
  var operation: js.UndefOr[CallFunction[OperationRecord]] = js.undefined
  var paging_token: String
  var precedes: js.UndefOr[CallFunction[EffectRecord]] = js.undefined
  var starting_balance: String
  var succeeds: js.UndefOr[CallFunction[EffectRecord]] = js.undefined
  var `type`: String
  var type_i: String
}

object EffectRecord {
  @scala.inline
  def apply(
    _links: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in T | 'self' ]: stellar-sdk.stellar-sdk.Horizon.ResponseLink}
    */ typings.stellarDashSdk.stellarDashSdkStrings.BaseResponse with js.Any,
    account: String,
    paging_token: String,
    starting_balance: String,
    `type`: String,
    type_i: String,
    amount: js.Any = null,
    operation: () => js.Promise[OperationRecord] = null,
    precedes: () => js.Promise[EffectRecord] = null,
    succeeds: () => js.Promise[EffectRecord] = null
  ): EffectRecord = {
    val __obj = js.Dynamic.literal(_links = _links, account = account, paging_token = paging_token, starting_balance = starting_balance, type_i = type_i)
    __obj.updateDynamic("type")(`type`)
    if (amount != null) __obj.updateDynamic("amount")(amount)
    if (operation != null) __obj.updateDynamic("operation")(js.Any.fromFunction0(operation))
    if (precedes != null) __obj.updateDynamic("precedes")(js.Any.fromFunction0(precedes))
    if (succeeds != null) __obj.updateDynamic("succeeds")(js.Any.fromFunction0(succeeds))
    __obj.asInstanceOf[EffectRecord]
  }
}

