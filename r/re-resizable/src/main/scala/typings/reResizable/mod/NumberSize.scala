package typings.reResizable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberSize extends js.Object {
  var height: Double
  var width: Double
}

object NumberSize {
  @scala.inline
  def apply(height: Double, width: Double): NumberSize = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberSize]
  }
}

