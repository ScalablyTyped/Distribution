package typings.rollupDashTypescript.rollupDashTypescriptMod

import typings.rollupDashTypescript.Typeofts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var exclude: js.UndefOr[String | js.Array[String]] = js.undefined
  var include: js.UndefOr[String | js.Array[String]] = js.undefined
  var module: js.UndefOr[String] = js.undefined
  var tsconfig: js.UndefOr[Boolean] = js.undefined
  var typescript: js.UndefOr[Typeofts] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    exclude: String | js.Array[String] = null,
    include: String | js.Array[String] = null,
    module: String = null,
    tsconfig: js.UndefOr[Boolean] = js.undefined,
    typescript: Typeofts = null
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

