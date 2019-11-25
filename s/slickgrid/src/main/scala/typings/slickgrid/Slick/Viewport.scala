package typings.slickgrid.Slick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Viewport extends js.Object {
  var bottom: Double
  var leftPx: Double
  var rightPx: Double
  var top: Double
}

object Viewport {
  @scala.inline
  def apply(bottom: Double, leftPx: Double, rightPx: Double, top: Double): Viewport = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], leftPx = leftPx.asInstanceOf[js.Any], rightPx = rightPx.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Viewport]
  }
}

