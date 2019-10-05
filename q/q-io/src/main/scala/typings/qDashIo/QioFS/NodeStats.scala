package typings.qDashIo.QioFS

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeStats extends js.Object {
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
  var node: NodeStats
  var rdev: Double
  var size: Double
  var uid: Double
  def isBlockDevice(): Boolean
  def isCharacterDevice(): Boolean
  def isDirectory(): Boolean
  def isFIFO(): Boolean
  def isFile(): Boolean
  def isSocket(): Boolean
  def isSymbolicLink(): Boolean
}

object NodeStats {
  @scala.inline
  def apply(
    atime: Date,
    blksize: Double,
    blocks: Double,
    ctime: Date,
    dev: Double,
    gid: Double,
    ino: Double,
    isBlockDevice: () => Boolean,
    isCharacterDevice: () => Boolean,
    isDirectory: () => Boolean,
    isFIFO: () => Boolean,
    isFile: () => Boolean,
    isSocket: () => Boolean,
    isSymbolicLink: () => Boolean,
    mode: Double,
    mtime: Date,
    nlink: Double,
    node: NodeStats,
    rdev: Double,
    size: Double,
    uid: Double
  ): NodeStats = {
    val __obj = js.Dynamic.literal(atime = atime, blksize = blksize, blocks = blocks, ctime = ctime, dev = dev, gid = gid, ino = ino, isBlockDevice = js.Any.fromFunction0(isBlockDevice), isCharacterDevice = js.Any.fromFunction0(isCharacterDevice), isDirectory = js.Any.fromFunction0(isDirectory), isFIFO = js.Any.fromFunction0(isFIFO), isFile = js.Any.fromFunction0(isFile), isSocket = js.Any.fromFunction0(isSocket), isSymbolicLink = js.Any.fromFunction0(isSymbolicLink), mode = mode, mtime = mtime, nlink = nlink, node = node, rdev = rdev, size = size, uid = uid)
  
    __obj.asInstanceOf[NodeStats]
  }
}

