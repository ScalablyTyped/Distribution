package typings.scrollmagic.mod

import typings.scrollmagic.scrollmagicStrings.shift
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShiftEvent extends Event[shift] {
  val reason: String
}

object ShiftEvent {
  @scala.inline
  def apply(
    currentTarget: Scene,
    namespace: String,
    reason: String,
    target: Scene,
    timeStamp: Date,
    timestamp: Date,
    `type`: shift
  ): ShiftEvent = {
    val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShiftEvent]
  }
}

