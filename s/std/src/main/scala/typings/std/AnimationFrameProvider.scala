package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimationFrameProvider extends js.Object {
  def cancelAnimationFrame(handle: Double): Unit = js.native
  def requestAnimationFrame(callback: FrameRequestCallback): Double = js.native
}

object AnimationFrameProvider {
  @scala.inline
  def apply(cancelAnimationFrame: Double => Unit, requestAnimationFrame: FrameRequestCallback => Double): AnimationFrameProvider = {
    val __obj = js.Dynamic.literal(cancelAnimationFrame = js.Any.fromFunction1(cancelAnimationFrame), requestAnimationFrame = js.Any.fromFunction1(requestAnimationFrame))
    __obj.asInstanceOf[AnimationFrameProvider]
  }
  @scala.inline
  implicit class AnimationFrameProviderOps[Self <: AnimationFrameProvider] (val x: Self) extends AnyVal {
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
    def setCancelAnimationFrame(value: Double => Unit): Self = this.set("cancelAnimationFrame", js.Any.fromFunction1(value))
    @scala.inline
    def setRequestAnimationFrame(value: FrameRequestCallback => Double): Self = this.set("requestAnimationFrame", js.Any.fromFunction1(value))
  }
  
}

