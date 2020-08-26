package typings.scrollmagic.mod

import typings.scrollmagic.scrollmagicStrings.shift
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShiftEvent extends Event[shift] {
  val reason: String = js.native
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
  @scala.inline
  implicit class ShiftEventOps[Self <: ShiftEvent] (val x: Self) extends AnyVal {
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
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
  }
  
}

