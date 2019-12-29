package typings.reactDashImgix.reactDashImgixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdjustmentParams extends js.Object {
  var bri: js.UndefOr[ImgixParamType] = js.undefined
  var con: js.UndefOr[ImgixParamType] = js.undefined
  var exp: js.UndefOr[ImgixParamType] = js.undefined
  var gam: js.UndefOr[ImgixParamType] = js.undefined
  var high: js.UndefOr[ImgixParamType] = js.undefined
  var hue: js.UndefOr[ImgixParamType] = js.undefined
  var invert: js.UndefOr[ImgixParamType] = js.undefined
  var sat: js.UndefOr[ImgixParamType] = js.undefined
  var shad: js.UndefOr[ImgixParamType] = js.undefined
  var sharp: js.UndefOr[ImgixParamType] = js.undefined
  var usm: js.UndefOr[ImgixParamType] = js.undefined
  var usmrad: js.UndefOr[ImgixParamType] = js.undefined
  var vib: js.UndefOr[ImgixParamType] = js.undefined
}

object AdjustmentParams {
  @scala.inline
  def apply(
    bri: ImgixParamType = null,
    con: ImgixParamType = null,
    exp: ImgixParamType = null,
    gam: ImgixParamType = null,
    high: ImgixParamType = null,
    hue: ImgixParamType = null,
    invert: ImgixParamType = null,
    sat: ImgixParamType = null,
    shad: ImgixParamType = null,
    sharp: ImgixParamType = null,
    usm: ImgixParamType = null,
    usmrad: ImgixParamType = null,
    vib: ImgixParamType = null
  ): AdjustmentParams = {
    val __obj = js.Dynamic.literal()
    if (bri != null) __obj.updateDynamic("bri")(bri.asInstanceOf[js.Any])
    if (con != null) __obj.updateDynamic("con")(con.asInstanceOf[js.Any])
    if (exp != null) __obj.updateDynamic("exp")(exp.asInstanceOf[js.Any])
    if (gam != null) __obj.updateDynamic("gam")(gam.asInstanceOf[js.Any])
    if (high != null) __obj.updateDynamic("high")(high.asInstanceOf[js.Any])
    if (hue != null) __obj.updateDynamic("hue")(hue.asInstanceOf[js.Any])
    if (invert != null) __obj.updateDynamic("invert")(invert.asInstanceOf[js.Any])
    if (sat != null) __obj.updateDynamic("sat")(sat.asInstanceOf[js.Any])
    if (shad != null) __obj.updateDynamic("shad")(shad.asInstanceOf[js.Any])
    if (sharp != null) __obj.updateDynamic("sharp")(sharp.asInstanceOf[js.Any])
    if (usm != null) __obj.updateDynamic("usm")(usm.asInstanceOf[js.Any])
    if (usmrad != null) __obj.updateDynamic("usmrad")(usmrad.asInstanceOf[js.Any])
    if (vib != null) __obj.updateDynamic("vib")(vib.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdjustmentParams]
  }
}

