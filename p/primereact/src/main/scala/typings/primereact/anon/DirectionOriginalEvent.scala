package typings.primereact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectionOriginalEvent extends js.Object {
  var direction: String = js.native
  var originalEvent: typings.std.Event = js.native
  var source: js.Array[_] = js.native
  var target: js.Array[_] = js.native
}

object DirectionOriginalEvent {
  @scala.inline
  def apply(direction: String, originalEvent: typings.std.Event, source: js.Array[_], target: js.Array[_]): DirectionOriginalEvent = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionOriginalEvent]
  }
  @scala.inline
  implicit class DirectionOriginalEventOps[Self <: DirectionOriginalEvent] (val x: Self) extends AnyVal {
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
    def setDirection(value: String): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def setOriginalEvent(value: typings.std.Event): Self = this.set("originalEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceVarargs(value: js.Any*): Self = this.set("source", js.Array(value :_*))
    @scala.inline
    def setSource(value: js.Array[_]): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetVarargs(value: js.Any*): Self = this.set("target", js.Array(value :_*))
    @scala.inline
    def setTarget(value: js.Array[_]): Self = this.set("target", value.asInstanceOf[js.Any])
  }
  
}

