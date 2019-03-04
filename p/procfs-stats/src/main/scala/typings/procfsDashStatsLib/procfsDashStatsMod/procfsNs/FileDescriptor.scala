package typings
package procfsDashStatsLib.procfsDashStatsMod.procfsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileDescriptor extends js.Object {
  var fd: js.UndefOr[java.lang.String] = js.undefined
  var info: FileDescriptorInfo
  var path: java.lang.String
  var stat: FileDescriptorStat | scala.Boolean
}

object FileDescriptor {
  @scala.inline
  def apply(
    info: FileDescriptorInfo,
    path: java.lang.String,
    stat: FileDescriptorStat | scala.Boolean,
    fd: java.lang.String = null
  ): FileDescriptor = {
    val __obj = js.Dynamic.literal(info = info, path = path, stat = stat.asInstanceOf[js.Any])
    if (fd != null) __obj.updateDynamic("fd")(fd)
    __obj.asInstanceOf[FileDescriptor]
  }
}

