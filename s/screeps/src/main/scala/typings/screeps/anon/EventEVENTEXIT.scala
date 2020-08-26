package typings.screeps.anon

import typings.screeps.EVENT_EXIT
import typings.screeps.EventItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventEVENTEXIT extends EventItem {
  var data: /* import warning: importer.ImportType#apply Failed type conversion: screeps.EventData[screeps.EVENT_EXIT] */ js.Any = js.native
  var event: EVENT_EXIT = js.native
  var objectId: String = js.native
}

object EventEVENTEXIT {
  @scala.inline
  def apply(
    data: /* import warning: importer.ImportType#apply Failed type conversion: screeps.EventData[screeps.EVENT_EXIT] */ js.Any,
    event: EVENT_EXIT,
    objectId: String
  ): EventEVENTEXIT = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], objectId = objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventEVENTEXIT]
  }
  @scala.inline
  implicit class EventEVENTEXITOps[Self <: EventEVENTEXIT] (val x: Self) extends AnyVal {
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
    def setData(
      value: /* import warning: importer.ImportType#apply Failed type conversion: screeps.EventData[screeps.EVENT_EXIT] */ js.Any
    ): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setEvent(value: EVENT_EXIT): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def setObjectId(value: String): Self = this.set("objectId", value.asInstanceOf[js.Any])
  }
  
}

