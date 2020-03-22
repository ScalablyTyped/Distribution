package typings.reResizable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNewHeight extends js.Object {
  var newHeight: Double
  var newWidth: Double
}

object AnonNewHeight {
  @scala.inline
  def apply(newHeight: Double, newWidth: Double): AnonNewHeight = {
    val __obj = js.Dynamic.literal(newHeight = newHeight.asInstanceOf[js.Any], newWidth = newWidth.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNewHeight]
  }
}

