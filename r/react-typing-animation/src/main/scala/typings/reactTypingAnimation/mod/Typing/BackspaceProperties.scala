package typings.reactTypingAnimation.mod.Typing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackspaceProperties extends js.Object {
  var count: js.UndefOr[Double] = js.native
  var delay: js.UndefOr[Double] = js.native
  var speed: js.UndefOr[Double] = js.native
}

object BackspaceProperties {
  @scala.inline
  def apply(): BackspaceProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackspaceProperties]
  }
  @scala.inline
  implicit class BackspacePropertiesOps[Self <: BackspaceProperties] (val x: Self) extends AnyVal {
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
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setSpeed(value: Double): Self = this.set("speed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpeed: Self = this.set("speed", js.undefined)
  }
  
}

