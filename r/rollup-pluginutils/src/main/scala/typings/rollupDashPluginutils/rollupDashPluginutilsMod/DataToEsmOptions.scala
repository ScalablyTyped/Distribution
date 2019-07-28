package typings.rollupDashPluginutils.rollupDashPluginutilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataToEsmOptions extends js.Object {
  var compact: js.UndefOr[Boolean] = js.undefined
  var indent: js.UndefOr[String] = js.undefined
  var namedExports: js.UndefOr[Boolean] = js.undefined
  var objectShorthand: js.UndefOr[Boolean] = js.undefined
  var preferConst: js.UndefOr[Boolean] = js.undefined
}

object DataToEsmOptions {
  @scala.inline
  def apply(
    compact: js.UndefOr[Boolean] = js.undefined,
    indent: String = null,
    namedExports: js.UndefOr[Boolean] = js.undefined,
    objectShorthand: js.UndefOr[Boolean] = js.undefined,
    preferConst: js.UndefOr[Boolean] = js.undefined
  ): DataToEsmOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact)
    if (indent != null) __obj.updateDynamic("indent")(indent)
    if (!js.isUndefined(namedExports)) __obj.updateDynamic("namedExports")(namedExports)
    if (!js.isUndefined(objectShorthand)) __obj.updateDynamic("objectShorthand")(objectShorthand)
    if (!js.isUndefined(preferConst)) __obj.updateDynamic("preferConst")(preferConst)
    __obj.asInstanceOf[DataToEsmOptions]
  }
}

