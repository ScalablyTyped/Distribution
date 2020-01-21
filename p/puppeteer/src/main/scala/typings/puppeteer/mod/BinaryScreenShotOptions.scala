package typings.puppeteer.mod

import typings.puppeteer.puppeteerStrings.binary
import typings.puppeteer.puppeteerStrings.jpeg
import typings.puppeteer.puppeteerStrings.png
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BinaryScreenShotOptions extends ScreenshotOptions {
  @JSName("encoding")
  var encoding_BinaryScreenShotOptions: js.UndefOr[binary] = js.undefined
}

object BinaryScreenShotOptions {
  @scala.inline
  def apply(
    clip: BoundingBox = null,
    encoding: binary = null,
    fullPage: js.UndefOr[Boolean] = js.undefined,
    omitBackground: js.UndefOr[Boolean] = js.undefined,
    path: String = null,
    quality: Int | Double = null,
    `type`: jpeg | png = null
  ): BinaryScreenShotOptions = {
    val __obj = js.Dynamic.literal()
    if (clip != null) __obj.updateDynamic("clip")(clip.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (!js.isUndefined(fullPage)) __obj.updateDynamic("fullPage")(fullPage.asInstanceOf[js.Any])
    if (!js.isUndefined(omitBackground)) __obj.updateDynamic("omitBackground")(omitBackground.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinaryScreenShotOptions]
  }
}

