package typings.screeps.anon

import typings.screeps.EVENT_UPGRADE_CONTROLLER
import typings.screeps.EventItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventEVENTUPGRADECONTROLLER extends EventItem {
  var data: /* import warning: importer.ImportType#apply Failed type conversion: screeps.EventData[screeps.EVENT_UPGRADE_CONTROLLER] */ js.Any
  var event: EVENT_UPGRADE_CONTROLLER
  var objectId: String
}

object EventEVENTUPGRADECONTROLLER {
  @scala.inline
  def apply(
    data: /* import warning: importer.ImportType#apply Failed type conversion: screeps.EventData[screeps.EVENT_UPGRADE_CONTROLLER] */ js.Any,
    event: EVENT_UPGRADE_CONTROLLER,
    objectId: String
  ): EventEVENTUPGRADECONTROLLER = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], objectId = objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventEVENTUPGRADECONTROLLER]
  }
}

