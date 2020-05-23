package typings.properLockfile.mod

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
    stale: js.UndefOr[Double] = js.undefined
  ): CheckOptions = {
    val __obj = js.Dynamic.literal()
    if (fs != null) __obj.updateDynamic("fs")(fs.asInstanceOf[js.Any])
    if (lockfilePath != null) __obj.updateDynamic("lockfilePath")(lockfilePath.asInstanceOf[js.Any])
    if (!js.isUndefined(realpath)) __obj.updateDynamic("realpath")(realpath.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stale)) __obj.updateDynamic("stale")(stale.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckOptions]
  }
}

