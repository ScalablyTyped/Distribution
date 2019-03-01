package typings
package reactDashNativeDashSvgDashChartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Color[T] extends js.Object {
  var color: java.lang.String
  var height: scala.Double
  var id: java.lang.String
  var index: scala.Double
  var key: java.lang.String
  var width: scala.Double
  var x: scala.Double
  var y: scala.Double
}

object Anon_Color {
  @scala.inline
  def apply[T](
    color: java.lang.String,
    height: scala.Double,
    id: java.lang.String,
    index: scala.Double,
    key: java.lang.String,
    width: scala.Double,
    x: scala.Double,
    y: scala.Double
  ): Anon_Color[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("color")(color)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("width")(width)
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[Anon_Color[T]]
  }
}

