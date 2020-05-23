package typings.puppeteer.mod

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
    quality: js.UndefOr[Double] = js.undefined,
    `type`: jpeg | png = null
  ): Base64ScreenShotOptions = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    if (clip != null) __obj.updateDynamic("clip")(clip.asInstanceOf[js.Any])
    if (!js.isUndefined(fullPage)) __obj.updateDynamic("fullPage")(fullPage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(omitBackground)) __obj.updateDynamic("omitBackground")(omitBackground.get.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(quality)) __obj.updateDynamic("quality")(quality.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Base64ScreenShotOptions]
  }
}

