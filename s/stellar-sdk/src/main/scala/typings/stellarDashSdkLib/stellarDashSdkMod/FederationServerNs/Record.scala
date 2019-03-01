package typings
package stellarDashSdkLib.stellarDashSdkMod.FederationServerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Record extends js.Object {
  var account_id: java.lang.String
  var memo: js.UndefOr[java.lang.String] = js.undefined
  var memo_type: js.UndefOr[java.lang.String] = js.undefined
}

object Record {
  @scala.inline
  def apply(account_id: java.lang.String, memo: java.lang.String = null, memo_type: java.lang.String = null): Record = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("account_id")(account_id)
    if (memo != null) __obj.updateDynamic("memo")(memo)
    if (memo_type != null) __obj.updateDynamic("memo_type")(memo_type)
    __obj.asInstanceOf[Record]
  }
}

