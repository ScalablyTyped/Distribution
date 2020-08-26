package typings.scrollmagic.mod

import typings.scrollmagic.scrollmagicStrings.destroy
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DestroyEvent extends Event[destroy] {
  val reset: Boolean = js.native
}

object DestroyEvent {
  @scala.inline
  def apply(
    currentTarget: Scene,
    namespace: String,
    reset: Boolean,
    target: Scene,
    timeStamp: Date,
    timestamp: Date,
    `type`: destroy
  ): DestroyEvent = {
    val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DestroyEvent]
  }
  @scala.inline
  implicit class DestroyEventOps[Self <: DestroyEvent] (val x: Self) extends AnyVal {
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
    def setReset(value: Boolean): Self = this.set("reset", value.asInstanceOf[js.Any])
  }
  
}

