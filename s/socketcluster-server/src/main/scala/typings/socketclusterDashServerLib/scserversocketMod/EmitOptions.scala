package typings
package socketclusterDashServerLib.scserversocketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmitOptions extends js.Object {
  var stringifiedData: js.UndefOr[java.lang.String] = js.undefined
  var useCache: js.UndefOr[scala.Boolean] = js.undefined
}

object EmitOptions {
  @scala.inline
  def apply(stringifiedData: java.lang.String = null, useCache: js.UndefOr[scala.Boolean] = js.undefined): EmitOptions = {
    val __obj = js.Dynamic.literal()
    if (stringifiedData != null) __obj.updateDynamic("stringifiedData")(stringifiedData)
    if (!js.isUndefined(useCache)) __obj.updateDynamic("useCache")(useCache)
    __obj.asInstanceOf[EmitOptions]
  }
}

