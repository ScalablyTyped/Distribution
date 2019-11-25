package typings.stellarDashSdk.libFederationUnderscoreServerMod.FederationServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Record extends js.Object {
  var account_id: String
  var memo: js.UndefOr[String] = js.undefined
  var memo_type: js.UndefOr[String] = js.undefined
}

object Record {
  @scala.inline
  def apply(account_id: String, memo: String = null, memo_type: String = null): Record = {
    val __obj = js.Dynamic.literal(account_id = account_id.asInstanceOf[js.Any])
    if (memo != null) __obj.updateDynamic("memo")(memo.asInstanceOf[js.Any])
    if (memo_type != null) __obj.updateDynamic("memo_type")(memo_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Record]
  }
}

