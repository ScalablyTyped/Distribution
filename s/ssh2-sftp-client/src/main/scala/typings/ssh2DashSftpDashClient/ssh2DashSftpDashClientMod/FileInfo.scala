package typings.ssh2DashSftpDashClient.ssh2DashSftpDashClientMod

import typings.ssh2DashSftpDashClient.Anon_Group
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileInfo extends js.Object {
  var accessTime: Double
  var group: Double
  var modifyTime: Double
  var name: String
  var owner: Double
  var rights: Anon_Group
  var size: Double
  var `type`: String
}

object FileInfo {
  @scala.inline
  def apply(
    accessTime: Double,
    group: Double,
    modifyTime: Double,
    name: String,
    owner: Double,
    rights: Anon_Group,
    size: Double,
    `type`: String
  ): FileInfo = {
    val __obj = js.Dynamic.literal(accessTime = accessTime, group = group, modifyTime = modifyTime, name = name, owner = owner, rights = rights, size = size)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[FileInfo]
  }
}

