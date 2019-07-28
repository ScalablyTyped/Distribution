package typings.puppeteer.puppeteerMod

import typings.puppeteer.puppeteerStrings.base64
import typings.puppeteer.puppeteerStrings.jpeg
import typings.puppeteer.puppeteerStrings.png
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Base64ScreenShotOptions extends ScreenshotOptions {
  @JSName("encoding")
  var encoding_Base64ScreenShotOptions: base64
}

object Base64ScreenShotOptions {
  @scala.inline
  def apply(
    encoding: base64,
    clip: BoundingBox = null,
    fullPage: js.UndefOr[Boolean] = js.undefined,
    omitBackground: js.UndefOr[Boolean] = js.undefined,
    path: String = null,
    quality: Int | Double = null,
    `type`: jpeg | png = null
  ): Base64ScreenShotOptions = {
    val __obj = js.Dynamic.literal(encoding = encoding)
    if (clip != null) __obj.updateDynamic("clip")(clip)
    if (!js.isUndefined(fullPage)) __obj.updateDynamic("fullPage")(fullPage)
    if (!js.isUndefined(omitBackground)) __obj.updateDynamic("omitBackground")(omitBackground)
    if (path != null) __obj.updateDynamic("path")(path)
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Base64ScreenShotOptions]
  }
}

