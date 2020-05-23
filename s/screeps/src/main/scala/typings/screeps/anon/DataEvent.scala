package typings.screeps.anon

import typings.screeps.EVENT_BUILD
import typings.screeps.EventItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataEvent extends EventItem {
  var data: /* import warning: importer.ImportType#apply Failed type conversion: screeps.EventData[screeps.EVENT_BUILD] */ js.Any
  var event: EVENT_BUILD
  var objectId: String
}

object DataEvent {
  @scala.inline
  def apply(
    data: /* import warning: importer.ImportType#apply Failed type conversion: screeps.EventData[screeps.EVENT_BUILD] */ js.Any,
    event: EVENT_BUILD,
    objectId: String
  ): DataEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], objectId = objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataEvent]
  }
}

