package typings.reactDashNativeDashFetchDashBlob

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Count extends js.Object {
  var count: js.UndefOr[Double] = js.undefined
  var interval: js.UndefOr[Double] = js.undefined
}

object Anon_Count {
  @scala.inline
  def apply(count: Int | Double = null, interval: Int | Double = null): Anon_Count = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Count]
  }
}

