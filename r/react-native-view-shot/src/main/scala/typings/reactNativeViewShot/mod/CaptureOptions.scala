package typings.reactNativeViewShot.mod

import typings.reactNativeViewShot.reactNativeViewShotStrings.`data-uri`
import typings.reactNativeViewShot.reactNativeViewShotStrings.`zip-base64`
import typings.reactNativeViewShot.reactNativeViewShotStrings.base64
import typings.reactNativeViewShot.reactNativeViewShotStrings.jpg
import typings.reactNativeViewShot.reactNativeViewShotStrings.png
import typings.reactNativeViewShot.reactNativeViewShotStrings.raw
import typings.reactNativeViewShot.reactNativeViewShotStrings.tmpfile
import typings.reactNativeViewShot.reactNativeViewShotStrings.webm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CaptureOptions extends js.Object {
  /**
    * either png or jpg or webm (Android). Defaults to png. raw is a ARGB array of image pixels.
    */
  var format: js.UndefOr[jpg | png | webm | raw] = js.undefined
  /**
    * @see {CaptureOptions#width}
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * the quality. 0.0 - 1.0 (default). (only available on lossy formats like jpg)
    */
  var quality: js.UndefOr[Double] = js.undefined
  /**
    * the method you want to use to save the snapshot, one of:
    " - tmpfile" (default): save to a temporary file (that will only exist for as long as the app is running).
    " - base64": encode as base64 and returns the raw string. Use only with small images as this may result of
    *   lags (the string is sent over the bridge). N.B. This is not a data uri, use data-uri instead.
    " - data-uri": same as base64 but also includes the Data URI scheme header.
    " - zip-base64: compress data with zip deflate algorithm and than convert to base64 and return as a raw string."
    */
  var result: js.UndefOr[tmpfile | base64 | `data-uri` | `zip-base64`] = js.undefined
  /**
    * if true and when view is a ScrollView, the "content container" height will be evaluated instead of the
    * container height.
    */
  var snapshotContentContainer: js.UndefOr[Boolean] = js.undefined
  /**
    * (number): the width and height of the final image (resized from the View bound. don't provide it if you want
    * the original pixel size).
    */
  var width: js.UndefOr[Double] = js.undefined
}

object CaptureOptions {
  @scala.inline
  def apply(
    format: jpg | png | webm | raw = null,
    height: js.UndefOr[Double] = js.undefined,
    quality: js.UndefOr[Double] = js.undefined,
    result: tmpfile | base64 | `data-uri` | `zip-base64` = null,
    snapshotContentContainer: js.UndefOr[Boolean] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): CaptureOptions = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(quality)) __obj.updateDynamic("quality")(quality.get.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    if (!js.isUndefined(snapshotContentContainer)) __obj.updateDynamic("snapshotContentContainer")(snapshotContentContainer.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptureOptions]
  }
}

