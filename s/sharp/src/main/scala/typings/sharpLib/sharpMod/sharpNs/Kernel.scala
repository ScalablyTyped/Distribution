package typings
package sharpLib.sharpMod.sharpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Kernel extends js.Object {
  /** height of the kernel in pixels. */
  var height: scala.Double
  /** Array of length width*height containing the kernel values. */
  var kernel: stdLib.ArrayLike[scala.Double]
  /** the offset of the kernel in pixels. (optional, default 0) */
  var offset: js.UndefOr[scala.Double] = js.undefined
  /** the scale of the kernel in pixels. (optional, default sum) */
  var scale: js.UndefOr[scala.Double] = js.undefined
  /** width of the kernel in pixels. */
  var width: scala.Double
}

object Kernel {
  @scala.inline
  def apply(
    height: scala.Double,
    kernel: stdLib.ArrayLike[scala.Double],
    width: scala.Double,
    offset: scala.Int | scala.Double = null,
    scale: scala.Int | scala.Double = null
  ): Kernel = {
    val __obj = js.Dynamic.literal(height = height, kernel = kernel, width = width)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[Kernel]
  }
}

