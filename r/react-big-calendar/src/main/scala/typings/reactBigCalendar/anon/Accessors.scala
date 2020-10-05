package typings.reactBigCalendar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Accessors[TEvent /* <: js.Object */] extends js.Object {
  var accessors: js.Any = js.native
  var events: js.Array[TEvent] = js.native
  var minimumStartDifference: Double = js.native
  var slotMetrics: js.Any = js.native
}

object Accessors {
  @scala.inline
  def apply[/* <: js.Object */ TEvent](accessors: js.Any, events: js.Array[TEvent], minimumStartDifference: Double, slotMetrics: js.Any): Accessors[TEvent] = {
    val __obj = js.Dynamic.literal(accessors = accessors.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], minimumStartDifference = minimumStartDifference.asInstanceOf[js.Any], slotMetrics = slotMetrics.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accessors[TEvent]]
  }
  @scala.inline
  implicit class AccessorsOps[Self <: Accessors[_], /* <: js.Object */ TEvent] (val x: Self with Accessors[TEvent]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccessors(value: js.Any): Self = this.set("accessors", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventsVarargs(value: TEvent*): Self = this.set("events", js.Array(value :_*))
    @scala.inline
    def setEvents(value: js.Array[TEvent]): Self = this.set("events", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinimumStartDifference(value: Double): Self = this.set("minimumStartDifference", value.asInstanceOf[js.Any])
    @scala.inline
    def setSlotMetrics(value: js.Any): Self = this.set("slotMetrics", value.asInstanceOf[js.Any])
  }
  
}

