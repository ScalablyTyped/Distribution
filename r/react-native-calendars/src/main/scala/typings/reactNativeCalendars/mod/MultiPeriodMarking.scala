package typings.reactNativeCalendars.mod

import typings.reactNativeCalendars.anon.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiPeriodMarking extends Marking {
  var periods: js.Array[Color]
}

object MultiPeriodMarking {
  @scala.inline
  def apply(periods: js.Array[Color]): MultiPeriodMarking = {
    val __obj = js.Dynamic.literal(periods = periods.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiPeriodMarking]
  }
}

