package typings.readdirDashEnhanced.readdirDashEnhancedMod

import typings.node.fsMod.StatsBase
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stats extends StatsBase[Double] {
  var depth: Double
  var path: String
}

object Stats {
  @scala.inline
  def apply(
    atime: Date,
    atimeMs: Double,
    birthtime: Date,
    birthtimeMs: Double,
    blksize: Double,
    blocks: Double,
    ctime: Date,
    ctimeMs: Double,
    depth: Double,
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
    mtimeMs: Double,
    nlink: Double,
    path: String,
    rdev: Double,
    size: Double,
    uid: Double
  ): Stats = {
    val __obj = js.Dynamic.literal(atime = atime, atimeMs = atimeMs, birthtime = birthtime, birthtimeMs = birthtimeMs, blksize = blksize, blocks = blocks, ctime = ctime, ctimeMs = ctimeMs, depth = depth, dev = dev, gid = gid, ino = ino, isBlockDevice = js.Any.fromFunction0(isBlockDevice), isCharacterDevice = js.Any.fromFunction0(isCharacterDevice), isDirectory = js.Any.fromFunction0(isDirectory), isFIFO = js.Any.fromFunction0(isFIFO), isFile = js.Any.fromFunction0(isFile), isSocket = js.Any.fromFunction0(isSocket), isSymbolicLink = js.Any.fromFunction0(isSymbolicLink), mode = mode, mtime = mtime, mtimeMs = mtimeMs, nlink = nlink, path = path, rdev = rdev, size = size, uid = uid)
  
    __obj.asInstanceOf[Stats]
  }
}

