package typings
package ssh2DashSftpDashClientLib.ssh2DashSftpDashClientMod.sftpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileInfo extends js.Object {
  var accessTime: scala.Double
  var group: scala.Double
  var modifyTime: scala.Double
  var name: java.lang.String
  var owner: scala.Double
  var rights: ssh2DashSftpDashClientLib.Anon_Group
  var size: scala.Double
  var `type`: java.lang.String
}

object FileInfo {
  @scala.inline
  def apply(
    accessTime: scala.Double,
    group: scala.Double,
    modifyTime: scala.Double,
    name: java.lang.String,
    owner: scala.Double,
    rights: ssh2DashSftpDashClientLib.Anon_Group,
    size: scala.Double,
    `type`: java.lang.String
  ): FileInfo = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("accessTime")(accessTime)
    __obj.updateDynamic("group")(group)
    __obj.updateDynamic("modifyTime")(modifyTime)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("owner")(owner)
    __obj.updateDynamic("rights")(rights)
    __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[FileInfo]
  }
}

