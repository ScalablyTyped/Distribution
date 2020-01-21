package typings.reactNativeCalendars.mod

import typings.reactNativeCalendars.AnonColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiPeriodMarking extends Marking {
  var periods: js.Array[AnonColor]
}

object MultiPeriodMarking {
  @scala.inline
  def apply(periods: js.Array[AnonColor]): MultiPeriodMarking = {
    val __obj = js.Dynamic.literal(periods = periods.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MultiPeriodMarking]
  }
}

