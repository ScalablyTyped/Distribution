package typings.rnFetchBlob

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCount extends js.Object {
  var count: js.UndefOr[Double] = js.undefined
  var interval: js.UndefOr[Double] = js.undefined
}

object AnonCount {
  @scala.inline
  def apply(count: Int | Double = null, interval: Int | Double = null): AnonCount = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCount]
  }
}

