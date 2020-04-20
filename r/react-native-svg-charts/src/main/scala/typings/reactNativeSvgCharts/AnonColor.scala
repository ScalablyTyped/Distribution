package typings.reactNativeSvgCharts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColor[T] extends js.Object {
  var color: String
  var height: Double
  var id: String
  var index: Double
  var key: /* keyof T */ String
  var width: Double
  var x: Double
  var y: Double
}

object AnonColor {
  @scala.inline
  def apply[T](
    color: String,
    height: Double,
    id: String,
    index: Double,
    key: /* keyof T */ String,
    width: Double,
    x: Double,
    y: Double
  ): AnonColor[T] = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColor[T]]
  }
}

