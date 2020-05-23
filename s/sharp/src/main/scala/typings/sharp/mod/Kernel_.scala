package typings.sharp.mod

import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Kernel_ extends js.Object {
  /** height of the kernel in pixels. */
  var height: Double
  /** Array of length width*height containing the kernel values. */
  var kernel: ArrayLike[Double]
  /** the offset of the kernel in pixels. (optional, default 0) */
  var offset: js.UndefOr[Double] = js.undefined
  /** the scale of the kernel in pixels. (optional, default sum) */
  var scale: js.UndefOr[Double] = js.undefined
  /** width of the kernel in pixels. */
  var width: Double
}

object Kernel_ {
  @scala.inline
  def apply(
    height: Double,
    kernel: ArrayLike[Double],
    width: Double,
    offset: js.UndefOr[Double] = js.undefined,
    scale: js.UndefOr[Double] = js.undefined
  ): Kernel_ = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], kernel = kernel.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scale)) __obj.updateDynamic("scale")(scale.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Kernel_]
  }
}

