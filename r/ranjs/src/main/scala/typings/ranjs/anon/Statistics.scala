package typings.ranjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Statistics extends js.Object {
  var passed: Boolean
  var statistics: Double
}

object Statistics {
  @scala.inline
  def apply(passed: Boolean, statistics: Double): Statistics = {
    val __obj = js.Dynamic.literal(passed = passed.asInstanceOf[js.Any], statistics = statistics.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statistics]
  }
}

