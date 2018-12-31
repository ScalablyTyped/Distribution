package typings
package sharpLib.sharpMod.sharpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TiffOptions extends OutputOptions {
  /** Compression options: lzw, deflate, jpeg, ccittfax4 (optional, default 'jpeg') */
  var compression: js.UndefOr[java.lang.String] = js.undefined
  /** Compression predictor options: none, horizontal, float (optional, default 'horizontal') */
  var predictor: js.UndefOr[java.lang.String] = js.undefined
  /** Squash 8-bit images down to 1 bit (optional, default false) */
  var squash: js.UndefOr[scala.Boolean] = js.undefined
  /** Horizontal resolution in pixels/mm (optional, default 1.0) */
  var xres: js.UndefOr[scala.Double] = js.undefined
  /** Vertical resolution in pixels/mm (optional, default 1.0) */
  var yres: js.UndefOr[scala.Double] = js.undefined
}

