package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimationTimeline extends js.Object {
  val currentTime: Double | Null = js.native
}

object AnimationTimeline {
  @scala.inline
  def apply(): AnimationTimeline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimationTimeline]
  }
  @scala.inline
  implicit class AnimationTimelineOps[Self <: AnimationTimeline] (val x: Self) extends AnyVal {
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
    def setCurrentTime(value: Double): Self = this.set("currentTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentTimeNull: Self = this.set("currentTime", null)
  }
  
}

