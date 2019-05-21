package typings
package reactDashNativeDashMapsLib.reactDashNativeDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapshotOptions extends js.Object {
  /** image formats, defaults to 'png' */
  var format: js.UndefOr[
    reactDashNativeDashMapsLib.reactDashNativeDashMapsLibStrings.png | reactDashNativeDashMapsLib.reactDashNativeDashMapsLibStrings.jpg
  ] = js.undefined
  /** optional, when omitted the view-height is used */
  var height: js.UndefOr[scala.Double] = js.undefined
  /** image quality: 0..1 (only relevant for jpg, default: 1) */
  var quality: js.UndefOr[scala.Double] = js.undefined
  /** __iOS only__, optional region to render */
  var region: js.UndefOr[Region] = js.undefined
  /** result types, defaults to 'file' */
  var result: js.UndefOr[
    reactDashNativeDashMapsLib.reactDashNativeDashMapsLibStrings.file | reactDashNativeDashMapsLib.reactDashNativeDashMapsLibStrings.base64
  ] = js.undefined
  /** optional, when omitted the view-width is used */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object SnapshotOptions {
  @scala.inline
  def apply(
    format: reactDashNativeDashMapsLib.reactDashNativeDashMapsLibStrings.png | reactDashNativeDashMapsLib.reactDashNativeDashMapsLibStrings.jpg = null,
    height: scala.Int | scala.Double = null,
    quality: scala.Int | scala.Double = null,
    region: Region = null,
    result: reactDashNativeDashMapsLib.reactDashNativeDashMapsLibStrings.file | reactDashNativeDashMapsLib.reactDashNativeDashMapsLibStrings.base64 = null,
    width: scala.Int | scala.Double = null
  ): SnapshotOptions = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region)
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotOptions]
  }
}

