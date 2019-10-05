package typings.projectDashOxford.projectDashOxfordMod.Options

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Analyze extends js.Object {
   // Detects if faces are present.If present, generate coordinates, gender and age.
  var Adult: js.UndefOr[Boolean] = js.undefined
   // Detects if image is pornographic in nature(nudity or sex act).Sexually suggestive content is also detected.
  var Categories: js.UndefOr[Boolean] = js.undefined
   // Detects if image is clipart or a line drawing.
  var Color: js.UndefOr[Boolean] = js.undefined
   // Determines the accent color, dominant color, if image is black& white.
  var Faces: js.UndefOr[Boolean] = js.undefined
   // Path to image to be analyzed
  var ImageType: js.UndefOr[Boolean] = js.undefined
   // Url to image to be analyzed
  var path: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object Analyze {
  @scala.inline
  def apply(
    Adult: js.UndefOr[Boolean] = js.undefined,
    Categories: js.UndefOr[Boolean] = js.undefined,
    Color: js.UndefOr[Boolean] = js.undefined,
    Faces: js.UndefOr[Boolean] = js.undefined,
    ImageType: js.UndefOr[Boolean] = js.undefined,
    path: String = null,
    url: String = null
  ): Analyze = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Adult)) __obj.updateDynamic("Adult")(Adult)
    if (!js.isUndefined(Categories)) __obj.updateDynamic("Categories")(Categories)
    if (!js.isUndefined(Color)) __obj.updateDynamic("Color")(Color)
    if (!js.isUndefined(Faces)) __obj.updateDynamic("Faces")(Faces)
    if (!js.isUndefined(ImageType)) __obj.updateDynamic("ImageType")(ImageType)
    if (path != null) __obj.updateDynamic("path")(path)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Analyze]
  }
}

