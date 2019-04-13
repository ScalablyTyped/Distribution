package typings
package sharpLib.sharpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverlayOptions extends js.Object {
  /** how to blend this image with the image below. (optional, default `'over'`) */
  var blend: js.UndefOr[Blend] = js.undefined
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

object OverlayOptions {
  @scala.inline
  def apply(
    blend: Blend = null,
    create: Create = null,
    cutout: js.UndefOr[scala.Boolean] = js.undefined,
    density: scala.Int | scala.Double = null,
    gravity: Gravity = null,
    left: scala.Int | scala.Double = null,
    raw: Raw = null,
    tile: js.UndefOr[scala.Boolean] = js.undefined,
    top: scala.Int | scala.Double = null
  ): OverlayOptions = {
    val __obj = js.Dynamic.literal()
    if (blend != null) __obj.updateDynamic("blend")(blend)
    if (create != null) __obj.updateDynamic("create")(create)
    if (!js.isUndefined(cutout)) __obj.updateDynamic("cutout")(cutout)
    if (density != null) __obj.updateDynamic("density")(density.asInstanceOf[js.Any])
    if (gravity != null) __obj.updateDynamic("gravity")(gravity.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (raw != null) __obj.updateDynamic("raw")(raw)
    if (!js.isUndefined(tile)) __obj.updateDynamic("tile")(tile)
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverlayOptions]
  }
}

