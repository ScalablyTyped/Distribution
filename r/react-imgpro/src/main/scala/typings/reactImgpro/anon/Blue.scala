package typings.reactImgpro.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Blue extends js.Object {
  var blue: js.UndefOr[Double] = js.undefined
  var brighten: js.UndefOr[Double] = js.undefined
  var darken: js.UndefOr[Double] = js.undefined
  var desaturate: js.UndefOr[Double] = js.undefined
  var green: js.UndefOr[Double] = js.undefined
  var greyscale: js.UndefOr[Double] = js.undefined
  var lighten: js.UndefOr[Double] = js.undefined
  var mix: js.UndefOr[Amount] = js.undefined
  var red: js.UndefOr[Double] = js.undefined
  var saturate: js.UndefOr[Double] = js.undefined
  var shade: js.UndefOr[Double] = js.undefined
  var spin: js.UndefOr[Double] = js.undefined
  var tint: js.UndefOr[Double] = js.undefined
  var xor: js.UndefOr[Double] = js.undefined
}

object Blue {
  @scala.inline
  def apply(
    blue: js.UndefOr[Double] = js.undefined,
    brighten: js.UndefOr[Double] = js.undefined,
    darken: js.UndefOr[Double] = js.undefined,
    desaturate: js.UndefOr[Double] = js.undefined,
    green: js.UndefOr[Double] = js.undefined,
    greyscale: js.UndefOr[Double] = js.undefined,
    lighten: js.UndefOr[Double] = js.undefined,
    mix: Amount = null,
    red: js.UndefOr[Double] = js.undefined,
    saturate: js.UndefOr[Double] = js.undefined,
    shade: js.UndefOr[Double] = js.undefined,
    spin: js.UndefOr[Double] = js.undefined,
    tint: js.UndefOr[Double] = js.undefined,
    xor: js.UndefOr[Double] = js.undefined
  ): Blue = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(blue)) __obj.updateDynamic("blue")(blue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(brighten)) __obj.updateDynamic("brighten")(brighten.get.asInstanceOf[js.Any])
    if (!js.isUndefined(darken)) __obj.updateDynamic("darken")(darken.get.asInstanceOf[js.Any])
    if (!js.isUndefined(desaturate)) __obj.updateDynamic("desaturate")(desaturate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(green)) __obj.updateDynamic("green")(green.get.asInstanceOf[js.Any])
    if (!js.isUndefined(greyscale)) __obj.updateDynamic("greyscale")(greyscale.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lighten)) __obj.updateDynamic("lighten")(lighten.get.asInstanceOf[js.Any])
    if (mix != null) __obj.updateDynamic("mix")(mix.asInstanceOf[js.Any])
    if (!js.isUndefined(red)) __obj.updateDynamic("red")(red.get.asInstanceOf[js.Any])
    if (!js.isUndefined(saturate)) __obj.updateDynamic("saturate")(saturate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shade)) __obj.updateDynamic("shade")(shade.get.asInstanceOf[js.Any])
    if (!js.isUndefined(spin)) __obj.updateDynamic("spin")(spin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tint)) __obj.updateDynamic("tint")(tint.get.asInstanceOf[js.Any])
    if (!js.isUndefined(xor)) __obj.updateDynamic("xor")(xor.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Blue]
  }
}

