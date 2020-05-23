package typings.scrollmagic.mod

import typings.scrollmagic.scrollmagicStrings.destroy
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DestroyEvent extends Event[destroy] {
  val reset: Boolean
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
}

