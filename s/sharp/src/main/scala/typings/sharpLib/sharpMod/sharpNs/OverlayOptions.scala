package typings
package sharpLib.sharpMod.sharpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait OverlayOptions extends js.Object {
  /** describes a blank overlay to be created. */
  var create: js.UndefOr[Create] = js.undefined
  /** set to true to apply only the alpha channel of the overlay image to the input image, giving the appearance of one image being cut out of another. (optional, default false) */
  var cutout: js.UndefOr[scala.Boolean] = js.undefined
  /** number representing the DPI for vector overlay image. (optional, default 72) */
  var density: js.UndefOr[scala.Double] = js.undefined
  /** gravity at which to place the overlay. (optional, default 'centre') */
  var gravity: js.UndefOr[Gravity] = js.undefined
  /** the pixel offset from the left edge. */
  var left: js.UndefOr[scala.Double] = js.undefined
  /** describes overlay when using raw pixel data. */
  var raw: js.UndefOr[Raw] = js.undefined
  /** set to true to repeat the overlay image across the entire image with the given  gravity. (optional, default false) */
  var tile: js.UndefOr[scala.Boolean] = js.undefined
  /** the pixel offset from the top edge. */
  var top: js.UndefOr[scala.Double] = js.undefined
}

