package typings.ssh2SftpClient.mod

import typings.ssh2SftpClient.AnonGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileInfo extends js.Object {
  var accessTime: Double
  var group: Double
  var modifyTime: Double
  var name: String
  var owner: Double
  var rights: AnonGroup
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
    rights: AnonGroup,
    size: Double,
    `type`: String
  ): FileInfo = {
    val __obj = js.Dynamic.literal(accessTime = accessTime.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], modifyTime = modifyTime.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], rights = rights.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileInfo]
  }
}

