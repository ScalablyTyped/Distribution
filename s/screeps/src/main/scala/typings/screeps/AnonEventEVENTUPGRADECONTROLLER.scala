package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEventEVENTUPGRADECONTROLLER extends EventItem {
  var data: /* import warning: importer.ImportType#apply Failed type conversion: screeps.EventData[screeps.EVENT_UPGRADE_CONTROLLER] */ js.Any
  var event: EVENT_UPGRADE_CONTROLLER
  var objectId: String
}

object AnonEventEVENTUPGRADECONTROLLER {
  @scala.inline
  def apply(
    data: /* import warning: importer.ImportType#apply Failed type conversion: screeps.EventData[screeps.EVENT_UPGRADE_CONTROLLER] */ js.Any,
    event: EVENT_UPGRADE_CONTROLLER,
    objectId: String
  ): AnonEventEVENTUPGRADECONTROLLER = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], objectId = objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEventEVENTUPGRADECONTROLLER]
  }
}

