package typings.reactScroll

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSmooth extends js.Object {
  var smooth: Boolean | String
}

object AnonSmooth {
  @scala.inline
  def apply(smooth: Boolean | String): AnonSmooth = {
    val __obj = js.Dynamic.literal(smooth = smooth.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSmooth]
  }
}

