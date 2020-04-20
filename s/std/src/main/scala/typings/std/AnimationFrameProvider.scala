package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationFrameProvider extends js.Object {
  def cancelAnimationFrame(handle: Double): Unit
  def requestAnimationFrame(callback: FrameRequestCallback): Double
}

object AnimationFrameProvider {
  @scala.inline
  def apply(cancelAnimationFrame: Double => Unit, requestAnimationFrame: FrameRequestCallback => Double): AnimationFrameProvider = {
    val __obj = js.Dynamic.literal(cancelAnimationFrame = js.Any.fromFunction1(cancelAnimationFrame), requestAnimationFrame = js.Any.fromFunction1(requestAnimationFrame))
    __obj.asInstanceOf[AnimationFrameProvider]
  }
}

