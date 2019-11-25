package typings.reactDashNativeDashMaps.reactDashNativeDashMapsMod

import typings.reactDashNativeDashMaps.reactDashNativeDashMapsStrings.base64
import typings.reactDashNativeDashMaps.reactDashNativeDashMapsStrings.file
import typings.reactDashNativeDashMaps.reactDashNativeDashMapsStrings.jpg
import typings.reactDashNativeDashMaps.reactDashNativeDashMapsStrings.png
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapshotOptions extends js.Object {
  /** image formats, defaults to 'png' */
  var format: js.UndefOr[png | jpg] = js.undefined
  /** optional, when omitted the view-height is used */
  var height: js.UndefOr[Double] = js.undefined
  /** image quality: 0..1 (only relevant for jpg, default: 1) */
  var quality: js.UndefOr[Double] = js.undefined
  /** __iOS only__, optional region to render */
  var region: js.UndefOr[Region] = js.undefined
  /** result types, defaults to 'file' */
  var result: js.UndefOr[file | base64] = js.undefined
  /** optional, when omitted the view-width is used */
  var width: js.UndefOr[Double] = js.undefined
}

object SnapshotOptions {
  @scala.inline
  def apply(
    format: png | jpg = null,
    height: Int | Double = null,
    quality: Int | Double = null,
    region: Region = null,
    result: file | base64 = null,
    width: Int | Double = null
  ): SnapshotOptions = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotOptions]
  }
}

