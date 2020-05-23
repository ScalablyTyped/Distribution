package typings.screeps.anon

import typings.screeps.EVENT_HARVEST
import typings.screeps.EventItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventObjectId extends EventItem {
  var data: /* import warning: importer.ImportType#apply Failed type conversion: screeps.EventData[screeps.EVENT_HARVEST] */ js.Any
  var event: EVENT_HARVEST
  var objectId: String
}

object EventObjectId {
  @scala.inline
  def apply(
    data: /* import warning: importer.ImportType#apply Failed type conversion: screeps.EventData[screeps.EVENT_HARVEST] */ js.Any,
    event: EVENT_HARVEST,
    objectId: String
  ): EventObjectId = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], objectId = objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventObjectId]
  }
}

