package typings.reactImgpro

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBlue extends js.Object {
  var blue: js.UndefOr[Double] = js.undefined
  var brighten: js.UndefOr[Double] = js.undefined
  var darken: js.UndefOr[Double] = js.undefined
  var desaturate: js.UndefOr[Double] = js.undefined
  var green: js.UndefOr[Double] = js.undefined
  var greyscale: js.UndefOr[Double] = js.undefined
  var lighten: js.UndefOr[Double] = js.undefined
  var mix: js.UndefOr[AnonAmount] = js.undefined
  var red: js.UndefOr[Double] = js.undefined
  var saturate: js.UndefOr[Double] = js.undefined
  var shade: js.UndefOr[Double] = js.undefined
  var spin: js.UndefOr[Double] = js.undefined
  var tint: js.UndefOr[Double] = js.undefined
  var xor: js.UndefOr[Double] = js.undefined
}

object AnonBlue {
  @scala.inline
  def apply(
    blue: Int | Double = null,
    brighten: Int | Double = null,
    darken: Int | Double = null,
    desaturate: Int | Double = null,
    green: Int | Double = null,
    greyscale: Int | Double = null,
    lighten: Int | Double = null,
    mix: AnonAmount = null,
    red: Int | Double = null,
    saturate: Int | Double = null,
    shade: Int | Double = null,
    spin: Int | Double = null,
    tint: Int | Double = null,
    xor: Int | Double = null
  ): AnonBlue = {
    val __obj = js.Dynamic.literal()
    if (blue != null) __obj.updateDynamic("blue")(blue.asInstanceOf[js.Any])
    if (brighten != null) __obj.updateDynamic("brighten")(brighten.asInstanceOf[js.Any])
    if (darken != null) __obj.updateDynamic("darken")(darken.asInstanceOf[js.Any])
    if (desaturate != null) __obj.updateDynamic("desaturate")(desaturate.asInstanceOf[js.Any])
    if (green != null) __obj.updateDynamic("green")(green.asInstanceOf[js.Any])
    if (greyscale != null) __obj.updateDynamic("greyscale")(greyscale.asInstanceOf[js.Any])
    if (lighten != null) __obj.updateDynamic("lighten")(lighten.asInstanceOf[js.Any])
    if (mix != null) __obj.updateDynamic("mix")(mix.asInstanceOf[js.Any])
    if (red != null) __obj.updateDynamic("red")(red.asInstanceOf[js.Any])
    if (saturate != null) __obj.updateDynamic("saturate")(saturate.asInstanceOf[js.Any])
    if (shade != null) __obj.updateDynamic("shade")(shade.asInstanceOf[js.Any])
    if (spin != null) __obj.updateDynamic("spin")(spin.asInstanceOf[js.Any])
    if (tint != null) __obj.updateDynamic("tint")(tint.asInstanceOf[js.Any])
    if (xor != null) __obj.updateDynamic("xor")(xor.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBlue]
  }
}

