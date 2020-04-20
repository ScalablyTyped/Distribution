package typings.snapsvg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RGB_ extends js.Object {
  var b: Double
  var g: Double
  var hex: String
  var r: Double
}

object RGB_ {
  @scala.inline
  def apply(b: Double, g: Double, hex: String, r: Double): RGB_ = {
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], hex = hex.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
    __obj.asInstanceOf[RGB_]
  }
}

