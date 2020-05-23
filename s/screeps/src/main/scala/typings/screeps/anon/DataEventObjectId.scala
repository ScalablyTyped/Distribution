package typings.screeps.anon

import typings.screeps.EVENT_HEAL
import typings.screeps.EventItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataEventObjectId extends EventItem {
  var data: /* import warning: importer.ImportType#apply Failed type conversion: screeps.EventData[screeps.EVENT_HEAL] */ js.Any
  var event: EVENT_HEAL
  var objectId: String
}

object DataEventObjectId {
  @scala.inline
  def apply(
    data: /* import warning: importer.ImportType#apply Failed type conversion: screeps.EventData[screeps.EVENT_HEAL] */ js.Any,
    event: EVENT_HEAL,
    objectId: String
  ): DataEventObjectId = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], objectId = objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataEventObjectId]
  }
}

