package typings.procfsDashStats.procfsDashStatsMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileDescriptorStat extends js.Object {
  var atime: Date
  var blksize: Double
  var blocks: Double
  var ctime: Date
  var dev: Double
  var gid: Double
  var ino: Double
  var mode: Double
  var mtime: Date
  var nlink: Double
  var rdev: Double
  var size: Double
  var uid: Double
}

object FileDescriptorStat {
  @scala.inline
  def apply(
    atime: Date,
    blksize: Double,
    blocks: Double,
    ctime: Date,
    dev: Double,
    gid: Double,
    ino: Double,
    mode: Double,
    mtime: Date,
    nlink: Double,
    rdev: Double,
    size: Double,
    uid: Double
  ): FileDescriptorStat = {
    val __obj = js.Dynamic.literal(atime = atime, blksize = blksize, blocks = blocks, ctime = ctime, dev = dev, gid = gid, ino = ino, mode = mode, mtime = mtime, nlink = nlink, rdev = rdev, size = size, uid = uid)
  
    __obj.asInstanceOf[FileDescriptorStat]
  }
}

