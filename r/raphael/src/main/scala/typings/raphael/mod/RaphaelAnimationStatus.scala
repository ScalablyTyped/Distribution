package typings.raphael.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RaphaelAnimationStatus extends js.Object {
  /** The animation to which the status applies. */
  var anim: RaphaelAnimation
  /** The current status of the animation, i.e. the normalized animation time, a value between `0` and `1`. */
  var status: Double
}

object RaphaelAnimationStatus {
  @scala.inline
  def apply(anim: RaphaelAnimation, status: Double): RaphaelAnimationStatus = {
    val __obj = js.Dynamic.literal(anim = anim.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaphaelAnimationStatus]
  }
}

