package typings.reactDashNativeDashViewDashShot.reactDashNativeDashViewDashShotMod

import typings.reactDashNativeDashViewDashShot.reactDashNativeDashViewDashShotStrings.`data-uri`
import typings.reactDashNativeDashViewDashShot.reactDashNativeDashViewDashShotStrings.`zip-base64`
import typings.reactDashNativeDashViewDashShot.reactDashNativeDashViewDashShotStrings.base64
import typings.reactDashNativeDashViewDashShot.reactDashNativeDashViewDashShotStrings.jpg
import typings.reactDashNativeDashViewDashShot.reactDashNativeDashViewDashShotStrings.png
import typings.reactDashNativeDashViewDashShot.reactDashNativeDashViewDashShotStrings.raw
import typings.reactDashNativeDashViewDashShot.reactDashNativeDashViewDashShotStrings.tmpfile
import typings.reactDashNativeDashViewDashShot.reactDashNativeDashViewDashShotStrings.webm
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
    height: Int | Double = null,
    quality: Int | Double = null,
    result: tmpfile | base64 | `data-uri` | `zip-base64` = null,
    snapshotContentContainer: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null
  ): CaptureOptions = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    if (!js.isUndefined(snapshotContentContainer)) __obj.updateDynamic("snapshotContentContainer")(snapshotContentContainer)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptureOptions]
  }
}

