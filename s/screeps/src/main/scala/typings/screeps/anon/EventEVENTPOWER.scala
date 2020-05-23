package typings.screeps.anon

import typings.screeps.EVENT_POWER
import typings.screeps.EventItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventEVENTPOWER extends EventItem {
  var data: /* import warning: importer.ImportType#apply Failed type conversion: screeps.EventData[screeps.EVENT_POWER] */ js.Any
  var event: EVENT_POWER
  var objectId: String
}

object EventEVENTPOWER {
  @scala.inline
  def apply(
    data: /* import warning: importer.ImportType#apply Failed type conversion: screeps.EventData[screeps.EVENT_POWER] */ js.Any,
    event: EVENT_POWER,
    objectId: String
  ): EventEVENTPOWER = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], objectId = objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventEVENTPOWER]
  }
}

