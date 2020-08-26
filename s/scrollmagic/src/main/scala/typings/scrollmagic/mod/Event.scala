package typings.scrollmagic.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Event[T] extends js.Object {
  val currentTarget: Scene = js.native
  val namespace: String = js.native
  val target: Scene = js.native
  val timeStamp: Date = js.native
  val timestamp: Date = js.native
  val `type`: T = js.native
}

object Event {
  @scala.inline
  def apply[T](
    currentTarget: Scene,
    namespace: String,
    target: Scene,
    timeStamp: Date,
    timestamp: Date,
    `type`: T
  ): Event[T] = {
    val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event[T]]
  }
  @scala.inline
  implicit class EventOps[Self <: Event[_], T] (val x: Self with Event[T]) extends AnyVal {
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
    def setCurrentTarget(value: Scene): Self = this.set("currentTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def setNamespace(value: String): Self = this.set("namespace", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: Scene): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeStamp(value: Date): Self = this.set("timeStamp", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: T): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

