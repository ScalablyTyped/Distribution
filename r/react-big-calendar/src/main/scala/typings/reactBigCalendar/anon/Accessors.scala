package typings.reactBigCalendar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Accessors[TEvent /* <: js.Object */] extends js.Object {
  var accessors: js.Any
  var events: js.Array[TEvent]
  var minimumStartDifference: Double
  var slotMetrics: js.Any
}

object Accessors {
  @scala.inline
  def apply[/* <: js.Object */ TEvent](accessors: js.Any, events: js.Array[TEvent], minimumStartDifference: Double, slotMetrics: js.Any): Accessors[TEvent] = {
    val __obj = js.Dynamic.literal(accessors = accessors.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], minimumStartDifference = minimumStartDifference.asInstanceOf[js.Any], slotMetrics = slotMetrics.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accessors[TEvent]]
  }
}

