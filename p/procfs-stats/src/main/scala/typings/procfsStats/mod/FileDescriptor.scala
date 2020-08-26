package typings.procfsStats.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileDescriptor extends js.Object {
  var fd: js.UndefOr[String] = js.native
  var info: FileDescriptorInfo = js.native
  var path: String = js.native
  var stat: FileDescriptorStat | Boolean = js.native
}

object FileDescriptor {
  @scala.inline
  def apply(info: FileDescriptorInfo, path: String, stat: FileDescriptorStat | Boolean): FileDescriptor = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], stat = stat.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileDescriptor]
  }
  @scala.inline
  implicit class FileDescriptorOps[Self <: FileDescriptor] (val x: Self) extends AnyVal {
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
    def setInfo(value: FileDescriptorInfo): Self = this.set("info", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setStat(value: FileDescriptorStat | Boolean): Self = this.set("stat", value.asInstanceOf[js.Any])
    @scala.inline
    def setFd(value: String): Self = this.set("fd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFd: Self = this.set("fd", js.undefined)
  }
  
}

