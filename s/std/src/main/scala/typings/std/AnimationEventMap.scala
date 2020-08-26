package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimationEventMap extends js.Object {
  var cancel: AnimationPlaybackEvent = js.native
  var finish: AnimationPlaybackEvent = js.native
}

object AnimationEventMap {
  @scala.inline
  def apply(cancel: AnimationPlaybackEvent, finish: AnimationPlaybackEvent): AnimationEventMap = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], finish = finish.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationEventMap]
  }
  @scala.inline
  implicit class AnimationEventMapOps[Self <: AnimationEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCancel(value: AnimationPlaybackEvent): Self = this.set("cancel", value.asInstanceOf[js.Any])
    @scala.inline
    def setFinish(value: AnimationPlaybackEvent): Self = this.set("finish", value.asInstanceOf[js.Any])
  }
  
}

