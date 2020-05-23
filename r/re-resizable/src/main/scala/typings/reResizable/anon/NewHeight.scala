package typings.reResizable.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewHeight extends js.Object {
  var newHeight: Double
  var newWidth: Double
}

object NewHeight {
  @scala.inline
  def apply(newHeight: Double, newWidth: Double): NewHeight = {
    val __obj = js.Dynamic.literal(newHeight = newHeight.asInstanceOf[js.Any], newWidth = newWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewHeight]
  }
}

