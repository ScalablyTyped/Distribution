package typings
package saxLib.saxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SAXOptions extends js.Object {
  var lowercase: js.UndefOr[scala.Boolean] = js.undefined
  var normalize: js.UndefOr[scala.Boolean] = js.undefined
  var noscript: js.UndefOr[scala.Boolean] = js.undefined
  var position: js.UndefOr[scala.Boolean] = js.undefined
  var trim: js.UndefOr[scala.Boolean] = js.undefined
  var xmlns: js.UndefOr[scala.Boolean] = js.undefined
}

object SAXOptions {
  @scala.inline
  def apply(
    lowercase: js.UndefOr[scala.Boolean] = js.undefined,
    normalize: js.UndefOr[scala.Boolean] = js.undefined,
    noscript: js.UndefOr[scala.Boolean] = js.undefined,
    position: js.UndefOr[scala.Boolean] = js.undefined,
    trim: js.UndefOr[scala.Boolean] = js.undefined,
    xmlns: js.UndefOr[scala.Boolean] = js.undefined
  ): SAXOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(lowercase)) __obj.updateDynamic("lowercase")(lowercase)
    if (!js.isUndefined(normalize)) __obj.updateDynamic("normalize")(normalize)
    if (!js.isUndefined(noscript)) __obj.updateDynamic("noscript")(noscript)
    if (!js.isUndefined(position)) __obj.updateDynamic("position")(position)
    if (!js.isUndefined(trim)) __obj.updateDynamic("trim")(trim)
    if (!js.isUndefined(xmlns)) __obj.updateDynamic("xmlns")(xmlns)
    __obj.asInstanceOf[SAXOptions]
  }
}

