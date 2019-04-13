package typings
package sharpLib.sharpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Region extends js.Object {
  /** dimension of extracted image */
  var height: scala.Double
  /** zero-indexed offset from left edge */
  var left: scala.Double
  /** zero-indexed offset from top edge */
  var top: scala.Double
  /** dimension of extracted image */
  var width: scala.Double
}

object Region {
  @scala.inline
  def apply(height: scala.Double, left: scala.Double, top: scala.Double, width: scala.Double): Region = {
    val __obj = js.Dynamic.literal(height = height, left = left, top = top, width = width)
  
    __obj.asInstanceOf[Region]
  }
}

