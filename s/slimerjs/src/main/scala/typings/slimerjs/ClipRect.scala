package typings.slimerjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClipRect
  extends TopLeft
     with Size

object ClipRect {
  @scala.inline
  def apply(height: Double, left: Double, top: Double, width: Double): ClipRect = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClipRect]
  }
}

