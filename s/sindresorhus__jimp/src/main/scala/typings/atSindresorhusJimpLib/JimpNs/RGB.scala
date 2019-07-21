package typings
package atSindresorhusJimpLib.JimpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RGB extends js.Object {
  var b: scala.Double
  var g: scala.Double
  var r: scala.Double
}

object RGB {
  @scala.inline
  def apply(b: scala.Double, g: scala.Double, r: scala.Double): RGB = {
    val __obj = js.Dynamic.literal(b = b, g = g, r = r)
  
    __obj.asInstanceOf[RGB]
  }
}

