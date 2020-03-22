package typings.rascal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCounters extends js.Object {
  var counters: AnonInMemory
}

object AnonCounters {
  @scala.inline
  def apply(counters: AnonInMemory): AnonCounters = {
    val __obj = js.Dynamic.literal(counters = counters.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCounters]
  }
}

