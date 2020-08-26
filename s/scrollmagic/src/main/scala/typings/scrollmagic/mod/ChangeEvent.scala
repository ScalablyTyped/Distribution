package typings.scrollmagic.mod

import typings.scrollmagic.scrollmagicStrings.change
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangeEvent extends Event[change] {
  val newval: js.Any = js.native
  val what: String = js.native
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
  @scala.inline
  implicit class ChangeEventOps[Self <: ChangeEvent] (val x: Self) extends AnyVal {
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
    def setNewval(value: js.Any): Self = this.set("newval", value.asInstanceOf[js.Any])
    @scala.inline
    def setWhat(value: String): Self = this.set("what", value.asInstanceOf[js.Any])
  }
  
}

