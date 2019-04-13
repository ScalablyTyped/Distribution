package typings
package promiseDashSftpLib.promiseDashSftpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** From the [statvfs struct](http://linux.die.net/man/2/statvfs). */
trait Statvfs extends js.Object {
  /** free blocks for unprivileged users */
  var f_bavail: scala.Double
  /** free blocks */
  var f_bfree: scala.Double
  /** size of fs in f_frsize units */
  var f_blocks: scala.Double
  /** file system block size */
  var f_bsize: scala.Double
  /** free inodes for unprivileged users */
  var f_favail: scala.Double
  /** free inodes */
  var f_ffree: scala.Double
  /** inodes */
  var f_files: scala.Double
  /** mount flags */
  var f_flag: scala.Double
  /** fragment size */
  var f_frsize: scala.Double
  /** file system ID */
  var f_fsid: scala.Double
  /** maximum filename length */
  var f_namemax: scala.Double
}

object Statvfs {
  @scala.inline
  def apply(
    f_bavail: scala.Double,
    f_bfree: scala.Double,
    f_blocks: scala.Double,
    f_bsize: scala.Double,
    f_favail: scala.Double,
    f_ffree: scala.Double,
    f_files: scala.Double,
    f_flag: scala.Double,
    f_frsize: scala.Double,
    f_fsid: scala.Double,
    f_namemax: scala.Double
  ): Statvfs = {
    val __obj = js.Dynamic.literal(f_bavail = f_bavail, f_bfree = f_bfree, f_blocks = f_blocks, f_bsize = f_bsize, f_favail = f_favail, f_ffree = f_ffree, f_files = f_files, f_flag = f_flag, f_frsize = f_frsize, f_fsid = f_fsid, f_namemax = f_namemax)
  
    __obj.asInstanceOf[Statvfs]
  }
}

