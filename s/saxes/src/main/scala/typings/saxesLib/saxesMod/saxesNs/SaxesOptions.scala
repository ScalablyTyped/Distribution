package typings
package saxesLib.saxesMod.saxesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SaxesOptions extends js.Object {
  var additionalNamespaces: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.undefined
  var fileName: js.UndefOr[java.lang.String] = js.undefined
  var fragment: js.UndefOr[scala.Boolean] = js.undefined
  var position: js.UndefOr[scala.Boolean] = js.undefined
  var xmlns: js.UndefOr[scala.Boolean] = js.undefined
}

object SaxesOptions {
  @scala.inline
  def apply(
    additionalNamespaces: stdLib.Record[java.lang.String, java.lang.String] = null,
    fileName: java.lang.String = null,
    fragment: js.UndefOr[scala.Boolean] = js.undefined,
    position: js.UndefOr[scala.Boolean] = js.undefined,
    xmlns: js.UndefOr[scala.Boolean] = js.undefined
  ): SaxesOptions = {
    val __obj = js.Dynamic.literal()
    if (additionalNamespaces != null) __obj.updateDynamic("additionalNamespaces")(additionalNamespaces)
    if (fileName != null) __obj.updateDynamic("fileName")(fileName)
    if (!js.isUndefined(fragment)) __obj.updateDynamic("fragment")(fragment)
    if (!js.isUndefined(position)) __obj.updateDynamic("position")(position)
    if (!js.isUndefined(xmlns)) __obj.updateDynamic("xmlns")(xmlns)
    __obj.asInstanceOf[SaxesOptions]
  }
}

