package typings.reactSelect.utilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RectType extends js.Object {
  var bottom: Double
  var height: Double
  var left: Double
  var right: Double
  var width: Double
}

object RectType {
  @scala.inline
  def apply(bottom: Double, height: Double, left: Double, right: Double, width: Double): RectType = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RectType]
  }
}

