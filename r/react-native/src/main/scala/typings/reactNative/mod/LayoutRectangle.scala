package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayoutRectangle extends js.Object {
  var height: Double
  var width: Double
  var x: Double
  var y: Double
}

object LayoutRectangle {
  @scala.inline
  def apply(height: Double, width: Double, x: Double, y: Double): LayoutRectangle = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LayoutRectangle]
  }
}

