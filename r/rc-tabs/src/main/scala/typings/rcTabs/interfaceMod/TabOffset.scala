package typings.rcTabs.interfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabOffset extends js.Object {
  var height: Double
  var left: Double
  var right: Double
  var top: Double
  var width: Double
}

object TabOffset {
  @scala.inline
  def apply(height: Double, left: Double, right: Double, top: Double, width: Double): TabOffset = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabOffset]
  }
}

