package typings.screeps.anon

import typings.screeps.EVENT_ATTACK_CONTROLLER
import typings.screeps.EventItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectId extends EventItem {
  var data: /* import warning: importer.ImportType#apply Failed type conversion: screeps.EventData[screeps.EVENT_ATTACK_CONTROLLER] */ js.Any = js.native
  var event: EVENT_ATTACK_CONTROLLER = js.native
  var objectId: String = js.native
}

object ObjectId {
  @scala.inline
  def apply(
    data: /* import warning: importer.ImportType#apply Failed type conversion: screeps.EventData[screeps.EVENT_ATTACK_CONTROLLER] */ js.Any,
    event: EVENT_ATTACK_CONTROLLER,
    objectId: String
  ): ObjectId = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], objectId = objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectId]
  }
  @scala.inline
  implicit class ObjectIdOps[Self <: ObjectId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setData(
      value: /* import warning: importer.ImportType#apply Failed type conversion: screeps.EventData[screeps.EVENT_ATTACK_CONTROLLER] */ js.Any
    ): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setEvent(value: EVENT_ATTACK_CONTROLLER): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def setObjectId(value: String): Self = this.set("objectId", value.asInstanceOf[js.Any])
  }
  
}

