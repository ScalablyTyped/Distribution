package typings
package properDashLockfileLib.properDashLockfileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnlockOptions extends js.Object {
   // default: true
  var fs: js.UndefOr[js.Any] = js.undefined
   // default: graceful-fs
  var lockfilePath: js.UndefOr[java.lang.String] = js.undefined
  var realpath: js.UndefOr[scala.Boolean] = js.undefined
}

object UnlockOptions {
  @scala.inline
  def apply(
    fs: js.Any = null,
    lockfilePath: java.lang.String = null,
    realpath: js.UndefOr[scala.Boolean] = js.undefined
  ): UnlockOptions = {
    val __obj = js.Dynamic.literal()
    if (fs != null) __obj.updateDynamic("fs")(fs)
    if (lockfilePath != null) __obj.updateDynamic("lockfilePath")(lockfilePath)
    if (!js.isUndefined(realpath)) __obj.updateDynamic("realpath")(realpath)
    __obj.asInstanceOf[UnlockOptions]
  }
}

