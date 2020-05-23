package typings.sendcloud.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailListListData extends js.Object {
  var limit: js.UndefOr[Double] = js.undefined
  var start: js.UndefOr[Double] = js.undefined
}

object EmailListListData {
  @scala.inline
  def apply(limit: js.UndefOr[Double] = js.undefined, start: js.UndefOr[Double] = js.undefined): EmailListListData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(start)) __obj.updateDynamic("start")(start.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailListListData]
  }
}

