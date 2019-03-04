package typings
package quillLib.quillMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoundsStatic extends js.Object {
  var bottom: scala.Double
  var height: scala.Double
  var left: scala.Double
  var right: scala.Double
  var top: scala.Double
  var width: scala.Double
}

object BoundsStatic {
  @scala.inline
  def apply(
    bottom: scala.Double,
    height: scala.Double,
    left: scala.Double,
    right: scala.Double,
    top: scala.Double,
    width: scala.Double
  ): BoundsStatic = {
    val __obj = js.Dynamic.literal(bottom = bottom, height = height, left = left, right = right, top = top, width = width)
  
    __obj.asInstanceOf[BoundsStatic]
  }
}

