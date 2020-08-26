package typings.ssh2SftpClient.mod

import typings.ssh2SftpClient.anon.Group
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileInfo extends js.Object {
  var accessTime: Double = js.native
  var group: Double = js.native
  var modifyTime: Double = js.native
  var name: String = js.native
  var owner: Double = js.native
  var rights: Group = js.native
  var size: Double = js.native
  var `type`: String = js.native
}

object FileInfo {
  @scala.inline
  def apply(
    accessTime: Double,
    group: Double,
    modifyTime: Double,
    name: String,
    owner: Double,
    rights: Group,
    size: Double,
    `type`: String
  ): FileInfo = {
    val __obj = js.Dynamic.literal(accessTime = accessTime.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], modifyTime = modifyTime.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], rights = rights.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileInfo]
  }
  @scala.inline
  implicit class FileInfoOps[Self <: FileInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccessTime(value: Double): Self = this.set("accessTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setGroup(value: Double): Self = this.set("group", value.asInstanceOf[js.Any])
    @scala.inline
    def setModifyTime(value: Double): Self = this.set("modifyTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwner(value: Double): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def setRights(value: Group): Self = this.set("rights", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

