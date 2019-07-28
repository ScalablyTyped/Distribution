package typings.ssh2DashSftpDashClient.ssh2DashSftpDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileStats extends js.Object {
  var accessTime: Double
  var group: Double
  var mode: Double
  var modifyTime: Double
  var owner: Double
  var permissions: js.UndefOr[js.Any] = js.undefined
  var size: Double
}

object FileStats {
  @scala.inline
  def apply(
    accessTime: Double,
    group: Double,
    mode: Double,
    modifyTime: Double,
    owner: Double,
    size: Double,
    permissions: js.Any = null
  ): FileStats = {
    val __obj = js.Dynamic.literal(accessTime = accessTime, group = group, mode = mode, modifyTime = modifyTime, owner = owner, size = size)
    if (permissions != null) __obj.updateDynamic("permissions")(permissions)
    __obj.asInstanceOf[FileStats]
  }
}

