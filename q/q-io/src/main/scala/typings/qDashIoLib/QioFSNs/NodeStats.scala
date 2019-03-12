package typings
package qDashIoLib.QioFSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeStats extends js.Object {
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
  var node: NodeStats
  var rdev: scala.Double
  var size: scala.Double
  var uid: scala.Double
  def isBlockDevice(): scala.Boolean
  def isCharacterDevice(): scala.Boolean
  def isDirectory(): scala.Boolean
  def isFIFO(): scala.Boolean
  def isFile(): scala.Boolean
  def isSocket(): scala.Boolean
  def isSymbolicLink(): scala.Boolean
}

object NodeStats {
  @scala.inline
  def apply(
    atime: stdLib.Date,
    blksize: scala.Double,
    blocks: scala.Double,
    ctime: stdLib.Date,
    dev: scala.Double,
    gid: scala.Double,
    ino: scala.Double,
    isBlockDevice: () => scala.Boolean,
    isCharacterDevice: () => scala.Boolean,
    isDirectory: () => scala.Boolean,
    isFIFO: () => scala.Boolean,
    isFile: () => scala.Boolean,
    isSocket: () => scala.Boolean,
    isSymbolicLink: () => scala.Boolean,
    mode: scala.Double,
    mtime: stdLib.Date,
    nlink: scala.Double,
    node: NodeStats,
    rdev: scala.Double,
    size: scala.Double,
    uid: scala.Double
  ): NodeStats = {
    val __obj = js.Dynamic.literal(atime = atime, blksize = blksize, blocks = blocks, ctime = ctime, dev = dev, gid = gid, ino = ino, isBlockDevice = js.Any.fromFunction0(isBlockDevice), isCharacterDevice = js.Any.fromFunction0(isCharacterDevice), isDirectory = js.Any.fromFunction0(isDirectory), isFIFO = js.Any.fromFunction0(isFIFO), isFile = js.Any.fromFunction0(isFile), isSocket = js.Any.fromFunction0(isSocket), isSymbolicLink = js.Any.fromFunction0(isSymbolicLink), mode = mode, mtime = mtime, nlink = nlink, node = node, rdev = rdev, size = size, uid = uid)
  
    __obj.asInstanceOf[NodeStats]
  }
}

