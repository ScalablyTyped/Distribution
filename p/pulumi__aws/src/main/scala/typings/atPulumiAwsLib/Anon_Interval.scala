package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Interval extends js.Object {
  var interval: js.UndefOr[scala.Double] = js.undefined
  var percentage: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Interval {
  @scala.inline
  def apply(interval: scala.Int | scala.Double = null, percentage: scala.Int | scala.Double = null): Anon_Interval = {
    val __obj = js.Dynamic.literal()
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (percentage != null) __obj.updateDynamic("percentage")(percentage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Interval]
  }
}

