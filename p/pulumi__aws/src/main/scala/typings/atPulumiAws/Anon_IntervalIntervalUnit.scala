package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IntervalIntervalUnit extends js.Object {
  var interval: Double
  var intervalUnit: js.UndefOr[String] = js.undefined
  var times: String
}

object Anon_IntervalIntervalUnit {
  @scala.inline
  def apply(interval: Double, times: String, intervalUnit: String = null): Anon_IntervalIntervalUnit = {
    val __obj = js.Dynamic.literal(interval = interval, times = times)
    if (intervalUnit != null) __obj.updateDynamic("intervalUnit")(intervalUnit)
    __obj.asInstanceOf[Anon_IntervalIntervalUnit]
  }
}

