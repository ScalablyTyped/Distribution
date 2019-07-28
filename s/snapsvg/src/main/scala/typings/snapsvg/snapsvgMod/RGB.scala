package typings.snapsvg.snapsvgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RGB extends js.Object {
  var b: Double
  var g: Double
  var hex: String
  var r: Double
}

object RGB {
  @scala.inline
  def apply(b: Double, g: Double, hex: String, r: Double): RGB = {
    val __obj = js.Dynamic.literal(b = b, g = g, hex = hex, r = r)
  
    __obj.asInstanceOf[RGB]
  }
}

