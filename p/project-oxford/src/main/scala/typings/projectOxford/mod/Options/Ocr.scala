package typings.projectOxford.mod.Options

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ocr extends js.Object {
   //BCP - 47 language code of the text to be detected in the image.Default value is "unk", then the service will auto detect the language of the text in the image.
  var detectOrientation: js.UndefOr[Boolean] = js.undefined
   // Path to image to be analyzed
  var language: js.UndefOr[String] = js.undefined
   // URL to image to be analyzed
  var path: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object Ocr {
  @scala.inline
  def apply(
    detectOrientation: js.UndefOr[Boolean] = js.undefined,
    language: String = null,
    path: String = null,
    url: String = null
  ): Ocr = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(detectOrientation)) __obj.updateDynamic("detectOrientation")(detectOrientation.get.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ocr]
  }
}

