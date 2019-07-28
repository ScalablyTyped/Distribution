package typings.rollup.rollupMod

import typings.rollup.Anon_PollInterval
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WatchOptions extends js.Object {
  var alwaysStat: js.UndefOr[Boolean] = js.undefined
  var atomic: js.UndefOr[Boolean | Double] = js.undefined
  var awaitWriteFinish: js.UndefOr[Anon_PollInterval | Boolean] = js.undefined
  var binaryInterval: js.UndefOr[Double] = js.undefined
  var cwd: js.UndefOr[String] = js.undefined
  var depth: js.UndefOr[Double] = js.undefined
  var disableGlobbing: js.UndefOr[Boolean] = js.undefined
  var followSymlinks: js.UndefOr[Boolean] = js.undefined
  var ignoreInitial: js.UndefOr[Boolean] = js.undefined
  var ignorePermissionErrors: js.UndefOr[Boolean] = js.undefined
  var ignored: js.UndefOr[js.Any] = js.undefined
  var interval: js.UndefOr[Double] = js.undefined
  var persistent: js.UndefOr[Boolean] = js.undefined
  var useFsEvents: js.UndefOr[Boolean] = js.undefined
  var usePolling: js.UndefOr[Boolean] = js.undefined
}

object WatchOptions {
  @scala.inline
  def apply(
    alwaysStat: js.UndefOr[Boolean] = js.undefined,
    atomic: Boolean | Double = null,
    awaitWriteFinish: Anon_PollInterval | Boolean = null,
    binaryInterval: Int | Double = null,
    cwd: String = null,
    depth: Int | Double = null,
    disableGlobbing: js.UndefOr[Boolean] = js.undefined,
    followSymlinks: js.UndefOr[Boolean] = js.undefined,
    ignoreInitial: js.UndefOr[Boolean] = js.undefined,
    ignorePermissionErrors: js.UndefOr[Boolean] = js.undefined,
    ignored: js.Any = null,
    interval: Int | Double = null,
    persistent: js.UndefOr[Boolean] = js.undefined,
    useFsEvents: js.UndefOr[Boolean] = js.undefined,
    usePolling: js.UndefOr[Boolean] = js.undefined
  ): WatchOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alwaysStat)) __obj.updateDynamic("alwaysStat")(alwaysStat)
    if (atomic != null) __obj.updateDynamic("atomic")(atomic.asInstanceOf[js.Any])
    if (awaitWriteFinish != null) __obj.updateDynamic("awaitWriteFinish")(awaitWriteFinish.asInstanceOf[js.Any])
    if (binaryInterval != null) __obj.updateDynamic("binaryInterval")(binaryInterval.asInstanceOf[js.Any])
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (depth != null) __obj.updateDynamic("depth")(depth.asInstanceOf[js.Any])
    if (!js.isUndefined(disableGlobbing)) __obj.updateDynamic("disableGlobbing")(disableGlobbing)
    if (!js.isUndefined(followSymlinks)) __obj.updateDynamic("followSymlinks")(followSymlinks)
    if (!js.isUndefined(ignoreInitial)) __obj.updateDynamic("ignoreInitial")(ignoreInitial)
    if (!js.isUndefined(ignorePermissionErrors)) __obj.updateDynamic("ignorePermissionErrors")(ignorePermissionErrors)
    if (ignored != null) __obj.updateDynamic("ignored")(ignored)
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (!js.isUndefined(persistent)) __obj.updateDynamic("persistent")(persistent)
    if (!js.isUndefined(useFsEvents)) __obj.updateDynamic("useFsEvents")(useFsEvents)
    if (!js.isUndefined(usePolling)) __obj.updateDynamic("usePolling")(usePolling)
    __obj.asInstanceOf[WatchOptions]
  }
}

