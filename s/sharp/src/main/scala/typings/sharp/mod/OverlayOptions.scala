package typings.sharp.mod

import typings.node.Buffer
import typings.sharp.AnonCreate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverlayOptions extends js.Object {
  /** how to blend this image with the image below. (optional, default `'over'`) */
  var blend: js.UndefOr[Blend] = js.undefined
  /** number representing the DPI for vector overlay image. (optional, default 72) */
  var density: js.UndefOr[Double] = js.undefined
  /** gravity at which to place the overlay. (optional, default 'centre') */
  var gravity: js.UndefOr[Gravity_] = js.undefined
  /** Buffer containing image data, String containing the path to an image file, or Create object  */
  var input: js.UndefOr[String | Buffer | AnonCreate] = js.undefined
  /** the pixel offset from the left edge. */
  var left: js.UndefOr[Double] = js.undefined
  /** Set to true to avoid premultipling the image below. Equivalent to the --premultiplied vips option. */
  var premultiplied: js.UndefOr[Boolean] = js.undefined
  /** describes overlay when using raw pixel data. */
  var raw: js.UndefOr[Raw] = js.undefined
  /** set to true to repeat the overlay image across the entire image with the given  gravity. (optional, default false) */
  var tile: js.UndefOr[Boolean] = js.undefined
  /** the pixel offset from the top edge. */
  var top: js.UndefOr[Double] = js.undefined
}

object OverlayOptions {
  @scala.inline
  def apply(
    blend: Blend = null,
    density: Int | Double = null,
    gravity: Gravity_ = null,
    input: String | Buffer | AnonCreate = null,
    left: Int | Double = null,
    premultiplied: js.UndefOr[Boolean] = js.undefined,
    raw: Raw = null,
    tile: js.UndefOr[Boolean] = js.undefined,
    top: Int | Double = null
  ): OverlayOptions = {
    val __obj = js.Dynamic.literal()
    if (blend != null) __obj.updateDynamic("blend")(blend.asInstanceOf[js.Any])
    if (density != null) __obj.updateDynamic("density")(density.asInstanceOf[js.Any])
    if (gravity != null) __obj.updateDynamic("gravity")(gravity.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (!js.isUndefined(premultiplied)) __obj.updateDynamic("premultiplied")(premultiplied.asInstanceOf[js.Any])
    if (raw != null) __obj.updateDynamic("raw")(raw.asInstanceOf[js.Any])
    if (!js.isUndefined(tile)) __obj.updateDynamic("tile")(tile.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverlayOptions]
  }
}

