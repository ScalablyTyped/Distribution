package typings.scrollmagic.mod

import typings.scrollmagic.scrollmagicStrings.change
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeEvent extends Event[change] {
  val newval: js.Any
  val what: String
}

object ChangeEvent {
  @scala.inline
  def apply(
    currentTarget: Scene,
    namespace: String,
    newval: js.Any,
    target: Scene,
    timeStamp: Date,
    timestamp: Date,
    `type`: change,
    what: String
  ): ChangeEvent = {
    val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], newval = newval.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], what = what.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeEvent]
  }
}

