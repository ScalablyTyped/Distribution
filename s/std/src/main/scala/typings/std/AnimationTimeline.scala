package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationTimeline extends js.Object {
  val currentTime: Double | Null
}

object AnimationTimeline {
  @scala.inline
  def apply(currentTime: Double = null.asInstanceOf[Double]): AnimationTimeline = {
    val __obj = js.Dynamic.literal(currentTime = currentTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationTimeline]
  }
}

