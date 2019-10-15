package typings.ranjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PassedStatistics extends js.Object {
  var passed: Boolean
  var statistics: Double
}

object Anon_PassedStatistics {
  @scala.inline
  def apply(passed: Boolean, statistics: Double): Anon_PassedStatistics = {
    val __obj = js.Dynamic.literal(passed = passed, statistics = statistics)
  
    __obj.asInstanceOf[Anon_PassedStatistics]
  }
}

