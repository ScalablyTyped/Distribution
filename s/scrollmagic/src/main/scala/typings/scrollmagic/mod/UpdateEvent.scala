package typings.scrollmagic.mod

import typings.scrollmagic.scrollmagicStrings.update
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateEvent extends Event[update] {
  val endPos: Double = js.native
  val scrollPos: Double = js.native
  val startPos: Double = js.native
}

object UpdateEvent {
  @scala.inline
  def apply(
    currentTarget: Scene,
    endPos: Double,
    namespace: String,
    scrollPos: Double,
    startPos: Double,
    target: Scene,
    timeStamp: Date,
    timestamp: Date,
    `type`: update
  ): UpdateEvent = {
    val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any], endPos = endPos.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], scrollPos = scrollPos.asInstanceOf[js.Any], startPos = startPos.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEvent]
  }
  @scala.inline
  implicit class UpdateEventOps[Self <: UpdateEvent] (val x: Self) extends AnyVal {
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
    def setEndPos(value: Double): Self = this.set("endPos", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollPos(value: Double): Self = this.set("scrollPos", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartPos(value: Double): Self = this.set("startPos", value.asInstanceOf[js.Any])
  }
  
}

