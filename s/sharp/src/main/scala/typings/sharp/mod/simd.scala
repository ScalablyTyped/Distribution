package typings.sharp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sharp", "simd")
@js.native
object simd extends js.Object {
  /**
    * Get and set use of SIMD vector unit instructions. Requires libvips to have been compiled with liborc support.
    * Improves the performance of resize, blur and sharpen operations by taking advantage of the SIMD vector unit of the CPU, e.g. Intel SSE and ARM NEON.
    * @param enable enable or disable use of SIMD vector unit instructions
    * @returns true if usage of SIMD vector unit instructions is enabled
    */
  def apply(): Boolean = js.native
  def apply(enable: Boolean): Boolean = js.native
}

