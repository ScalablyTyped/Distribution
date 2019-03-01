package typings
package puppeteerLib.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Base64ScreenShotOptions extends ScreenshotOptions {
  @JSName("encoding")
  var encoding_Base64ScreenShotOptions: puppeteerLib.puppeteerLibStrings.base64
}

object Base64ScreenShotOptions {
  @scala.inline
  def apply(
    encoding: puppeteerLib.puppeteerLibStrings.base64,
    clip: BoundingBox = null,
    fullPage: js.UndefOr[scala.Boolean] = js.undefined,
    omitBackground: js.UndefOr[scala.Boolean] = js.undefined,
    path: java.lang.String = null,
    quality: scala.Int | scala.Double = null,
    `type`: puppeteerLib.puppeteerLibStrings.jpeg | puppeteerLib.puppeteerLibStrings.png = null
  ): Base64ScreenShotOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("encoding")(encoding)
    if (clip != null) __obj.updateDynamic("clip")(clip)
    if (!js.isUndefined(fullPage)) __obj.updateDynamic("fullPage")(fullPage)
    if (!js.isUndefined(omitBackground)) __obj.updateDynamic("omitBackground")(omitBackground)
    if (path != null) __obj.updateDynamic("path")(path)
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Base64ScreenShotOptions]
  }
}

