package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorageEstimate extends js.Object {
  var quota: js.UndefOr[Double] = js.undefined
  var usage: js.UndefOr[Double] = js.undefined
}

object StorageEstimate {
  @scala.inline
  def apply(quota: js.UndefOr[Double] = js.undefined, usage: js.UndefOr[Double] = js.undefined): StorageEstimate = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(quota)) __obj.updateDynamic("quota")(quota.get.asInstanceOf[js.Any])
    if (!js.isUndefined(usage)) __obj.updateDynamic("usage")(usage.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageEstimate]
  }
}

