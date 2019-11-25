package typings.properDashLockfile.properDashLockfileMod

import typings.retry.retryMod.OperationOptions
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LockOptions extends js.Object {
   // default: true
  var fs: js.UndefOr[js.Any] = js.undefined
   // default: (err) => throw err
  var lockfilePath: js.UndefOr[String] = js.undefined
   // default: graceful-fs
  var onCompromised: js.UndefOr[js.Function1[/* err */ Error, _]] = js.undefined
   // default: 0
  var realpath: js.UndefOr[Boolean] = js.undefined
   // default: stale/2
  var retries: js.UndefOr[Double | OperationOptions] = js.undefined
  var stale: js.UndefOr[Double] = js.undefined
   // default: 10000
  var update: js.UndefOr[Double] = js.undefined
}

object LockOptions {
  @scala.inline
  def apply(
    fs: js.Any = null,
    lockfilePath: String = null,
    onCompromised: /* err */ Error => _ = null,
    realpath: js.UndefOr[Boolean] = js.undefined,
    retries: Double | OperationOptions = null,
    stale: Int | Double = null,
    update: Int | Double = null
  ): LockOptions = {
    val __obj = js.Dynamic.literal()
    if (fs != null) __obj.updateDynamic("fs")(fs.asInstanceOf[js.Any])
    if (lockfilePath != null) __obj.updateDynamic("lockfilePath")(lockfilePath.asInstanceOf[js.Any])
    if (onCompromised != null) __obj.updateDynamic("onCompromised")(js.Any.fromFunction1(onCompromised))
    if (!js.isUndefined(realpath)) __obj.updateDynamic("realpath")(realpath.asInstanceOf[js.Any])
    if (retries != null) __obj.updateDynamic("retries")(retries.asInstanceOf[js.Any])
    if (stale != null) __obj.updateDynamic("stale")(stale.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(update.asInstanceOf[js.Any])
    __obj.asInstanceOf[LockOptions]
  }
}

