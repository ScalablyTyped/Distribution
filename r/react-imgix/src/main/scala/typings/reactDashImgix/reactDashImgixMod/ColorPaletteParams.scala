package typings.reactDashImgix.reactDashImgixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorPaletteParams extends js.Object {
  var colors: js.UndefOr[ImgixParamType] = js.undefined
  var palette: js.UndefOr[ImgixParamType] = js.undefined
  var prefix: js.UndefOr[ImgixParamType] = js.undefined
}

object ColorPaletteParams {
  @scala.inline
  def apply(colors: ImgixParamType = null, palette: ImgixParamType = null, prefix: ImgixParamType = null): ColorPaletteParams = {
    val __obj = js.Dynamic.literal()
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (palette != null) __obj.updateDynamic("palette")(palette.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorPaletteParams]
  }
}

