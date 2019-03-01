package typings
package puppeteerLib.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BinaryScreenShotOptions extends ScreenshotOptions {
  @JSName("encoding")
  var encoding_BinaryScreenShotOptions: js.UndefOr[puppeteerLib.puppeteerLibStrings.binary] = js.undefined
}

object BinaryScreenShotOptions {
  @scala.inline
  def apply(
    clip: BoundingBox = null,
    encoding: puppeteerLib.puppeteerLibStrings.binary = null,
    fullPage: js.UndefOr[scala.Boolean] = js.undefined,
    omitBackground: js.UndefOr[scala.Boolean] = js.undefined,
    path: java.lang.String = null,
    quality: scala.Int | scala.Double = null,
    `type`: puppeteerLib.puppeteerLibStrings.jpeg | puppeteerLib.puppeteerLibStrings.png = null
  ): BinaryScreenShotOptions = {
    val __obj = js.Dynamic.literal()
    if (clip != null) __obj.updateDynamic("clip")(clip)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (!js.isUndefined(fullPage)) __obj.updateDynamic("fullPage")(fullPage)
    if (!js.isUndefined(omitBackground)) __obj.updateDynamic("omitBackground")(omitBackground)
    if (path != null) __obj.updateDynamic("path")(path)
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinaryScreenShotOptions]
  }
}

