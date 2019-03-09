package typings
package seenLib.seenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaterialOptions extends js.Object {
  var color: js.UndefOr[Color] = js.undefined
  var metallic: js.UndefOr[scala.Boolean] = js.undefined
  var shader: js.UndefOr[Shader] = js.undefined
  var specularColor: js.UndefOr[Color] = js.undefined
  var specularExponent: js.UndefOr[scala.Double] = js.undefined
}

object MaterialOptions {
  @scala.inline
  def apply(
    color: Color = null,
    metallic: js.UndefOr[scala.Boolean] = js.undefined,
    shader: Shader = null,
    specularColor: Color = null,
    specularExponent: scala.Int | scala.Double = null
  ): MaterialOptions = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(metallic)) __obj.updateDynamic("metallic")(metallic)
    if (shader != null) __obj.updateDynamic("shader")(shader)
    if (specularColor != null) __obj.updateDynamic("specularColor")(specularColor)
    if (specularExponent != null) __obj.updateDynamic("specularExponent")(specularExponent.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaterialOptions]
  }
}

