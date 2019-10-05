package typings.sharp.sharpMod

import org.scalablytyped.runtime.TopLevel
import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Kernel extends js.Object {
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

object Kernel {
  @scala.inline
  def apply(
    height: Double,
    kernel: ArrayLike[Double],
    width: Double,
    offset: Int | Double = null,
    scale: Int | Double = null
  ): Kernel = {
    val __obj = js.Dynamic.literal(height = height, kernel = kernel, width = width)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[Kernel]
  }
}

@JSImport("sharp", "kernel")
@js.native
object kernel extends TopLevel[KernelEnum]

