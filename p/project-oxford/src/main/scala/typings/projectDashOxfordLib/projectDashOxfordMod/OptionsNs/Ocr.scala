package typings
package projectDashOxfordLib.projectDashOxfordMod.OptionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ocr extends js.Object {
   //BCP - 47 language code of the text to be detected in the image.Default value is "unk", then the service will auto detect the language of the text in the image.
  var detectOrientation: js.UndefOr[scala.Boolean] = js.undefined
   // Path to image to be analyzed
  var language: js.UndefOr[java.lang.String] = js.undefined
   // URL to image to be analyzed
  var path: js.UndefOr[java.lang.String] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object Ocr {
  @scala.inline
  def apply(
    detectOrientation: js.UndefOr[scala.Boolean] = js.undefined,
    language: java.lang.String = null,
    path: java.lang.String = null,
    url: java.lang.String = null
  ): Ocr = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(detectOrientation)) __obj.updateDynamic("detectOrientation")(detectOrientation)
    if (language != null) __obj.updateDynamic("language")(language)
    if (path != null) __obj.updateDynamic("path")(path)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Ocr]
  }
}

