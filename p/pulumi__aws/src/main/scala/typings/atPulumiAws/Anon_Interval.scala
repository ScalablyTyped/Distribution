package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Interval extends js.Object {
  var interval: js.UndefOr[Double] = js.undefined
  var percentage: js.UndefOr[Double] = js.undefined
}

object Anon_Interval {
  @scala.inline
  def apply(interval: Int | Double = null, percentage: Int | Double = null): Anon_Interval = {
    val __obj = js.Dynamic.literal()
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (percentage != null) __obj.updateDynamic("percentage")(percentage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Interval]
  }
}

