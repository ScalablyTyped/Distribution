package typings.procfsDashStats.procfsDashStatsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileDescriptor extends js.Object {
  var fd: js.UndefOr[String] = js.undefined
  var info: FileDescriptorInfo
  var path: String
  var stat: FileDescriptorStat | Boolean
}

object FileDescriptor {
  @scala.inline
  def apply(info: FileDescriptorInfo, path: String, stat: FileDescriptorStat | Boolean, fd: String = null): FileDescriptor = {
    val __obj = js.Dynamic.literal(info = info, path = path, stat = stat.asInstanceOf[js.Any])
    if (fd != null) __obj.updateDynamic("fd")(fd)
    __obj.asInstanceOf[FileDescriptor]
  }
}

