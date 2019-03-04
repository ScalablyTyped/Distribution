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
    val __obj = js.Dynamic.literal(accessTime = accessTime, group = group, mode = mode, modifyTime = modifyTime, owner = owner, size = size)
    if (permissions != null) __obj.updateDynamic("permissions")(permissions)
    __obj.asInstanceOf[FileStats]
  }
}

