package typings.screeps.anon

import typings.screeps.EVENT_REPAIR
import typings.screeps.EventItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventEVENTREPAIR extends EventItem {
  var data: /* import warning: importer.ImportType#apply Failed type conversion: screeps.EventData[screeps.EVENT_REPAIR] */ js.Any
  var event: EVENT_REPAIR
  var objectId: String
}

object EventEVENTREPAIR {
  @scala.inline
  def apply(
    data: /* import warning: importer.ImportType#apply Failed type conversion: screeps.EventData[screeps.EVENT_REPAIR] */ js.Any,
    event: EVENT_REPAIR,
    objectId: String
  ): EventEVENTREPAIR = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], objectId = objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventEVENTREPAIR]
  }
}

