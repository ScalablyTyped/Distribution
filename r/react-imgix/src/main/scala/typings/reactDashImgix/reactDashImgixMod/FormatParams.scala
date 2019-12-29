package typings.reactDashImgix.reactDashImgixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatParams extends js.Object {
  var ch: js.UndefOr[ImgixParamType] = js.undefined
  var chromasub: js.UndefOr[ImgixParamType] = js.undefined
  var colorquant: js.UndefOr[ImgixParamType] = js.undefined
  var cs: js.UndefOr[ImgixParamType] = js.undefined
  var dl: js.UndefOr[ImgixParamType] = js.undefined
  var dpi: js.UndefOr[ImgixParamType] = js.undefined
  var fm: js.UndefOr[ImgixParamType] = js.undefined
  var lossless: js.UndefOr[ImgixParamType] = js.undefined
  var q: js.UndefOr[ImgixParamType] = js.undefined
}

object FormatParams {
  @scala.inline
  def apply(
    ch: ImgixParamType = null,
    chromasub: ImgixParamType = null,
    colorquant: ImgixParamType = null,
    cs: ImgixParamType = null,
    dl: ImgixParamType = null,
    dpi: ImgixParamType = null,
    fm: ImgixParamType = null,
    lossless: ImgixParamType = null,
    q: ImgixParamType = null
  ): FormatParams = {
    val __obj = js.Dynamic.literal()
    if (ch != null) __obj.updateDynamic("ch")(ch.asInstanceOf[js.Any])
    if (chromasub != null) __obj.updateDynamic("chromasub")(chromasub.asInstanceOf[js.Any])
    if (colorquant != null) __obj.updateDynamic("colorquant")(colorquant.asInstanceOf[js.Any])
    if (cs != null) __obj.updateDynamic("cs")(cs.asInstanceOf[js.Any])
    if (dl != null) __obj.updateDynamic("dl")(dl.asInstanceOf[js.Any])
    if (dpi != null) __obj.updateDynamic("dpi")(dpi.asInstanceOf[js.Any])
    if (fm != null) __obj.updateDynamic("fm")(fm.asInstanceOf[js.Any])
    if (lossless != null) __obj.updateDynamic("lossless")(lossless.asInstanceOf[js.Any])
    if (q != null) __obj.updateDynamic("q")(q.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatParams]
  }
}

