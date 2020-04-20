package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEventEVENTRESERVECONTROLLER extends EventItem {
  var data: /* import warning: importer.ImportType#apply Failed type conversion: screeps.EventData[screeps.EVENT_RESERVE_CONTROLLER] */ js.Any
  var event: EVENT_RESERVE_CONTROLLER
  var objectId: String
}

object AnonEventEVENTRESERVECONTROLLER {
  @scala.inline
  def apply(
    data: /* import warning: importer.ImportType#apply Failed type conversion: screeps.EventData[screeps.EVENT_RESERVE_CONTROLLER] */ js.Any,
    event: EVENT_RESERVE_CONTROLLER,
    objectId: String
  ): AnonEventEVENTRESERVECONTROLLER = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], objectId = objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEventEVENTRESERVECONTROLLER]
  }
}

