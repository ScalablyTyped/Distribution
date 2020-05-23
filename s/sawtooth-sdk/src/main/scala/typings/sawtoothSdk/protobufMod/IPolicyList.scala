package typings.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPolicyList extends js.Object {
  /** PolicyList policies */
  var policies: js.UndefOr[js.Array[IPolicy] | Null] = js.undefined
}

object IPolicyList {
  @scala.inline
  def apply(policies: js.UndefOr[Null | js.Array[IPolicy]] = js.undefined): IPolicyList = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(policies)) __obj.updateDynamic("policies")(policies.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPolicyList]
  }
}

