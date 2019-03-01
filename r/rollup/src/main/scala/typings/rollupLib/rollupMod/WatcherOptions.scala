package typings
package rollupLib.rollupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WatcherOptions extends js.Object {
  var chokidar: js.UndefOr[scala.Boolean | WatchOptions] = js.undefined
  var clearScreen: js.UndefOr[scala.Boolean] = js.undefined
  var exclude: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var include: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object WatcherOptions {
  @scala.inline
  def apply(
    chokidar: scala.Boolean | WatchOptions = null,
    clearScreen: js.UndefOr[scala.Boolean] = js.undefined,
    exclude: js.Array[java.lang.String] = null,
    include: js.Array[java.lang.String] = null
  ): WatcherOptions = {
    val __obj = js.Dynamic.literal()
    if (chokidar != null) __obj.updateDynamic("chokidar")(chokidar.asInstanceOf[js.Any])
    if (!js.isUndefined(clearScreen)) __obj.updateDynamic("clearScreen")(clearScreen)
    if (exclude != null) __obj.updateDynamic("exclude")(exclude)
    if (include != null) __obj.updateDynamic("include")(include)
    __obj.asInstanceOf[WatcherOptions]
  }
}

