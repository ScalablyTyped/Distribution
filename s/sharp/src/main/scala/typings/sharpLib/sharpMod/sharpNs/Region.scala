package typings
package sharpLib.sharpMod.sharpNs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("left")(left)
    __obj.updateDynamic("top")(top)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[Region]
  }
}

