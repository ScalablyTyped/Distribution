package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonObjectId extends EventItem {
  var data: /* import warning: importer.ImportType#apply Failed type conversion: screeps.EventData[screeps.EVENT_ATTACK_CONTROLLER] */ js.Any
  var event: EVENT_ATTACK_CONTROLLER
  var objectId: String
}

object AnonObjectId {
  @scala.inline
  def apply(
    data: /* import warning: importer.ImportType#apply Failed type conversion: screeps.EventData[screeps.EVENT_ATTACK_CONTROLLER] */ js.Any,
    event: EVENT_ATTACK_CONTROLLER,
    objectId: String
  ): AnonObjectId = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], objectId = objectId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonObjectId]
  }
}

