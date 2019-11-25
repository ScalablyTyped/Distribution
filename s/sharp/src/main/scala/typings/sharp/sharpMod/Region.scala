package typings.sharp.sharpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Region extends js.Object {
  /** dimension of extracted image */
  var height: Double
  /** zero-indexed offset from left edge */
  var left: Double
  /** zero-indexed offset from top edge */
  var top: Double
  /** dimension of extracted image */
  var width: Double
}

object Region {
  @scala.inline
  def apply(height: Double, left: Double, top: Double, width: Double): Region = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Region]
  }
}

