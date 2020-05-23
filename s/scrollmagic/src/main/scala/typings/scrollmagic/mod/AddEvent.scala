package typings.scrollmagic.mod

import typings.scrollmagic.scrollmagicStrings.add
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddEvent extends Event[add] {
  val controller: Controller
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
}

