package typings
package sharpLib.sharpMod.sharpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TileOptions extends js.Object {
  /** Tile angle of rotation, must be a multiple of 90. (optional, default 0) */
  var angle: js.UndefOr[scala.Double] = js.undefined
  /** Tile container, with value fs (filesystem) or zip (compressed file). (optional, default 'fs') */
  var container: js.UndefOr[java.lang.String] = js.undefined
  /** How deep to make the pyramid, possible values are "onepixel", "onetile" or "one" (default based on layout) */
  var depth: js.UndefOr[java.lang.String] = js.undefined
  /** Filesystem layout, possible values are dz, zoomify or google. (optional, default 'dz') */
  var layout: js.UndefOr[java.lang.String] = js.undefined
  /** Tile overlap in pixels, a value between 0 and 8192. (optional, default 0) */
  var overlap: js.UndefOr[scala.Double] = js.undefined
  /** Tile size in pixels, a value between 1 and 8192. (optional, default 256) */
  var size: js.UndefOr[scala.Double] = js.undefined
}

object TileOptions {
  @scala.inline
  def apply(
    angle: scala.Int | scala.Double = null,
    container: java.lang.String = null,
    depth: java.lang.String = null,
    layout: java.lang.String = null,
    overlap: scala.Int | scala.Double = null,
    size: scala.Int | scala.Double = null
  ): TileOptions = {
    val __obj = js.Dynamic.literal()
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container)
    if (depth != null) __obj.updateDynamic("depth")(depth)
    if (layout != null) __obj.updateDynamic("layout")(layout)
    if (overlap != null) __obj.updateDynamic("overlap")(overlap.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileOptions]
  }
}

