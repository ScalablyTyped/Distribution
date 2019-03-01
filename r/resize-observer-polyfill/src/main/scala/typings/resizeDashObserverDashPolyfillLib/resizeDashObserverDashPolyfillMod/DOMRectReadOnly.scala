package typings
package resizeDashObserverDashPolyfillLib.resizeDashObserverDashPolyfillMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DOMRectReadOnly extends js.Object {
  val bottom: scala.Double
  val height: scala.Double
  val left: scala.Double
  val right: scala.Double
  val top: scala.Double
  val width: scala.Double
  val x: scala.Double
  val y: scala.Double
}

object DOMRectReadOnly {
  @scala.inline
  def apply(
    bottom: scala.Double,
    height: scala.Double,
    left: scala.Double,
    right: scala.Double,
    top: scala.Double,
    width: scala.Double,
    x: scala.Double,
    y: scala.Double
  ): DOMRectReadOnly = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bottom")(bottom)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("left")(left)
    __obj.updateDynamic("right")(right)
    __obj.updateDynamic("top")(top)
    __obj.updateDynamic("width")(width)
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[DOMRectReadOnly]
  }
}

