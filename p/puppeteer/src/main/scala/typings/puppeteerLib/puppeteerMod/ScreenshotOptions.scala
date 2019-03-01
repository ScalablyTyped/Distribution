package typings
package puppeteerLib.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScreenshotOptions extends js.Object {
  /**
    * An object which specifies clipping region of the page.
    */
  var clip: js.UndefOr[BoundingBox] = js.undefined
  /**
    * The encoding of the image, can be either base64 or binary.
    * @default binary
    */
  var encoding: js.UndefOr[
    puppeteerLib.puppeteerLibStrings.base64 | puppeteerLib.puppeteerLibStrings.binary
  ] = js.undefined
  /**
    * When true, takes a screenshot of the full scrollable page.
    * @default false
    */
  var fullPage: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Hides default white background and allows capturing screenshots with transparency.
    * @default false
    */
  var omitBackground: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The file path to save the image to. The screenshot type will be inferred from file extension.
    * If `path` is a relative path, then it is resolved relative to current working directory.
    * If no path is provided, the image won't be saved to the disk.
    */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /** The quality of the image, between 0-100. Not applicable to png images. */
  var quality: js.UndefOr[scala.Double] = js.undefined
  /**
    * The screenshot type.
    * @default png
    */
  var `type`: js.UndefOr[puppeteerLib.puppeteerLibStrings.jpeg | puppeteerLib.puppeteerLibStrings.png] = js.undefined
}

object ScreenshotOptions {
  @scala.inline
  def apply(
    clip: BoundingBox = null,
    encoding: puppeteerLib.puppeteerLibStrings.base64 | puppeteerLib.puppeteerLibStrings.binary = null,
    fullPage: js.UndefOr[scala.Boolean] = js.undefined,
    omitBackground: js.UndefOr[scala.Boolean] = js.undefined,
    path: java.lang.String = null,
    quality: scala.Int | scala.Double = null,
    `type`: puppeteerLib.puppeteerLibStrings.jpeg | puppeteerLib.puppeteerLibStrings.png = null
  ): ScreenshotOptions = {
    val __obj = js.Dynamic.literal()
    if (clip != null) __obj.updateDynamic("clip")(clip)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (!js.isUndefined(fullPage)) __obj.updateDynamic("fullPage")(fullPage)
    if (!js.isUndefined(omitBackground)) __obj.updateDynamic("omitBackground")(omitBackground)
    if (path != null) __obj.updateDynamic("path")(path)
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScreenshotOptions]
  }
}

