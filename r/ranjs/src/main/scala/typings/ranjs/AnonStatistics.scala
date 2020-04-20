package typings.ranjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStatistics extends js.Object {
  var passed: Boolean
  var statistics: Double
}

object AnonStatistics {
  @scala.inline
  def apply(passed: Boolean, statistics: Double): AnonStatistics = {
    val __obj = js.Dynamic.literal(passed = passed.asInstanceOf[js.Any], statistics = statistics.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStatistics]
  }
}

