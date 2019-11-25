package typings.properDashLockfile.properDashLockfileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckOptions extends js.Object {
   // default: true
  var fs: js.UndefOr[js.Any] = js.undefined
   // default: graceful-fs
  var lockfilePath: js.UndefOr[String] = js.undefined
   // default: 10000
  var realpath: js.UndefOr[Boolean] = js.undefined
  var stale: js.UndefOr[Double] = js.undefined
}

object CheckOptions {
  @scala.inline
  def apply(
    fs: js.Any = null,
    lockfilePath: String = null,
    realpath: js.UndefOr[Boolean] = js.undefined,
    stale: Int | Double = null
  ): CheckOptions = {
    val __obj = js.Dynamic.literal()
    if (fs != null) __obj.updateDynamic("fs")(fs.asInstanceOf[js.Any])
    if (lockfilePath != null) __obj.updateDynamic("lockfilePath")(lockfilePath.asInstanceOf[js.Any])
    if (!js.isUndefined(realpath)) __obj.updateDynamic("realpath")(realpath.asInstanceOf[js.Any])
    if (stale != null) __obj.updateDynamic("stale")(stale.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckOptions]
  }
}

