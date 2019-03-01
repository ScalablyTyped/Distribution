package typings
package ssh2DashSftpDashClientLib.ssh2DashSftpDashClientMod.sftpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileStats extends js.Object {
  var accessTime: scala.Double
  var group: scala.Double
  var mode: scala.Double
  var modifyTime: scala.Double
  var owner: scala.Double
  var permissions: js.UndefOr[js.Any] = js.undefined
  var size: scala.Double
}

object FileStats {
  @scala.inline
  def apply(
    accessTime: scala.Double,
    group: scala.Double,
    mode: scala.Double,
    modifyTime: scala.Double,
    owner: scala.Double,
    size: scala.Double,
    permissions: js.Any = null
  ): FileStats = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("accessTime")(accessTime)
    __obj.updateDynamic("group")(group)
    __obj.updateDynamic("mode")(mode)
    __obj.updateDynamic("modifyTime")(modifyTime)
    __obj.updateDynamic("owner")(owner)
    __obj.updateDynamic("size")(size)
    if (permissions != null) __obj.updateDynamic("permissions")(permissions)
    __obj.asInstanceOf[FileStats]
  }
}

