package typings.resizeDashObserverDashPolyfill.resizeDashObserverDashPolyfillMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DOMRectReadOnly extends js.Object {
  val bottom: Double
  val height: Double
  val left: Double
  val right: Double
  val top: Double
  val width: Double
  val x: Double
  val y: Double
}

object DOMRectReadOnly {
  @scala.inline
  def apply(
    bottom: Double,
    height: Double,
    left: Double,
    right: Double,
    top: Double,
    width: Double,
    x: Double,
    y: Double
  ): DOMRectReadOnly = {
    val __obj = js.Dynamic.literal(bottom = bottom, height = height, left = left, right = right, top = top, width = width, x = x, y = y)
  
    __obj.asInstanceOf[DOMRectReadOnly]
  }
}

