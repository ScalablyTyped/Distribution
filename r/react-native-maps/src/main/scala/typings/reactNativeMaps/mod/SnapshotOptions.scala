package typings.reactNativeMaps.mod

import typings.reactNativeMaps.reactNativeMapsStrings.base64
import typings.reactNativeMaps.reactNativeMapsStrings.file
import typings.reactNativeMaps.reactNativeMapsStrings.jpg
import typings.reactNativeMaps.reactNativeMapsStrings.png
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
    height: js.UndefOr[Double] = js.undefined,
    quality: js.UndefOr[Double] = js.undefined,
    region: Region = null,
    result: file | base64 = null,
    width: js.UndefOr[Double] = js.undefined
  ): SnapshotOptions = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(quality)) __obj.updateDynamic("quality")(quality.get.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotOptions]
  }
}

