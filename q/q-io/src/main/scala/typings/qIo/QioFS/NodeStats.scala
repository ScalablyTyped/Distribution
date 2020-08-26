package typings.qIo.QioFS

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeStats extends js.Object {
  var atime: Date = js.native
  var blksize: Double = js.native
  var blocks: Double = js.native
  var ctime: Date = js.native
  var dev: Double = js.native
  var gid: Double = js.native
  var ino: Double = js.native
  var mode: Double = js.native
  var mtime: Date = js.native
  var nlink: Double = js.native
  var node: NodeStats = js.native
  var rdev: Double = js.native
  var size: Double = js.native
  var uid: Double = js.native
  def isBlockDevice(): Boolean = js.native
  def isCharacterDevice(): Boolean = js.native
  def isDirectory(): Boolean = js.native
  def isFIFO(): Boolean = js.native
  def isFile(): Boolean = js.native
  def isSocket(): Boolean = js.native
  def isSymbolicLink(): Boolean = js.native
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
    val __obj = js.Dynamic.literal(atime = atime.asInstanceOf[js.Any], blksize = blksize.asInstanceOf[js.Any], blocks = blocks.asInstanceOf[js.Any], ctime = ctime.asInstanceOf[js.Any], dev = dev.asInstanceOf[js.Any], gid = gid.asInstanceOf[js.Any], ino = ino.asInstanceOf[js.Any], isBlockDevice = js.Any.fromFunction0(isBlockDevice), isCharacterDevice = js.Any.fromFunction0(isCharacterDevice), isDirectory = js.Any.fromFunction0(isDirectory), isFIFO = js.Any.fromFunction0(isFIFO), isFile = js.Any.fromFunction0(isFile), isSocket = js.Any.fromFunction0(isSocket), isSymbolicLink = js.Any.fromFunction0(isSymbolicLink), mode = mode.asInstanceOf[js.Any], mtime = mtime.asInstanceOf[js.Any], nlink = nlink.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], rdev = rdev.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeStats]
  }
  @scala.inline
  implicit class NodeStatsOps[Self <: NodeStats] (val x: Self) extends AnyVal {
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
    def setAtime(value: Date): Self = this.set("atime", value.asInstanceOf[js.Any])
    @scala.inline
    def setBlksize(value: Double): Self = this.set("blksize", value.asInstanceOf[js.Any])
    @scala.inline
    def setBlocks(value: Double): Self = this.set("blocks", value.asInstanceOf[js.Any])
    @scala.inline
    def setCtime(value: Date): Self = this.set("ctime", value.asInstanceOf[js.Any])
    @scala.inline
    def setDev(value: Double): Self = this.set("dev", value.asInstanceOf[js.Any])
    @scala.inline
    def setGid(value: Double): Self = this.set("gid", value.asInstanceOf[js.Any])
    @scala.inline
    def setIno(value: Double): Self = this.set("ino", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsBlockDevice(value: () => Boolean): Self = this.set("isBlockDevice", js.Any.fromFunction0(value))
    @scala.inline
    def setIsCharacterDevice(value: () => Boolean): Self = this.set("isCharacterDevice", js.Any.fromFunction0(value))
    @scala.inline
    def setIsDirectory(value: () => Boolean): Self = this.set("isDirectory", js.Any.fromFunction0(value))
    @scala.inline
    def setIsFIFO(value: () => Boolean): Self = this.set("isFIFO", js.Any.fromFunction0(value))
    @scala.inline
    def setIsFile(value: () => Boolean): Self = this.set("isFile", js.Any.fromFunction0(value))
    @scala.inline
    def setIsSocket(value: () => Boolean): Self = this.set("isSocket", js.Any.fromFunction0(value))
    @scala.inline
    def setIsSymbolicLink(value: () => Boolean): Self = this.set("isSymbolicLink", js.Any.fromFunction0(value))
    @scala.inline
    def setMode(value: Double): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def setMtime(value: Date): Self = this.set("mtime", value.asInstanceOf[js.Any])
    @scala.inline
    def setNlink(value: Double): Self = this.set("nlink", value.asInstanceOf[js.Any])
    @scala.inline
    def setNode(value: NodeStats): Self = this.set("node", value.asInstanceOf[js.Any])
    @scala.inline
    def setRdev(value: Double): Self = this.set("rdev", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setUid(value: Double): Self = this.set("uid", value.asInstanceOf[js.Any])
  }
  
}

