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
    isBlockDevice: js.Function0[scala.Boolean],
    isCharacterDevice: js.Function0[scala.Boolean],
    isDirectory: js.Function0[scala.Boolean],
    isFIFO: js.Function0[scala.Boolean],
    isFile: js.Function0[scala.Boolean],
    isSocket: js.Function0[scala.Boolean],
    isSymbolicLink: js.Function0[scala.Boolean],
    mode: scala.Double,
    mtime: stdLib.Date,
    nlink: scala.Double,
    node: NodeStats,
    rdev: scala.Double,
    size: scala.Double,
    uid: scala.Double
  ): NodeStats = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("atime")(atime)
    __obj.updateDynamic("blksize")(blksize)
    __obj.updateDynamic("blocks")(blocks)
    __obj.updateDynamic("ctime")(ctime)
    __obj.updateDynamic("dev")(dev)
    __obj.updateDynamic("gid")(gid)
    __obj.updateDynamic("ino")(ino)
    __obj.updateDynamic("isBlockDevice")(isBlockDevice)
    __obj.updateDynamic("isCharacterDevice")(isCharacterDevice)
    __obj.updateDynamic("isDirectory")(isDirectory)
    __obj.updateDynamic("isFIFO")(isFIFO)
    __obj.updateDynamic("isFile")(isFile)
    __obj.updateDynamic("isSocket")(isSocket)
    __obj.updateDynamic("isSymbolicLink")(isSymbolicLink)
    __obj.updateDynamic("mode")(mode)
    __obj.updateDynamic("mtime")(mtime)
    __obj.updateDynamic("nlink")(nlink)
    __obj.updateDynamic("node")(node)
    __obj.updateDynamic("rdev")(rdev)
    __obj.updateDynamic("size")(size)
    __obj.updateDynamic("uid")(uid)
    __obj.asInstanceOf[NodeStats]
  }
}

