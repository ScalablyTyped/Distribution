package typings.ranjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPassedStatistics extends js.Object {
  var passed: Boolean
  var statistics: Double
}

object AnonPassedStatistics {
  @scala.inline
  def apply(passed: Boolean, statistics: Double): AnonPassedStatistics = {
    val __obj = js.Dynamic.literal(passed = passed.asInstanceOf[js.Any], statistics = statistics.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPassedStatistics]
  }
}

