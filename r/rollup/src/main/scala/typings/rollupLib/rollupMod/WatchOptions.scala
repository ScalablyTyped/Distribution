package typings
package rollupLib.rollupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WatchOptions extends js.Object {
  var alwaysStat: js.UndefOr[scala.Boolean] = js.undefined
  var atomic: js.UndefOr[scala.Boolean | scala.Double] = js.undefined
  var awaitWriteFinish: js.UndefOr[rollupLib.Anon_PollInterval | scala.Boolean] = js.undefined
  var binaryInterval: js.UndefOr[scala.Double] = js.undefined
  var cwd: js.UndefOr[java.lang.String] = js.undefined
  var depth: js.UndefOr[scala.Double] = js.undefined
  var disableGlobbing: js.UndefOr[scala.Boolean] = js.undefined
  var followSymlinks: js.UndefOr[scala.Boolean] = js.undefined
  var ignoreInitial: js.UndefOr[scala.Boolean] = js.undefined
  var ignorePermissionErrors: js.UndefOr[scala.Boolean] = js.undefined
  var ignored: js.UndefOr[js.Any] = js.undefined
  var interval: js.UndefOr[scala.Double] = js.undefined
  var persistent: js.UndefOr[scala.Boolean] = js.undefined
  var useFsEvents: js.UndefOr[scala.Boolean] = js.undefined
  var usePolling: js.UndefOr[scala.Boolean] = js.undefined
}

object WatchOptions {
  @scala.inline
  def apply(
    alwaysStat: js.UndefOr[scala.Boolean] = js.undefined,
    atomic: scala.Boolean | scala.Double = null,
    awaitWriteFinish: rollupLib.Anon_PollInterval | scala.Boolean = null,
    binaryInterval: scala.Int | scala.Double = null,
    cwd: java.lang.String = null,
    depth: scala.Int | scala.Double = null,
    disableGlobbing: js.UndefOr[scala.Boolean] = js.undefined,
    followSymlinks: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreInitial: js.UndefOr[scala.Boolean] = js.undefined,
    ignorePermissionErrors: js.UndefOr[scala.Boolean] = js.undefined,
    ignored: js.Any = null,
    interval: scala.Int | scala.Double = null,
    persistent: js.UndefOr[scala.Boolean] = js.undefined,
    useFsEvents: js.UndefOr[scala.Boolean] = js.undefined,
    usePolling: js.UndefOr[scala.Boolean] = js.undefined
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

