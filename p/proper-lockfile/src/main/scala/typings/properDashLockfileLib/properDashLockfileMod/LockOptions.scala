package typings
package properDashLockfileLib.properDashLockfileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LockOptions extends js.Object {
   // default: true
  var fs: js.UndefOr[js.Any] = js.undefined
   // default: (err) => throw err
  var lockfilePath: js.UndefOr[java.lang.String] = js.undefined
   // default: graceful-fs
  var onCompromised: js.UndefOr[js.Function1[/* err */ stdLib.Error, _]] = js.undefined
   // default: 0
  var realpath: js.UndefOr[scala.Boolean] = js.undefined
   // default: stale/2
  var retries: js.UndefOr[scala.Double] = js.undefined
  var stale: js.UndefOr[scala.Double] = js.undefined
   // default: 10000
  var update: js.UndefOr[scala.Double] = js.undefined
}

object LockOptions {
  @scala.inline
  def apply(
    fs: js.Any = null,
    lockfilePath: java.lang.String = null,
    onCompromised: /* err */ stdLib.Error => _ = null,
    realpath: js.UndefOr[scala.Boolean] = js.undefined,
    retries: scala.Int | scala.Double = null,
    stale: scala.Int | scala.Double = null,
    update: scala.Int | scala.Double = null
  ): LockOptions = {
    val __obj = js.Dynamic.literal()
    if (fs != null) __obj.updateDynamic("fs")(fs)
    if (lockfilePath != null) __obj.updateDynamic("lockfilePath")(lockfilePath)
    if (onCompromised != null) __obj.updateDynamic("onCompromised")(js.Any.fromFunction1(onCompromised))
    if (!js.isUndefined(realpath)) __obj.updateDynamic("realpath")(realpath)
    if (retries != null) __obj.updateDynamic("retries")(retries.asInstanceOf[js.Any])
    if (stale != null) __obj.updateDynamic("stale")(stale.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(update.asInstanceOf[js.Any])
    __obj.asInstanceOf[LockOptions]
  }
}

