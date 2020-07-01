package typings.rcTextarea.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaxHeight extends js.Object {
  var height: Double
  var maxHeight: Double
  var minHeight: Double
  var overflowY: js.Any
}

object MaxHeight {
  @scala.inline
  def apply(height: Double, maxHeight: Double, minHeight: Double, overflowY: js.Any): MaxHeight = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], maxHeight = maxHeight.asInstanceOf[js.Any], minHeight = minHeight.asInstanceOf[js.Any], overflowY = overflowY.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxHeight]
  }
}

