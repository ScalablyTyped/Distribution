package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEventEVENTEXIT extends EventItem {
  var data: /* import warning: importer.ImportType#apply Failed type conversion: screeps.EventData[screeps.EVENT_EXIT] */ js.Any
  var event: EVENT_EXIT
  var objectId: String
}

object AnonEventEVENTEXIT {
  @scala.inline
  def apply(
    data: /* import warning: importer.ImportType#apply Failed type conversion: screeps.EventData[screeps.EVENT_EXIT] */ js.Any,
    event: EVENT_EXIT,
    objectId: String
  ): AnonEventEVENTEXIT = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], objectId = objectId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEventEVENTEXIT]
  }
}

