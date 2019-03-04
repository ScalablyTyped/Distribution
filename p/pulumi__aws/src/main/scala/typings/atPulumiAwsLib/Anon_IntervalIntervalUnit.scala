package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IntervalIntervalUnit extends js.Object {
  var interval: scala.Double
  var intervalUnit: js.UndefOr[java.lang.String] = js.undefined
  var times: java.lang.String
}

object Anon_IntervalIntervalUnit {
  @scala.inline
  def apply(interval: scala.Double, times: java.lang.String, intervalUnit: java.lang.String = null): Anon_IntervalIntervalUnit = {
    val __obj = js.Dynamic.literal(interval = interval, times = times)
    if (intervalUnit != null) __obj.updateDynamic("intervalUnit")(intervalUnit)
    __obj.asInstanceOf[Anon_IntervalIntervalUnit]
  }
}

