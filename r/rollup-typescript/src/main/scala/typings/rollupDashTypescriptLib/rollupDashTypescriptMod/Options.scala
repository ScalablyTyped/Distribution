package typings
package rollupDashTypescriptLib.rollupDashTypescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var exclude: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var include: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var module: js.UndefOr[java.lang.String] = js.undefined
  var tsconfig: js.UndefOr[scala.Boolean] = js.undefined
  var typescript: js.UndefOr[rollupDashTypescriptLib.Typeofts] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    exclude: java.lang.String | js.Array[java.lang.String] = null,
    include: java.lang.String | js.Array[java.lang.String] = null,
    module: java.lang.String = null,
    tsconfig: js.UndefOr[scala.Boolean] = js.undefined,
    typescript: rollupDashTypescriptLib.Typeofts = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (module != null) __obj.updateDynamic("module")(module)
    if (!js.isUndefined(tsconfig)) __obj.updateDynamic("tsconfig")(tsconfig)
    if (typescript != null) __obj.updateDynamic("typescript")(typescript)
    __obj.asInstanceOf[Options]
  }
}

