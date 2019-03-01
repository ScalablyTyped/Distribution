package typings
package procfsDashStatsLib.procfsDashStatsMod.procfsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileDescriptorStat extends js.Object {
  var atime: stdLib.Date
  var blksize: scala.Double
  var blocks: scala.Double
  var ctime: stdLib.Date
  var dev: scala.Double
  var gid: scala.Double
  var ino: scala.Double
  var mode: scala.Double
  var mtime: stdLib.Date
  var nlink: scala.Double
  var rdev: scala.Double
  var size: scala.Double
  var uid: scala.Double
}

object FileDescriptorStat {
  @scala.inline
  def apply(
    atime: stdLib.Date,
    blksize: scala.Double,
    blocks: scala.Double,
    ctime: stdLib.Date,
    dev: scala.Double,
    gid: scala.Double,
    ino: scala.Double,
    mode: scala.Double,
    mtime: stdLib.Date,
    nlink: scala.Double,
    rdev: scala.Double,
    size: scala.Double,
    uid: scala.Double
  ): FileDescriptorStat = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("atime")(atime)
    __obj.updateDynamic("blksize")(blksize)
    __obj.updateDynamic("blocks")(blocks)
    __obj.updateDynamic("ctime")(ctime)
    __obj.updateDynamic("dev")(dev)
    __obj.updateDynamic("gid")(gid)
    __obj.updateDynamic("ino")(ino)
    __obj.updateDynamic("mode")(mode)
    __obj.updateDynamic("mtime")(mtime)
    __obj.updateDynamic("nlink")(nlink)
    __obj.updateDynamic("rdev")(rdev)
    __obj.updateDynamic("size")(size)
    __obj.updateDynamic("uid")(uid)
    __obj.asInstanceOf[FileDescriptorStat]
  }
}

