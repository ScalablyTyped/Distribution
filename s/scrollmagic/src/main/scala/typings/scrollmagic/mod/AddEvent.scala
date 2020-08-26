package typings.scrollmagic.mod

import typings.scrollmagic.scrollmagicStrings.add
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddEvent extends Event[add] {
  val controller: Controller = js.native
}

object AddEvent {
  @scala.inline
  def apply(
    controller: Controller,
    currentTarget: Scene,
    namespace: String,
    target: Scene,
    timeStamp: Date,
    timestamp: Date,
    `type`: add
  ): AddEvent = {
    val __obj = js.Dynamic.literal(controller = controller.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddEvent]
  }
  @scala.inline
  implicit class AddEventOps[Self <: AddEvent] (val x: Self) extends AnyVal {
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
    def setController(value: Controller): Self = this.set("controller", value.asInstanceOf[js.Any])
  }
  
}

