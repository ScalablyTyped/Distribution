package typings.rnFetchBlob.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Count extends js.Object {
  var count: js.UndefOr[Double] = js.undefined
  var interval: js.UndefOr[Double] = js.undefined
}

object Count {
  @scala.inline
  def apply(count: js.UndefOr[Double] = js.undefined, interval: js.UndefOr[Double] = js.undefined): Count = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count.get.asInstanceOf[js.Any])
    if (!js.isUndefined(interval)) __obj.updateDynamic("interval")(interval.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Count]
  }
}

