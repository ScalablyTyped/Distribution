package typings.rollup.rollupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WatcherOptions extends js.Object {
  var chokidar: js.UndefOr[Boolean | WatchOptions] = js.undefined
  var clearScreen: js.UndefOr[Boolean] = js.undefined
  var exclude: js.UndefOr[js.Array[String]] = js.undefined
  var include: js.UndefOr[js.Array[String]] = js.undefined
}

object WatcherOptions {
  @scala.inline
  def apply(
    chokidar: Boolean | WatchOptions = null,
    clearScreen: js.UndefOr[Boolean] = js.undefined,
    exclude: js.Array[String] = null,
    include: js.Array[String] = null
  ): WatcherOptions = {
    val __obj = js.Dynamic.literal()
    if (chokidar != null) __obj.updateDynamic("chokidar")(chokidar.asInstanceOf[js.Any])
    if (!js.isUndefined(clearScreen)) __obj.updateDynamic("clearScreen")(clearScreen.asInstanceOf[js.Any])
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatcherOptions]
  }
}

