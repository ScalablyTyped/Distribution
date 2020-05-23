package typings.seen.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaterialOptions extends js.Object {
  var color: js.UndefOr[Color] = js.undefined
  var metallic: js.UndefOr[Boolean] = js.undefined
  var shader: js.UndefOr[Shader] = js.undefined
  var specularColor: js.UndefOr[Color] = js.undefined
  var specularExponent: js.UndefOr[Double] = js.undefined
}

object MaterialOptions {
  @scala.inline
  def apply(
    color: Color = null,
    metallic: js.UndefOr[Boolean] = js.undefined,
    shader: Shader = null,
    specularColor: Color = null,
    specularExponent: js.UndefOr[Double] = js.undefined
  ): MaterialOptions = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(metallic)) __obj.updateDynamic("metallic")(metallic.get.asInstanceOf[js.Any])
    if (shader != null) __obj.updateDynamic("shader")(shader.asInstanceOf[js.Any])
    if (specularColor != null) __obj.updateDynamic("specularColor")(specularColor.asInstanceOf[js.Any])
    if (!js.isUndefined(specularExponent)) __obj.updateDynamic("specularExponent")(specularExponent.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaterialOptions]
  }
}

