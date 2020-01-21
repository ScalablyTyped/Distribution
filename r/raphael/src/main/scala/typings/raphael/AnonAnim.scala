package typings.raphael

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAnim extends js.Object {
  var anim: RaphaelAnimation
  var status: Double
}

object AnonAnim {
  @scala.inline
  def apply(anim: RaphaelAnimation, status: Double): AnonAnim = {
    val __obj = js.Dynamic.literal(anim = anim.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAnim]
  }
}

