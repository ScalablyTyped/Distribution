package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashNativeDashSvg {
  /*
    ColumnMajorTransformMatrix
    [a, b, c, d, tx, ty]
    This matrix can be visualized as:
    ╔═      ═╗
    ║ a c tx ║
    ║ b d ty ║
    ║ 0 0 1  ║
    ╚═      ═╝
  */
  type ColumnMajorTransformMatrix = js.Array[Double]
  // argb values inside range 0x00 to 0xff inclusive
  // int32ARGBColor = 0xaarrggbb
  type int32ARGBColor = Double
  // rgba values inside range 0 to 1 inclusive
  // rgbaArray = [r, g, b, a]
  type rgbaArray = js.Array[Double]
}
